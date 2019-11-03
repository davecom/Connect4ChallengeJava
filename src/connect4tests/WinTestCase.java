// WinTestCase.java
// Tests to ensure the Board class detects wins correctly.
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

import org.junit.jupiter.api.Test;

class WinTestCase {

	@Test
	void testWin1() {
		int[][] position = {
		        {2, 1, 1, 1, 2, 2},
				{2, 1, 2, 1, 2, 1},
				{1, 2, 1, 2, 1, 2},
				{1, 2, 1, 2, 1, 2},
				{2, 2, 1, 2, 1, 2},
				{1, 1, 2, 1, 2, 1},
				{2, 1, 2, 1, 2, 1}};
		Board b = new Board(position, 1);
		assertFalse(b.checkWin());
	}
	
	@Test
	void testWin2() {
		int[][] position = {
		        {2, 1, 2, 1, 2, 1},
				{2, 1, 2, 1, 2, 2},
				{1, 2, 1, 2, 1, 2},
				{1, 2, 1, 2, 1, 2},
				{2, 2, 1, 2, 1, 2},
				{1, 1, 2, 1, 2, 1},
				{2, 1, 2, 1, 1, 1}};
		Board b = new Board(position, 1);
		assertTrue(b.checkWin());
	}
	
	@Test
	void testWin3() {
		int[][] position = {
		        {2, 1, 1, 1, 2, 2},
				{2, 1, 2, 1, 2, 2},
				{1, 2, 1, 2, 1, 2},
				{1, 2, 1, 2, 1, 1},
				{2, 2, 1, 2, 1, 2},
				{1, 1, 2, 1, 2, 1},
				{2, 1, 2, 1, 1, 2}};
		Board b = new Board(position, 1);
		assertTrue(b.checkWin());
	}
	
	@Test
	void testWin4() {
		int[][] position = {
		        {2, 2, 2, 1, 2, 1},
				{2, 1, 2, 1, 2, 2},
				{1, 2, 1, 2, 1, 2},
				{1, 2, 1, 2, 1, 1},
				{2, 2, 1, 2, 1, 2},
				{1, 1, 2, 1, 2, 1},
				{2, 2, 1, 1, 1, 2}};
		Board b = new Board(position, 1);
		assertTrue(b.checkWin());
	}
	
	@Test
	void testWin5() {
		int[][] position = {
		        {2, 2, 2, 2, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0}};
		Board b = new Board(position, 1);
		assertTrue(b.checkWin());
	}

}
