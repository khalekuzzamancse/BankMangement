package library;

import javafx.scene.layout.VBox;

public class GenericViewScreen<T> extends VBox {
    private final TableViewInfoViewModelI<T> viewModel;
    public GenericViewScreen(TableViewInfoViewModelI<T> viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        CustomTable<T> table1 = new CustomTable<>(viewModel.getTableColumnName(), viewModel.getTableData());
        getChildren().add(table1);
    }

}
