public class Driver4{

    public static void main(String[] args){
	Greeter g1 = new Greeter();
        System.out.println(g1.greet());
	System.out.println("Before the constructor is called");
	Greeter g2 = new Greeter("Howdy!");
	System.out.println("After the contructor is called");
	System.out.println(g2.greet());
    }
}
