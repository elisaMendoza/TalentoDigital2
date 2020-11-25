package ampolleta;
import java.util.Scanner;

public class Ampolleta {

	private boolean estado;
	private int potencia;
	private String color;
	private float horas;
	//constructor
	public Ampolleta() {
		estado = false;
		potencia = 0;
		color = "";
		horas = 10;
	}
	//constructor with parameters
	public Ampolleta(boolean estado, int potencia, String color, float horas) {
		this.estado = estado;
		this.potencia = potencia;
		this.color = color;
		this.horas = horas;
	}
	//getters and setters
	public void setEstado(boolean value) {
		this.estado = value;
	}
	//getter con otro nombre
	public boolean verEstado() {
		return this.estado;
	}
	//setter con otro nombre
	public void cambiarPotencia(int value) {
		this.potencia = value;
	}
	//getter con otro nombre
	public int verPotencia() {
		return this.potencia;
	}
	public void setColor(String value) {
		this.color = value;
	}
	//getter con otro nombre
	public String verColor() {
		return this.color;
	}
	public void setHoras(float value) {
		this.horas = value;
	}
	public float getHoras() {
		return this.horas;
	}
	//pregunta horas y enciende ampolleta
	public void encender() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el número de horas que quiere encender la ampolleta");
		float num = input.nextFloat();
		horas = horas - num;
		if(horas>0) {
			this.estado= true;
		}else {
			System.out.println("Número de horas ingresada es mayor a lo disponible");
		}
	}
	//apaga ampolleta
	public void apagar() {
		this.estado = false;
	}
	//cambia color a ampolleta con el parametro ingresado
	public void cambiaColor(String value) {
		if(estado==true) {
			this.estado = false;
			this.color = value;	
		}else {
			this.color = value;
		}
	}
	//añade mas horas a las que ya tiene
	public void recargar() {
		Scanner recharge = new Scanner(System.in);
		System.out.println("Ingrese número de horas que desea recargar la ampolleta");
		float hours = recharge.nextFloat();
		horas = horas + hours;
	}
	//imprime estado de atributos de la ampolleta
	public void ampolleta() {
	System.out.println("---------------------");
	System.out.println("Estado de ampolleta: "+verEstado());
	System.out.println("Potencia de ampolleta: "+verPotencia());
	System.out.println("Color de ampolleta: "+verColor());
	System.out.println("Horas de ampolleta: "+getHoras());
	}
	//interaccion con usuario
	public void questions() {
		boolean repeat = true;
		do {
		
		Scanner question = new Scanner(System.in);
		System.out.println("1. Encender ampolleta");
		System.out.println("2. Apagar ampolleta");
		System.out.println("3. Cambiar color a ampolleta");
		System.out.println("4. Cambiar potencia a ampolleta");
		System.out.println("5. Recargar número de horas de encendida");
		System.out.println("6. Ver estado, potencia, color y horas de ampolleta");
		System.out.println("Ingrese el número de la tarea que quisiera ejecutar:");
		int response = question.nextInt();
		switch (response) {
		case 1:
		encender();
		System.out.println("Ampolleta encendida");
		break;
		case 2:
		apagar();
		System.out.println("Ampolleta apagada");
		break;
		case 3:
		Scanner question3 = new Scanner(System.in);
		System.out.println("Ingrese color: ");
		String response3 = question3.nextLine();
		cambiaColor(response3);
		System.out.println("Ampolleta se ha cambiado al color: "+verColor());
		break;
		case 4:
		Scanner question4 = new Scanner(System.in);
		System.out.println("Ingrese potencia: ");
		int response4 = question4.nextInt();
		cambiarPotencia(response4);
		System.out.println("Potencia de ampolleta se ha cambiado");
		break;
		case 5:
		recargar();
		System.out.println("Ampolleta recargada");
		break;
		case 6:
		ampolleta();
		break;
		default:
		System.out.println("Ingreso incorrecto");
		repeat = false;
		break;
		}System.out.println("====================");
		} while(repeat);
	}

	public static void main(String[] args) {
		Ampolleta test = new Ampolleta();
		test.questions();
		test.ampolleta();

	}

}
