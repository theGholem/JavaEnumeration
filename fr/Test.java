
/**
 * 
 * @author oem
 * @since  28/01/2023
 * 
 */
public class Test{
    public static void main(String[]args){

        Color c1,c2,c3,c4;

        //Instancition : 

        c1=Color.RED;
        c2=Color.GREEN;
        c3=Color.BLUE;
        c4=Color.RED;

        System.out.println("\n"+c1.toString());//affiche le nom contenu dans l'enumeration, ici "Rouge"
                              
        c3.display();

        //La comparaison directe est possible : 

        System.out.println("\nComparaison: \n");
        if(c1==c4){
            System.out.println("It's same");
            c1.display();
            c4.display();;
        }else {
            System.out.println("It's diferent");
            c1.display();
            c2.display();;
        }

        /**
         * A l'aide d'une boucle, on va afficher toutes les valeurs de notre enumeration
         * 
         */

         for(Color c : Color.values()){
            System.out.println(c.toString()); 

            //Ici on affiche "Rouge,Vert,Bleu" car on affiche toute les noms de nos enumerations
         }
        
    }
}