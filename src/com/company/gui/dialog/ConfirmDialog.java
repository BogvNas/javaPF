package com.company.gui.dialog;

import com.company.gui.MainFrame;
import com.company.settings.Text;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ConfirmDialog {

    public static int show(MainFrame frame, String text, String title){
        String[] options = {Text.get("YES"), Text.get("NO")};
        int result = JOptionPane.showOptionDialog(frame, text, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        return result;
    }

}
