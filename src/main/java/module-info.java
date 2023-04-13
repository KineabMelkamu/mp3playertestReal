module com.example.mp3playertest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mp3playertest to javafx.fxml;
    exports com.example.mp3playertest;
}