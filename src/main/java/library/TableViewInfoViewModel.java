package library;

import javafx.collections.ObservableList;

public interface TableViewInfoViewModel<T> {
    ObservableList<T> getTableData();

    String[] getTableColumnName();

}
