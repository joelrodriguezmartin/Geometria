package dad.javafx.geometria.shapes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Triangle extends Polygon {
	
	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	
	public Triangle() {
		this(0.0, 0.0);
	}

	public Triangle(double base, double altura) {

		super();
		
		this.base.set(base);
		this.altura.set(altura);
		
		createPoints();
		this.base.addListener((o, ov, nv) -> createPoints());
		this.altura.addListener((o, ov, nv) -> createPoints());

	}
	
	private void createPoints() {
		
		getPoints().clear();
		

		getPoints().addAll(base.get()/2, 0.0);
		getPoints().addAll(base.get(), altura.get());
		getPoints().addAll(0.0, altura.get());
		
	}
	

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}
	

	public final double getAltura() {
		return this.alturaProperty().get();
	}
	

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}

}
