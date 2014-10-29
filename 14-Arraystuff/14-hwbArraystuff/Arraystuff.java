import java.io.*;
import java.util.*;

public class Arraystuff{
    private int[] a;
    private Random rnd;

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int sum67(int[] nums) {
	int f = 0;
	boolean s = true;
	for (int i = 0;i<nums.length;i++) {
	    if (nums[i]==6) {
		s = false;
	    }
	    if (s == true) {
		f += nums[i];
	    }
	    if (nums[i]==7) {
		s = true;
	    }
	}
	return f;
    }
    public boolean more14(int[] nums) {
	int freq = 0;
	int freq2 = 0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i] == 1) {
		freq += 1;
	    }
	    if (nums[i] == 4){
		freq2 += 1;
	    }
	}
	return (freq > freq2);
  
    }

    public int[] tenRun(int[] nums) {
	boolean s = false;
	int k = 0;
	for(int i=0;i<nums.length;i++) {
	    if (nums[i] % 10 == 0) {
		s = true;
		k = nums[i];
	    }
	    if (s == true) {
		nums[i] = k;
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	boolean b = false;
	for (int i = 0; i<=nums.length-3; i++) {
	    if ((nums[i+1] == (nums[i] + 1)) && (nums[i+2] == nums[i] + 2)) {
		b = true;
	    }
	}
	return b;
    }

    public boolean canBalance(int[] nums) {
	int count = 0;
	for (int i = 0;i < nums.length; i++) {
	    count += nums[i];
	    int count2 = 0;
	    for (int j = nums.length-1; j > i; j--) {
		count2 += nums[j];
	    }
	    if (count == count2){
		return true;
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] a;
	a = new int[n*(n+1)/2];
	int k = 0;
	for (int i=0;i <= n; i++) {
	    for (int j = 1; j <=i; j++, k++) {
		a[k] = j;
	    }
	}
	return a;
  
    }

    public int freq(int n) {
        int i = a[n];
	int counter = 0;
	for (int j = 0; i<a.length; i++) {
	    if (i == a[i]) {
		counter++;
	    }
	}
	return counter;
    }
}
