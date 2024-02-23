package Clases;
import java.util.ArrayList;

import Ventana.GuardarEnTxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Registro{
    private ArrayList<Tarea> tareas;

	public Registro() {
		this.tareas = new ArrayList<>();
		try {
			this.tareas = GuardarEnTxt.leerArchivoYObtenerLista("tareas.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
		try {
			GuardarEnTxt.guardarTareasEnArchivo("tareas.txt", tareas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addTarea(Tarea tarea) {
		tareas.add(tarea);
		try {
			GuardarEnTxt.guardarTareasEnArchivo("tareas.txt", tareas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		setTareas(copia);
	}
	
	public void cambiarEstado(String nombre,String estado) {
		for(Tarea t:tareas) {
			if(t.getNombre().equals(nombre)) {
				if(estado.equals("Pendiente")) {
					t.setPendiente();
				}
				if(estado.equals("Completada")) {
					t.setCompletado();
				}
				if(estado.equals("En Curso")) {
					t.setEnCurso();
				}
			}
		}
		try {
			GuardarEnTxt.guardarTareasEnArchivo("tareas.txt", tareas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<String> listaNombresNuevos(){
		ArrayList<String> nombres = new ArrayList<>();
		for(Tarea t:tareas) {
			if(t.getEstado().equals("Pendiente")) {
				nombres.add(t.getNombre());
			}
		}
		return nombres;
	}
	
	
	public ArrayList<String> listaNombres(){
		ArrayList<String> nombres = new ArrayList<>();
		for(Tarea t:tareas) {
			nombres.add(t.getNombre());
		}
		return nombres;
	}
	
	
	
	
	

	
    
}