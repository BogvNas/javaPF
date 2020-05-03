package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.Refresh;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
abstract public class AbstractPanel extends JPanel implements Refresh {

    protected final MainFrame frame;

    public AbstractPanel(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void refresh() {
    removeAll();
    init();
    }

    abstract protected void init();
}
