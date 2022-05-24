package Ejercicio26.dto;




import java.util.List;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name="Equipos")//en caso que la tabala sea diferente

public class Equipos {

	//Atributos de entidad equipo
	@Id
	private char id;
	@Column(name = "nombre")
	private String nombre;
	
	//Constructores
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Reservas> reservas;
	
	@ManyToOne
    @JoinColumn(name="facultad_id")
    private Facultad facultad_id;
	
	
	public Equipos() {
	
	}

	
	public Equipos(char id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
			
	}

	public char getId() {
		return id;
	}


	public void setId(char id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Equipos [id=" + id + ", nombre=" + nombre + ", reservas=" + reservas + ", facultad_id=" + facultad_id
				+ "]";
	}

	
	
	
	
}
