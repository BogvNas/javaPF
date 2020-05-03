package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.table.TransactionTableData;
import com.company.settings.Settings;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class OverViewPanel extends RightPanel {

    public OverViewPanel(MainFrame frame) {
        super(frame, new TransactionTableData(Settings.COUNT_OVERVIEW_ROWS), "LAST_TRANSACTIONS", Style.ICON_PANEL_OVERVIEW);
    }

}
