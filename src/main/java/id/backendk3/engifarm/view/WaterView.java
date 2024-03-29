package id.backendk3.engifarm.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import id.backendk3.engifarm.Player;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Kelas riil WaterView turunan JPanel
 * 
 * <p>Kelas ini merepresenstasikan data water yang dimiliki oleh player dan ditampilkan pada layar
 */
public class WaterView extends JPanel implements Observer {

    private final JLabel waterLabel;

    /**
     * Konstruktor Kelas WaterView
     */
    public WaterView() {
        this.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        waterLabel = new JLabel();
        waterLabel.setText("Water = ");
        this.add(waterLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * Method pembaruan untuk menangani perubahan data water yang dimiliki player dan ditampilkan kembali ke layar
     */
    public void update(Observable observable, Object arg) {
        Player p = (Player) observable;
        waterLabel.setText(String.format("Water  = %d", p.getWater()));
        this.repaint();
        this.revalidate();
    }
}
