
/**
 * @author oem
 * @since  28/01/2023
 * 
 * @apiNote Cette classe est une enumeration, qui enumère des couleurs en precisant leur noms et leur 
 *          correspondance en hexadecimale
 * 
 *          Cette classe est de base une final class, donc on ne peut 
 *          pas la faire heriter d'autre classes et autres
 *          On utilise le mot clé "enum" pour l'appeler
 * 
 *          Son constructeur est d'ordre " private "
 * 
 *          A part cela, elle se comporte exactement comme une classe normale
 * 
 */
public enum Color{
    
    /**
     *Nos enumeration de couleur :
     
     *On aurait pu egalement jsute defini nos elements sans preciser des valeurs en parametre:
     *   
     * RED, GREEN,BLUE;
     * 
     * Dans ce cas le constructor est par defaut et sera : " private Color(){} " 
     */

    RED("Rouge","FF0000"), 
    GREEN("Vert","00FF00"), 
    BLUE("Bleu","0000FF");

    //Nos attributs, facultatif si on le voulais:

    private String Name,hexaValue;

    /**
     * @apiNote Notre constructor est toujours private, et il respecte la structure de notre enumeration
     * 
     * @param name
     * @param hexaValue
     */
    private Color(String name,String hexaValue){
        this.Name=name;
        this.hexaValue=hexaValue;
    }

    /**
     * 
     * Grace à cette methode on pourra agir directement avec le nom de la color
     * 
     * return name of color
     */
    public String toString(){
        return this.Name;
    }

    public String toString2(){
        return this.hexaValue;
    }

    public void display(){
        System.out.println("\nNom couleur: "+this.toString()+"\nNom codé: "+toString2());
    }
}