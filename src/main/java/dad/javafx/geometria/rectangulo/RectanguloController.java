package dad.javafx.geometria.rectangulo;

public class RectanguloController {
	
	private RectanguloModel model = new RectanguloModel();
	private RectanguloView view = new RectanguloView();
	
	public RectanguloController() {
		
		view.getAnchoText().textProperty().addListener((o, ov, nv) -> AnchoListener(nv));
		view.getAltoText().textProperty().addListener((o, ov, nv) -> AlturaListener(nv));
		
	}
	
	private void AnchoListener(String nv) {
		if(!nv.isEmpty()) {
			model.anchoProperty().set(Double.parseDouble(nv));
		}else {
			model.anchoProperty().set(0.0);
		}
		
		CambioArea();
		CambioPerimetro();
		CambioRectangulo();
		
	}
	
	private void AlturaListener(String nv) {
		if(!nv.isEmpty()) {
			model.altoProperty().set(Double.parseDouble(nv));
		}else {
			model.altoProperty().set(0);
		}
		
		CambioArea();
		CambioPerimetro();
		CambioRectangulo();
	}
	
	private void CambioArea() {
		view.setAreaText(Double.toString(model.getArea()));
	}
	
	private void CambioPerimetro() {
		view.setPerimetroText(Double.toString(model.getPerimetro()));
	}
	
	private void CambioRectangulo() {
		view.setRectangulo(model.getAncho(), model.getAlto());
	}
	
	public RectanguloView getRoot() {
		return view;
	}

}
