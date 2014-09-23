public class Driver {
    public static void main(String[] args){
	
	public String makeOutWord(String out, String word) {
	    String y = out.substring(0,2);
	    String s = out.substring(2);
	    return y + word + s;
	}
	
	public boolean mixStart(String str) {
	    if (str.length() < 3)return false;
	    String two = str.substring(1,3);
	    return (two.equals("ix"));
	}
	
	public String firstHalf(String str) {
	    String s = str.substring(0,(str.length())/2);
	    return s;
	}
    }
}
