/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;


import com.company.gui.MainFrame;
import com.company.gui.panel.StatisticsPanel;
import com.company.settings.HandlerCode;

import java.awt.event.ActionEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ChartHandler extends Handler {
    
    public ChartHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.TYPE: {
                ((StatisticsPanel) frame.getRightPanel()).nextType();
            }
        }
        super.actionPerformed(ae);
    }
    
}
