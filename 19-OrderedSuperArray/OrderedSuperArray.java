public class OrderedSuperArray extends SuperArray {

    private String[] data;
    private int nextBlank;
    private int endpt;

    public OrderedSuperArray( int i ) {
	data = new String[i];
	nextBlank = 0;
	endpt = i;
    }
    
}
