package juego.ajedrez;

public class Torre extends Piezas {

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
