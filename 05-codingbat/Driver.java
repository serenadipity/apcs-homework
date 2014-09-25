/* working with Pooneet */

public class Driver {
    public static void main(String[] args){
	StringStuff s = new StringStuff();
	int n = s.diff21(54);
	System.out.println(n);
	String m = s.nonStart("Hello","World");
	System.out.println(m);
	String p = s.makeAbba("abc","def");
	System.out.println(p);
	boolean q = s.nearHundred(199);
	System.out.println(q);
	boolean r = s.mixStart("max snacks");
	System.out.println(r);
	int t = s.teaParty(1, 2);
	System.out.println(t);
	boolean v = s.lastDigit(14, 42, 7);
	System.out.println(v);
    }
}
