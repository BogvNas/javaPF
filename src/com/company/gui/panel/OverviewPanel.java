package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.dialog.TransactionAddEditDialog;
import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.TransactionTableData;
import com.company.settings.Settings;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class OverviewPanel extends RightPanel {

    public OverviewPanel(MainFrame frame) {
        super(frame,
                new TransactionTableData(new FunctionsHandler(frame, new TransactionAddEditDialog(frame)), Settings.COUNT_OVERVIEW_ROWS),
                "LAST_TRANSACTIONS", Style.ICON_PANEL_OVERVIEW);
    }

}
