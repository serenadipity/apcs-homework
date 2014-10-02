public class Loops3 {

    public String tri3(int h) {
	String s = "";
	int i = 0;
	int j;
	while (i <= h) {
	    j = 0;
	    while (j < i){
		s = s + "*";
		j = j + 1;
	    }
	    s = s + "\n";
	    i = i + 1;
	}
	return s;
    }

    public String tri4(int h) {
	String s = "";
	int row = 0;
	int i;
	while (row < h) {
	    /*space part*/
	    i = 0;
	    while (i < h-row-1) {
		s = s + " ";
		i++;
	    }
	    /*star part*/
	    i = 0;
	    while ( i < row+1) {
		s = s + "*";
		i = i + 1;
	    }
	    s = s + "\n";
	    row = row + 1;
	}
	    
	return s;
    }
}
