package library.layouts;

import javafx.scene.layout.VBox;
import library.TableViewInfoViewModel;

public class GenericViewScreen<T> extends VBox {
    private final TableViewInfoViewModel<T> viewModel;
    public GenericViewScreen(TableViewInfoViewModel<T> viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        CustomTable<T> table1 = new CustomTable<>(viewModel.getTableColumnName(), viewModel.getTableData());
        getChildren().add(table1);
    }

}
