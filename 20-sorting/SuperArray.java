import java.io.*;
import java.util.*;

public class OrderedSuperArray extends SuperArray{
	public String[] data;
    public static void main(String[] args){
	OrderedSuperArray osa = new OrderedSuperArray(10);
	osa.add("hi");
	osa.add("heythere");
	osa.add("hola");
	osa.add("bonjour");
	osa.add("ciao");
	System.out.println(osa.toString());
    }
    public OrderedSuperArray(int i){
	data = new String[i];
	for (int j=0;j<data.length;j++){
    	data[j]="";
    }
    }
    public void add(int index, String i){
	int length = i.length();
	int j = 0;
	while (length <= super.get(j).length()){
	    j++;
	}
	super.add(j, i);
    }
    public boolean add(String i){
	int length = i.length();
	int j = 0;
	while (length <= super.get(j).length()){
	    j++;
	}
	super.add(j, i);
	return true;
    }
    public void isort(){
    	for (int i=0;i<data.length;i++){
    		int k=0;
    		String s = data[i];
			for (k = i; k > 0 && s.length() < data[k-1].length() ; k--) {
    		data[k] = data[k-1];
		}
		data[k]=s;
    	}
    }
    
}
