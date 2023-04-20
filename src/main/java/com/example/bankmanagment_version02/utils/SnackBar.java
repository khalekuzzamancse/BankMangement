package com.example.bankmanagment_version02.utils;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class SnackBar {

    public static void show(String message) {
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
        Rectangle bg = new Rectangle(prefWidth + 40, prefHeight + 20, Color.rgb(0, 0, 0, 0.7));
        bg.setArcWidth(20);
        bg.setArcHeight(20);

        // create a stack pane to hold the rectangle and the notification content
        StackPane root = new StackPane(bg, layout);
        root.setAlignment(Pos.CENTER);

        // set the scene's root to the stack pane
        scene.setRoot(root);

        // set the position of the notification to be centered on the primary screen
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(primaryScreenBounds.getMinX() + (primaryScreenBounds.getWidth() - prefWidth - 20) / 2);
        stage.setY(primaryScreenBounds.getMinY() + (primaryScreenBounds.getHeight() - prefHeight - 20) / 2);

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


