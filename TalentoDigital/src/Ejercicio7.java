import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Introduzca dos números:");
		
		int x= inputs.nextInt();
		int y= inputs.nextInt();
		
		int randomNum = (int)(Math.random()*((y-x)+1))+x;
		System.out.println("El número aleatorio entre ambos números es: "+randomNum);

	}

}
