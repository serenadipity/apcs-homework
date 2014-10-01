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

    public String tri1(int c) {
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

    public String tri2(int h) {
	String s = "";
	int count = 1;
	while (count <= h) {
	    int c = 0;
	    int g = (h - count);
	    while (c < g) {
		s = s + " ";
		c = c + 1;
	    }
	    int f = 1;
	    while (f <= count) {
		s = s + "*";
		f = f + 1;
	    }
	    s = s + "\n";
	    count = count + 1;
	}
	return s;
    }
}
