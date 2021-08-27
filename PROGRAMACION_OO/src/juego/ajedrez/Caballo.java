package juego.ajedrez;

public class Caballo extends TableroAjedrez {

	public String color;

	
	public String toString() {
		return "Caballo [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
