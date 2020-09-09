package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MeniuAdmin {
    @FXML
    public Button btncamere;
    @FXML
    public Button btnadauga;
    @FXML
    public Button btnpret;
    @FXML
    public Button afisare;
    @FXML
    public Pane pn_afiseaza;
    @FXML
    public Pane pn_adauga;
    @FXML
    public Pane pn_pret;
    @FXML
    public Pane pn_camere;
        public void Afiseaza(ActionEvent event) throws IOException {
        if (event.getSource() == btnadauga) {
            pn_adauga.toFront();
        } else if (event.getSource() == btncamere) {
            pn_camere.toFront();
        } else if (event.getSource() == btnpret) {
            pn_pret.toFront();
        } else if (event.getSource() == afisare) {
            pn_afiseaza.toFront();
        }

//        File file = new File("holiday.txt");
//        ArrayList<String> fileList = new ArrayList<>();
//        Scanner in = new Scanner(file);
//        while (in.hasNextLine()) {
//            fileList.add(in.nextLine().trim());
//        }
//
//        System.out.println(fileList);
    }
//    public void Afiseaza(Stage primaryStage) throws IOException {
//        StackPane root = new StackPane();
//        Button button = new Button("Go To Second Form");
//        root.getChildren().add(button);
//        Scene scene = new Scene(root, 500, 500);
//        primaryStage.setScene(scene); // set the scene
//        primaryStage.setTitle("First Form");
//        primaryStage.show();
//        button.setOnAction(e -> {
//            StackPane root2 = new StackPane();
//            Label label = new Label("Your are now in the second form");
//            root2.getChildren().add(label);
//            Scene secondScene = new Scene(root2, 500, 500);
//            Stage secondStage = new Stage();
//            secondStage.setScene(secondScene); // set the scene
//            secondStage.setTitle("Second Form");
//            secondStage.show();
//            primaryStage.close(); // close the first stage (Window)
//        });
//    }
}

