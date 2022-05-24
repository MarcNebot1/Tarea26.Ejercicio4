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

import Ejercicio26.dto.Reservas;
import Ejercicio26.service.ReservasServiceImpl;



	@RestController
	@RequestMapping("/api")
	public class ReservasController {
		
		@Autowired
		ReservasServiceImpl reservasServideImpl;
		
		@GetMapping("/reservas")
		public List<Reservas> listarReservas(){
			return reservasServideImpl.listarReservas();
		}
		
		
		
		@PostMapping("/reservas")
		public Reservas salvarReservas(@RequestBody Reservas reservas) {
			
			return reservasServideImpl.guardarReservas(reservas);
		}
		
		
		@GetMapping("/reservas/{id}")
		public Reservas reservasXID(@PathVariable(name="id") int id) {
			
			Reservas reservas_xid= new Reservas();
			
			reservas_xid=reservasServideImpl.ReservasXID(id);
			
			System.out.println("Reservas XID: "+reservas_xid);
			
			return reservas_xid;
		}
		
		@PutMapping("/reservas/{id}")
		public Reservas actualizarCajas(@PathVariable(name="id")int id,@RequestBody Reservas reservas) {
			
			Reservas reservas_seleccionado= new Reservas();
			Reservas reservas_actualizado= new  Reservas();
			
			reservas_seleccionado= reservasServideImpl.ReservasXID(id);
			
			reservas_seleccionado.setComienzo(reservas.getComienzo());
			reservas_seleccionado.setFin(reservas.getFin());
			reservas_seleccionado.setEquipos_id(reservas.getEquipos_id());
			reservas_actualizado = reservasServideImpl.actualizarReservas(reservas_actualizado);
			
			System.out.println("El cliente actualizado es: "+ reservas_actualizado);
			
			return reservas_actualizado;
		}
		
		@DeleteMapping("/reservas/{id}")
		public void eliminarReservas(@PathVariable(name="id")int id) {
			reservasServideImpl.eliminarReservas(id);
		}
		
		
	}