package dad.javafx.geometria.hexagono;

public class HexagonoController {
	
	private HexagonoModel model = new HexagonoModel();
	private HexagonoView view = new HexagonoView();
	
	public HexagonoController() {
		
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
		view.setPerimetroText(Double.toString(model.getPerimetro()));
	}
	
	private void CambioRectangulo() {
		view.setHexagono(model.getRadio());
	}
	
	public HexagonoView getRoot() {
		return view;
	}

}
