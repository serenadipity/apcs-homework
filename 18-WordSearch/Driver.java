public class Driver {

    public static void main(String[] args) {
	WordSearch W = new WordSearch(30,50,"LameVillains.txt",10);
	W.MakePuzzle();
	System.out.println(W);

    }

}
