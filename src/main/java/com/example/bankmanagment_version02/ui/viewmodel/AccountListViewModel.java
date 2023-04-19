package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AccountListModel;
import com.example.bankmanagment_version02.data.model.CreateAccountFormModel;
import javafx.collections.ObservableList;
import library.ViewInfoViewModelI;

public class AccountListViewModel implements ViewInfoViewModelI<CreateAccountFormModel> {

    @Override
    public ObservableList<CreateAccountFormModel> getTableData() {
        return new AccountListModel().getAccounts();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};
    }
}
