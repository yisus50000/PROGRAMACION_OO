package juego.ajedrez;

public class Rey extends TableroAjedrez{


	public String color;
	
	public String toString() {
		return "Rey [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
