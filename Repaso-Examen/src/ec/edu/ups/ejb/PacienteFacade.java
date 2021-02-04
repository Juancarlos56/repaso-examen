package ec.edu.ups.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidadaes.Paciente;


@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{

	 @PersistenceContext(unitName = "Repaso-Examen")
	 private EntityManager em;
    
    public PacienteFacade() {
       super(Paciente.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public Paciente buscarCedula(String cedula) {
		
		
		return new Paciente();
	}
	

}
