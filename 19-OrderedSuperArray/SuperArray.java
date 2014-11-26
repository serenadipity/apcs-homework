public class SuperArray {

    private int[] data;
    private int nextBlank;
    private int endpt;

    public SuperArray( int i ) {
	data = new int[i];
	nextBlank = 0;
	endpt = i;
    }

    public String toString(){
	String s="";
	for (int i=0;i<data.length;i++){
	    s=s+data[i]+", ";
	}
	return s;
    }

    public void add( int i ) {
	grow();
	for (int x=0;data[nextBlank]!=0;x=x+1) {
	    nextBlank = nextBlank + 1;
	}
	data[nextBlank] = i;
	nextBlank = nextBlank + 1;
    }

    public void add( int index, int i ) {
	if (index > size() ) {
	    endpt = index;
	}
	grow();
	for (int x=data.length-1;x>index;x=x-1) {
	    data[x] = data[x-1];
	}
	data[index] = i;
	endpt = index + 1;
    }

    public int get( int index ) {
	return data[index];
    }

    public int size() {
	return data.length;
    }

    public void set( int index, int i ) {
       	data[index] = i;
    }

    public void grow() {
	if ( endpt >= data.length ) {
	    int[] end = new int[data.length + (data.length/2)];
	    for (int i=0;i<data.length;i=i+1) {
		end[i] = data[i];
	    }
	    data = end;
	}
    }

}
