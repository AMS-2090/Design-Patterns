/*
 * Button class object from JavaFx package has the 'onAction' property.
 * It is set by setOnAction(EventHandler<ActionEvent> event) method in JavaFxExample class.
 * 
 * When the button is fired the handle(ActionEvent event) method
 * from JavaFxExample class is being invoked.
 * 
 * In this way, JavaFxExample class is being notified about changes in buttons.
 */

package observer.javafxExample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxExample extends Application {
	
	Button button, button2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("JavaFX Example");
		
		button = new Button("Button");
		button2 = new Button("Button 2");
		EventHandler<ActionEvent> buttonActionHandler = new ButtonHandler();
		
		/*
		 * Adding ButtonHandler as the Observer of buttons action 
		 */
		button.setOnAction(buttonActionHandler);
		button2.setOnAction(buttonActionHandler);
		
		HBox hBox = new HBox(30);
		hBox.setAlignment(Pos.CENTER);
		
		hBox.getChildren().add(button);
		hBox.getChildren().add(button2);
		
		Scene scene = new Scene(hBox, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class ButtonHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			if (event.getSource() == button) {
				System.out.println("button: Hello world!");
			}
			if(event.getSource() == button2) {
				System.out.println("button 2: Hello world!");
			}
		}
	}

}