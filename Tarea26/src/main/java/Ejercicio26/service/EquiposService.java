package Ejercicio26.service;

import java.util.List;

import Ejercicio26.dto.Equipos;


public interface EquiposService {

	//Metodos del CRUD
	public List<Equipos> listarEquipos(); 
	
	public Equipos guardarEquipos(Equipos equipos);	
	
	public Equipos EquiposXID(Long id); 
		
	public Equipos actualizarEquipos(Equipos equipos); 
	
	public void eliminarEquipos(Long id);
}

