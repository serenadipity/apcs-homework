
public class Driver {
    public static void main(String[] args) {
	Arraystuff x = new Arraystuff();
	int[] array1 = new int[]{1,2,2,6,8,9,7,2};
	int[] array2 = new int[]{1,1,5,6,7,4};
	int[] array3 = new int[]{1,10,3,20,7,4};
	int[] array4 = new int[]{1,2,3,4};
	int[] array5 = new int[]{4,6,1,5,6,1};
	System.out.println(x);
	System.out.println(x.sum67(array1));
	System.out.println(x.more14(array2));
	System.out.println(x.tenRun(array3));
	System.out.println(x.tripleUp(array4));
	System.out.println(x.canBalance(array5));
	System.out.println(x.freq(4));
    }
}
