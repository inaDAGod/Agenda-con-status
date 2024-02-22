import java.time.LocalDate;
import java.util.ArrayList;

public class Fecha{
    private LocalDate date;
    private ArrayList<Tarea> tareas;

    public Fecha(LocalDate date){
        this.date =date;
        this.tareas = new ArrayList<Tarea>();
    }
    
    public LocalDate getDate() {
		  return date;
	}
    public ArrayList getTareas(){
        return tareas;
    }

    public void addTarea(Tarea tarea){
        tareas.add(tarea);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    

}