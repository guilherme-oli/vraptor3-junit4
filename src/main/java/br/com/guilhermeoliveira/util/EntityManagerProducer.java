package br.com.guilhermeoliveira.util;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author guilherme.oliveira
 */
@Component
public class EntityManagerProducer implements ComponentFactory<EntityManager> {

    private final EntityManager em;

    public EntityManagerProducer(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }

    @Override
    public EntityManager getInstance() {
        return em;
    }
    
    @PreDestroy
    public void destroy() {
        em.close();
    }
    
}
