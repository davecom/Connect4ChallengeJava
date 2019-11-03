// BoardLocation.java
// A single cell on the board.
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

public final class BoardLocation {
	public int column, row;
	public BoardLocation(int column, int row) {
		this.column = column;
		this.row = row;
	}
}
