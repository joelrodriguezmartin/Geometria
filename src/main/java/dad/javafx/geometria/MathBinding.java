package dad.javafx.geometria;

import javafx.beans.binding.DoubleExpression;

public class MathBinding {
	
	public static SqrtBinding sqrt (DoubleExpression b) {
		return new SqrtBinding(b);
	}

}
