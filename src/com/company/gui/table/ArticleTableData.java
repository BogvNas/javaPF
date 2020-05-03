package com.company.gui.table;

import com.company.gui.table.model.AccountTableModel;
import com.company.gui.table.model.ArticleTableModel;
import com.company.settings.Style;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ArticleTableData extends TableData {

    private static final String[] columns = new String[]{"TITLE"};
    private static final ImageIcon[] icons = new ImageIcon[]{Style.ICON_TITLE};

    public ArticleTableData(){
        super(new ArticleTableModel(columns), columns, icons);
    }
}
