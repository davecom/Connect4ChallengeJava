# Connect 4 Challenge
- Connect 4 written for Java 8+
- No external dependencies beyond the Java standard library and JUnit
- Starter code is included
- Directory is structured as an Eclipse project

## Finishing the Implementation
Please do not change any of the methods that are already implemented, any of the method signatures, and please do not change any of the unit tests. Add your code into the incomplete methods and add any additional utility methods/variables that you would like. Incomplete methods are explicitly marked "Your Code Here."

## Playing a Game Against the AI

The package `connect4` contains a main class `ConnectFour` that can be launched after compilation from the command line or from Eclipse by right clicking it and choosing "Run As->Java Application".

## Testing

The package `connect4tests` contains JUnit test cases that can be run from Eclipse by right clicking the package and choosing "Run As->JUnit Test".

## Extended Description

You will be creating an artificial opponent that plays the game of Connect Four using the [minimax](https://en.wikipedia.org/wiki/Minimax) algorithm with alpha-beta pruning. Your Connect Four AI will likely be good enough to beat most human players.

### Connect Four Description

In [Connect Four](https://en.wikipedia.org/wiki/Connect_Four), two players alternate dropping different colored (red or black traditionally) pieces in a seven-column, six-row grid. Pieces fall from the top of the grid to the bottom until they hit the bottom or another piece. In essence, the player’s only decision each turn is which of the seven columns to drop a piece into. The player may not drop it into a full column. The first player that has four pieces of their color next to one another with no breaks in a row, column, or diagonal wins. If no player achieves this, and the grid is completely filled, the game is a draw.

### Objective

Your goal is to build a program in which the user can play a game of Connect Four against the computer. In other words, you will have a main game loop that takes a move from the user, updates the state of the game, gets a response from the artificial opponent, and updates the state again. All along your program should be printing out the contents of the board to the user so they can see the game's progression.

Your game must use the included implementation of the minimax/alphabeta algorithm to figure out the computer's moves. You must use the provided starter code as part of your program. Please do not change the included methods nor their signatures (although you may add additional methods and variables of your own). Your program must pass the included unit tests. You should also test your program beyond the unit tests since they do not cover every aspect of the program.

### Instructions

1. Use the contents of the repository as starter code, copying it into a private repository of your own that you create.

2. Add us (@davecom, @brianrhall, @mkgungor) as collaborators on the repository on GitHub.

3. Open the project in Eclipse by choosing "Open Projects from File System..." from the "File" menu.

4. Fill in the methods with the missing code and add any additional utility methods that you see fit.

5. Test your program on its own and also test the included unit tests.

6. Submit the URL of your repository to us by email.

### Advice

Before you begin, take the time to carefully read through the included files from the starter code and try to understand how they fit together. There are in-line comments explaining all aspects of the starter code, including comments at the top of each file explaining that file's purpose. You will almost certainly need to add additional utility methods to make your code readable. 

The included MiniMax/AlphaBeta algorithm in `Evaluator.java` should be called # of legal moves times for a given starting position from your version of `getBestMove()`. Each call to `alphabeta()` will return an evaluation of a move. You must look at how high that evaluation is relative to the evaluation of the other legal moves and return the highest evaluated move (the "best move"). 

The `Board` class maintains the state of the game. `position` is the grid at any given time. What pieces are on what squares? It is maintained as a two-dimensional array of `int`. Note that for convenience vis-a-vis Connect Four, it is in the unusual configuration of being column-first. `columnCount` keeps track of how many pieces are in each column. Initially, all columns have 0 pieces. `turn` is which player's turn it is. The `int` type is used both to designate pieces on the grid and to designate players via the turn property. A 0 is an empty square, a 1 is player 1, and a 2 is player 2.

The `move()` method on `Board` needs to put a new piece on the grid, update that column's count, and change who's turn it is. `undoMove()` needs to do the same but in the reverse direction.

The hardest part of doing this will likely be writing the `evalPosition()` method in `Evaluator`. The purpose of the `evalPosition()` method is to tell `alphabeta()` "how good" a given position is for the provided player. For instance, a position in which a player is about to win because they have two segments of the board where they have 3 pieces in a row and there is no way to block them at both simultaneously should be evaluated as "very good" for that player. In other words it should get a high number returned. On the other hand, a position in which both players do not seem to have any winning opportunities should be evaluated "lower" than the first example. And a position in which the opponent looks to be near winning, should be evaluated even lower. The evaluation numbers only matter in relation to one another. You make up the scale. Note that there is more than one way to evaluate a position, and it is very possible for you to come up with your own solution that will be different from other peoples' and still work well.
