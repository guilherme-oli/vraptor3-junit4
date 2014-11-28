package br.com.guilhermeoliveira.controller;

import br.com.caelum.vraptor.util.test.MockResult;
import br.com.guilhermeoliveira.service.UsuarioService;
import br.com.guilhermeoliveira.util.EntityManagerFactoryProducer;
import br.com.guilhermeoliveira.util.EntityManagerProducer;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guilherme.oliveira
 */
public class UsuarioControllerTest {
    
    private MockResult result;
    private UsuarioController usuarioController;
            
    public UsuarioControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        result = new MockResult();
        EntityManagerProducer em = new EntityManagerProducer(new EntityManagerFactoryProducer().getInstance());
        UsuarioService usuarioService = new UsuarioService(em.getInstance());
        usuarioController = new UsuarioController(result, usuarioService);
    }
    
    @After
    public void tearDown() {
        usuarioController = null;
        result = null;
        System.gc();
    }

    @Test
    public void testLista() {      
        usuarioController.lista();    
        assertNotNull("Result não preenchido", result.included().get("usuarios"));        
    }
    
}
