package Clases;
import java.time.LocalDate;

public class Tarea{
    private String nombre;
    private String detalles;
    private LocalDate fecha;
    private String estado;

    
	public Tarea(String nombre, String detalles, LocalDate fecha, String estado) {
		this.nombre = nombre;
		this.detalles = detalles;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	public Tarea(String nombre, String detalles, LocalDate fecha) {
		this.nombre = nombre;
		this.detalles = detalles;
		this.fecha = fecha;
		this.estado = "Pendiente";
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalles() {
		return detalles;
	}


	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return  fecha +":"+ nombre + "( "+ estado+ " )\n\t" + detalles+"\n";
	}
	
	public void setCompletado() {
		this.setEstado("Completada");
	}
	public void setPendiente() {
		this.setEstado("Pendiente");
	}
	public void setEnCurso() {
		this.setEstado("En Curso");
	}
    
    

    

}