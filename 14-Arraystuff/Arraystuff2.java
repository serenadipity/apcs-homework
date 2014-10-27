import java.io.*;
import java.util.*;

public class Arraystuff2{
    private int[] a;
    private Random rnd;

    public Arraystuff2(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff2() {
	this(100);
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int value){
        for (int i=0;i<a.length;i++){
	    if (a[i]==value){
		return i;
	    }
	}
	return -1;
    }

    public int maxvalue() {
	int maxnum = a[0];
	for(int i = 0;i<a.length;i++) {
	    if (a[i]>maxnum) {
		maxnum = a[i];
	    }
	}
	return maxnum;
    }
		
}
