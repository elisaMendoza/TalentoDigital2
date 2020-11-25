package com.figuras.testfigura;

import com.figuras.Figura;
import com.figuras.circulo.Circulo;
import com.figuras.cuadrado.Cuadrado;
import com.figuras.rectangulo.Rectangulo;

public class TestFigura {

	public static void main(String[] args) {
		Figura rect1 = new Rectangulo(4,5);
		Figura cuadra1 = new Cuadrado(3);
		Figura circ1 = new Circulo(2);
		
		System.out.println("Rectangulo: "+"area: "+rect1.getArea()+", perimetro: "+rect1.getPerimetrto());
		System.out.println("Cuadrado: "+"area: "+cuadra1.getArea()+", perimetro: "+cuadra1.getPerimetrto());
		System.out.println("Círculo1: "+"area: "+circ1.getArea()+", perimetro: "+circ1.getPerimetrto());
		System.out.println("-Total Areas de todas las figuras anteriores: " + Figura.getAreasTotales());
		
		Figura circ2 = new Circulo(3);
		Figura circ3 = new Circulo(1);
		System.out.println("Círculo2: "+"area: "+circ2.getArea()+", perimetro: "+circ2.getPerimetrto());
		System.out.println("Círculo3: "+"area: "+circ3.getArea()+", perimetro: "+circ3.getPerimetrto());
		System.out.println("-Total Area de Circulos: "+Circulo.areaTotal);
		

	}



}
