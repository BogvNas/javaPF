package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.table.AccountTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AccountPanel extends RightPanel {

    public AccountPanel(MainFrame frame) {
        super(frame, new AccountTableData(), "ACCOUNTS", Style.ICON_PANEL_ACCOUNTS, new FunctionsToolBar());
    }

}
