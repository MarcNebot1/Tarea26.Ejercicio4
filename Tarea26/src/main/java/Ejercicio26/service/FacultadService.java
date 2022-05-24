package Ejercicio26.service;

import java.util.List;

import Ejercicio26.dto.Facultad;


public interface FacultadService {

	//Metodos del CRUD
	public List<Facultad> listarFacultad(); 
	
	public Facultad guardarFacultad(Facultad facultad);	
	
	public Facultad FacultadXID(int id); 
		
	public Facultad actualizarFacultad(Facultad facultad); 
	
	public void eliminarFacultad(int id);
}

