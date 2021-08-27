package juego.ajedrez;

public class Reina extends TableroAjedrez {

	public String color;

	
	public String toString() {
		return "Reina [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
