public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addWordV("yooo",4,8);
	w.addWordSE("hey",6,9);
	w.addWordNE("hiii",11,13);
	w.addWordNW("hihi",17,15);
	w.addWordSW("hola",14,8);
	System.out.println(w);
    }
}
