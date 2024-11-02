package tp_abstraites_et_interfaces;

public class Rectangle extends Forme {
 private double longueur,largeur;
 public  Rectangle(double longueur,double largeur) {
	 this.longueur=longueur;
	 this.largeur=largeur;
	 
 }
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur ;
	}

	@Override
	public double perimétre() {
		// TODO Auto-generated method stub
		return 2*(longueur+largeur);
	}

}
