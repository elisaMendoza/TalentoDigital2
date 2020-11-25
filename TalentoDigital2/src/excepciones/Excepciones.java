package excepciones;
import java.util.ArrayList;

public class Excepciones {
	ArrayList<Object> myList = new ArrayList<Object>();
	public void manejoExcepciones() {
		try {
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		for(int i = 0; i < myList.size(); i++) {
		    Integer castedValue = (Integer) myList.get(i);
		    System.out.println(castedValue);
		}

	}catch (ClassCastException e) {
		System.out.println("Index values 1 and 3 from myList array: "+myList.get(1)+" and "+myList.get(3)+" cannot be converted to integers");
		System.out.println(e.getMessage());
	}
	}
	
	
	public static void main(String[] args) {
		Excepciones test = new Excepciones();
		test.manejoExcepciones();
	

	}

}
