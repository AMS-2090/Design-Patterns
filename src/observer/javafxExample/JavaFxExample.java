/*
 * Button class object from JavaFx package has the 'onAction' property.
 * It is set by setOnAction(EventHandler<ActionEvent> event) method in JavaFxExample class.
 * 
 * When the button is fired the handle(ActionEvent event) method
 * from JavaFxExample class is invoked.
 * 
 * In this way, JavaFxExample class is being notified about changes in buttons.
 */

package observer.javafxExample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxExample extends Application implements EventHandler<ActionEvent> {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("JavaFX Example");
		
		button = new Button("Button");
		
		/*
		 * 'this' argument means that JavaFxExample class
		 * will be searched for a handle(ActionEvent event) method
		 * to provide action handling for button state change. 
		 */
		button.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == button) {
			System.out.println("Hello world!");
		}
	}

}
