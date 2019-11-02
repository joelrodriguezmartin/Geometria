package dad.javafx.geometria;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBinding extends DoubleBinding {
	
	private DoubleExpression b;
	
	public SqrtBinding(DoubleExpression b) {
		
		super();
		this.b = b;
		bind(b);
		
	}
	
	protected double computeValue() {
		return Math.sqrt(b.get());
	}
}
