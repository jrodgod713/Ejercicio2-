package ejercicio2;

public class Card {

	public String suit;
	public String value;
	//Creación de cartas con variables para el tipo y el número
	public Card (String suit, String value) {
		//
		this.suit = suit;
		this.value = value;
	}
	//Uniendo el tipo y el número
	
	//23
	public String toString () {
		//
		return (this.suit+"-"+this.value);
	}
}