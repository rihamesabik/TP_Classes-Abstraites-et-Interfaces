package tp_abstraites_et_interfaces;

public class TestProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Produit pe1=new ProduitElectronique(1,700);
     Produit pa1 =new ProduitAlimentaire(5,1000);
     System.out.println("Valeur du stock alimentaire:"+pa1.calculerValeurStock());
     System.out.println("Valeur du stock electronique :"+pe1.calculerValeurStock());
	}

}
