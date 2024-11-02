package tp_abstraites_et_interfaces;


public class Test {
 public static void main(String[] args) {
     Forme c1 = new Cercle(10);
     Forme r1 = new Rectangle(2, 5);
     Forme tr = new Triangle(5, 6, 13); 

     System.out.println("Le périmètre du cercle est : " + c1.perimétre());
     System.out.println("La surface du cercle est : " + c1.surface()); 
     System.out.println("Le périmètre du rectangle est : " + r1.perimétre()); 
     System.out.println("La surface du rectangle est : " + r1.surface()); 
     System.out.println("Le périmètre du triangle est : " + tr.perimétre());
     System.out.println("La surface  est : " + tr.surface()); 
 }
}


