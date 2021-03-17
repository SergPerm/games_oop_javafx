package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (isHorizontalWin(board, i) || isVerticalWin(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean isHorizontalWin(int[][] board, int row) {
        boolean rslH = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rslH = false;
                break;
            }
        }
        return rslH;
    }

    public static boolean isVerticalWin(int[][] board, int cell) {
        boolean rslV = true;
        for (int[] ints : board) {
            if (ints[cell] != 1) {
                rslV = false;
                break;
            }
        }
        return rslV;
    }
}
