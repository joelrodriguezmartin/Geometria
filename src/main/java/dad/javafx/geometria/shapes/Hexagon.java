package dad.javafx.geometria.shapes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Hexagon extends Polygon {
	
	private DoubleProperty radius = new SimpleDoubleProperty();
	private static final int SIDES = 6;
	
	public Hexagon(double radius) {
		
		super();
		
		this.radius.set(radius);
		createPoints();
		this.radius.addListener((o, ov, nv) -> createPoints());
		
	}

	private void createPoints() {
		
		double radius = getRadius();
		
		getPoints().clear();
		for (int i = 0; i < SIDES; i++) {
			double x = radius + radius * Math.cos(i * 2 * Math.PI / SIDES);
			double y = radius + radius * Math.sin(i * 2 * Math.PI / SIDES);
			
			getPoints().addAll(x, y);
			setRotate(90);
		}
		
	}
	

	public final DoubleProperty radiusProperty() {
		return this.radius;
	}
	

	public final double getRadius() {
		return this.radiusProperty().get();
	}
	

	public final void setRadius(final double radius) {
		this.radiusProperty().set(radius);
	}
	
}
