package Ejercicio26.service;

import java.util.List;

import Ejercicio26.dto.Reservas;


public interface ReservasService {

	//Metodos del CRUD
	public List< Reservas> listarReservas(); 
	
	public  Reservas guardarReservas(Reservas reservas);	
	
	public  Reservas  ReservasXID(int id); 
	
	public  Reservas actualizarReservas( Reservas reservas); 
	
	public void eliminarReservas(int id);
	
	
}

