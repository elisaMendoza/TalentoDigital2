package com.figuras.circulo;

import com.figuras.Figura;

public class Circulo extends Figura {
	final float pi = 3.1416f;
	public static float areaTotal=0;
	
	public Circulo(float radio) {
		setArea(pi*(radio*radio));
		setPerimetro(2*pi*radio);
		areaTotal += getArea();
		Figura.areasTotales += this.getArea();
	}
	
}
