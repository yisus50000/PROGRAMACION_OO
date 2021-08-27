package juego.ajedrez;

public class Torre extends TableroAjedrez {

	public String color;

	
	public String toString() {
		return "Torre [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
