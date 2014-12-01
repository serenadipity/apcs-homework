import java.io.*;
import java.util.*;

public class Sarray{
    private int[] data;
    private int last;
    
    public Sarray(){
	data = new int[10];
	// start array with size 10
	last = 0;
    }

    public int find() {
	int index = 0;
	for (int i =0; i< data.length; i++) {
	    if (data[i]==0) { // 0 is initial value
		index = i;
	    }
	}
	return index;
    }

    //last = find();

    public void add(int i) {
	// add to end
	data[last] = i;
    }
    public void add(int index, int i) {
	// add at location index; shift everything else down
	if (last >= data.length){
	    int[] Array1 = new int[data.length + 5];
	    for (int i=0;i<data.length;i++) {
		Array1[i] = data[i];
	    }
	    data = Array1;
	}
	for(int k = length;k > 0;k--){
	    if(k > index){
	        data[k] = data[k-1];
	    } else if (k == index){
		data[k] = i;
		length +=1;
	    }
	 }
    }

    public int get(int index) {
	return data[index];
    }

    public void set(int index, int i) {
	int k = data[index];
	data[index] = i;
	return k;
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	return last;
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int k = data[index];
	for (int i=0; i<last;i++) {
	    if (i >= index) {
		data[i] = data[i+1];
	    }
	}
	length--;
	return k;
    }

    public static void main(String[] args) {
	Sarray s = new Sarray();
	return s;
    }
}
