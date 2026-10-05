package polynomialExpression;

public class PolyNode {

	private float coeff;
	private int expo;
	private PolyNode next;
	
	public PolyNode() {
		expo = 0;
		coeff = 0;
		next = null;
	}
	
	public PolyNode(float coefficient, int exponent) {
		expo = exponent;
		coeff = coefficient;
		next = null;
	}

//	getters & setters
	public int getExpo() {
		return expo;
	}

	public void setExpo(int expo) {
		this.expo = expo;
	}

	public float getCoeff() {
		return coeff;
	}

	public void setCoeff(float coeff) {
		this.coeff = coeff;
	}

	public PolyNode getNext() {
		return next;
	}

	public void setNext(PolyNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "polyNomial: [ "+coeff+" x^"+expo+" ]";
	}
	
	
}
