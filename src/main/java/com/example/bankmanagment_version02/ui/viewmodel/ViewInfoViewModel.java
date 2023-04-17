package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AccountListModel;
import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import javafx.collections.ObservableList;

public class ViewInfoViewModel {
    private String[] accountColumn;
    private String[] boxColumn;
    private final ObservableList<AccountModel> accounts;
    private final ObservableList<AddBoxModel> boxes;

    public ViewInfoViewModel() {
        accountColumn = new String[]{"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};
        boxColumn = new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
        AccountListModel accountListModel = new AccountListModel();
        BoxListModel boxListModel = new BoxListModel();
        accounts = accountListModel.getAccounts();
        boxes = boxListModel.getBoxes();

    }

    public ObservableList<AccountModel> getAccounts() {
        return accounts;
    }

    public ObservableList<AddBoxModel> getBoxes() {
        return boxes;
    }

    public String[] getAccountColumn() {
        return accountColumn;
    }

    public String[] getBoxColumn() {
        return boxColumn;
    }
}