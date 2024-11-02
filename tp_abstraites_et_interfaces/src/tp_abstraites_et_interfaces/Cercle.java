package tp_abstraites_et_interfaces;

public class Cercle extends Forme {
private double rayon;
public Cercle(double rayon) {
	this.rayon=rayon;
}
@Override
public double surface() {
	// TODO Auto-generated method stub
	return Math.PI*rayon*rayon;
}
@Override
public double perimétre() {
	// TODO Auto-generated method stub
	return 2*Math.PI*rayon;
}

}
