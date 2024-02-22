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
	
	
    
}