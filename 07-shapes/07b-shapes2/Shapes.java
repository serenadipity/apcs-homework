

public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }

    public String tri3(int h) {
	String output = "";
	int sideSpaces;
	int starNum = 1;
	for (int y = 0; y < h; y++) {
	    sideSpaces = h - y + 1;
	    for (int spaceLeft = 0; spaceLeft < sideSpaces; spaceLeft++) {
		output+=" ";
	    }
	    for (int starCounter = 0; starCounter < starNum; starCounter++) {
		output+="*";
	    }
	    starNum+=2;
	    for (int spaceRight = 0; spaceRight < sideSpaces; spaceRight++) {
		output += " ";
	    }
	    output += "\n";
	}
	return output;
    }

    public String tri4(int h){
	String output = "";
	for (int height = h; height > 0; height--) {
	    for (int spaceLeft = 0; spaceLeft < h-height; spaceLeft++){
		output += " ";
	    }
	    for (int stars = 0; stars < height; stars++) {
		output += "*";
	    }
	    output += "\n";
	}
	return output;
    }

    public String diamond(int h) {
	String output = "";
	output += tri3(h/2 + h%2);
	output = output.substring(0, output.length() - 1);
	int maxStarLength;
	if (h/2 == 1) {
	    maxStarLength = 1;
	}else{
	    maxStarLength = 1 + (h/2 + h%2 - 1)*2;
	}
	String reversedTri = new StringBuilder(tri3(h/2 + h%2)).reverse().toString();
	String reversedNewLine = new StringBuilder("\n").reverse().toString();
	if (h%2 != 0) {
	    reversedTri = reversedTri.substring(maxStarLength + 1);
	}
	output += reversedTri.replace(reversedNewLine, "\n");
	output += "\n";
	return output;
    }
	
}
