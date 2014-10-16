public class Greeter2 {
   
    private String greeting = new String("Hello");
    public void setGreeting(String s){
	greeting = s;
    }

    public String greetPerson(String name){
	return greeting+ " "+name;
    }
    
}
