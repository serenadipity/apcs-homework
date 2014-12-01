public class SuperArray {

    private String[] data;

    public SuperArray() {
	data = new String[20];
	for (int i=0; i<data.length, i++) {
	    data[i] = "";
	}
    }

    public SuperArray(int i) {
	data = new String[i];
	for (int j=0; j<data.length; j++) {
	    data[j]="";
	}
    }

    public boolean add(String str) {
	int i = 0;
	while (data[i]!="") {
	    i++;
	}
	
	    
		
	grow();
	int i = 0;
	while (data[i]!="") {
	    i++;
	}
	data[i] = str;
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
