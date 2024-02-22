import java.util.ArrayList;

public class Registro{
    private ArrayList<Fecha> fechas;

    public Registro(){
        this.fechas =new ArrayList<Fecha>();
    }

    public ArrayList getFechas(){
        return fechas;
    }

    public void addFecha(Fecha fecha){
        fechas.add(fecha);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}