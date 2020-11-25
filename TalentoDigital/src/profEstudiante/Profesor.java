package profEstudiante;

public class Profesor {
	private String rut;
	private String nombre;
	private String apellido;
	private String direccion;
	private String asignatura;
	private String institucion;
	
	public void setRut(String rut) {
		this.rut = rut;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public String getRut() {
		return this.rut;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	public String getInstitucion() {
		return this.institucion;
	}

}
