package com.figuras.rectangulo;

import com.figuras.Figura;

public class Rectangulo extends Figura {
	public static float areaTotal=0;
	
	public Rectangulo(float ladoA, float ladoB) {
		setArea(ladoA * ladoB);
		setPerimetro(2*(ladoA + ladoB));
		areaTotal += this.getArea();
		Figura.areasTotales += this.getArea();
	}
	
}
