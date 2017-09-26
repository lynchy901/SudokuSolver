package com.company;

import java.util.Arrays;

/**
 * Created by nathanlynch on 9/25/17.
 */
public class SudokuBoard {
    private Integer[][] board;

    public SudokuBoard(Integer[][] board) {
        this.board = board;
    }

    public Integer[] findRow(Integer x) {
        Integer [] r = null;
        for (Integer[] row: board) {
            if (Arrays.asList(row).contains(x)) {
                r = row;
            }
        }

        return r;
    }

    public Integer[] findCol(Integer x) {
        Integer index = null;
        Integer[] column = new Integer[9];

        for (Integer[] row: board) {
            if (Arrays.asList(row).contains(x)) {
                index = Arrays.asList(row).indexOf(x); // finds index of the column the data exists in
            }
        }

        if (index != null) {
            for (int row = 0; row < board.length; row++) {
                column[row] = board[row][index]; // loops through rows and adds specific index of each row to form the column
            }
        }

        return column;
    }
}
