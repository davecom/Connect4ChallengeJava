// LegalMovesTestCase.java
// Tests to ensure the Board class generates legal moves correctly.
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
package connect4tests;
import connect4.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

import org.junit.jupiter.api.Test;

class LegalMovesTestCase {

	@Test
	void testLegalMovesOneFilledBoard() {
		int[][] position = {
		                             {2, 2, 0, 0, 0, 0},
		                             {1, 1, 1, 2, 1, 2},
		                             {1, 0, 0, 0, 0, 0},
		                             {2, 1, 2, 1, 2, 0},
		                             {0, 0, 0, 0, 0, 0},
		                             {0, 0, 0, 0, 0, 0},
		                             {0, 0, 0, 0, 0, 0}};
		Board b = new Board(position, 1);
		Integer[] correct = {0, 2, 3, 4, 5, 6};
		HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(correct));
		Set<Integer> actual = b.getLegalMoves();
		assertTrue(actual.equals(expected));
	}
	
	@Test
	void testLegalMovesEmptyBoard() {
		Board b = new Board();
		Integer[] correct = {0, 1, 2, 3, 4, 5, 6};
		HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(correct));
		Set<Integer> actual = b.getLegalMoves();
		assertTrue(actual.equals(expected));
	}

}
