package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override public void start(Stage window)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 900,500, Color.rgb(44, 62, 80));

        /*    LABEL ( LOGIN )       */
        Label labellogin = new Label("Login");
        labellogin.setTextFill(Color.web("#42dab7"));
        labellogin.setStyle("-fx-font: 25 calibri;");
        labellogin.setLayoutX(206.0);
        labellogin.setLayoutY(135.0);
        root.getChildren().add(labellogin);

        /*    LABEL ( REGISTER )       */
        Label labelreg = new Label("Register");
        labelreg.setTextFill(Color.WHITE);
        labelreg.setStyle("-fx-font: 25 calibri;");
        labelreg.setLayoutX(390.0);
        labelreg.setLayoutY(135.0);
        root.getChildren().add(labelreg);

        /*    SEPARATOR HORIZONTAL #1       */
        Separator separator = new Separator();
        separator.setLayoutX(14.0);
        separator.setLayoutY(132.0);
        separator.setMinWidth(872.0);
        root.getChildren().add(separator);

        /*    SEPARATOR HORIZONTAL #2       */
        Separator separator2 = new Separator();
        separator2.setLayoutX(14.0);
        separator2.setLayoutY(170.0);
        separator2.setMinWidth(872.0);
        root.getChildren().add(separator2);

        /*    SEPARATOR VERTICAL       */
        Separator separator3 = new Separator();
        separator3.setOrientation(Orientation.VERTICAL);
        separator3.setLayoutX(340.0);
        separator3.setLayoutY(135.0);
        separator3.setMinHeight(35.0);
        root.getChildren().add(separator3);

        /*    RECTANGLE       */
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(403.0);
        rectangle.setHeight(200.0);
        rectangle.setFill(Color.WHITE);
        rectangle.setLayoutX(206.0);
        rectangle.setLayoutY(211.0);
        rectangle.setArcHeight(10.0);
        rectangle.setArcWidth(10.0);
        root.getChildren().add(rectangle);

        /*    EMAIL LABEL       */
        Label email = new Label("E-mail");
        email.setTextFill(Color.BLACK);
        email.setStyle("-fx-font: 20px calibri");
        email.setLayoutX(221.0);
        email.setLayoutY(214.0);
        root.getChildren().add(email);

        /*    TEXT FIELD       */
        TextField emailtxt = new TextField();
        emailtxt.setLayoutX(221.0);
        emailtxt.setLayoutY(250.0);
        emailtxt.setStyle("-fx-font: 20px calibri;");
        root.getChildren().add(emailtxt);

        /*    PASSWORD LABEL       */
        Label pswrd = new Label("Password");
        pswrd.setTextFill(Color.BLACK);
        pswrd.setStyle("-fx-font: 20px calibri");
        pswrd.setLayoutX(221.0);
        pswrd.setLayoutY(293.0);
        root.getChildren().add(pswrd);

        /*    PASSWORD FIELD       */
        PasswordField pswrdtxt = new PasswordField();
        pswrdtxt.setLayoutX(221.0);
        pswrdtxt.setStyle("-fx-font: 20px calibri;");
        pswrdtxt.setLayoutY(322.0);
        root.getChildren().add(pswrdtxt);

        /*    LOGIN BUTTON       */
        Button loginbtn = new Button("Login");
        loginbtn.setLayoutX(220.0);
        loginbtn.setStyle("-fx-background-color: #1abc9c; -fx-font: 20 calibri;");
        loginbtn.setTextFill(Color.WHITE);
        loginbtn.setMinWidth(375.0);
        loginbtn.setLayoutY(368.0);
        root.getChildren().add(loginbtn);

        /*      LABEL AFTER LOGIN     */
        Label afterlogin = new Label();
        afterlogin.setTextFill(Color.WHITE);
        afterlogin.setStyle("-fx-font: 20px calibri;");
        afterlogin.setLayoutX(375.0);
        afterlogin.setLayoutY(450.0);
        root.getChildren().add(afterlogin);

        loginbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                afterlogin.setText("Your email: "+emailtxt.getText()
                        +", Your pass: "+pswrdtxt.getText()+".");
            }
        });

        /*       WINDOW       */
        window.setScene(scene);
        window.setTitle("Application");
        window.setResizable(false);
        window.show();
    }
}