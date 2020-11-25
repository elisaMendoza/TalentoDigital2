import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public void array() {
		ArrayList<Integer> arreglo1 = new ArrayList<Integer>();
		arreglo1.add(3);
		arreglo1.add(5);
		arreglo1.add(1);
		arreglo1.add(2);
		arreglo1.add(7);
		arreglo1.add(9);
		arreglo1.add(8);
		arreglo1.add(13);
		arreglo1.add(25);
		arreglo1.add(32);
		System.out.println("Arreglo1: " + arreglo1);
		ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
		int sum = 0;
		for(int i= 0; i < arreglo1.size(); i++) {
			sum = sum + arreglo1.get(i);
			if(arreglo1.get(i)>10) {
				arreglo2.add(arreglo1.get(i));	
			}
		}
		System.out.println("La suma del Arreglo1 es: "+sum);
		System.out.println("Números mayores a 10: " + arreglo2);
		}
	public void japaneseNames() {
		ArrayList<String> arreglo = new ArrayList<String>();
		arreglo.add("Nancy");
		arreglo.add("Jinichi");
		arreglo.add("Fujibayashi");
		arreglo.add("Momochi");
		arreglo.add("Ishikawa");
		for(int i=0; i < arreglo.size(); i++) {
			System.out.println(arreglo.get(i));
		}	Collections.shuffle(arreglo);
		System.out.println("----------------------");
		for(int j=0; j < arreglo.size(); j++) {
			System.out.println(arreglo.get(j));
			}System.out.println("----------------------");
		ArrayList<String> arreglo2 = new ArrayList<String>();
		for(int a=0; a < arreglo.size(); a++) {
			if((arreglo.get(a)).length() >5) {
				arreglo2.add(arreglo.get(a));
			}
		}System.out.println(arreglo2);
	}
		
	public void Alphabet() {
		String[] alfabeto1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> alfabeto2 = new ArrayList<String>(); 
		for(int i=0; i<alfabeto1.length; i++) {
			alfabeto2.add(alfabeto1[i]);
		}
		Collections.shuffle(alfabeto2);
		
		System.out.println(alfabeto2.get(26));
		
		System.out.println(alfabeto2.get(0));
		if(alfabeto2.get(0).equals("a")||alfabeto2.get(0).equals("e")||alfabeto2.get(0).equals("i")||alfabeto2.get(0).equals("o")||alfabeto2.get(0).equals("u")) {
			System.out.println("La primera letra es una vocal");
		}
	}
	public void randomNums() {
		ArrayList<Integer> numAzar = new ArrayList<Integer>();
		for(int j= 0; j<10;j++) {
			numAzar.add(0);
		}
		Random valorAzar = new Random();
		for(int i=0; i<numAzar.size(); i++) {
			numAzar.set(i, valorAzar.nextInt(100-55+1)+55);
		}
		System.out.println(numAzar);
	}
	public void randomNums2() {
		ArrayList<Integer> numAzar = new ArrayList<Integer>();
		for(int j= 0; j<10;j++) {
			numAzar.add(0);
		}
		Random valorAzar = new Random();
		for(int i=0; i<numAzar.size(); i++) {
			numAzar.set(i, valorAzar.nextInt(100-55+1)+55);
		}
		System.out.println("Arreglo desordenado al azar: "+numAzar);
		
		Collections.sort(numAzar);
		
		System.out.println("Arreglo en orden: "+numAzar);
		int max = numAzar.get(0);
		int min = numAzar.get(0);
		for(int a= 0; a < numAzar.size(); a++) {
		if(max < numAzar.get(a)) {
			max = numAzar.get(a);
		}
		if(min > numAzar.get(a)) {
			min = numAzar.get(a);
		}
		}System.out.println("Valor máximo del arreglo: "+max+", Valor mínimo del arreglo: "+min);
	}
	public String randomWord() {
		Random azar = new Random();
		StringBuilder word = new StringBuilder();
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i <5; i++) {
			word.append(chars.charAt(azar.nextInt(chars.length())));
		}return word.toString();
	}
	public void cadenasEnArreglo() {
		ArrayList<String> arreglo= new ArrayList<String>();
		for(int j= 0; j<10;j++) {
			arreglo.add("");
		}
		for(int a=0; a< arreglo.size(); a++) {
			arreglo.set(a, (randomWord()));
		}System.out.println(arreglo);
	}
	
	
	public static void main(String[] args) {
		PuzzleJava test = new PuzzleJava();
		//test.array();
		//test.japaneseNames();
		//test.Alphabet();
		//test.randomNums();
		//test.randomNums2();
		//System.out.println(test.randomWord());
		test.cadenasEnArreglo();
		

	}

}
