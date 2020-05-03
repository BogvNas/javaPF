package com.company.gui.panel;

import com.company.gui.MainButton;
import com.company.gui.MainFrame;
import com.company.saveload.SaveData;
import com.company.settings.Format;
import com.company.settings.HandlerCode;
import com.company.settings.Style;

import java.awt.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class FilterPanel extends AbstractPanel {


    public FilterPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {

        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        setLayout(layout);

        MainButton left = new MainButton(Style.ICON_LEFT, null, HandlerCode.LEFT);
        MainButton step = new MainButton(Format.getTitleFilter(SaveData.getInstance().getFilter()), null, HandlerCode.STEP);
        MainButton right = new MainButton(Style.ICON_RIGHT, null, HandlerCode.RIGHT);

        setBorder(Style.BORDER_FILTER_PANEL);

        step.setFont(Style.FONT_BUTTON_FILTER);
        step.setPreferredSize(new Dimension(Style.WIDTH_FILTER_BUTON, left.getPreferredSize().height));

        add(left);
        add(step);
        add(right);
    }
}
