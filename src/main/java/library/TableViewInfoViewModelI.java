package library;

import javafx.collections.ObservableList;

public interface TableViewInfoViewModelI<T> {
    ObservableList<T> getTableData();

    String[] getTableColumnName();

}
