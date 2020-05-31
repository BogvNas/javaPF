package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.dialog.CurrencyAddEditDialog;
import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.ArticleTableData;
import com.company.gui.table.CurrencyTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class CurrencyPanel extends RightPanel {

    public CurrencyPanel(MainFrame frame) {
        super(frame, new CurrencyTableData(new FunctionsHandler(frame, new CurrencyAddEditDialog(frame))),
                "CURRENCIES", Style.ICON_PANEL_CURRENCIES,
                new FunctionsToolBar(new FunctionsHandler(frame, new CurrencyAddEditDialog(frame))));
    }

}
