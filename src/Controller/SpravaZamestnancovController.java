package Controller;

import GUI.*;

public class SpravaZamestnancovController {

    private SpravaZamestnancovView spravaZamestnancovView;
    //private SpravaZamestnancvoModel spravaZamestnancvoModel;

    public SpravaZamestnancovController(SpravaZamestnancovView spravaZamestnancovView, HlavneMenuModel hlavneMenuModel) {

        spravaZamestnancovView.getTable().setItems(hlavneMenuModel.getListObservableZamestnancov());


        spravaZamestnancovView.getAddButton().setOnAction(e ->{
/*
            allProducts = table.getItems();
            productSelected = table.getSelectionModel().getSelectedItems();
            productSelected.forEach(allProducts::remove);
        */

           // hlavneMenuModel.getAllProducts() = spravaZamestnancovView.getTable().getSelectionModel().getSelectedItems();
            //hlavneMenuModel.getProductSelected() = spravaZamestnancovView.getTable().getSelectionModel().getSelectedItems();
            hlavneMenuModel.getProductSelected().forEach(hlavneMenuModel.getAllProducts()::remove);



                }
                );

    }
}
