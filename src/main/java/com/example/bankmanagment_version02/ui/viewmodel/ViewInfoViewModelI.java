package com.example.bankmanagment_version02.ui.viewmodel;

import javafx.collections.ObservableList;

public interface ViewInfoViewModelI<T> {
    ObservableList<T> getTableData();

    String[] getTableColumnName();

}
