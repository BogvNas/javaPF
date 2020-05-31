package com.company.gui.table;

import com.company.gui.handler.FunctionsHandler;
import com.company.gui.table.model.AccountTableModel;
import com.company.gui.table.model.TransactionTableModel;
import com.company.gui.table.render.MainTableCellRenderer;
import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;
import java.awt.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AccountTableData extends TableData {

    private static final String[] columns = new String[]{"TITLE", "AMOUNT"};
    private static final ImageIcon[] icons = new ImageIcon[]{Style.ICON_TITLE, Style.ICON_AMOUNT};

    public AccountTableData(FunctionsHandler handler) {
        super(new AccountTableModel(columns), handler, columns, icons);
    }

}
