/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui.handler;


import com.company.gui.MainFrame;
import com.company.settings.HandlerCode;

import java.awt.event.ActionEvent;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MainToolBarHandler extends MenuViewHandler {
    
    public MainToolBarHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.TOOLBAR_OVERVIEW: {
                showOverviewPanel();
                break;
            }
            case HandlerCode.TOOLBAR_ACCOUNTS: {
                showAccountPanel();
                break;
            }
            case HandlerCode.TOOLBAR_ARTICLES: {
                showArticlePanel();
                break;
            }
            case HandlerCode.TOOLBAR_TRANSACTIONS: {
                showTransactionPanel();
                break;
            }
            case HandlerCode.TOOLBAR_TRANSFERS: {
                showTransferPanel();
                break;
            }
            case HandlerCode.TOOLBAR_CURRENCIES: {
                showCurrencyPanel();
                break;
            }
            case HandlerCode.TOOLBAR_STATISTICS: {
                showStatisticsPanel();
            }
            
        }
        super.actionPerformed(ae);
    }
    
}
