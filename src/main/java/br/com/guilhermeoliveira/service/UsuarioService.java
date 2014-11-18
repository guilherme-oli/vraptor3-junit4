package br.com.guilhermeoliveira.service;

import br.com.caelum.vraptor.ioc.Component;
import br.com.guilhermeoliveira.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author guilherme.oliveira
 */
@Component
public class UsuarioService {
    
    private final EntityManager em;

    public UsuarioService(EntityManager em) {
        this.em = em;
    }
    
    public List<Usuario> lista() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }
}
