public class Driver {

    public static void main(String[] args) {
	SuperArray A = new SuperArray(10);
	A.add(1);
	A.add(2);
	A.add(3);
	A.add(4);
	A.add(5);
	A.add(6);
	A.add(7);
	A.add(8);
	A.add(9);
	A.add(10);
	A.add(11);
	A.add(18,18);
	A.set(3,33);
	System.out.println(A);
	int a = A.size();
	System.out.println(a);
    }

}
