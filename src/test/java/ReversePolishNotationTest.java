import Model.Alumno;
import Model.Instituto;
import Model.Operación;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ReversePolishNotationTest {

    private final static Logger logger = Logger.getLogger(ProductManagerTest.class);

    private Alumno a1;
    private Alumno a2;

    private Instituto u1;
    private Instituto u2;

    Operación op1;
    Operación op2;

    private List<Operación> oplist1;
    private List<Operación> oplist2;

    @Before //Junit4
    public void setUp() throws Exception {
        a1 = new Alumno("Sara");
        a2 = new Alumno("Pedro");

        u1 = new Instituto("StJoan");
        u2 = new Instituto("StPere");

        oplist1 = new ArrayList<>();
        oplist2 = new ArrayList<>();

        getInstance().realizoOperacion();

    }

    @After //Junit4
    public void tearDown(){
        a1 = null;
        a2 = null;

        u1 = null;
        u2 = null;

        oplist1 = null;
        oplist2 = null;

        getInstance().realizoOperacion().clear();
    }

    @Test
    public void realizarOperacion(){
        logger.info("Starting realizarOperacion...");
        Assert.assertTrue(getInstance().realizarOperacion());
        logger.info("Finishing realizarOperacion...");

    }

    @Test
    public void procesarOperacion(){
        logger.info("Starting procesarOperacion...");
        Assert.assertTrue(getInstance().procesarOperacion());
        logger.info("Finishing procesarOperacion...");

    }


}
