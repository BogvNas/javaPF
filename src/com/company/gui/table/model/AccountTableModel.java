package com.company.gui.table.model;

import com.company.model.Account;
import com.company.model.Transaction;
import com.company.saveload.SaveData;
import com.company.settings.Format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class AccountTableModel extends MainTableModel {

    private static final int TITLE = 0;
    private static final int AMOUNT = 1;
    private int count = -1;

    public AccountTableModel(String[] columns) {
        super(SaveData.getInstance().getAccounts(), columns);
    }

    @Override
    protected void updateData() {
        if (count == -1) data = SaveData.getInstance().getFilterTransactions();
        else data = SaveData.getInstance().getTransactionsOnCount(count);
    }

    @Override
    public Object getValueAt(int row, int column) {

        if (data.isEmpty()) return null;
        Account account = (Account) data.get(row);
        switch (column){
            case TITLE:
                return account.getTitle();
            case AMOUNT:
                return Format.amount(account.getAmount(), account.getCurrency());
        }
        return null;
    }
}
