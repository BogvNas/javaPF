/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;

import com.company.gui.MainFrame;
import com.company.gui.dialog.ConfirmDialog;
import com.company.saveload.SaveData;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MainWindowHandler extends WindowAdapter {
    
    @Override
    public void windowClosing(WindowEvent we) {
        if (SaveData.getInstance().isSaved()) System.exit(0);
        else {
            int result = ConfirmDialog.show((MainFrame) we.getWindow(), "CONFIRM_EXIT_TEXT", "CONFIRM_EXIT_TITLE");
            if (result == JOptionPane.YES_OPTION) System.exit(0);
        }
    }
    
}
