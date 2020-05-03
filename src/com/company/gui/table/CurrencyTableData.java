package com.company.gui.table;

import com.company.gui.table.model.ArticleTableModel;
import com.company.gui.table.model.CurrencyTableModel;
import com.company.gui.table.render.MainTableCellRenderer;
import com.company.model.Currency;
import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;
import java.awt.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class CurrencyTableData extends TableData {

    private static final String[] columns = new String[]{"TITLE","CODE","RATE","ON","BASE"};
    private static final ImageIcon[] icons = new ImageIcon[]{Style.ICON_TITLE,Style.ICON_TITLE,Style.ICON_TITLE,Style.ICON_ON,Style.ICON_BASE};

    public CurrencyTableData(){
        super(new CurrencyTableModel(columns), columns, icons);
        init();
    }

    @Override
    protected final void init() {
        for (String column : columns) {
            getColumn(Text.get(column)).setCellRenderer(new TableCellOnOffRenderer());
        }
    }

    private class TableCellOnOffRenderer extends MainTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (((Currency) ((CurrencyTableModel)table.getModel()).getCommonByRow(row)).isOn())
                renderer.setForeground((Color) Style.COLOR_ON);
            else renderer.setForeground((Color) Style.COLOR_OFF);
            return renderer;
        }

    }

}
