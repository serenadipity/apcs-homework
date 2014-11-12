import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> ai;
	ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0; i<20;i++) {
	    ai.add(r.nextInt(20));
	}
	System.out.println(ai);
    }
}
