/* subclass of BaseChar */
public class Warrior extends BaseChar{
    private int healthboost=5;
    public Warrior(String n){
	//calls the super classes zero param constructor
	// even if you don't write this, the super constructor will always
	//be called as the first line of a subclass' constructor
	super(n);
	setName(n);
    }
    public void attack(BaseChar other){
	// System.out.println(this.getName()+" is super attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is super attacking "+other);
	
    }
    
      public int getHealth() {
	  return healthboost + super.getHealth();
    }

}
