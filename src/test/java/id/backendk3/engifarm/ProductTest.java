package id.backendk3.engifarm;

import id.backendk3.engifarm.product.farmproduct.*;
import id.backendk3.engifarm.product.Product;
import id.backendk3.engifarm.product.sideproduct.BeefRolade;
import id.backendk3.engifarm.product.sideproduct.EggBenedict;
import id.backendk3.engifarm.product.sideproduct.Meatza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTest {
    @Test
    void testConstructor() {
        ChickenEgg a = new ChickenEgg();
        CowMeat b = new CowMeat();
        CowMilk c = new CowMilk();
        DuckEgg d = new DuckEgg();
        GoatMeat e = new GoatMeat();
        GoatMilk f = new GoatMilk();
        HorseMeat g = new HorseMeat();
        RabbitMeat h = new RabbitMeat();
        BeefRolade i = new BeefRolade();
        EggBenedict j = new EggBenedict();
        Meatza k = new Meatza();

        assertEquals(Product.ProductType.ChickenEggType, a.getType(), "Construct ChickenEgg Failed");
        assertEquals(Product.ProductType.CowMeatType, b.getType(), "Construct CowMeat Failed");
        assertEquals(Product.ProductType.CowMilkType, c.getType(), "Construct CowMilk Failed");
        assertEquals(Product.ProductType.DuckEggType, d.getType(), "Construct DuckEgg Failed");
        assertEquals(Product.ProductType.GoatMeatType, e.getType(), "Construct GoatMeat Failed");
        assertEquals(Product.ProductType.GoatMilkType, f.getType(), "Construct GoatMilk Failed");
        assertEquals(Product.ProductType.HorseMeatType, g.getType(), "Construct HorseMeat Failed");
        assertEquals(Product.ProductType.RabbitMeatType, h.getType(), "Construct RabbitMeat Failed");
        assertEquals(Product.ProductType.BeefRoladeType, i.getType(), "Construct BeefRolade Failed");
        assertEquals(Product.ProductType.EggBenedictType, j.getType(), "Construct EggBenedict Failed");
        assertEquals(Product.ProductType.MeatzaType, k.getType(), "Construct Meatza Failed");
    }

    @Test
    void testgetHarga() {
        ChickenEgg a = new ChickenEgg();
        CowMeat b = new CowMeat();
        CowMilk c = new CowMilk();
        DuckEgg d = new DuckEgg();
        GoatMeat e = new GoatMeat();
        GoatMilk f = new GoatMilk();
        HorseMeat g = new HorseMeat();
        RabbitMeat h = new RabbitMeat();
        BeefRolade i = new BeefRolade();
        EggBenedict j = new EggBenedict();
        Meatza k = new Meatza();

        assertEquals(100, a.getHarga(), "ChickenEgg must cost 100");
        assertEquals(100, b.getHarga(), "CowMeat must cost 100");
        assertEquals(100, c.getHarga(), "CowMilk must cost 100");
        assertEquals(100, d.getHarga(), "DuckEgg must cost 100");
        assertEquals(100, e.getHarga(), "GoatMeat must cost 100");
        assertEquals(100, f.getHarga(), "GoatMilk must cost 100");
        assertEquals(100, g.getHarga(), "HorseMeat must cost 100");
        assertEquals(100, h.getHarga(), "RabbitMeat must cost 100");
        assertEquals(400, i.getHarga(), "BeefRolade must cost 400");
        assertEquals(600, j.getHarga(), "EggBenedict must cost 600");
        assertEquals(600, k.getHarga(), "Meatza must cost 600");
    }

    @Test
    void testRender() {
        ChickenEgg a = new ChickenEgg();
        CowMeat b = new CowMeat();
        CowMilk c = new CowMilk();
        DuckEgg d = new DuckEgg();
        GoatMeat e = new GoatMeat();
        GoatMilk f = new GoatMilk();
        HorseMeat g = new HorseMeat();
        RabbitMeat h = new RabbitMeat();
        BeefRolade i = new BeefRolade();
        EggBenedict j = new EggBenedict();
        Meatza k = new Meatza();

        assertEquals("Chicken Egg", a.render(), "Render ChickenEgg Failed");
        assertEquals("Cow Meat", b.render(), "Render CowMeat Failed");
        assertEquals("Cow Milk", c.render(), "Render CowMilk Failed");
        assertEquals("Duck Egg", d.render(), "Render DuckEgg Failed");
        assertEquals("Goat Meat", e.render(), "Render GoatMeat Failed");
        assertEquals("Goat Milk", f.render(), "Render GoatMilk Failed");
        assertEquals("Horse Meat", g.render(), "Render HorseMeat Failed");
        assertEquals("Rabbit Meat", h.render(), "Render RabbitMeat Failed");
        assertEquals("Beef Rolade", i.render(), "Render BeefRolade Failed");
        assertEquals("Egg Benedict", j.render(), "Render EggBenedict Failed");
        assertEquals("Meatza", k.render(), "Render Meatza Failed");
    }

    @Test
    void testEquals() {
        ChickenEgg a = new ChickenEgg();
        CowMeat b = new CowMeat();
        CowMilk c = new CowMilk();
        DuckEgg d = new DuckEgg();
        GoatMeat e = new GoatMeat();
        GoatMilk f = new GoatMilk();
        HorseMeat g = new HorseMeat();
        RabbitMeat h = new RabbitMeat();
        BeefRolade i = new BeefRolade();
        EggBenedict j = new EggBenedict();
        Meatza k = new Meatza();

        assertEquals(a, new ChickenEgg(), "Equals on ChickenEggType Failed");
        assertEquals(b, new CowMeat(), "Equals on CowMeatType Faisled");
        assertEquals(c, new CowMilk(), "Equals on CowMilkType Failed");
        assertEquals(d, new DuckEgg(), "Equals on DuckEggType Failed");
        assertEquals(e, new GoatMeat(), "Equals on GoatMeatType Failed");
        assertEquals(f, new GoatMilk(), "Equals on GoatMilkType Failed");
        assertEquals(g, new HorseMeat(), "Equals on HorseMeatType Failed");
        assertEquals(h, new RabbitMeat(), "Equals on RabbitMeatType Failed");
        assertEquals(i, new BeefRolade(), "Equals on BeefRoladeType Failed");
        assertEquals(j, new EggBenedict(), "Equals on EggBenedictType Failed");
        assertEquals(k, new Meatza(), "Equals on MeatzaType Failed");
    }
}
