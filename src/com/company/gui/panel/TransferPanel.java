package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.dialog.TransferAddEditDialog;
import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.TransactionTableData;
import com.company.gui.table.TransferTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Settings;
import com.company.settings.Style;
import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class TransferPanel extends RightPanel {

    public TransferPanel(MainFrame frame) {
        super(frame, new TransferTableData(new FunctionsHandler(frame, new TransferAddEditDialog(frame))),
                "TRANSFERS", Style.ICON_PANEL_TRANSFERS,
                new JPanel[] {new FunctionsToolBar(new FunctionsHandler(frame, new TransferAddEditDialog(frame))), new FilterPanel(frame)});
    }

}
