package dad.javafx.geometria.circulo;

public class CirculoController {
	
	private CirculoModel model = new CirculoModel();
	private CirculoView view = new CirculoView();
	
	public CirculoController() {
		
		view.getRadioText().textProperty().addListener((o, ov, nv) -> RadioListener(nv));
		
	}
	
	private void RadioListener(String nv) {
		if(!nv.isEmpty()) {
			model.radioProperty().set(Double.parseDouble(nv));
		}else {
			model.radioProperty().set(0.0);
		}
		
		CambioArea();
		CambioPerimetro();
		CambioRectangulo();
		
	}
	
	private void CambioArea() {
		view.setAreaText(String.format("%2.2f", model.getArea()));
	}
	
	private void CambioPerimetro() {
		view.setPerimetroText(String.format("%2.2f", model.getPerimetro()));
	}
	
	private void CambioRectangulo() {
		view.setCirculo(model.getRadio());
	}
	
	public CirculoView getRoot() {
		return view;
	}

}
