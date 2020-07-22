/**
 * @author Darol Kom
 * @version 1.0
 */
package model;

import org.junit.After; 
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
    private Model model;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.model = new Model();
    }

    @After
    public void tearDown() throws Exception {
    }

   @Test
    public void testGetMessage() {
        Assert.assertEquals("", this.model.getHelloWorld().getMessage());
    }

    /**
     * Test method for {@link model.Model#loadHelloWorld(java.lang.String)}.
     */
    @Test
    public void testGetMessageString() {
        this.model.loadHelloWorld("UP");
       //s Assert.assertEquals("11111111111111111111;15000002223322222331;11112000000000000001;11120000011111111111;11200001120311111111;13203120020020020111;10001220000000002111;10001003111110230111;10021002160020100111;10221020102031070111;10021000200301020111;10002113000112200111;11000021111320200111;11130000200000001111;11111300020020111111;11111111111111111111;", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("DW");
        //Assert.assertEquals("11111111111111111111;15000003200020000001;12000000200000002001;10000000000200000001;10000000000002030001;10000000000000000001;10000000020030000001;10000000070000000001;10032000021111100001;10022000300613032001;10020000001111100001;10000000000000200001;10000300000000000001;10002000000000000001;10000200000000000001;12000000000000000001;10000000000030000001;10022300000000000201;11111111111111111111;", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("RI");
       // Assert.assertEquals("11111111111111111111;15000001222220102001;10022001233300000021;10200201236320102331;10003001233320102331;10000001222220102221;10000001000000100001;11110111110111111011;12000020000222000021;10020000020070002001;10000000000000020001;10111110111111011111;10231000001200000131;10201200021020000131;10221020033302000001;10001002001020200121;13001300001200003001;11111111111111111111;", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("LE");
      //  Assert.assertEquals("11111111111111111111;15200020002000000001;10023020000000000201;10002020000000000001;10000000012220022211;10010700001300003121;10021000022132231001;10022100002010010001;10000310000006300001;10000100200010010021;10001002000102201001;10010020001023320101;10000200010002200011;10000000302000002001;10000202000000000001;10000000000000000001;11111111111111111111;", this.model.getHelloWorld().getMessage());
        this.model.loadHelloWorld("PP");
      //  Assert.assertEquals("11111111111111111111;15000000003020000001;10202000000000000001;10000000000000000001;12022000000000200001;12002000000000220021;10000002000000002001;11100011111000111111;10000020030000202001;10030000020000000001;10002002020000000001;10020000200000000221;10200000200000000201;10320000070000000021;10000000111111111111;10000000000000003001;12200000000022002061;10200200000000200001;11111111111111111111;", this.model.getHelloWorld().getMessage());
    }
}
