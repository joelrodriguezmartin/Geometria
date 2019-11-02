package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class TrianguloView extends BorderPane{
	
	private Label baseLabel, alturaLabel, areaLabel, perimetroLabel;
	private TextField baseText, alturaText, areaText, perimetroText;
	private Triangle triangulo;
	
	public TrianguloView() {
		super();
		
		baseLabel = new Label("Base: ");
		alturaLabel = new Label("Altura: ");
		areaLabel = new Label("Área: ");
		perimetroLabel = new Label("Perímetro: ");
		
		baseText = new TextField();
		alturaText = new TextField();
		
		areaText = new TextField();
		areaText.setEditable(false);
		perimetroText = new TextField();
		perimetroText.setEditable(false);
		
		triangulo = new Triangle(50, 50);
		triangulo.setFill(Color.GREEN);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);
		HBox trianguloBox = new HBox(triangulo);
		trianguloBox.setAlignment(Pos.CENTER);
		
		GridPane tabla = new GridPane();
		tabla.setVgap(10);
		
		tabla.add(baseLabel, 0, 0, 1, 1);
		tabla.add(baseText, 1, 0, 1, 1);
		
		tabla.add(alturaLabel, 0, 1, 1, 1);
		tabla.add(alturaText, 1, 1, 1, 1);
		
		tabla.add(trianguloBox, 0, 2, 2, 1);

		tabla.add(areaLabel, 0, 3, 1, 1);
		tabla.add(areaText, 1, 3, 1, 1);

		tabla.add(perimetroLabel, 0, 4, 1, 1);
		tabla.add(perimetroText, 1, 4, 1, 1);
		tabla.setAlignment(Pos.CENTER);
		
		
		setCenter(tabla);
		
	}
	

	public Triangle getTriangulo() {
		return (Triangle) triangulo;
	}

	public void setTriangulo(double base, double altura) {
		this.triangulo.setBase(base);
		this.triangulo.setAltura(altura);
	}

	public TextField getBaseText() {
		return baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public TextField getAreaText() {
		return areaText;
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
