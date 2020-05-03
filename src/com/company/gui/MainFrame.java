package com.company.gui;

import com.company.gui.menu.MainMenu;
import com.company.gui.panel.*;
import com.company.gui.toolbar.MainToolBar;
import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;
import java.awt.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MainFrame extends JFrame implements Refresh{

    private final GridBagConstraints constraints;
    private final LeftPanel leftPanel;
    private RightPanel rightPanel;
    private final MainMenu mb;
    private final MainToolBar tb;

    public MainFrame(){
        super(Text.get("PROGRAMM_NAME"));

        setResizable(false);
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new MainMenu(this);
        setJMenuBar(mb);

        setLayout(new GridBagLayout());

        constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        //add toolbar
        tb = new MainToolBar();
        add(tb,constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;

        //add left panel
        leftPanel = new LeftPanel(this);
        add(leftPanel, constraints);

        //RightPanel
        setRightPanel(new StatisticsPanel(this));

        pack();
        setLocationRelativeTo(null);


    }


    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        tb.refresh();
        leftPanel.refresh();
        rightPanel.refresh();
        pack();
    }

    public MainMenu getMenu() {
        return mb;
    }

    public void setRightPanel(RightPanel panel) {
        if (rightPanel != null) remove(rightPanel);
        constraints.gridy = 1;
        constraints.gridx = 1;
        rightPanel = panel;
        panel.setBorder(Style.BORDER_PANEL);
        add(rightPanel, constraints);
        pack();
    }

    public RightPanel getRightPanel() { return rightPanel; }
}
