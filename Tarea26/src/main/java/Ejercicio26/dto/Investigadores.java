package Ejercicio26.dto;




import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Investigadores")//en caso que la tabala sea diferente

public class Investigadores {

	//Atributos de entidad cliente
	@Id
	private char id;
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;
	
	
	//Constructores
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Reservas> reservas;
	
	

	@ManyToOne
    @JoinColumn(name="facultad_id")
    Facultad facultad_id;
	
	public Investigadores() {
	
	}

	
	public Investigadores(char id, String nomapels, Facultad facultad_id) {
		//super();
		this.id = id;
		this.nomapels = nomapels;
		this.facultad_id = facultad_id;
		
	}



	public char getId() {
		return id;
	}


	public void setId(char id) {
		this.id = id;
	}


	public String getNomapels() {
		return nomapels;
	}


	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}


	public Facultad getFacultad() {
		return facultad_id;
	}


	public void setFacultad(Facultad facultad) {
		this.facultad_id = facultad;
	}

	public Facultad getFacultad_id() {
		return facultad_id;
	}


	public void setFacultad_id(Facultad facultad_id) {
		this.facultad_id = facultad_id;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reservas")
	public List<Reservas> getReservas() {
		return reservas;
	}


	@Override
	public String toString() {
		return "Investigadores [id=" + id + ", nomapels=" + nomapels + ", reservas=" + reservas + ", facultad_id="
				+ facultad_id + "]";
	}

	
	
	
}
