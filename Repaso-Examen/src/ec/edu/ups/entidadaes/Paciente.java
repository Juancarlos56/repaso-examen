package ec.edu.ups.entidadaes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "personaSignosVitales")
    private List<SignosVitales> signosVitales= new ArrayList<SignosVitales>();
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "personaCitas")
    private List<Cita> citas= new ArrayList<Cita>();
	
	
	
	public Paciente() {
		super();
	}



	public Paciente(int id, String cedula, String nombre, String apellido, String telefono, String direccion,
			String email) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}



	public Paciente(String cedula, String nombre, String apellido, String telefono, String direccion, String email) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List<SignosVitales> getSignosVitales() {
		return signosVitales;
	}



	public void setSignosVitales(List<SignosVitales> signosVitales) {
		this.signosVitales = signosVitales;
	}
	
	
	
	public void addSignosVitales(SignosVitales signoVitale) {
		this.signosVitales.add(signoVitale);
	}



	public List<Cita> getCitas() {
		return citas;
	}



	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
   
	
	public void addCitas(Cita cita) {
		this.citas.add(cita);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + ((citas == null) ? 0 : citas.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((signosVitales == null) ? 0 : signosVitales.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Paciente other = (Paciente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (citas == null) {
			if (other.citas != null)
				return false;
		} else if (!citas.equals(other.citas))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (signosVitales == null) {
			if (other.signosVitales != null)
				return false;
		} else if (!signosVitales.equals(other.signosVitales))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", signosVitales="
				+ signosVitales + ", citas=" + citas + "]";
	}
	
	
}
