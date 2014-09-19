public class Driver3 {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();
	System.out.println(g1.greet());
	System.out.print(g2.greet());

	//We can't do this because greeting is private
	// g1.greeting = new String("sup");
	//Instead we write and use a set method
	//
	//new String("Sup") makes a new block of memory, puts Sup! in it
	// and then returns its address

	g1.setGreeting(new String("Sup!"));
	g1.greet();
	g2.greet();
	
	//Here, we're using the string literal Howdy! and Java just
	//returns its address without grabbing a new block of memory.
	//if we use "howdy!" a bunch of times, they'll all point to the same
	//"Howdy" whereas if we use new String a bunch of times, each will point
	//to a different one.
	
	g2.setGreeting("Howdy");

	g1.greet();
	g2.greet();

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: "+s);
	System.out.println("g2's greeting is: "+g2.getGreeting());
	/*
	 1. Type in the greeter and driver and test them
	 2. Uncomment the line specified in greeter, run - what happens and why
	    then comment the line again
	 3. See if you can figure out how to change the instance variable
	 4. Run again - are g1 and g2 greeter you differently now?
	    Why or why not?
	 5. What if we make the instance variable greeting provate.
	    Does it change what you did for questions 3 and 4?
	*/
    }

}
