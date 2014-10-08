public class Driver {
    public static void main(String[] args) {
        BaseChar c = new BaseChar();
	Warrior w = new Warrior();
	Mage m = new Mage();
       	c.setHealth(150);
	w.setName("Groo");
	m.setName("Mr. Sage");
	
	w.attack(m);
	m.attack(w);
	w.attack(w);

	System.out.println(w.toString());
	/*
	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());

	System.out.println(m.getManna());
	*/
    }	     
}
