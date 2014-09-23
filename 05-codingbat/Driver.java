public class Driver {
    public static void main(String[] args){
	StringStuff s = new StringStuff();
	StringStuff s2 = new StringStuff();
	StringStuff s3 = new StringStuff();
	int n = s.diff21(54);
	System.out.println(n);
	String m = s2.nonStart("Hello","World");
	System.out.println(m);
	String p = s3.makeAbba("abc","def");
	System.out.println(p);
    }
}
