package juego.ajedrez;

import java.util.Arrays;

public abstract class Piezas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peon peonBlanco = new Peon();
		peonBlanco.setColor("Blanco");

		Peon peonNegro = new Peon();
		peonNegro.setColor("Negro");

		Torre torreBlanca = new Torre();
		torreBlanca.setColor("Blanco");

		Torre torreNegra = new Torre();
		torreNegra.setColor("Negro");

		Caballo caballoBlanco = new Caballo();
		caballoBlanco.setColor("Blanco");

		Caballo caballoNegro = new Caballo();
		caballoNegro.setColor("Negro");

		Alfil alfilBlanco = new Alfil();
		alfilBlanco.setColor("Blanco");
		
		Alfil alfilNegro = new Alfil();
		alfilNegro.setColor("Negro");		

		Reina reinaBlanca = new Reina();
		reinaBlanca.setColor("Blanco");

		Reina reinaNegra = new Reina();
		reinaNegra.setColor("Negra");

		Rey reyBlanco = new Rey();
		reyBlanco.setColor("Blanco");

		Rey reyNegro = new Rey();
		reyNegro.setColor("Negro");
		
        Piezas tablero[][]= new Piezas[8][8];
		
		tablero[0][0]=torreBlanca;
		tablero[0][1]=caballoBlanco;
		tablero[0][2]=alfilBlanco;
		tablero[0][3]=reinaBlanca;
		tablero[0][4]=reyBlanco;
		tablero[0][5]=alfilBlanco;
		tablero[0][6]=caballoBlanco;
		tablero[0][7]=torreBlanca;
		
		tablero[1][0]=peonBlanco;
		tablero[1][1]=peonBlanco;
		tablero[1][2]=peonBlanco;
		tablero[1][3]=peonBlanco;
		tablero[1][4]=peonBlanco;
		tablero[1][5]=peonBlanco;
		tablero[1][6]=peonBlanco;
		tablero[1][7]=peonBlanco;
		
		tablero[6][0]=peonNegro;
		tablero[6][1]=peonNegro;
		tablero[6][2]=peonNegro;
		tablero[6][3]=peonNegro;
		tablero[6][4]=peonNegro;
		tablero[6][5]=peonNegro;
		tablero[6][6]=peonNegro;
		tablero[6][7]=peonNegro;
		
		tablero[7][0]=torreNegra;
		tablero[7][1]=caballoNegro;
		tablero[7][2]=alfilNegro;
		tablero[7][3]=reinaNegra;
		tablero[7][4]=reyNegro;
		tablero[7][5]=alfilNegro;
		tablero[7][6]=caballoNegro;
		tablero[7][7]=torreNegra;
		
		 System.out.println("Empleados y sus salarios");
	     System.out.println(Arrays.toString(tablero));
	}


	}

