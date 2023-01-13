import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    @Parameterized.Parameter()
    public String name;
    @Parameterized.Parameter(1)
    public float price;

    @Parameterized.Parameters(name = "Name = {0}, Price = {1}")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"", 12f},
                {null, 0},
                {"!@#!$$!$$!$<>", 12456464564346454654564564652333f},
                {"     ", -1231546f},
                {"BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuurger", 0.0000000000000000001f},
                {"best bun", 200.00f},
                {"-546454654564564652333f", 1/100f}
        };
    }
    @Test
    public void getNameTest() {
        Bun bun = new Bun(name, price);
        assertEquals("Булка называется: ", name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        Bun bun = new Bun(name, price);
        assertEquals(price, bun.getPrice(), 0);
    }
}
