package Ejercicio26.service;

import java.util.List;

import Ejercicio26.dto.Investigadores;


public interface InvestigadoresService {

	//Metodos del CRUD
	public List< Investigadores> listarInvestigadores(); 
	
	public  Investigadores guardarInvestigadores(Investigadores investigadores);	
	
	public Investigadores InvestigadoresXID(int id); 
	
	public  Investigadores actualizarInvestigadores(Investigadores investigadores); 
	
	public void eliminarInvestigadores(int id);
	
	
}

