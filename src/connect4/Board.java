// Board.java
// The Board class represents a position in Connect Four
// Copyright 2019 David Kopec
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package connect4;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Board implements Cloneable {
	public static final int NUM_COLUMNS = 7;
	public static final int NUM_ROWS = 6;
	public static final int SEGMENT_LENGTH = 4;
	private int[][] position; // 0 = empty, 1 is player 1, 2 is player 2
	private int[] columnCount; // number of pieces in each column
	private int turn; // which player's turn is it, 1 or 2
	// YOUR ADDITIONAL VARIABLES HERE

	public Board() {
		// ints by default are initialized to 0
		// note that we're doing columns first
		position = new int[NUM_COLUMNS][NUM_ROWS];
		columnCount = new int[NUM_COLUMNS];
		turn = 1; // 1 goes first
	}
	
	// Constructor for test cases
	public Board(int[][] position, int turn) {
		this.position = position;
		columnCount = new int[NUM_COLUMNS];
		for (int c = 0; c < Board.NUM_COLUMNS; c++) {
			int piecesInColumn = 0;
			for (int r = 0; r < Board.NUM_ROWS; r++) {
				if (position[c][r] != 0) {
					piecesInColumn++;
				}
			}
			columnCount[c] = piecesInColumn;
		}
		
		this.turn = turn;
	}

	// Get a particular piece at a certain column and row
	public int getPieceAt(int col, int row) {
		return position[col][row];
	}

	// Clone this Board
	public Board clone() {
		Board duplicate = null;
		try {
			duplicate = (Board) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		duplicate.position = position.clone(); // clones outer
		for (int i = 0; i < duplicate.position.length; i++) { // clones inner
			duplicate.position[i] = position[i].clone();
		}
		duplicate.columnCount = columnCount.clone();
		return duplicate;
	}

	// Check if a move can be made
	// ... a move being a column number
	public boolean isLegal(int move) {
		return (move >= 0 && columnCount[move] < NUM_ROWS && move < NUM_COLUMNS);
	}

	// Find all currently playable moves
	public Set<Integer> getLegalMoves() {
		// YOUR CODE HERE
	}

	// Can any more moves be played?
	// Always check for win before tie
	public boolean checkTie() {
		return (getLegalMoves().size() == 0);
	}

	// Does one side have 4-in-a-row?
	public boolean checkWin() {
		// YOUR CODE HERE
	}

	// Make a play at column m
	// assume the move is legal
	public void move(int m) {
		// YOUR CODE HERE
	}

	// Undo move at m
	public void undoMove(int m) {
		// YOUR CODE HERE
	}
	
	public int getTurn() {
		return turn;
	}

	// Print a default representation of the board for debugging and play
	@Override
	public String toString() {
		// YOUR CODE HERE
	}
	
	// YOUR ADDITONAL METHODS HERE
}