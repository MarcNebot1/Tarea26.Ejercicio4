package Ejercicio26.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ejercicio26.dto.Investigadores;
import Ejercicio26.service.InvestigadoresServiceImpl;




@RestController
@RequestMapping("/api")
public class InvestigadoresController {
	
	@Autowired
	InvestigadoresServiceImpl investigadoresServideImpl;
	
	@GetMapping("/investigadores")
	public List<Investigadores> listarInvestigadores(){
		return investigadoresServideImpl.listarInvestigadores();
	}
	
	
	
	@PostMapping("/investigadores")
	public Investigadores salvarInvestigadores(@RequestBody Investigadores investigadores) {
		
		return investigadoresServideImpl.guardarInvestigadores(investigadores);
	}
	
	
	@GetMapping("/investigadores/{id}")
	public Investigadores investigadoresXID(@PathVariable(name="id") int id) {
		
		Investigadores investigadores_xid= new Investigadores();
		
		investigadores_xid=investigadoresServideImpl.InvestigadoresXID(id);
		
		System.out.println("Investigadores XID: "+investigadores_xid);
		
		return investigadores_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigadores actualizarInvestigadores(@PathVariable(name="id")int id,@RequestBody Investigadores investigadores) {
		
		Investigadores investigadores_seleccionado= new Investigadores();
		Investigadores investigadores_actualizado= new  Investigadores();
		
		investigadores_seleccionado= investigadoresServideImpl.InvestigadoresXID(id);
		
		investigadores_seleccionado.setNomapels(investigadores.getNomapels());
		investigadores_seleccionado.setFacultad(investigadores.getFacultad());
		investigadores_seleccionado = investigadoresServideImpl.actualizarInvestigadores(investigadores_actualizado);
		
		System.out.println("El cliente actualizado es: "+ investigadores_actualizado);
		
		return investigadores_actualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigadores(@PathVariable(name="id")int id) {
		investigadoresServideImpl.eliminarInvestigadores(id);
	}
	
	
}
