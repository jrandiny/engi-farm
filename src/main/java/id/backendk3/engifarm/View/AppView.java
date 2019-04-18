package id.backendk3.engifarm.View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import id.backendk3.engifarm.Farm;
import id.backendk3.engifarm.OptionBox;
import id.backendk3.engifarm.Player;
import id.backendk3.engifarm.Controller.InputController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.Observer;
import java.util.Observable;

public class AppView extends JFrame implements Observer {
    public static final int SIDEBAR_SIZE = 300;

    private MapView mapPanel;
    private TooltipView tooltipPanel;
    private MoneyView moneyPanel;
    private WaterView waterPanel;
    private InventoryView inventoryPanel;
    private InputController ic;

    public AppView(Player p, Farm f) {
        this.ic = ic;

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        this.setSize(dim.width / 2, dim.height / 2);
        this.setLocationRelativeTo(null);
        
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 2, new Insets(10, 10, 10, 10), -1, -1));
        final JScrollPane scrollPaneMap = new JScrollPane();
        mainPanel.add(scrollPaneMap, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        mapPanel = new MapView(p,f);
        scrollPaneMap.setViewportView(mapPanel.$$$getRootComponent$$$());
        final JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(sidePanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(150, -1), null, null, 0, false));
        tooltipPanel = new TooltipView();
        sidePanel.add(tooltipPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, new Dimension(-1, 50), null, new Dimension(-1, 50), 0, false));
        moneyPanel = new MoneyView();
        sidePanel.add(moneyPanel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, new Dimension(-1, 20), null, new Dimension(-1, 20), 0, false));
        waterPanel = new WaterView();
        sidePanel.add(waterPanel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, new Dimension(-1, 20), null, new Dimension(-1, 20), 0, false));
        inventoryPanel = new InventoryView();
        sidePanel.add(inventoryPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel titleLabel = new JLabel();
        titleLabel.setText("Engi's Farm");
        sidePanel.add(titleLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(SIDEBAR_SIZE,-1), null, null, 0, false));
        this.add(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setFocusable(true);
    }
    
    public void setInputListener(InputController ic){
        this.ic = ic;
        this.addKeyListener(ic);
    }

    public MapView getMapView(){
        return mapPanel;
    }

    public TooltipView getTooltipView(){
        return tooltipPanel;
    }

    public MoneyView getMoneyView(){
        return moneyPanel;
    }

    public WaterView getWaterView(){
        return waterPanel;
    }
    
    public InventoryView getInventoryView(){
        return inventoryPanel;
    }

    public void update(Observable observable, Object arg) {
        OptionBox ob = (OptionBox) observable;
        String[] options = ob.getOptions();
        String out = (String) JOptionPane.showInputDialog(this, "Pilih", "Pilihan", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        ic.dialogSet(ob.getType(),out);
    }
}
