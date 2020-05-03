package com.company.gui.table;

import com.company.gui.Refresh;
import com.company.gui.menu.TablePopupMenu;
import com.company.gui.table.model.MainTableModel;
import com.company.gui.table.render.MainTableCellRenderer;
import com.company.gui.table.render.TableHeaderIconRenderer;
import com.company.settings.Style;
import com.company.settings.Text;

import javax.swing.*;
import java.awt.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class TableData extends JTable implements Refresh {

    private TablePopupMenu popup;
    private final ImageIcon[] icons;
    private final String[] columns;


    public TableData(MainTableModel model, String[] columns, ImageIcon[] icons) {
        super(model);
        this.icons = icons;
        this.columns = columns;
        this.popup = new TablePopupMenu();

        getTableHeader().setFont(Style.FONT_TABLE_HEADER);
        setFont(Style.FONT_TABLE);
        setRowHeight(getRowHeight() + Style.TABLE_ADD_ROW_HEIGHT);

        setAutoCreateRowSorter(true);
        setPreferredScrollableViewportSize(Style.DIMENSION_TABLE_SHOW_SIZE);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        for (int i = 0; i < columns.length; i++) {
            getColumn(Text.get(columns[i])).setHeaderRenderer(new TableHeaderIconRenderer(icons[i]));
        }
        MainTableCellRenderer renderer =new MainTableCellRenderer();
        setDefaultRenderer(String.class, renderer);
        setComponentPopupMenu(popup);
    }

    @Override
    public JPopupMenu getComponentPopupMenu(){
        Point p = getMousePosition();
        int row = rowAtPoint(p);
        if ( p != null && row != -1){
            setRowSelectionInterval(row,row);
        }
        return super.getComponentPopupMenu();
    }

    @Override
    public void refresh() {
        int selectedRow = getSelectedRow();
        ((MainTableModel)getModel()).refresh();
        /*for (int i = 0; i < columns.length; i++) {
            getColumn(Text.get(columns[i])).setHeaderRenderer((TableCellRenderer) new TableHeaderIconRender(icons[i]));//?
        }*/
        if (selectedRow != -1 && selectedRow < getRowCount()) setRowSelectionInterval
                (selectedRow, selectedRow);
        init();
    }

    protected void init(){

    }
}
