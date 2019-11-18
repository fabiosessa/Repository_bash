package corsoJava1.giorno1;

public class DatiGruppo {

	public static void main(String[] args) {
		//Dati primo componente del gruppo Marte
		String nome1 = "Antonietta";
		String cognome1 = "De Angelis";
		int età1 = 31;
		
		//Dati secondo componente del gruppo Marte
		String nome2 = "Simone";
		String cognome2 = "Vinci";
		int età2 = 23;
		
		//Dati terzo componente del gruppo Marte
		String nome3 = "Fabio";
		String cognome3 = "Sessa";
		int età3 = 27;
		
		//Definiamo una variabile somma di tipo double per evitare conversioni implicite nel calcolo della media 
		double somma = età1 + età2 + età3;
		double media = somma/3;
		
		double differenza1 = età1 - media;
		double differenza2 = età2 - media;
		double differenza3 = età3 - media;
		
		System.out.println("Gruppo Marte\n");
		System.out.println("Nome: "+nome1+" - Cognome: "+cognome1+" - Età: "+età1+" - Differenza età dalla media: "+differenza1+"\n");
		System.out.println("Nome: "+nome2+" - Cognome: "+cognome2+" - Età: "+età2+" - Differenza età dalla media: "+differenza2+"\n");
		System.out.println("Nome: "+nome3+" - Cognome: "+cognome3+" - Età: "+età3+" - Differenza età dalla media: "+differenza3+"\n");
	}

}
