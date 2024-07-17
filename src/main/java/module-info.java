module com.shorna.oop.akashdht {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shorna.oop.akashdht to javafx.fxml;
    exports com.shorna.oop.akashdht;
}