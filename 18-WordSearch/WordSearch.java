import java.util.*;
import java.io.*;

public class WordSearch {

    /* ------------------------- variables ------------------------- */

    private char[][] board;
    private int Row;
    private int Col;
    private Random Rand = new Random();
    private String kind;
    private ArrayList<String> words = new ArrayList<String>(50);

    /* ------------------------- contructors ------------------------- */

    public WordSearch(int r, int c, String k) {
	Row = r;
	Col = c;
	board = new char[r][c];
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		board[i][j]='.';
	    }
	}
	kind = k;
    }
    public WordSearch() {
	this(20,30,"words.txt");
    }

    /* ------------------------- toString ------------------------- */

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

    /* ------------------------- add methods ------------------------- */

    public boolean checker(String w, int row, int col,
			   int rdirection, int cdirection) {
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
    public boolean addWordHlf(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 0, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordVdw(String w, int row, int col) {
	int r = row;
	int c = col;	
	if ( checker(w, r, c, 1, 0) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		r = r + 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordHrt(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 0, -1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordVup(String w, int row, int col) {
	int r = row;
	int c = col;	
	if ( checker(w, r, c, -1, 0) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		r = r - 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordSE(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 1, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
		r = r + 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordNW(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, -1, -1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
		r = r - 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordNE(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, -1, 1) == true ) {
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c + 1;
		r = r - 1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordSW(String w, int row, int col) {
	int r = row;
	int c = col;
	if ( checker(w, r, c, 1, -1) == true ) { 
	    for(int i=0;i<w.length();i=i+1) {
		board[r][c] = w.charAt(i);
		c = c - 1;
		r = r + 1;
	    }
	    return true;
	}
	return false;
    }

    /* -------------------- puzzle building methods -------------------- */

    public void ReadFile() {
	Scanner sc = null;
	try {
	    sc = new Scanner(new File(kind));
	} catch (Exception e) { 
	    System.out.println("Can't Open File");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    words.add(s);
	}
    }

    public void wordAdder() {
	for (int i=0;i<words.size();i++) {
	    int r = Rand.nextInt(Row+1);
	    int c = Rand.nextInt(Col+1);
	    String x = words.get(i);
	    boolean d = false;
	    while (d == false) {
		int n = Rand.nextInt(8);
		if (n==0) {
		   d = addWordHlf(x,r,c);
		} else if (n==1) {
		    d = addWordHrt(x,r,c);
		} else if (n==2) {
		    d = addWordVup(x,r,c);
		} else if (n==3) {
		    d = addWordVdw(x,r,c);
		} else if (n==4) {
		    d = addWordNE(x,r,c);
		} else if (n==5) {
		    d = addWordNW(x,r,c);
		} else if (n==6) {
		    d = addWordSE(x,r,c);
		} else if (n==7) {
		    d = addWordSW(x,r,c);
		}
	    }
	}
    }

    public void fillIn() {
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		if (board[i][j] == '.') {
		    int n = Rand.nextInt(26) + 65;
		    char ch = (char)n;
		    board[i][j] = ch;
		}
	    }
	}
    }

    public void MakePuzzle() {
	ReadFile();
	wordAdder();
	fillIn();
    }

}
