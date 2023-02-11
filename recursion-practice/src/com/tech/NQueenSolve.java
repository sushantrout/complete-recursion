package com.tech;

import java.util.ArrayList;

public class NQueenSolve {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> board = new ArrayList<>();
		ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<>();

		int n = 4;
		for (int i = 0; i < n; i++) {
			ArrayList<String> rowData = new ArrayList<String>();
			for (int j = 0; j < n; j++) {
				rowData.add(".");
			}
			board.add(rowData);
		}

		getQueenPlacement(0, n, board, result);
		for (ArrayList<ArrayList<String>> arrayList : result) {
			for (ArrayList<String> row : arrayList) {
				System.out.println(row);
			}
			System.out.println();
		}
	}

	private static void getQueenPlacement(int column, int n, ArrayList<ArrayList<String>> board,
			ArrayList<ArrayList<ArrayList<String>>> result) {
		if (column == n) {
			ArrayList<ArrayList<String>> currentBoard = new ArrayList<ArrayList<String>>();
			for (ArrayList<String> r : board) {
				ArrayList<String> currentRow = new ArrayList<>();
				currentBoard.add(currentRow);
				for (String c : r) {
					currentRow.add(c);
				}
			}
			result.add(currentBoard);
			return;
		} else {
			for (int row = 0; row < n; row++) {
				boolean safe = isSafe(row, column, board, n);
				if (safe) {
					board.get(row).set(column, "Q");
					getQueenPlacement(column + 1, n, board, result);
					board.get(row).set(column, ".");
				}
			}
		}
	}

	private static boolean isSafe(int row, int col, ArrayList<ArrayList<String>> board, int n) {
		int duprow = row;
		int dupcol = col;

		while (row >= 0 && col >= 0) {
			if (getPlacementStatus(row, col, board))
				return false;
			row--;
			col--;
		}

		col = dupcol;
		row = duprow;
		while (col >= 0) {
			if (getPlacementStatus(row, col, board))
				return false;
			col--;
		}

		row = duprow;
		col = dupcol;
		while (row < n && col >= 0) {
			if (getPlacementStatus(row, col, board))
				return false;
			row++;
			col--;
		}
		return true;
	}

	private static boolean getPlacementStatus(int row, int col, ArrayList<ArrayList<String>> board) {
		return board.get(row).get(col) == "Q";
	}
}
