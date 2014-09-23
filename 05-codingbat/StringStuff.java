public class StringStuff {

    public String nonStart(String a, String b) {
	String c = a.substring(1);
	String d = b.substring(1);
	String e = c+d;
	return e;
    }

    public String makeAbba(String a, String b){
	String x = a+b+b+a;
	return x;
	    }

    public int diff21(int n) {
	int first = 21 - n;
	if (first > 0) return first;
	else return (first * -1 * 2);
    }
}
