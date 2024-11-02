package tp_abstraites_et_interfaces;

public class TestVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule[] vehicules = new Vehicule[3];
		vehicules[0]=new Voiture("BMW","Essence");
		vehicules[1]=new Bateau("bateau","essence");
		vehicules[2]=new Hydravion("Hydravion","Aviation");
		for(Vehicule v1:vehicules) {
			v1.afficherInfos();
			v1.demarrer();
			v1.arreter();	
			
          if(v1 instanceof Roulant) {
				((Roulant)v1).rouler();
			}
          if(v1 instanceof Flottant) {
				((Flottant)v1).flotter();;
			}
		}
		

}
}