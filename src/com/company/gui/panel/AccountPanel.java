package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.dialog.AccountAddEditDialog;
import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.AccountTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AccountPanel extends RightPanel {

    public AccountPanel(MainFrame frame) {
        super(frame, new AccountTableData(new FunctionsHandler(frame, new AccountAddEditDialog(frame))),
                "ACCOUNTS", Style.ICON_PANEL_ACCOUNTS,
                new FunctionsToolBar(new FunctionsHandler(frame, new AccountAddEditDialog(frame))));
    }

}
