package dad.javafx.geometria.circulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends BorderPane{
	
	private Label radioLabel, areaLabel, perimetroLabel;
	private TextField radioText, areaText, perimetroText;
	private Circle circulo;
	
	public CirculoView() {
		super();
		
		radioLabel = new Label("Radio: ");
		areaLabel = new Label("Área: ");
		perimetroLabel = new Label("Perímetro: ");
		
		radioText = new TextField();
		
		areaText = new TextField();
		areaText.setEditable(false);
		perimetroText = new TextField();
		perimetroText.setEditable(false);
		
		circulo = new Circle(40);
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);
		HBox circuloBox = new HBox(circulo);
		circuloBox.setAlignment(Pos.CENTER);
		
		GridPane tabla = new GridPane();
		tabla.setVgap(10);
		
		tabla.add(radioLabel, 0, 0, 1, 1);
		tabla.add(radioText, 1, 0, 1, 1);
		
		tabla.add(circuloBox, 0, 1, 2, 1);

		tabla.add(areaLabel, 0, 2, 1, 1);
		tabla.add(areaText, 1, 2, 1, 1);

		tabla.add(perimetroLabel, 0, 3, 1, 1);
		tabla.add(perimetroText, 1, 3, 1, 1);
		tabla.setAlignment(Pos.CENTER);
		
		
		setCenter(tabla);
		
	}
	

	public Circle getCirculo() {
		return circulo;
	}

	public void setCirculo(double radio) {
		this.circulo.setRadius(radio);
	}

	public TextField getRadioText() {
		return radioText;
	}
	
	public void setAreaText(String area) {
		this.areaText.setText(area);
	}

	public TextField getPerimetroText() {
		return perimetroText;
	}
	
	public void setPerimetroText(String perimetro) {
		this.perimetroText.setText(perimetro);
	}
	
}
