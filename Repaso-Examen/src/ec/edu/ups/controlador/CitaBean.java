package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaFacade;
import ec.edu.ups.entidadaes.Cita;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CitaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitaFacade ejbCita;
	
	

	public CitaBean() {
        
    }

}
