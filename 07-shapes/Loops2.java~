public class Loops2 {
    public String box(int r, int c){
	String s = "";
	int i = c;
	while (r > 0) {
	    while (c > 0) {
		s = s + "*";
		c = c - 1;
	    }
	    s = s + "\n";
	    c = i;
	    r = r - 1;
	}
	return s;
        }

    public String frontTri(int c) {
	String s = "";
	int i = 1;
	int x = 1;
	while (c > 0) {
	    while (i <= x) {
	    s = s + "*";
	    i = i + 1;
	}
	    s = s + "\n";
	    c = c - 1;
	    x = x + 1;
	    i = 1;
	}
	return s;
    }

    public String reverseTri(int c) {
	String s = "";
	int x = c;
	int i = 0;
	while (i <= c) {
	    while (c > 0) {
		s = s + "*";
		c = c - 1;
	    }
	    x = x - 1;
	    c = x;
	    s = s + "\n";
	}
	return s;
    }
}
