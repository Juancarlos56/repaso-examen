package ec.edu.ups.entidadaes;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity

public class Cita implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Calendar fechaInicio;
	private Calendar fechaFin;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn
	private Paciente personaCitas;
	
	public Cita() {
		super();
	}

	public Cita(int id, Calendar fechaInicio, Calendar fechaFin, String descripcion, Paciente personaCitas) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.personaCitas = personaCitas;
	}

	public Cita(Calendar fechaInicio, Calendar fechaFin, String descripcion, Paciente personaCitas) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.personaCitas = personaCitas;
	}

	public Cita(int id, Calendar fechaInicio, Calendar fechaFin, String descripcion) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
	}

	public Cita(Calendar fechaInicio, Calendar fechaFin, String descripcion) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Paciente getPersonaCitas() {
		return personaCitas;
	}

	public void setPersonaCitas(Paciente personaCitas) {
		this.personaCitas = personaCitas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + id;
		result = prime * result + ((personaCitas == null) ? 0 : personaCitas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (id != other.id)
			return false;
		if (personaCitas == null) {
			if (other.personaCitas != null)
				return false;
		} else if (!personaCitas.equals(other.personaCitas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion="
				+ descripcion + ", personaCitas=" + personaCitas + "]";
	}
	
	
	
   
}
