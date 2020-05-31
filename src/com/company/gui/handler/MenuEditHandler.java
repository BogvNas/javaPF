/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;

import com.company.gui.MainFrame;
import com.company.settings.HandlerCode;

import java.awt.event.ActionEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MenuEditHandler extends Handler {
    
    public MenuEditHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        FunctionsHandler handler = frame.getRightPanel().getTableData().getFunctionHandler();
        switch (ae.getActionCommand()) {
            case HandlerCode.MENU_EDIT_ADD: {
                handler.add();
                break;
            }
            case HandlerCode.MENU_EDIT_EDIT: {
                handler.edit();
                break;
            }
            case HandlerCode.MENU_EDIT_DELETE: {
                handler.delete();
            }
            
        }
        super.actionPerformed(ae);
    }
    
}
