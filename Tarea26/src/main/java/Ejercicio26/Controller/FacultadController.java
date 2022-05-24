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

import Ejercicio26.dto.Facultad;
import Ejercicio26.service.FacultadServiceImpl;




@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadServideImpl;
	
	@GetMapping("/facultad")
	public List<Facultad> listarFacultad(){
		return facultadServideImpl.listarFacultad();
	}
	
	
	
	@PostMapping("/facultad")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		
		return facultadServideImpl.guardarFacultad(facultad);
	}
	
	
	@GetMapping("/facultad/{id}")
	public Facultad facultadXID(@PathVariable(name="id") int id) {
		
		Facultad almacen_xid= new Facultad();
		
		almacen_xid=facultadServideImpl.FacultadXID(id);
		
		System.out.println("Facultad XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/facultad/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id")int id,@RequestBody Facultad facultad) {
		
		Facultad facultad_seleccionado= new Facultad();
		Facultad facultad_actualizado= new  Facultad();
		
		facultad_seleccionado= facultadServideImpl.FacultadXID(id);
		
		facultad_seleccionado.setNombre(facultad.getNombre());
		facultad_seleccionado = facultadServideImpl.actualizarFacultad(facultad_actualizado);
		
		System.out.println("El cliente actualizado es: "+ facultad_actualizado);
		
		return facultad_actualizado;
	}
	
	@DeleteMapping("/facultad/{id}")
	public void eliminarFacultad(@PathVariable(name="id")int id) {
		facultadServideImpl.eliminarFacultad(id);
	}
	
	
}
