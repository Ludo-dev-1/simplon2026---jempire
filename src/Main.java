import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le jeu de gestion de ressources !");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Ressources Ressources = new Ressources();
        do {

            System.out.println("Ressources actuel : " + Ressources.bois + " bois, " + Ressources.pierre + " pierre, "
                    + Ressources.or + " or, " + Ressources.nourriture + " nourriture, " + Ressources.habitants
                    + " habitants.");

            System.out.println("Menu principal :");
            System.out.println("1. Explorer la forêt");
            System.out.println("2. Creer une mine");
            System.out.println("3. Travailler dans la mine");
            System.out.println("4. Recruter un soldat");
            System.out.println("5. Faire du commerce");
            System.out.println("6. Construire un château");
            System.out.println("7. Quitter le jeu");
            System.out.println("Séléctionner une action : ");

            choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    Ressources.exploreForest();
                    break;
                case 2:
                    Ressources.mine();
                    Ressources.mineCreate = true;
                    break;
                case 3:
                    if (Ressources.mineCreate = false || Ressources.nourriture<=5) {
                        System.out.println("Vous devez d'abord créer une mine avant de pouvoir y travailler ou augmenter vos ressources en nourritures");
                    } else {
                        Ressources.workMine();
                    }
                    break;
                case 4:
                    if (Ressources.or < 30 ){
                        System.out.println("Vous devez augmenter vos ressources en or");
                    }
                    Ressources.recruitSoldier();
                    break;
                case 5:
                    if (Ressources.pierre <5 ){
                        System.out.println("Vous devez augmenter vos ressources en pierre");
                    }
                    Ressources.commerce();
                    break;
                case 6:
                    Ressources.buildCastle();
                    break;
                default:
                    System.out.println("Merci d'avoir joué !");
            } Ressources.deleteFood();
        } while (choice != 7);
          

        scanner.close();

    }
}