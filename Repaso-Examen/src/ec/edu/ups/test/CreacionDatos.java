package ec.edu.ups.test;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.entidadaes.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CreacionDatos implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@EJB
	private PacienteFacade ejbPaciente;
	@EJB
	private CitaFacade ejbCita;
	@EJB
	private SignosVitalesFacade ejbSignosVitales;
	
	public CreacionDatos() {
		
	}

	public void creacionPrincipal() {
		Paciente p = new Paciente("0106113301", "Juan", "Barrera", "0980990592", "Paute", "barrerajuan930@gmail.com");
		Paciente p2 = new Paciente("0106114309", "Katherine", "Barrera", "0980990592", "Paute", "katerinbarrera21@gmail.com");
		Paciente p3 = new Paciente("0106113301", "John", "Chiqui", "0980990592", "Paute", "johnchiqui@gmail.com");
		ejbPaciente.create(p);
		ejbPaciente.create(p2);
		ejbPaciente.create(p3);
	}
	
	
	
}
