package tic_tac;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Current player: " + currentPlayer);
            System.out.print("Enter row (0, 1, 2) and column (0, 1, 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;

                if (checkForWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a draw!");
                    break;
                }

                changePlayer();
            } else {
                System.out.println("This move is not valid");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
