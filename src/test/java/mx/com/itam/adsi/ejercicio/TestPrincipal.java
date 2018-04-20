package mx.com.itam.adsi.ejercicio;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrincipal {
    private final static Logger LOG = Logger.getLogger(TestPrincipal.class);
    
    private Principal p = new Principal();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectCalcTest() {
        String val="";
        LOG.info("Ejecutando la prueba");
        
        val="abab";
        assertTrue("Calculo para '"+val+"':", calc(val, true));
        val = "gustavogustavogustavo";
	assertTrue("Calculo para '"+val+"':", calc(val, true));
	val = "aba";
	assertTrue("Calculo para '"+val+"':", calc(val, false));
	val = "a";
	assertTrue("Calculo para '"+val+"':", calc(val, false));
	val = "holaaholaa";
	assertTrue("Calculo para '"+val+"':", calc(val, true));
	val = "holaholaa";
	assertTrue("Calculo para '"+val+"':", calc(val, false));
	val = "holaprofeholaprofeholaprofe";
	assertTrue("Calculo para '"+val+"':", calc(val, true));
	val = "";
	assertTrue("Calculo para '"+val+"':", calc(val, false));
	val = "abcdababcdab";
	assertTrue("Calculo para '"+val+"':", calc(val, true));
	val = "asasasasasasasas";
	assertTrue("Calculo para '"+val+"':", calc(val, true));
    }
    
    private boolean calc(String source, boolean resp) {
        boolean calc = p.seConstruyeConSubcadenas(source);
        System.out.println(calc);
        return resp==calc;
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
