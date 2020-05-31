package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.dialog.TransactionAddEditDialog;
import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.TransactionTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Settings;
import com.company.settings.Style;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class TransactionPanel extends RightPanel {

    public TransactionPanel(MainFrame frame) {
        super(frame, new TransactionTableData(new FunctionsHandler(frame, new TransactionAddEditDialog(frame))),
                "TRANSACTIONS", Style.ICON_PANEL_TRANSACTIONS,
                new JPanel[] {new FunctionsToolBar(new FunctionsHandler(frame, new TransactionAddEditDialog(frame))), new FilterPanel(frame)});
    }

}
