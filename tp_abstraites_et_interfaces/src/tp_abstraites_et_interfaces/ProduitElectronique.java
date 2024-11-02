package tp_abstraites_et_interfaces;

public class ProduitElectronique implements Produit {
	private double prixU;
    private int quantiteEnStock;
public ProduitElectronique(double prixU,int quantiteEnStock) {
	this.prixU=prixU;
	this.quantiteEnStock=quantiteEnStock;
}
	@Override
	public double getPrixUnitaire() {
		// TODO Auto-generated method stub
		return prixU;
	}

	@Override
	public double calculerValeurStock() {
		// TODO Auto-generated method stub
		return prixU*quantiteEnStock;
	}

}

