import java.io.*;
import java.util.*;

class Interval implements Comparable{
    private int low,high;
    private static Random r = new Random();
    private static int numIntervals = 0;

    public Interval(int l, int h) {
	    low = l;
	    high = h;
    }

    public Interval() {
      low = r.nextInt(100);
	    high  = low + r.nextInt(100) + 1;
	    numIntervals++;
    }

    public String toString(){ 
	    String s = "[" + low + "," + high + "]";
	    return s;
    }

    public static void printstuff() {
	    System.out.println("Stuff");
    }
    
    public int compareTo(Object other) {
	/* cast other to the appropriate type and store in
	   local variable for convenience
	*/
	Interval o = (Interval)other;
	/*
	if (this.low == o.low) {
	    return this.high - o.high; 
	}
	else {
	    return this.low - o.low;
	}
	*/
	return (this.high - this.low) - (o.high - o.low);
    }

    public static void main(String[] args) {
	 for(int j = 0; j<10; j++) {
	    System.out.println(new Interval());
  }
	Interval b = new Interval();
	b.printstuff(); // normal calling off an instance
	printstuff(); // b/c printStuff is static, can call it w/o an instance
	Interval.printstuff(); // we can also call it right off a class
	
	Interval[] a = new Interval[10];
	for (int i=0; i<a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	Interval i1 = new Interval(5,10);
	Interval i2 = new Interval(5,5);
	System.out.println(i1.compareTo(i2));

	String[] sa = {"frog", "cat", "dog", "mouse"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
	
	int[] ia= {5,3,5,9,10,50,20,100};
	System.out.println(Arrays.toString(ia));
	Arrays.sort(ia);
	System.out.println(Arrays.toString(ia));

	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
    }
}

/*
An interface is a specification that lists methods.
For example:

interface Name {
     method signature;
     method2 signature;
     ...
}

where method signature is a public/private return type
name(params)

Interface built into java --> called Comparable

interface Comparable {
     public int compareTo(object other);
}

-*note: A class that implements an interface must define all the methods in the interface. Also, you can only extend one class but you can implement multiple interfaces.

*/
