/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;


import com.company.gui.MainFrame;
import com.company.gui.dialog.AboutDialog;
import com.company.settings.HandlerCode;

import java.awt.event.ActionEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MenuHelpHandler extends Handler {
    
    public MenuHelpHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.MENU_HELP_ABOUT: {
                new AboutDialog().setVisible(true);
            }
        }
        super.actionPerformed(ae);
    }
    
}
