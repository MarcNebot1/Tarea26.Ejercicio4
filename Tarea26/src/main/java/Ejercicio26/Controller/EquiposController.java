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

import Ejercicio26.dto.Equipos;
import Ejercicio26.service.EquiposServiceImpl;




@RestController
@RequestMapping("/api")
public class EquiposController {
	
	@Autowired
	 EquiposServiceImpl  equiposServideImpl;
	
	@GetMapping("/equipos")
	public List< Equipos> listarCajas(){
		return  equiposServideImpl.listarEquipos();
	}
	
	
	
	@PostMapping("/almacen")
	public  Equipos salvarEquipos(@RequestBody  Equipos equipos) {
		
		return  equiposServideImpl.guardarEquipos(equipos);
	}
	
	
	@GetMapping("/equipos/{id}")
	public  Equipos almacenXID(@PathVariable(name="id") Long id) {
		
		 Equipos equipos_xid= new  Equipos();
		
		 equipos_xid=equiposServideImpl.EquiposXID(id);
		
		System.out.println(" Equipos XID: "+equipos_xid);
		
		return equipos_xid;
	}
	
	@PutMapping("/equipos/{id}")
	public Equipos actualizarEquipos(@PathVariable(name="id")long id,@RequestBody Equipos equipos) {
		
		 Equipos equipos_seleccionado= new  Equipos();
		 Equipos equipos_actualizado= new   Equipos();
		
		equipos_seleccionado= equiposServideImpl.EquiposXID(id);
		
		equipos_seleccionado.setNombre(equipos.getNombre());
		equipos_seleccionado.setFacultad_id(equipos.getFacultad_id());
		equipos_seleccionado = equiposServideImpl.actualizarEquipos(equipos_actualizado);
		
		System.out.println("El cliente actualizado es: "+ equipos_actualizado);
		
		return equipos_actualizado;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipos(@PathVariable(name="id")long id) {
		equiposServideImpl.eliminarEquipos(id);
	}
	
	
}
