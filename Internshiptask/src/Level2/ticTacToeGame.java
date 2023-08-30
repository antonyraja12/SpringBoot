package Level2;


import java.util.Scanner;

public class ticTacToeGame {
	    private char[][] board = new char[3][3];
	    private char currentPlayer = 'X';
	    private boolean isGameOver = false;

	    public ticTacToeGame() {
	        // Initialize the board with empty cells
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = ' ';
	            }
	        }
	    }

	    public void drawBoard() {
	        // Draw the current state of the board
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }

	    public void makeMove(int row, int col) {
	        // Make a move on the board
	        if (board[row][col] == ' ' && !isGameOver) {
	            board[row][col] = currentPlayer;
	            if (checkWin() || checkDraw()) {
	                isGameOver = true;
	            } else {
	                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	            }
	        }
	    }

	    private boolean checkWin() {
	        // Check if the current player has won
	        // Implement the logic to check for a win in rows, columns, and diagonals
	        // Return true if the current player wins
	        return false;
	    }

	    private boolean checkDraw() {
	        // Check if the game is a draw (all cells are filled)
	        // Return true if the game is a draw
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ticTacToeGame game = new ticTacToeGame();

	        while (!game.isGameOver) {
	            game.drawBoard();
	            System.out.println("Current player: " + game.currentPlayer);
	            System.out.print("Enter row (0-2): ");
	            int row = scanner.nextInt();
	            System.out.print("Enter column (0-2): ");
	            int col = scanner.nextInt();

	            game.makeMove(row, col);
	        }

	        game.drawBoard();
	        System.out.println("Game Over!");
	        scanner.close();
	    }
	}
