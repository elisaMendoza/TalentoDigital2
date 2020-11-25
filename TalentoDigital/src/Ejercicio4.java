import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un número");
		
		int num = input.nextInt();
		if(num%2==0)
		{
			System.out.println(num+ " es divisible entre 2");
		}
		else
		{
			System.out.println("El número que ingresó no es divisble entre 2");
		}

	}

}
