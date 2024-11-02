package tp_abstraites_et_interfaces;

public abstract class Vehicule {
private String nom;
private String typeCarburant;
public Vehicule(String nom,String typeCarburant) {
	this.nom=nom;
	this.typeCarburant=typeCarburant;
}
public abstract void demarrer();
public abstract void arreter();
public void afficherInfos() {
	System.out.println("nom:"+nom+",typeCarburant: "+typeCarburant);
}

}
