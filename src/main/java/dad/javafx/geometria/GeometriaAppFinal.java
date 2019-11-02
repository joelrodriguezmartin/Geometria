package dad.javafx.geometria;

import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaAppFinal extends Application {
	
	private RectanguloController rectanguloController;
	private CirculoController circuloController;
	private TrianguloController trianguloController;
	private HexagonoController hexagonoController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		rectanguloController = new RectanguloController();
		circuloController = new CirculoController();
		trianguloController = new TrianguloController();
		hexagonoController = new HexagonoController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.getTabs().add(new Tab("Rectángulo", rectanguloController.getRoot()));
		root.getTabs().add(new Tab("Círculo", circuloController.getRoot()));
		root.getTabs().add(new Tab("Triángulo", trianguloController.getRoot()));
		root.getTabs().add(new Tab("Hexágono", hexagonoController.getRoot()));
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
