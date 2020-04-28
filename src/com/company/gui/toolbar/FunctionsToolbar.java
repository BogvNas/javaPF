package com.company.gui.toolbar;

import com.company.gui.EnableEditDelete;
import com.company.gui.MainButtom;
import com.company.settings.HandlerCode;
import com.company.settings.Style;
import com.company.settings.Text;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class FunctionsToolbar extends AbstractToolbar implements EnableEditDelete {

    private MainButtom editButton;
    private MainButtom deleteButton;

    public FunctionsToolbar() {
        super(Style.BORDER_FUNCTIONS_TOOLBAR);
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
