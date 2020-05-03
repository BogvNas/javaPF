package com.company.gui.toolbar;

import com.company.gui.MainButton;
import com.company.gui.Refresh;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
abstract public class AbstractToolBar extends JPanel implements Refresh {

    public AbstractToolBar(EmptyBorder border){
        super();
        setBorder(border);
    }

    abstract protected void init();

    protected MainButton addButton(String title, ImageIcon icon, String action, boolean topIcon){
        MainButton button = new MainButton(title, icon, null, action);
        if(topIcon){
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
        }else {
            button.setHorizontalTextPosition(SwingConstants.RIGHT);
            button.setVerticalTextPosition(SwingConstants.CENTER);
        }
        add(button);
        return button;
    }

    @Override
    public void refresh() {
        removeAll();
        init();
    }
}
