package tp_abstraites_et_interfaces;

public class Voiture extends Vehicule implements Roulant{
   public Voiture(String nom,String typeCarburant) {
	   super(nom,typeCarburant);
   }
	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("demarrer la voiture");
	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("l'arrét de la voiture");
	}
	public void rouler() {
		System.out.println(" la voiture roule");
	}

}
