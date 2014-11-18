package br.com.guilhermeoliveira.util;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guilherme.oliveira
 */
@ApplicationScoped
@Component
public class EntityManagerFactoryProducer implements ComponentFactory<EntityManagerFactory> {

    private final EntityManagerFactory emf;

    public EntityManagerFactoryProducer() {
        emf = Persistence.createEntityManagerFactory("default");
    }
    
    
    @Override
    public EntityManagerFactory getInstance() {
        return emf;
    }
    
}
