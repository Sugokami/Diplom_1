import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private Ingredient ingredient;
    @Parameterized.Parameter()
    public String ingredientType;
    @Parameterized.Parameter(1)
    public String name;
    @Parameterized.Parameter(2)
    public float price;

    @Parameterized.Parameters(name = "Ingredient Type = {0}, Name = {1}, Price = {2}")
    public static Object[][] getData() {
        return new Object[][]{
                {"SAUCE", "Pumpernickel", 500.00f},
                {"FILLING", "Light bread", 350.00f},
        };
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.valueOf(ingredientType), name, price);
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(price, ingredient.getPrice(), 10);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(name, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals(IngredientType.valueOf(ingredientType), ingredient.getType());
    }
}
