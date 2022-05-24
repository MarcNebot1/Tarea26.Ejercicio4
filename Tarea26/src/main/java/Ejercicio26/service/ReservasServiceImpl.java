package Ejercicio26.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio26.dao.ReservasDAO;
import Ejercicio26.dto.Reservas;





@Service
public class  ReservasServiceImpl implements ReservasService{
	
	
	@Autowired
	ReservasDAO ReservasDAO;
	
	@Override
	public List<Reservas> listarReservas() {
		
		return ReservasDAO.findAll();
	}

	@Override
	public Reservas guardarReservas(Reservas reservas) {
		
		return ReservasDAO.save(reservas);
	}

	@Override
	public Reservas ReservasXID(int id) {
		
		return ReservasDAO.findById(id).get();
	}
	

	@Override
	public Reservas actualizarReservas(Reservas reserva) {
		
		return ReservasDAO.save(reserva);
	}

	@Override
	public void eliminarReservas(int id) {
		
		ReservasDAO.deleteById(id);
		
	}

}
