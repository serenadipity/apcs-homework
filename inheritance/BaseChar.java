/*superclass of Warrior */

public class BaseChar {
    private int health=20;
    private String name = "default name";

    public String toString(){
	return this.getName();
    }

    public void attack(BaseChar other) {
	System.out.println(this.getName() + " is attacking "+ other.getName());
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public int getHealth() {
	return health;
    }

    public void setHealth(int i){
	health = i;
    }
}
