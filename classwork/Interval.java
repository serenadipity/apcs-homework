import java.io.*;
import java.util.*;

class Interval {
    private int low,high;
    private Random r = new Random();
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

    public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	    System.out.println(new Interval());
	}
	Interval i = new Interval();
	i.printstuff(); // normal calling off an instance
	printstuff(); // b/c printStuff is static, can call it w/o an instance
	Interval.printstuff(); // we can also call it right off a class
	
	Interval[] a = new Interval[10];
	for (int i=0; i<a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));

    }
}
