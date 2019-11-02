package dad.javafx.geometria.rectangulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends BorderPane{
	
	private Label anchoLabel, altoLabel, areaLabel, perimetroLabel;
	private TextField anchoText, altoText, areaText, perimetroText;
	private Rectangle rectangulo;
	
	public RectanguloView() {
		super();
		
		anchoLabel = new Label("Ancho: ");
		altoLabel = new Label("Alto: ");
		areaLabel = new Label("Área: ");
		perimetroLabel = new Label("Perímetro: ");
		
		anchoText = new TextField();
		altoText = new TextField();
		
		areaText = new TextField();
		areaText.setEditable(false);
		perimetroText = new TextField();
		perimetroText.setEditable(false);
		
		rectangulo = new Rectangle(80, 40);
		rectangulo.setFill(Color.BLUE);
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		HBox rectanguloBox = new HBox(rectangulo);
		rectanguloBox.setAlignment(Pos.CENTER);
		
		GridPane tabla = new GridPane();
		tabla.setVgap(10);
		
		tabla.add(anchoLabel, 0, 0, 1, 1);
		tabla.add(anchoText, 1, 0, 1, 1);
		
		tabla.add(altoLabel, 0, 1, 1, 1);
		tabla.add(altoText, 1, 1, 1, 1);
		
		tabla.add(rectanguloBox, 0, 2, 2, 1);

		tabla.add(areaLabel, 0, 3, 1, 1);
		tabla.add(areaText, 1, 3, 1, 1);

		tabla.add(perimetroLabel, 0, 4, 1, 1);
		tabla.add(perimetroText, 1, 4, 1, 1);
		tabla.setAlignment(Pos.CENTER);
		
		
		setCenter(tabla);
		
	}
	

	public Rectangle getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(double base, double altura) {
		this.rectangulo.setWidth(base);
		this.rectangulo.setHeight(altura);
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
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
