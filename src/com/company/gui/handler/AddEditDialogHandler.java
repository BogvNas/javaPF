/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;


import com.company.exception.ModelException;
import com.company.gui.MainFrame;
import com.company.gui.dialog.AddEditDialog;
import com.company.gui.dialog.ErrorDialog;
import com.company.saveload.SaveData;
import com.company.settings.HandlerCode;

import java.awt.event.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AddEditDialogHandler extends Handler implements WindowListener, KeyListener {

    private final AddEditDialog dialog;

    public AddEditDialogHandler(MainFrame frame, AddEditDialog dialog) {
        super(frame);
        this.dialog = dialog;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.ADD:
                addEdit(true);
                break;
            case HandlerCode.EDIT:
                addEdit(false);
                break;
            case HandlerCode.CANCEL:
                closeDialog();
        }
        super.actionPerformed(ae);
    }
    
    private void addEdit(boolean add) {
        try {
            if (add) SaveData.getInstance().add(dialog.getCommonFromForm());
            else SaveData.getInstance().edit(dialog.getCommon(), dialog.getCommonFromForm());
            closeDialog();
        }
        catch (ModelException ex) {
            ErrorDialog.show(frame, ex.getMessage());
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            addEdit(dialog.isAdd());
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void windowOpened(WindowEvent we) {}

    @Override
    public void windowClosing(WindowEvent we) {
        closeDialog();
    }

    @Override
    public void windowClosed(WindowEvent we) { }

    @Override
    public void windowIconified(WindowEvent we) {}

    @Override
    public void windowDeiconified(WindowEvent we) {}

    @Override
    public void windowActivated(WindowEvent we) {}

    @Override
    public void windowDeactivated(WindowEvent we) {}

    private void closeDialog() {
        dialog.closeDialog();
    }
    
}
