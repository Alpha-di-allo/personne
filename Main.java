import outils.Personne;


public class Main {

    public static void main(String[] args) {
        /* lorsque l'on declare une variable de type objet , on dit que l'on fait une INSTANCIATION .
        un objet est une INSTANCE d'une  classe .
        @return String concaténation du prénom et du nom 
        @var aucune variable n'est déclaré dans cette méthode 
          */
      Personne p = new Personne("Onyme","Anne",50) ;
      p.prenom = " Anne ";
      p.nom = "Onyme"; 
      p.setAge(50) ; 
      System.out.println("Nom : " + p.nom);
      System.out.println("Prénom :" + p.prenom);
      System.out.println("Age : " + p.getAge());
      

      System.out.println(p.identite());

      Personne p1 = new Personne("jean ","Cérien"); 
    //   p1.prenom = "Jean";
    //   p1.nom = "Cerien";
      p1.setAge(25); 
      System.out.println("Identité de p1 : " + p1.identite());


      /* 1. déclarer un tableau d'objets Personne . 
       * 2.remplir le tableau avec les donnée utilisées dans exempleArray.java ( ou dans https://sharemycode.fr/mardi10)
       * 3. affichez toute les identités des personnes ( en utilisant la méthode identite())
       * 4. ajoutez un constructeur qui permet d'instancier 
       * une personne en définissant directement son prenom ; 
       * son nom et son âge . ( Cherchez sur internet ce qu'est un constructeur et comment le declarer )
       */


       Personne[] tableauPersonnes = new Personne[10];  // on cree un objet de tableau de  personne 
       for (int i = 0;i<tableauPersonnes.length;i++){   // on fai une boucle pour instancier toutes les personne du tableau personne 
            tableauPersonnes[i] = new Personne();
       }

       tableauPersonnes[0] = new Personne();           // on creer une personne dans le tableau de personne ; on instancie 
       tableauPersonnes[0].prenom = "Gérard";
       tableauPersonnes[0].nom = "Menfin";
       tableauPersonnes[0].setAge(20) ; 

       tableauPersonnes[1] = new Personne(); 
       tableauPersonnes[1].prenom = "Ateur";
       tableauPersonnes[1].nom = "Nordine";
       tableauPersonnes[1].setAge (20) ; 

       for (Personne personne : tableauPersonnes){
        System.out.println(personne.identite() + " " + personne.getAge() );
       }

       /* NUll est un type de donnée particulier ( qu'on peut considérer comme une valeur particulière)
        * une variable qui n'a pas été initialisée est considéré comme étant NULL .
        */
        
        System.out.println(tableauPersonnes[1].identite());


        

        
       
      




    }
}
