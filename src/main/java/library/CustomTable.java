package library;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomTable<T> extends TableView<T> {
    public CustomTable(String[] columnNames, ObservableList<T> data) {
        // create columns
        for (String columnName : columnNames) {
            TableColumn<T, String> column = new TableColumn<>(columnName);
            column.setCellValueFactory(new PropertyValueFactory<>(columnName.replaceAll("\\s+", "")));
            getColumns().add(column);
        }

        // set data
        setItems(data);
    }

}
