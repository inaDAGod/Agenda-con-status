package Ventana;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.BufferedReader;

import javax.swing.JOptionPane;

import Clases.Tarea;
import Clases.Registro;

public class GuardarEnTxt {

    public static void main(String[] args) throws IOException {
        Registro registro = new Registro();
        registro.addTarea(new Tarea("Tarea1", "Detalles1", LocalDate.now(), "PENDIENTE"));
        registro.addTarea(new Tarea("Tarea2", "Detalles2", LocalDate.now(), "EN_CURSO"));
        registro.addTarea(new Tarea("Tarea3", "Detalles3", LocalDate.now(), "COMPLETADA"));

        String rutaArchivo = "tareas.txt";

        guardarTareasEnArchivo(rutaArchivo, registro.getTareas());
    }

    public static void guardarTareasEnArchivo(String rutaArchivo, ArrayList<Tarea> tareas) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Tarea tarea : tareas) {
                writer.write(tarea.getFecha() + ":" + tarea.getNombre() + " (" + tarea.getEstado() + ")\n\t" + tarea.getDetalles() + "\n");
            }
            System.out.println("Tareas guardadas en el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            throw e;
        }
    }

    public static void agregarTarea(String tarea, String fecha, String estado, String detalles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt", true))) {
            writer.write(fecha + ":" + tarea + " (" + estado + ")\n\t" + detalles + "\n");
            System.out.println("Tarea agregada al archivo correctamente.");

            System.out.println("Tarea agregada:\nFecha: " + fecha + "\nTarea: " + tarea + "\nEstado: " + estado + "\nDetalles: " + detalles);

            JOptionPane.showMessageDialog(null, "Tarea agregada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());

            JOptionPane.showMessageDialog(null, "Error al agregar la tarea: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<Tarea> leerArchivoYObtenerLista(String nombreArchivo) throws IOException {
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Tarea tarea = procesarLineaComoTarea(linea);
                if (tarea != null) {
                    listaTareas.add(tarea);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            throw e;
        }

        return listaTareas;
    }

    private static Tarea procesarLineaComoTarea(String linea) {
        try {
            String[] partes = linea.split("[:()]");

            String fechaStr = partes[0].trim();
            String tareaNombre = partes[1].trim();
            String estado = partes[2].trim();
            String detalles = partes[3].trim();

            LocalDate fecha = LocalDate.parse(fechaStr);

            return new Tarea(tareaNombre, detalles, fecha, estado);
        } catch (Exception e) {
            System.err.println("Error al convertir la línea en Tarea: " + e.getMessage());
            return null;
        }
    }
}
