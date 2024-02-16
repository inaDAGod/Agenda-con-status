import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Presione enter para continuar");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            System.out.println("Menu de opciones");
            System.out.println("1.Añadir tarea nueva");
            System.out.println("2.Eliminar tarea");
            System.out.println("3.Ver todas las tareas");
            System.out.println("4.Ver tareas pendientes");
            System.out.println("5.Ver tareas en curso");
            System.out.println("6.Ver tareas terminadas");
            System.out.println("7.Salir");
            int i=s.nextInt();
            switch(i){
                case 1:
                    System.out.println("Ventana para añadir tareas");
                    break;
                case 2:
                    System.out.println("Ventana para eliminar tareas");
                    break;
                case 3:
                    System.out.println("Ventana de  tareas");
                    break;
                case 4:
                    System.out.println("Ventana de tareas pendientes");
                    break;
                case 5:
                    System.out.println("Ventana de tareas en curso");
                    break;
                case 6:
                    System.out.println("Ventana de tareas terminada");
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }
             System.out.println();
        }
    }
}
