package com.company.gui.menu;

import com.company.gui.Refresh;
import com.company.settings.HandlerCode;
import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class TablePopupMenu extends JPopupMenu implements Refresh {

    public TablePopupMenu() {
        super();
        init();
    }

    @Override
    public void refresh() {

    }

    private void init(){
        JMenuItem editItem = new JMenuItem(Text.get("EDIT"));
        JMenuItem deleteItem = new JMenuItem(Text.get("DELETE"));

        editItem.setActionCommand(HandlerCode.EDIT);
        deleteItem.setActionCommand(HandlerCode.DELETE);

        editItem.setIcon(Style.ICON_MENU_POPUP_EDIT);
        deleteItem.setIcon(Style.ICON_MENU_POPUP_DELETE);

        add(editItem);
        add(deleteItem);
    }

}
