package juego.ajedrez;

public class Alfil extends TableroAjedrez {

	public String color;

	
	public String toString() {
		return "Alfil [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
