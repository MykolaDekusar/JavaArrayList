import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList = un array ridimensionabile
		//            aggiunta/rimozione di elementi dopo la compilazione
		//            contiene tipi di dati di riferimento
		//dobbiamo importare java.util.ArrayList; per poterla utilizzare
		ArrayList<String> cibi = new ArrayList<String>();
		//aggiungiamo elementi String al nostro ArrayList di tipo String
		cibi.add("pasta");
		cibi.add("Manzo");
		cibi.add("Pizza");
		
		ArrayList<Integer> prezzi = new ArrayList<Integer>();
		//aggiungiamo elementi Integer al nostro ArrayList di tipo Integer
		prezzi.add(10);
		prezzi.add(15);
		prezzi.add(8);
	}

}
