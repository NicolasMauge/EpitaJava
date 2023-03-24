public class Enfant {
    private String nom;
    private String prenom;
    private int age = 0;
    private Enfant amoureux = null;

    public String getNom() {
        return nom;
    }

    public void tomberAmoureux(Enfant amoureux) {
        this.setAmoureux(amoureux);
        amoureux.setAmoureux(this);
    }

    public void setAmoureux(Enfant amoureux) {
        if((this.age > 17) && (amoureux.getAge() > 17)) {
            this.amoureux = amoureux;
        } else {
            System.out.println("Il faut attendre quelques années pour tomber amoureux");
        }
    }
    public Boolean estAmoureux() {
        return this.amoureux != null;
    }

    public Enfant getAmoureux() {
        return amoureux;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être superieur à 0");
        }
    }

    Enfant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        if(age > 0) {
            this.age = age;
        }
    }

    public void presentation() {
        System.out.println("Bonjour, je m'appelle " + this.prenom + " " + this.nom + "et j'ai "+ this.age + " ans");
    }

    /** cette fonction permet d'ajouter un an à l'âge
     *  si l'âge est déjà à 17 ans, affichage d'un message
     */
    public void feterAnniversaire() {
        if(this.age < 17) {
            this.age++;
        } else {
            System.out.println("On ne fête plus son anniversaire à 17 ans");
        }

    }

    /**
     *  jouer au ballon
     * @param avecUnEnfant un autre enfant
     */
    public void joueAuBallon(Enfant avecUnEnfant) {
        System.out.println(this.prenom + " joue au ballon avec " + avecUnEnfant.getPrenom() );
    }
}
