package basicjava;
import java.util.ArrayList;
public class BasicJava {
	public void bubble() {
		int n = 5;
		int x = 0;
		int[] array = {2,10,1,5,7};
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j <n; j++) {
				if(array[i] > array[j]) {
					x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
			
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);//imprime arreglo en orden ascendente
		}
	}

	public void imprimeNum() {
		int i=1;
		while(i <256) {
			System.out.println(i);
			i++;
		}
	}
	
	public void imprimeImpar() {
		int i = 1;
		while(i < 256) {
			System.out.println(i);
			i+=2;
		}
	}
	
	public void imprimeSum() {
		int i=0;
		int j=0;
		while(i <256) {
			System.out.println("Nuevo numero: "+i+" Suma: "+j);
			i++;
			j=j+i;
		}
	}
	
	public void recorreArray() {
		int[]array = {1,3,5,7,9,13};
		for(int i= 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void maxArray() {
		int[]array = {1,3,5,7,9,13};
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("El máximo es: "+ max);
	}
	
	public void promArray() {
		float[]array = {1,3,5,7,9,13};
		float sum = 0;
		float prom;
		for(int i = 0; i < array.length; i++) {
			sum = sum+array[i];
		}
		prom = sum/array.length;
		System.out.println("El promedio es: "+prom);
	}
		public void arrayImpar() {
			ArrayList<Integer> y = new ArrayList<Integer>();
			int i = 1;
			while(i < 256) {
				y.add(i);
				i+=2;
			}
			System.out.println(y);
		}
		
		public void mayorY() {
			int[]array = {1,3,5,7,9,13};
			int y = 3;
			int sum = 0;
			for(int i = 0; i < array.length; i++) {
				if(array[i] > y) {
					sum++;
				}
			}
			System.out.println("Cantidad de números mayores a "+ y +": " + sum);
		}
		
		public void arrayCuadrado() {
			ArrayList<Integer> cuadrado = new ArrayList<Integer>();
			cuadrado.add(1);
			cuadrado.add(3);
			cuadrado.add(5);
			cuadrado.add(7);
			cuadrado.add(9);
			System.out.println("Arreglo: " + cuadrado);
			for(int i = 0; i < cuadrado.size(); i++) {
				int num = (cuadrado.get(i))*(cuadrado.get(i));
				cuadrado.set(i, num);
			}
			System.out.println("Arreglo al cuadrado: " + cuadrado);
			}
		public void arraySinNeg() {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();
			arreglo.add(1);
			arreglo.add(5);
			arreglo.add(10);
			arreglo.add(-2);
			arreglo.add(3);
			System.out.println("Arreglo con números negativos: " + arreglo);
			for(int i= 0; i < arreglo.size(); i++) {
				if(arreglo.get(i) < 0) {
					arreglo.set(i, 0);
				}
			}System.out.println("Arreglo sin números negativos: " + arreglo);
		}
		public void minManPro() {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();
			arreglo.add(1);
			arreglo.add(5);
			arreglo.add(10);
			arreglo.add(-2);
			System.out.println("Arreglo: " + arreglo);
			int max = arreglo.get(0);
			int min = arreglo.get(0);
			int sum = 0;
			int prom = 0;
			for(int i= 0; i < arreglo.size(); i++) {
				sum = sum + arreglo.get(i);
				if(max < arreglo.get(i)) {
					max = arreglo.get(i);
				}
				if(min > arreglo.get(i)) {
					min = arreglo.get(i);
				}
				}
			prom = sum/arreglo.size();
			arreglo.clear();
			arreglo.add(max);
			arreglo.add(min);
			arreglo.add(prom);
			System.out.println("Arreglo con valor mínimo, máximo y promedio: " + arreglo);
			}
		public void lista() {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();
			arreglo.add(1);
			arreglo.add(5);
			arreglo.add(10);
			arreglo.add(7);
			arreglo.add(-2);
			System.out.println("Arreglo: " + arreglo);
			for(int i=0; i<arreglo.size()-1; i++) {
				arreglo.set(i, arreglo.get(i+1));
				if(i==arreglo.size()-1) {
					arreglo.add(0);
				}
			}
			System.out.println("Nuevo arreglo: " + arreglo);
		}
			
	
	
	public static void main(String[] args) {
		BasicJava test = new BasicJava();
		//test.bubble();
		//test.imprimeNum();
		//test.imprimeImpar();
		//test.imprimeSum();
		//test.recorreArray();
		//test.maxArray();
		//test.promArray();
		//test.arrayImpar();
		//test.mayorY();
		//test.arrayCuadra();
		//test.arrayCuadrado();
		//test.arraySinNeg();
		//test.minManPro();
		test.lista();

	}

}
