import java.io.*;
import java.util.*;

public class Searching{
    Comparable[] a;
    int len = 0;
    
    public Searching(int k){
        a = new Comparable[k];
        len = k;
    }
    
    public void additem(Comparable n){
        int i = 0;
        while (a[i] != null){
            i++;
        }
        if (i < a.length){
            a[i] = n;
        }
        else {
            len = len + 5;
            a = new Comparable[len];
        }
    }
    
    public void sort(){
        Arrays.sort(a);
    }
    
    public Comparable lsearch(Comparable x){
        for (int i=0; i<a.length; i++){
            if (a[i]==x){
                return i;
            }
        }
        return null;
    }
    
    public Comparable bsearch(Comparable x){
        //only works if this is already sorted in main class
        int low = 0;
        int high = a.length-1;
        int middle = 0;
        while (high >= low) {
            middle = (low + high)/2;
            if (a[middle] == x){
                return a[middle];
            }
            if (x.compareTo(a[middle]) < 0) {
                high = middle -1;
            }
            if (x.compareTo(a[middle]) > 0) {
                low = middle + 1;
            }
        }
        return null;
    }

    public Comparable rbsearch(Comparable n){
        return rbsearch(n, 0, a.length-1);
    }
    
    public Comparable rbsearch(Comparable n, int low, int high){
        int p = (high-low)/2 + low;
        if (high < low){
            return null;
        } 
        else {
            if (a[p].compareTo(n)==0){
                return p;
            } 
            else {
                if (a[p].compareTo(n)<0){
                return rbsearch(n, p + 1, high);
                }
                else {
                    return rbsearch(n, low, p - 1);
                }
            }
        }
    }
    
    public static void main(String[] args){
        Searching s = new Searching(50);
        for (int i=0; i < 50; i++) {
            s.additem(i);
        }
        System.out.println(s);
        s.sort();
        System.out.println(s);
        System.out.println(s.lsearch(7));
        System.out.println(s.lsearch(4));
        System.out.println(s.bsearch(2));
        System.out.println(s.bsearch(9));
        System.out.println(s.rbsearch(6));
        System.out.println(s.rbsearch(1));
    }
}
