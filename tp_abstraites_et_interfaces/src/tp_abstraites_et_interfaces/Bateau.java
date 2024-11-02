package tp_abstraites_et_interfaces;

public class Bateau extends Vehicule implements Flottant{
	 public Bateau(String nom,String typeCarburant) {
		   super(nom,typeCarburant);
	   }
	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("le bateau demare");
	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("le bateau arrete");
	}
	public void flotter() {
		
		System.out.println("le bateau flotte");
	}

}
