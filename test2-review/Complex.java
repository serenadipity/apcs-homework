public class Complex{
    
    private int a,b;
    
    public Complex(int x, int y) {
	a = x;
	b = y;
    }

    public String toString() {
	String s = a + " + " +  b + "i";
	return s;
    }

    public double norm() {
	return Math.sqrt( a*a+b*b);
    }

    public int compareTo(Complex other){
	return (int)this.norm(); //- other.norm();
    }
}
