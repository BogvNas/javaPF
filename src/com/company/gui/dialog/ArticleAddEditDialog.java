package com.company.gui.dialog;

import com.company.exception.ModelException;
import com.company.gui.MainFrame;
import com.company.model.Article;
import com.company.model.Common;
import com.company.settings.Format;
import com.company.settings.Style;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ArticleAddEditDialog extends AddEditDialog {

    public ArticleAddEditDialog(MainFrame frame) {
        super(frame);
    }

    @Override
    protected void init() {
        components.put("LABEL_TITLE", new JTextField());

        icons.put("LABEL_TITLE", Style.ICON_TITLE);
    }

    @Override
    protected void setValues() {
        Article article = (Article) c;
        values.put("LABEL_TITLE", article.getTitle());
    }

    @Override
    public Common getCommonFromForm() throws ModelException {
        String title = ((JTextField) components.get("LABEL_TITLE")).getText();
        return new Article(title);
    }

}
