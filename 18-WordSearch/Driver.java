public class Driver {

    public static void main(String[] args) {
	WordSearch W = new WordSearch();
	W.addWordVdw("opal",8,12);
	W.addWordHlf("hello",8,8);
	W.addWordHrt("great",7,7);
	W.addWordVdw("there",10,9);
	W.addWordVup("hat",6,19);
	W.addWordSE("boo",1,1);
	W.addWordNE("cat",13,14);
	W.addWordSW("dog",11,4);
	W.addWordNW("bug",19,10);
	System.out.println(W);

    }

}
