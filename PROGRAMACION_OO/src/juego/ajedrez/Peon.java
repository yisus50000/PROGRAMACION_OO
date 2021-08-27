package juego.ajedrez;

public class Peon extends TableroAjedrez  {
	
	public String color;

	
	public String toString() {
		return "Peon [color = " + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
