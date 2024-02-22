import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Tarea t= new Tarea("nombre", "detalle", LocalDate.now());
        System.out.println(t);
        Registro r = new Registro();
        r.addTarea(t);
        System.out.println(r);
        r.eliminarTarea("nombre");
    }
}
