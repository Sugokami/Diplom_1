import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Corn bread", 200.0f);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Corn bread", bun.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(200.0f, bun.getPrice(), 0);
    }
}
