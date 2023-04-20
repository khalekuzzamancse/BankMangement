package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AccountListModel;
import com.example.bankmanagment_version02.data.model.AddAccountModel;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModelI;

public class AccountListViewModelTable implements TableViewInfoViewModelI<AddAccountModel> {

    @Override
    public ObservableList<AddAccountModel> getTableData() {
        return new AccountListModel().getAccounts();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};
    }
}
