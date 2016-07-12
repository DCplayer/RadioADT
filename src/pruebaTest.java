/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import radioa.Radio;
import radioa.gui;
import radioa.logica;

/**
 *
 * @author Jenny
 */
public class pruebaTest  extends TestCase{
    
    private Radio radio;
    private logica internalRadio;
    private gui gui;
    private double [] lista;
    private int i;
    private double emisora;
    
    
    
    public pruebaTest() {
        lista = new double [12];
        lista[0]=87.9;
        internalRadio = new logica();
        internalRadio.setFrecuencia(true);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
     public void testGuardarEmisora() {
        internalRadio.saveEmisora(1, 87.9);
        System.out.println(internalRadio.getFm());
        for(i=0;i<internalRadio.getFm().length;i++){
            System.out.println(internalRadio.getFm()[i]);
        }    
        assertEquals(lista[0],internalRadio.getFm()[0]); 
         
     }
     
     public void testSelectEmisora(){
        internalRadio.selectEmisora(1);
        assertEquals(lista[0], internalRadio.selectEmisora(1));
     }
     
}
