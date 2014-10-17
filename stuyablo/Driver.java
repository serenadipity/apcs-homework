import java.util.*;
import java.io.*;

public class Driver {

   public static void twosecs() {
       try {
	   Thread.sleep(2000);
	   } catch (Exception e) {}
	}

    public static void main(String[] args) {
	/*
	Warrior w = new Warrior();
	Mage m = new Mage();
	*/
	System.out.println("You wake up alone in the forest");
	System.out.println("Are you a warrior or a mage?*Type warrior or mage*");
        Scanner scan = new Scanner(System.in);
	String type = scan.nextLine();
        type = type.toLowerCase();
	/*
	double d = Math.random();
	System.out.println(d);
	if (d >= .5) {
	    Mage enemy = new Mage();
	}
	else {
	    Warrior enemy = new Warrior();
	}
	*/
	System.out.println("A mysterious figure approaches...");	

	System.out.println("'I command you...tell me asl ;)'");
	twosecs();
	Scanner scan1 = new Scanner(System.in);
	String nametroll = scan1.nextLine();
	System.out.println("Excellent!");
	System.out.println("What is your name hottie? ;)");
	Scanner scan2 = new Scanner(System.in);
	String name = scan2.nextLine();
        
	
    }
}
