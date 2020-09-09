package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static javafx.fxml.FXMLLoader.load;

public class Login {
    @FXML
    private Label mylabel;
    @FXML
    private TextField usename;
    @FXML
    private TextField password;


    public void Log(ActionEvent event) throws IOException {
        File file = new File("C:\\Users\\JohnSmith\\Documents\\users.txt");
        Scanner sc = new Scanner(file);
        boolean b = true;
        while (sc.hasNextLine()) {
            if (usename.getText().equals(sc.nextLine())) {
                if (password.getText().equals(sc.nextLine())) {
                    b = false;
                    mylabel.setText(sc.nextLine());
                    break;
                }
            }
        }
        if (!b) {
            if("admin".equals(mylabel.getText())){
                Stage stage = new Stage();
                Parent root = load(getClass().getResource("MeniuAdmin.fxml"));
                Scene scene = new Scene(root, 400, 400);
                stage.setScene(scene);
                stage.show();
            }
            if("client".equals(mylabel.getText())){
                Stage primaryStage = new Stage();
                Parent root = load(getClass().getResource("MeniuClient.fxml"));
                Scene scene = new Scene(root, 400, 400);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
            } else {
            mylabel.setText("Datele introduse nu sunt corecte, reintrodu!");
        }
    }

}
