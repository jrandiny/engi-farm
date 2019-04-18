package id.backendk3.engifarm.View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import id.backendk3.engifarm.Player;
import id.backendk3.engifarm.Product.Product;

import javax.swing.*;
import java.util.Observer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;

public class InventoryView extends JScrollPane implements Observer {

    private JList<String> inventoryList;
    private DefaultListModel<String> listModel;

    public InventoryView() {
        listModel = new DefaultListModel<>();
        inventoryList = new JList<String>(listModel);

        this.setViewportView(inventoryList);
    }

    public void update(Observable observable, Object arg) {
        Player p = (Player) observable;
        Map<Product,Integer> bag = p.getBag();

        listModel.clear();
        for(Map.Entry<Product, Integer> entry : bag.entrySet() ){
            listModel.addElement(entry.getValue().toString()+" - "+entry.getKey().render());
        }  

        this.setViewportView(inventoryList);

        this.repaint();
        this.revalidate();
    }
}
