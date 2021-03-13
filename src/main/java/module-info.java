module ch.teko.prg3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ch.teko.prg3 to javafx.fxml;
    exports ch.teko.prg3;
}