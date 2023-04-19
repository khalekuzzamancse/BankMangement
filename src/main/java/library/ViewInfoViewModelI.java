package library;

import javafx.collections.ObservableList;

public interface ViewInfoViewModelI<T> {
    ObservableList<T> getTableData();

    String[] getTableColumnName();

}
