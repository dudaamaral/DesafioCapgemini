/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cadastrodeanuncios.dao.AnuncioDAO;
import cadastrodeanuncios.model.AnuncioModel;
import cadastrodeanuncios.model.InvestimentoModel;
import cadastrodeanuncios.model.PessoaModel;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class AnuncioTestNG {
    
    public AnuncioTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test (expectedExceptions = {SQLException.class, NullPointerException.class})
    public void criarAnuncioNulo(){
        AnuncioDAO anuncio = new AnuncioDAO();
        anuncio.criarAnuncio(null);       
    }
    
    @Test (expectedExceptions = {SQLException.class, NullPointerException.class})
    public void criarAnuncioDadosNulos(){
        AnuncioDAO anuncioDao = new AnuncioDAO();
        AnuncioModel anuncio = new AnuncioModel();
        anuncio.setNome(null);
        anuncio.setDinicio(null);
        anuncio.setDfinal(null);
        anuncio.setCliente(null);
        anuncio.setInvestimento(null);
                
        anuncioDao.criarAnuncio(null);       
    }
    
    @Test (expectedExceptions = {SQLException.class, NullPointerException.class, ParseException.class})
    public void criarAnuncioDatasInvalidas() throws ParseException{
        AnuncioDAO anuncioDao = new AnuncioDAO();
        AnuncioModel anuncio = new AnuncioModel();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        anuncio.setNome("Eduarda");
        anuncio.setDinicio(formato.parse(new Date().toString()));
        anuncio.setDfinal(formato.parse(new Date().toString()));
        anuncio.setCliente(new PessoaModel("Cliente 2","123.123.123.123"));
        anuncio.setInvestimento(new InvestimentoModel(100.0));
        
        anuncioDao.criarAnuncio(anuncio);       
    }
}
