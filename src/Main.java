public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le jeu de gestion de ressources !");
        Ressources Ressources = new Ressources();
       System.out.println("Ressources initialisées : " + Ressources.bois + " bois, " + Ressources.pierre + " pierre, " + Ressources.or + " or, " + Ressources.nourriture + " nourriture, " + Ressources.habitants + " habitants.");
       Ressources.exploreforest();
       System.out.println("Ressources après exploration de la forêt : " + Ressources.bois + " bois, " + Ressources.pierre + " pierre, " + Ressources.or + " or, " + Ressources.nourriture + " nourriture, " + Ressources.habitants + " habitants.");
    }
    
}