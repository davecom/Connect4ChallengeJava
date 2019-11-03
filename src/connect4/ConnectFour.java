// ConnectFour.java
// A main game loop to play the computer in Connect Four
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

import java.util.Scanner;

public class ConnectFour {
	private Board board;
	private Scanner scanner;
	private Evaluator evaluator;
	
	ConnectFour() {
		board = new Board();
		scanner = new Scanner(System.in);
		evaluator = new Evaluator();
		mainGameLoop();
	}
	
	// Find the user's next move
	private int getPlayerMove() {
		// YOUR CODE HERE
	}
	
	// Keep alternatively taking user and artificial opponent moves to
	// form a game; report if either side won
	private void mainGameLoop() {
		// YOUR CODE HERE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConnectFour();
	}

}
