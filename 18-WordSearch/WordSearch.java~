import java.io.*;
import java.util.*;
// creates a word search puzzle

public class WordSearch {

    private char[][] board;
    private int Row;
    private int Col;

    public WordSearch(int r, int c) {
	Row = r;
	Col = c;
	board = new char[r][c];
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,30);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean checker(String w, int row, int col, int rdirection, int cdirection) {
	int r = row;
	int c = col;
	for(int i=0;i<w.length();i=i+1) {
	    if ( r > Row - 1 || r < 0 ) {
		return false;
	    } else if ( c > Col - 1 || c < 0 ) {
		return false;
	    } else  if ( board[r][c] != '.' &&  w.charAt(i) != board[r][c] ) {
		return false;
	    }
	    c = c + cdirection;
	    r = r + rdirection;
	}
	return true;
    }
    public void addWordHlf(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 0, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
	    }
	}
    }
    public void addWordVdw(String w, int row, int col) {
	int r = row;
	int c = col;	
	if ( checker(w, r, c, 1, 0) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		r = r + 1;
	    }
	}
    }
    public void addWordHrt(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 0, -1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
	    }
	}
    }
    public void addWordVup(String w, int row, int col) {
	int r = row;
	int c = col;	
	if ( checker(w, r, c, -1, 0) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		r = r - 1;
	    }
	}
    }
    public void addWordSE(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 1, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
		r = r + 1;
	    }
	}
    }
    public void addWordNW(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, -1, -1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
		r = r - 1;
	    }
	}
    }
    public void addWordNE(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, -1, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
		r = r - 1;
	    }
	}
    }
    public void addWordSW(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 1, -1) == true ) { 
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
		r = r + 1;
	    }
	}
    }

}
