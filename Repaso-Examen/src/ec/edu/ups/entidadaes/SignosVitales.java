package ec.edu.ups.entidadaes;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double presion;
	private double frecuenciaCardiaca;
	private double frecienciaRespiratoria;
	private double temperatura;
	private double saturacion;
	private String alergias;
	private String enfermedadesPrevias;
	
	@ManyToOne
	@JoinColumn
	private Paciente personaSignosVitales;
	
	
	public SignosVitales() {
		super();
	}


	public SignosVitales(int id, double presion, double frecuenciaCardiaca, double frecienciaRespiratoria,
			double temperatura, double saturacion, String alergias, String enfermedadesPrevias,
			Paciente personaSignosVitales) {
		super();
		this.id = id;
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecienciaRespiratoria = frecienciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
		this.personaSignosVitales = personaSignosVitales;
	}


	public SignosVitales(double presion, double frecuenciaCardiaca, double frecienciaRespiratoria, double temperatura,
			double saturacion, String alergias, String enfermedadesPrevias, Paciente personaSignosVitales) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecienciaRespiratoria = frecienciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
		this.personaSignosVitales = personaSignosVitales;
	}


	public SignosVitales(double presion, double frecuenciaCardiaca, double frecienciaRespiratoria, double temperatura,
			double saturacion, String alergias, String enfermedadesPrevias) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecienciaRespiratoria = frecienciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
	}


	public SignosVitales(int id, double presion, double frecuenciaCardiaca, double frecienciaRespiratoria,
			double temperatura, double saturacion, String alergias, String enfermedadesPrevias) {
		super();
		this.id = id;
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecienciaRespiratoria = frecienciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPresion() {
		return presion;
	}


	public void setPresion(double presion) {
		this.presion = presion;
	}


	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}


	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}


	public double getFrecienciaRespiratoria() {
		return frecienciaRespiratoria;
	}


	public void setFrecienciaRespiratoria(double frecienciaRespiratoria) {
		this.frecienciaRespiratoria = frecienciaRespiratoria;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	public double getSaturacion() {
		return saturacion;
	}


	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}


	public String getAlergias() {
		return alergias;
	}


	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}


	public String getEnfermedadesPrevias() {
		return enfermedadesPrevias;
	}


	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		this.enfermedadesPrevias = enfermedadesPrevias;
	}


	public Paciente getPersonaSignosVitales() {
		return personaSignosVitales;
	}


	public void setPersonaSignosVitales(Paciente personaSignosVitales) {
		this.personaSignosVitales = personaSignosVitales;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alergias == null) ? 0 : alergias.hashCode());
		result = prime * result + ((enfermedadesPrevias == null) ? 0 : enfermedadesPrevias.hashCode());
		long temp;
		temp = Double.doubleToLongBits(frecienciaRespiratoria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(frecuenciaCardiaca);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((personaSignosVitales == null) ? 0 : personaSignosVitales.hashCode());
		temp = Double.doubleToLongBits(presion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(saturacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(temperatura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		SignosVitales other = (SignosVitales) obj;
		if (alergias == null) {
			if (other.alergias != null)
				return false;
		} else if (!alergias.equals(other.alergias))
			return false;
		if (enfermedadesPrevias == null) {
			if (other.enfermedadesPrevias != null)
				return false;
		} else if (!enfermedadesPrevias.equals(other.enfermedadesPrevias))
			return false;
		if (Double.doubleToLongBits(frecienciaRespiratoria) != Double.doubleToLongBits(other.frecienciaRespiratoria))
			return false;
		if (Double.doubleToLongBits(frecuenciaCardiaca) != Double.doubleToLongBits(other.frecuenciaCardiaca))
			return false;
		if (id != other.id)
			return false;
		if (personaSignosVitales == null) {
			if (other.personaSignosVitales != null)
				return false;
		} else if (!personaSignosVitales.equals(other.personaSignosVitales))
			return false;
		if (Double.doubleToLongBits(presion) != Double.doubleToLongBits(other.presion))
			return false;
		if (Double.doubleToLongBits(saturacion) != Double.doubleToLongBits(other.saturacion))
			return false;
		if (Double.doubleToLongBits(temperatura) != Double.doubleToLongBits(other.temperatura))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SignosVitales [id=" + id + ", presion=" + presion + ", frecuenciaCardiaca=" + frecuenciaCardiaca
				+ ", frecienciaRespiratoria=" + frecienciaRespiratoria + ", temperatura=" + temperatura
				+ ", saturacion=" + saturacion + ", alergias=" + alergias + ", enfermedadesPrevias="
				+ enfermedadesPrevias + ", personaSignosVitales=" + personaSignosVitales + "]";
	}
	
	
   
}
