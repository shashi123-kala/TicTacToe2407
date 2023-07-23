package com.ttt.tdd;

import com.ttt.exceptions.TicTacToeException;

public class TicTacToe {

	private Character[][] board = { { '\0', '\0', '\0' }, { '\0', '\0', '\0' }, { '\0', '\0', '\0' } };
	private char lastPlayer = '\0';


	public void play(int column, int row) {
		
		checkAxis(column, "X value is outside the board!");
		checkAxis(row, "Y value is outside the board!");		
		setField(column, row, "Field is occupied!");
		
	}
	
	public char nextPlayer() {
		if (lastPlayer == 'X') {
			return 'O';
		}
		return 'X';

	}

	private void setField(int column, int row,String msg) {
        if (board[column - 1][row - 1] != '\0') {
            throw new TicTacToeException(msg);
        } else {
            board[column - 1][row - 1] = 'X';
        }
    }
	
	private void checkAxis(int axis, String message) {
		if (axis < 1 || axis > 3) {
			throw new TicTacToeException(message);
		}
	}
	
	
}
