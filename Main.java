package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Integer is a wrapper class which makes a primitive an object. Allows us to do things like .contains
        // since you can't do that on an array of primitives. Can treat them as primitives otherwise
        Integer[][] board = {
                {1,1,1,1,1,1,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,3,8,9},
                {1,2,3,4,5,6,7,8,11}
        };

        SudokuBoard gameboard = new SudokuBoard(board);

        for (Integer x: gameboard.findRow(11)) { // loops through Integer array returned
            System.out.print(x + ", ");
        }
        System.out.println();
        for (Integer x: gameboard.findCol(11)) {
            System.out.print(x + ", ");
        }
    }
}
