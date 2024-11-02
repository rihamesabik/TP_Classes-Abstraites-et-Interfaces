package tp_abstraites_et_interfaces;

public class Triangle extends Forme {
 private double a,b,c;
 public Triangle(double a,double b,double c) {
	 this.a=a;
	 this.b=b;
	 this.c=c;
 }
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		double semiperimetre=(a + b + c) / 2;
		return Math.sqrt(semiperimetre * (semiperimetre - a) * (semiperimetre - b) * (semiperimetre - c));
	}

	@Override
	public double perimétre() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
