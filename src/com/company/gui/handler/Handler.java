package com.company.gui.handler;

import com.company.gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public abstract class Handler implements ActionListener {

    protected final MainFrame frame;

    public Handler(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        frame.refresh();
    }
}
