package com.company.gui.toolbar;

import com.company.gui.MainButtom;
import com.company.gui.Refresh;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
abstract public class AbstractToolbar extends JPanel implements Refresh {

    public AbstractToolbar(EmptyBorder border){
        super();
        setBorder(border);
    }

    abstract protected void init();

    protected MainButtom addButton(String title, ImageIcon icon, String action, boolean topIcon){
        MainButtom button = new MainButtom(title, icon, null, action);
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
