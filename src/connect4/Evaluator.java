// Evaluator.java
// Find the best move in a given position using minimax w/ alphabeta pruning.
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

public class Evaluator {
	// The default number of moves to search into the future (max depth).
	public static int ply = 8;

	// What is the best move in the current position?
	// Call alphabeta on all of the legal moves and find the one that evaluates highest.
	public int getBestMove(Board b) {
		// YOUR CODE HERE
	}
	
	// Helper that sets alpha and beta for the first call
	// and sets maxDepth to the default
	private int alphabeta(Board b, boolean maximizing, int originalPlayer) {
		return alphabeta(b, maximizing, originalPlayer, ply, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	// Evaluates a Board b
	private int alphabeta(Board b, boolean maximizing, int originalPlayer, int depth, int alpha, int beta) {
		// Base case: check if reach our ply limit or it's a terminal position
		if (depth == 0 || b.checkTie() || b.checkWin()) {
			return evalPosition(b, originalPlayer);
		}
		
		// Recursive case: maximize your gains or minimize the opponent's gains
		if (maximizing) {
			for (int m : b.getLegalMoves()) {
				b.move(m);
				alpha = Math.max(alpha, alphabeta(b, false, originalPlayer, depth - 1, alpha, beta));
				b.undoMove(m);
				if (beta <= alpha) { // check cutoff
					break;
				}
			}
			return alpha;
		} else { // minimizing
			for (int m : b.getLegalMoves()) {
				b.move(m);
				beta = Math.min(beta, alphabeta(b, true, originalPlayer, depth - 1, alpha, beta));
				b.undoMove(m);
				if (beta <= alpha) { // check cutoff
					break;
				}
			}
			return beta;
		}
		
	}

	// Who is winning in this position?
	// This function scores the position for player and returns a numerical score
	// When player is doing well, the score should be higher
	// When player is doing worse, player's returned score should be lower
	// Scores mean nothing except in relation to one another; so you can
	// use any scale that makes sense to you
	// The more accurately evaluate() scores a position, the better that alphabeta will work
	// There may be more than one way to evaluate a position but an obvious route
	// is to count how many 1 filled, 2 filled, and 3 filled segments of the board
	// that the player has (that don't include any of the opponents pieces) and give
	// a higher score for 3 filleds than 2 filleds, 1 filleds, etc.
	// You may also need to score wins (4 filleds) as very high scores and losses (4 filleds
	// for the opponent) as very low scores
	private int evalPosition(Board b, int player) {
		// YOUR CODE HERE
	}

	// YOUR ADDITIONAL METHODS HERE
}
