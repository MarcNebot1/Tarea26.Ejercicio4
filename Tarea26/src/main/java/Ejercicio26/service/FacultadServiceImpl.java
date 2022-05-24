package Ejercicio26.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio26.dto.Facultad;
import Ejercicio26.dao.FacultadDAO;




@Service
public class FacultadServiceImpl implements FacultadService{
	
	
	@Autowired
	FacultadDAO FacultadDAO;
	
	@Override
	public List<Facultad> listarFacultad() {
		
		return FacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facu) {
		
		return FacultadDAO.save(facu);
	}

	@Override
	public Facultad FacultadXID(int id) {
		
		return FacultadDAO.findById(id).get();
	}
	

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		
		return FacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		
		FacultadDAO.deleteById(id);
		
	}

}
