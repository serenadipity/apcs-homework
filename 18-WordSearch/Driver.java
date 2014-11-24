public class Driver {

    public static void main(String[] args) {
	WordSearch W = new WordSearch(30,50,"words.txt");
	W.MakePuzzle();
	System.out.println(W);

    }

    }

}
