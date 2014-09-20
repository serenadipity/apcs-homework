public class Driver {
    public static void main(String[] args){
	String s="serena chan";
	System.out.println("My name is: "+s);
	int location = s.indexOf(" ");
	System.out.println("The location of the space is: "+location);
	String first = s.substring(0, location);
	System.out.println("My first name is: "+first);
	String last = s.substring(location + 1);
	System.out.println("My last name is: "+last);
    }
}
