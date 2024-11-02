package tp_abstraites_et_interfaces;

public class Hydravion extends Vehicule implements Flottant,Volant{

	public Hydravion(String nom, String typeCarburant) {
		super(nom, typeCarburant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flotter() {
		// TODO Auto-generated method stub
		System.out.println("l'hydravion flotte");
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("demarrer");
	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("arreter");
	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
		System.out.println("l'hydravion vole");
	}

}
