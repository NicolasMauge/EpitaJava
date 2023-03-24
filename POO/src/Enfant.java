public class Enfant {
    private String nom;
    private String prenom;
    private int age = 0;
    private Enfant amoureux = null;

    /**
     * tomber amoureux d'un autre enfant. Impossible si un des deux enfants n'est pas majeur
     * @param amoureux l'amoureux
     */
    public void tomberAmoureux(Enfant amoureux) {
        this.setAmoureux(amoureux);
        amoureux.setAmoureux(this);
    }

    /**
     * défini l'amoureux dans le détail (méthode privée)
     * @param amoureux l'amoureux
     */
    private void setAmoureux(Enfant amoureux) {
        if(amoureux!=null) {
            if ((this.age > 17) && (amoureux.getAge() > 17)) {
                this.amoureux = amoureux;
            } else {
                System.out.println("Il faut attendre quelques années pour tomber amoureux");
            }
        }
    }

    /**
     * pour vérifier si l'enfant est amoureux
     * @return oui ou non
     */
    public Boolean estAmoureux() {
        return this.amoureux != null;
    }

    /**
     * défini l'âge avec un contrôle pour qu'il soit supérieur à 0
     * @param age age qui doit être supérieur à 0
     */
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être superieur à 0");
        }
    }

    /**
     * Constructeur de la classe Enfant
     * @param nom nom
     * @param prenom prenom
     * @param age attention, l'âge doit être supérieur à 0
     */
    Enfant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.setAge(age);
    }

    /**
     * une méthode pour afficher la présentation
     */
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
        if(avecUnEnfant!=null) {
            System.out.println(this.prenom + " joue au ballon avec " + avecUnEnfant.getPrenom());
        }
    }

    public String getNom() {
        return nom;
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
}
