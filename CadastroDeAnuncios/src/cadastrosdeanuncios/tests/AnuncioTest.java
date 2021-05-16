package cadastrosdeanuncios.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cadastrodeanuncios.dao.AnuncioDAO;
import java.sql.SQLException;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class AnuncioTest extends TestCase  {
    
    public AnuncioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {    
    }
    
    @AfterClass
    public static void tearDownClass() {     
    }
    
    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }
    
    @After
    @Override
    public void tearDown() throws Exception {
        super.setUp();
    }
    
    @Test//(expected = SQLException.class)
    public void criarAnuncioTest(){
        AnuncioDAO anuncio = new AnuncioDAO();
        anuncio.criarAnuncio(null);       
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
