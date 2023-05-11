/* le namespace pour une classe  est l'équivalent du chemin de dossiers pour un fichier
 * en JAVA , on utilise le mot clé package . le package 
   */


package outils;



public class Personne {
    /* les propriétés (ou attribut) définie une classe 
     * correspondant aux caractéristiques des objets qui vont etre creer a partir de cette classe . 
     */
    public String prenom = "defaut";
    public String nom ; 
    private int age ; 


    /*CONSTRUCTEUR 
     * un constructeur est une méthode quand un objet est instancié . 
     * Toutes les classes ont un constructeur par défaut en java .
     * le construcuteur a forcement le meme  nom que la classe . par exemple :  
     * Personne p = new Personne();
     * 
     * on peut définir un nouveau constructeur tant qu'on veut tant que la signature est différente . 
     * un constructeur ne DOIT PAS retourner une valeur . doonc il n'y a pas de type avant le nom de la méthode lors de la déclaration .
     * en général , les constructeurs sont utilisés pour initialiser la valeur des propriétés de l'objet . 
      
     */
    

    /* une fonction dans une classe est appelée une METHODE  */

    public Personne(String name, String firstname , int old ){
        nom = name ;
        prenom = firstname ; 
        age = old ; 
    }
/* quand on definit un construcuteur , le construcuteur par défaut n'est plus accessible .
 * Si on veut l'utiliser à nouveau , il faut déclarer un constructeur sans argument .
 NB : on peut laisser les {} vides si aucune instruction ne doit être exécutée . 
 PS : on peut déclarer autant de constructeur que l'on veut ; les arguments ou les types doivent etre différent . 

 */

    public Personne (String prenom, String nom){
       this.prenom = prenom ; 
        this.nom = nom ; 
    }

    public Personne() {}

    public String identite(){
        return this.prenom + " " + this.nom ;
    }

    public String identite(boolean vrai ){
        return this.prenom + " " + this.nom + ",agé de " + this.age + "ans"; 
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public static void test(){
        System.out.println("Methode statique test de la classe Personne ");

    }
}