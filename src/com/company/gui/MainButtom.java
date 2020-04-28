package com.company.gui;

import com.company.settings.Style;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MainButtom extends JButton{

    public MainButtom(String title, ImageIcon icon, ActionListener listener, String action){
        super(title);
        setIcon(icon);
        setActionCommand(action);
        addActionListener(listener);
        addMouseListener(new HoverButtom());

        setFont(Style.FONT_MAIN_BUTTON);
        setFocusPainted(false);
        setBackground(Style.COLOR_BUTTON_BG_NORMAL);
    }

    public MainButtom(String title,ActionListener listener, String action){
        this(title, null, listener, action);
    }

    public MainButtom(ImageIcon icon,ActionListener listener, String action){
        this("", icon, listener, action);
    }

    private class HoverButtom implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ((MainButtom)e.getSource()).setBackground(Style.COLOR_BUTTON_BG_HOVER);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ((MainButtom)e.getSource()).setBackground(Style.COLOR_BUTTON_BG_NORMAL);
        }
    }

}


