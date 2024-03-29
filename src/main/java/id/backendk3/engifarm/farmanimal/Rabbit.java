package id.backendk3.engifarm.farmanimal;

import id.backendk3.engifarm.cell.Cell;
import id.backendk3.engifarm.product.farmproduct.RabbitMeat;
import id.backendk3.engifarm.product.Product;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Kelas riil turunan farmanimal
 *
 * <p>Kelas untuk salah satu tipe {@link FarmAnimal}.
 * Merepresentasikan hewan kelinci
 *
 * @author backendk3
 * @see FarmAnimal
 */

public class Rabbit extends FarmAnimal {

    /**
     * Konstruktor kelas Rabbit
     *
     * @param _x Lokasi X
     * @param _y Lokasi Y
     */
    public Rabbit(int _x, int _y) {
        super(_x, _y, 20, Cell.CellType.BarnType);
    }

    /**
     * Mengembalikan suara Rabbit
     *
     * @return String suara Rabbit
     */
    public String speak() {
        return "Purr purr..!";
    }

    /**
     * Mengembalikan produk dari Rabbit
     *
     * @return product berupa RabbitMeat
     * @see RabbitMeat
     */
    public Product getProduct() {
        Product res = new RabbitMeat();
        setHaveProduct(false);
        return res;
    }

    /**
     * Mengembalikan sprite untuk Rabbit
     *
     * @return Gambar sprite Rabbit
     */
    public Image getSprite() throws IOException {
        Image image;
        if (getEatStatus()) {
            // sudah makan
            image = ImageIO.read(getClass().getClassLoader().getResource("sprites/animal/rabbit.png"));
        } else {
            image = ImageIO.read(getClass().getClassLoader().getResource("sprites/animal/rabbit-hungry.png"));
        }
        return image;
    }
}