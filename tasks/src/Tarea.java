public class Tarea{
    private String nombre;
    private String detalles;
    private String estado;

    public Tarea(String nombre, String detalles, String estado){
        this.nombre = nombre;
        this.detalles = detalles;
        this.estado =estado;
    }

    public String getNombre() {
		  return nombre;
	  }
    public String getDetalles() {
		  return detalles;
	  }
    public String getEstado() {
		  return estado;
	  
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    

}