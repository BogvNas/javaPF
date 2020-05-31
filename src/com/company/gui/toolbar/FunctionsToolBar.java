package com.company.gui.toolbar;

import com.company.gui.EnableEditDelete;
import com.company.gui.MainButton;
import com.company.settings.HandlerCode;
import com.company.settings.Style;
import com.company.settings.Text;
import com.company.gui.handler.*;


/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public final class FunctionsToolBar extends AbstractToolBar implements EnableEditDelete {

    private MainButton editButton;
    private MainButton deleteButton;

    public FunctionsToolBar(Handler handler) {
        super(Style.BORDER_FUNCTIONS_TOOLBAR, handler);
        init();
    }

    @Override
    protected void init() {
        addButton(Text.get("ADD"), Style.ICON_ADD, HandlerCode.ADD, false);
        editButton = addButton(Text.get("EDIT"), Style.ICON_EDIT, HandlerCode.EDIT, false);
        deleteButton = addButton(Text.get("DELETE"), Style.ICON_DELETE, HandlerCode.DELETE, false);
    }

    @Override
    public void setEnableEditDelete(boolean enable) {
        editButton.setEnabled(enable);
        deleteButton.setEnabled(enable);
    }

}
