package com.company.gui.panel;

import com.company.gui.MainButton;
import com.company.gui.MainFrame;
import com.company.gui.handler.ChartHandler;
import com.company.settings.HandlerCode;
import com.company.settings.Text;

import javax.swing.*;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public final class StatisticsTypePanel extends AbstractPanel {

    private final String title;

    public StatisticsTypePanel(MainFrame frame, String title) {
        super(frame);
        this.title = Text.get(title);
        init();
    }

    @Override
    protected void init() {
        MainButton type = new MainButton(title, new ChartHandler(frame), HandlerCode.TYPE);
        add(type);
    }

}
