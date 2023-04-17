package com.example.bankmanagment_version02.ui.screens;

import javafx.collections.ObservableList;

public interface ViewInfoViewModelI<T> {
    ObservableList<T> getTableData();

    String[] getTableColumnName();

}
