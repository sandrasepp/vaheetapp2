import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by aleksandra on 26/10/2016.
 */

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
                Scene scene = new Scene(stack, 500, 400);

                        primaryStage.setScene(scene);
        primaryStage.show();

        Rectangle rectangle = new Rectangle(80, 90);
        stack.getChildren().add(rectangle);
        rectangle.setFill(Color.PEACHPUFF);

        rectangle.setOnMouseClicked(event -> {
            System.out.println("Klikk toimib");
        });



    }
}
