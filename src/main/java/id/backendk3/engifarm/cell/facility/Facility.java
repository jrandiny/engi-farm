package id.backendk3.engifarm.cell.facility;

import id.backendk3.engifarm.cell.Cell;

/**
 * Kelas abstrak facility turunan cell
 *
 * <p>Kelas ini merepresentasikan cell yang bertipe fasilitas.
 * Karena berupa fasilitas, fasilitas akan selalu ter-<i>occupied</i>
 * Fasilitas secara <i>default</i> dapat digunakan (<i>usable</i>), tetapi
 * bisa juga tidak dapat digunakan
 *
 * @author backendk3
 * @see Cell
 * @see Mixer
 * @see Truck
 * @see Well
 */
public abstract class Facility extends Cell {
    /**
     * Apakah suatu fasilitas dapat digunakan
     *
     * <p>Akan bernilai true jika bisa digunakan
     */
    boolean usable;

    /**
     * Konstuktor kelas facility
     *
     * @param _x    Lokasi X
     * @param _y    Lokasi Y
     * @param _type Tipe fasilitas
     */
    protected Facility(int _x, int _y, CellType _type) {
        super(_x, _y, _type);
        occupied = true;
        usable = true;
    }

    /**
     * Mengecek apakah sebuah fasilitas dapat digunakan
     *
     * @return true jika dapat digunakan
     */
    public boolean isUsable() {
        return usable;
    }

    /**
     * Default callback for TimerObj
     */
    @Override
    protected void callback() {

    }
}
