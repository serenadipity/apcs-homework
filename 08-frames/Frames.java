public class Frames {

    public String line(int c) {
	String s = "";
	while (c > 0) {
	    s = s + "*";
	    c--;
	}
	return s;
    }

    public String line2(int c) {
	String s = "";
	if (c > 0) {
	    s = s + "*";
	}
	int z = c-2;
	while (z > 0) {
	    s = s + " ";
	    z--;
	}
	if (c >= 2) {
	s = s + "*";
	}
	return s;
    }

    public String frame(int r, int c) {
	String s = "";
	if (r >= 1 && c > 0) {
	    s = s + line(c) + "\n";
	while (r-2 > 0) {
	    s = s + line2(c) + "\n";
	    r--;
	}
	s = s + line(c);
	}
	return s;
    }

    public String stringSplosion(String str) {
	String s = "";
	int len = str.length();
	for (int i = 1; i <= len; i = i + 1) {
	    s = s + str.substring(0, i);
	}
	return s;
    }

    public String stringX(String str) {
	String result = "";
	for (int i=0; i<str.length(); i++) {
	    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		result = result + str.substring(i, i+1);
	    }
	}
	return result;
    }

}

