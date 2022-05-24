package Ejercicio26.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio26.dto.Investigadores;

import Ejercicio26.dao.InvestigadoresDAO;



@Service
public class InvestigadoresServiceImpl implements InvestigadoresService{
	
	
	@Autowired
	InvestigadoresDAO InvestigadoresDAO;
	
	@Override
	public List<Investigadores> listarInvestigadores() {
		
		return InvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores invest) {
		
		return InvestigadoresDAO.save(invest);
	}

	@Override
	public Investigadores InvestigadoresXID(int id) {
		
		return InvestigadoresDAO.findById(id).get();
	}
	

	@Override
	public Investigadores actualizarInvestigadores(Investigadores investi) {
		
		return InvestigadoresDAO.save(investi);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		
		InvestigadoresDAO.deleteById(id);
		
	}

}
