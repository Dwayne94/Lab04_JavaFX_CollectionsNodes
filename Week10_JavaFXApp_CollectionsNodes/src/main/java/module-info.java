module org.example.week10_javafxapp_collectionsnodes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week10_javafxapp_collectionsnodes to javafx.fxml;
    exports org.example.week10_javafxapp_collectionsnodes;
}