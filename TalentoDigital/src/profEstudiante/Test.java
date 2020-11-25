package profEstudiante;
public class Test {

	public static void main(String[] args) {
		Profesor profe = new Profesor();
		Estudiante estu = new Estudiante();
		profe.setNombre("Edgar");
		profe.setApellido("Ramirez");
		profe.setAsignatura("Teatro");
		
		estu.setNombre("Eli");
		estu.setCiudad("Viña del Mar");
		estu.setRut("0111-22");
		
		System.out.println("Profesor: " + profe.getNombre());
		System.out.println("Apellido: "+ profe.getApellido());
		System.out.println("Estudiante: " + estu.getNombre());
		System.out.println("Ciudad: "+estu.getCiudad());

	}

}
