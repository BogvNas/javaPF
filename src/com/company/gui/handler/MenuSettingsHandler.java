/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;


import com.company.gui.MainFrame;
import com.company.settings.HandlerCode;
import com.company.settings.Settings;
import com.company.settings.Text;

import java.awt.event.ActionEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MenuSettingsHandler extends Handler {
    
    public MenuSettingsHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.MENU_SETTINGS_LANGUAGE_RUSSIAN: {
                Settings.setLanguage("ru");
                break;
            }
            case HandlerCode.MENU_SETTINGS_LANGUAGE_ENGLISH: {
                Settings.setLanguage("en");
            }
        }
        Text.init();
        frame.getMenu().refresh();
        super.actionPerformed(ae);
    }
    
}
