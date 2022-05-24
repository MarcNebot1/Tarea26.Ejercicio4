package Ejercicio26.dto;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Reservas")//en caso que la tabala sea diferente
public class Reservas {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "comienzo")//no hace falta si se llama igual
	private String comienzo;
	@Column(name = "fin")//no hace falta si se llama igual
	private String fin;
	
	
	//Constructores
	
	
	@ManyToOne
    @JoinColumn(name="equipos_id")
    private Equipos equipos_id;
	
	@ManyToOne
    @JoinColumn(name="investigadores_id")
    private Investigadores investigadores_id;
	
	
	public Reservas() {
	
	}


	public Reservas(int id,String comienzo, String fin, Equipos equipos_id, Investigadores investigadores_id) {
		//super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.equipos_id = equipos_id;
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getComienzo() {
		return comienzo;
	}


	public void setComienzo(String comienzo) {
		this.comienzo = comienzo;
	}


	public String getFin() {
		return fin;
	}


	public void setFin(String fin) {
		this.fin = fin;
	}


	public Equipos getEquipos_id() {
		return equipos_id;
	}


	public void setEquipos_id(Equipos equipos_id) {
		this.equipos_id = equipos_id;
	}


	public Investigadores getInvestigadores_id() {
		return investigadores_id;
	}

	public void setInvestigadores_id(Investigadores investigadores_id) {
		this.investigadores_id = investigadores_id;
	}

	@Override
	public String toString() {
		return "Reservas [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", equipos_id=" + equipos_id
				+ ", investigadores_id=" + investigadores_id + "]";
	}
	
}
