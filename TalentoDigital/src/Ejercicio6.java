import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un día de la semana: ");
		
		String dia = input.nextLine();
		
		switch (dia) {
		case "Lunes":
		System.out.println("Es un día laboral");
		break;
		case "Martes":
		System.out.println("Es un día laboral");
		break;
		case "Miercoles":
		System.out.println("Es un día laboral");
		break;
		case "Jueves":
		System.out.println("Es un día laboral");
		break;
		case "Viernes":
		System.out.println("Es un día laboral");
		break;
		case "Sabado":
		System.out.println("Yujuu es fin de semana");
		break;
		case "Domingo":
		System.out.println("Yujuuu es fin de semana");
		break;
		default:
		System.out.println("Ingresa un dia de la semana. Ej: Viernes");
		
		}

	}

}
