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
		
		cibi.set(0, "Ramen"); //modifichiamo il dato in posizione 0 da pasta a Ramen
		//prendiamo l'elemento in posizione 0 e lo stampiamo
		//stampiamo tutti gli elemti dell'ArrayList ciclando sulla lunghezza usando .size
		for(int i=0;i<cibi.size();i++) {
			System.out.print(cibi.get(i)+" ");
			System.out.print(prezzi.get(i)+"€");
			System.out.println();
		}
		System.out.println();
		//rimuoviamo l'elemento in posizione index 2
		prezzi.remove(2);
		cibi.remove(2);
		for(int i=0;i<cibi.size();i++) {
			System.out.print(cibi.get(i)+" ");
			System.out.print(prezzi.get(i)+"€");
			System.out.println();
		}
		cibi.clear(); //svuotiamo completamente l'ArrayList cibi
	}

}
