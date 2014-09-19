import java.io.*;
import java.util.*;

public class Greeter {
    /*
      public <- can be used outside of the class
      void <- this DOES NOT return anything
              you would place a "return type"
	      here if the method did return something
      greet <- That's the name
      () <- parameters go here
      { } <- the actual code goes between these

    */
    
    //Instance variables are almost always private.
    //We access them with "accessor methods" get and set
    private String greeting = new String("Hello World");

    // constructors

    /*
      Note- the name is the same as the class name
          - there is no return type (nothing between public and the name)
	  - it's always public

	  a constructor is run automatically when you instantiate the class.
	  that is, if you have: Greeter g = new Greet("Hello")
	  then Java will automatically call this contructor sending Hello
	  in as parameter g. It wil then set the instance variable
	  greeting to what g refers to, which is hello
    */
    
    public Greeter(String g) {
	System.out.println("In the constructor");
	greeting = g;
    }
    
    /* WE can overload methods (including constructors which means we have more
       than one method with the same name. They just have to have different
       "signatures" which means different parameter types
    */
    // public Greeter(String g) {
	
    //regular methods

    public void setGreeting(String s) {
	//String greeting = new String("Sup!");
	greeting = s;
    }

    //String is the "return type" that is, the type of data that we
    //will send back using the return statement.
    //void is a special "return type" which means we won't be returning any
    //value
    public String getGreeting() {
	return greeting;
	
    }
    //

    /* out original greet just printed the greeting.
       Generally we want our methods to return information and only print if
       they are SPECIFICALLY designed to print.
    */
    public String greet() {
        return greeting;
     	//ungreet();
    }
    
    private void ungreet() {
	System.out.println("I'm out.");
    }
}
