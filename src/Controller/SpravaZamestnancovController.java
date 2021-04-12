package Controller;

import GUI.SpravaZamestnancovView;
import GUI.SpravaZamestnancvoModel;
import GUI.ZamestnanciModel;
import GUI.ZamestnanciView;

public class SpravaZamestnancovController {

    private SpravaZamestnancovView spravaZamestnancovView;
    private SpravaZamestnancvoModel spravaZamestnancvoModel;

    public SpravaZamestnancovController(SpravaZamestnancovView spravaZamestnancovView, SpravaZamestnancvoModel spravaZamestnancvoModel, ZamestnanciModel zamestnanciModel) {

        spravaZamestnancovView.getTable().setItems(zamestnanciModel.getListObservableZamestnancov());


        spravaZamestnancovView.getAddButton().setOnAction(e ->{
/*
            allProducts = table.getItems();
            productSelected = table.getSelectionModel().getSelectedItems();
            productSelected.forEach(allProducts::remove);
        */

           // zamestnanciModel.getAllProducts() = spravaZamestnancovView.getTable().getSelectionModel().getSelectedItems();
            //zamestnanciModel.getProductSelected() = spravaZamestnancovView.getTable().getSelectionModel().getSelectedItems();
            zamestnanciModel.getProductSelected().forEach(zamestnanciModel.getAllProducts()::remove);



                }
                );

    }
}
