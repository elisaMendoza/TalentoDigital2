package profEstudiante;

public class Estudiante {
	private String rut;
	private String nombre;
	private String apellido;
	private String ciudad;
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
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
	public String Apellido() {
		return this.apellido;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	public String getInstitucion() {
		return this.institucion;
	}

}
