package Clases;
import java.util.ArrayList;

public class Registro{
    private ArrayList<Tarea> tareas;

	public Registro() {
		this.tareas = new ArrayList<>();
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	public void addTarea(Tarea tarea) {
		tareas.add(tarea);
	}

	@Override
	public String toString() {
		String s = "";
		for(Tarea t: tareas) {
			s += t.toString();
		}
		return s;
	}
	
	public String getPendientes(){
		String s = "";
		for(Tarea t: tareas) {
			if(t.getEstado().equals("Pendiente")) {
				s += t.toString();
			}
			
		}
		return s;
	}
	public String getEnCurso(){
		String s = "";
		for(Tarea t: tareas) {
			if(t.getEstado().equals("En Curso")) {
				s += t.toString();
			}
			
		}
		return s;
	}
	
	public String getCompletada(){
		String s = "";
		for(Tarea t: tareas) {
			if(t.getEstado().equals("Completada")) {
				s += t.toString();
			}
			
		}
		return s;
	}
	
	public void eliminarTarea(String nombre) {
		ArrayList<Tarea> copia = new ArrayList<>();
		for(Tarea t:tareas) {
			if(!t.getNombre().equals(nombre)) {
				copia.add(t);
			}
		}
		this.tareas = copia;
	}
	

	
    
}