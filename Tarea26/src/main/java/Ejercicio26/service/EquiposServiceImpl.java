package Ejercicio26.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio26.dao.EquiposDAO;
import Ejercicio26.dto.Equipos;



@Service
public class EquiposServiceImpl implements EquiposService{
	
	
	@Autowired
	EquiposDAO EquiposDAO;
	
	@Override
	public List<Equipos> listarEquipos() {
		
		return EquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos almacen) {
		
		return EquiposDAO.save(almacen);
	}

	@Override
	public Equipos EquiposXID(Long id) {
		
		return EquiposDAO.findById(id).get();
	}
	

	@Override
	public Equipos actualizarEquipos(Equipos equipo) {
		
		return EquiposDAO.save(equipo);
	}

	@Override
	public void eliminarEquipos(Long id) {
		
		EquiposDAO.deleteById(id);
		
	}

}
