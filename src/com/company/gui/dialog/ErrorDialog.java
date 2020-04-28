package com.company.gui.dialog;

import com.company.gui.MainFrame;
import com.company.settings.Text;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ErrorDialog {

    public static void show(MainFrame frame, String text){
        JOptionPane.showMessageDialog(frame, text, Text.get("ERROR"), JOptionPane.ERROR_MESSAGE);
    }

}
