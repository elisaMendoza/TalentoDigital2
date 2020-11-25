package com.figuras.cuadrado;

import com.figuras.Figura;

public class Cuadrado extends Figura {
	public static float areaTotal=0;
	
	public Cuadrado(float lado) {
		setArea(lado * lado);
		setPerimetro(4*lado);
		areaTotal += this.getArea();
		Figura.areasTotales += this.getArea();
	}
}
