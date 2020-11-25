package com.figuras;

public class Figura {
	private float area;
	private float perimetro;
	public static float areasTotales=0;
	
	public float getArea() {
		return this.area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getPerimetrto() {
		return this.perimetro;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	public static float getAreasTotales() {
		return areasTotales;
	}
}
