package com.example.bankmanagment_version02;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Snackbar {

    public static void show(String message, Node ownerNode) {
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        Label label = new Label(message);
        label.setTextFill(Color.WHITE);
        VBox layout = new VBox(label);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("notification");
        Scene scene = new Scene(layout);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);

        // calculate the preferred width of the notification based on the label's text
        label.applyCss();
        double prefWidth = label.prefWidth(-1);
        double prefHeight = label.prefHeight(prefWidth);

        // create a rectangle background for the notification
        Rectangle bg = new Rectangle(prefWidth + 20, prefHeight + 20, Color.rgb(0, 0, 0, 0.7));
        bg.setArcWidth(20);
        bg.setArcHeight(20);

        // create a stack pane to hold the rectangle and the notification content
        StackPane root = new StackPane(bg, layout);
        root.setAlignment(Pos.CENTER);

        // set the scene's root to the stack pane
        scene.setRoot(root);

        // set the position of the notification to be centered above the owner node
        stage.setX(ownerNode.getScene().getWindow().getX() + ownerNode.getScene().getWindow().getWidth() / 2 - prefWidth / 2);
        stage.setY(ownerNode.getScene().getWindow().getY() + ownerNode.getScene().getWindow().getHeight() / 2 - prefHeight / 2 - 50);

        stage.show();

        // animate the notification
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(root.opacityProperty(), 0)),
                new KeyFrame(Duration.seconds(1),
                        new KeyValue(root.opacityProperty(), 1)),
                new KeyFrame(Duration.seconds(4),
                        new KeyValue(root.opacityProperty(), 1)),
                new KeyFrame(Duration.seconds(5),
                        new KeyValue(root.opacityProperty(), 0))
        );
        timeline.setOnFinished(event -> stage.close());
        timeline.play();
    }
}


