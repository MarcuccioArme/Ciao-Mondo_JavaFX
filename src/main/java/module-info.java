module com.armenise.ciaomondofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.armenise.ciaomondofx to javafx.fxml;
    exports com.armenise.ciaomondofx;
}