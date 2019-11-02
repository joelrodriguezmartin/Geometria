package dad.javafx.geometria.triangulo;

public class TrianguloController {
	
	private TrianguloModel model = new TrianguloModel();
	private TrianguloView view = new TrianguloView();
	
	public TrianguloController() {
		
		view.getBaseText().textProperty().addListener((o, ov, nv) -> BaseListener(nv));
		view.getAlturaText().textProperty().addListener((o, ov, nv) -> AlturaListener(nv));
		
	}
	
	private void BaseListener(String nv) {
		if(!nv.isEmpty()) {
			model.baseProperty().set(Double.parseDouble(nv));
		}else {
			model.baseProperty().set(0.0);
		}
		
		CambioArea();
		CambioPerimetro();
		CambioTriangulo();
		
	}
	
	private void AlturaListener(String nv) {
		if(!nv.isEmpty()) {
			model.alturaProperty().set(Double.parseDouble(nv));
		}else {
			model.alturaProperty().set(0);
		}
		
		CambioArea();
		CambioPerimetro();
		CambioTriangulo();
	}
	
	private void CambioArea() {
		view.setAreaText(String.format("%2.2f", model.getArea()));
	}
	
	private void CambioPerimetro() {
		view.setPerimetroText(String.format("%2.2f", model.getPerimetro()));
	}
	
	private void CambioTriangulo() {
		view.setTriangulo(model.getBase(), model.getAltura());
	}
	
	public TrianguloView getRoot() {
		return view;
	}

}
