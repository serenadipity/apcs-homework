import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Mage[] mag = new Mage[10];
        Random r = new Random();
	for(int i =0; i<mag.length; i++){
	    String name = "";
	    name += (char)('A' + r.nextInt(26));
	    mag[i] = new Mage();
	    mag[i].setName(name);
	}
	System.out.println(Arrays.toString(ma));
	Arrays.sort(ma);
	System.out.println(Arrays.toString(ma));
	
	ArrayList<Warrior> war = new ArrayList<Warrior>();
	for(int i =0;i<10;i++){
	    String name = "";
	    name += (char)('A' + rnd.nextInt(26));
	    Warrior k = new Warrior();
	    k.setName(name);
	    war.add(k);
	}
	System.out.println(war);
	Collections.sort(war);
	System.out.println(war);
      
    }
}
