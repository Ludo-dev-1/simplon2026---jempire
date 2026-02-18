
public class Ressources {
    int bois;
    int pierre;
    int or;
    int nourriture;
    int habitants;
    boolean mineCreate;
    boolean gameOverO;
    boolean fireWood;
    boolean chest;
    boolean covid;
    boolean wolfForest;


    public Ressources() {
        this.bois = 0;
        this.pierre = 0;
        this.or = 50;
        this.nourriture = 100;
        this.habitants = 1;
        this.mineCreate = false;
        this.gameOverO = false;
        this.fireWood = false;
        this.chest = false;
        this.covid = false;
        this.wolfForest = false;
    }

    public void exploreForest() {
        this.bois += 5;
        this.nourriture += 3 * habitants;

        System.out.println("Vous avez exploré la forêt et récolté 5 bois et " + (3 * habitants) + " nourriture.");
    }

    public void mine() {
        if (bois >= 10) {
            this.bois -= 10;
            System.out.println("Vous avez crée une mine et débloquer la ressource pierre (-10 bois).");
        } else {
            System.out.println("Vous devez augmenter vos ressources en bois");
        }
    }

    public void workMine() {
        this.pierre += 5;
        this.nourriture -= 5;
        this.or += 2;
        this.mineCreate = true;
        System.out.println("Vous avez travaillé dans la mine et récolté 5 pierre et 2 or et consommé 5 nourritures.");
    }

    public void recruitSoldier() {
        if (or > 30) {
            this.habitants += 1;
            this.or -= 30;
            System.out.println("Vous avez recruté un soldat, ajoute 1 habitant et consomme 30 or.");
        }
    }

    public void commerce() {
        if (pierre > 5) {
            this.or += 10;
            this.pierre -= 5;
            System.out.println("Vous avez fait du commerce et gagné 10 or en échange de 5 pierre.");
        }
    }

    public void buildCastle() {
        if (bois >= 100 || pierre >= 100 || or >= 200 || habitants > 40) {

            this.bois -= 100;
            this.pierre -= 100;
            this.or -= 200;
            this.habitants -= 40;
            System.out.println("Vous avez construit un château, YOU WINNN !.");
        } else {
            System.out.println("Vous devez augmenter toutes vos ressources");
        }

    }

    public void deleteFood() {
        if (habitants > nourriture) {
            int killHabitants = habitants - nourriture;
            habitants -= killHabitants;
            System.out.println(
                    "Vous n'avez pas assez de nourriture pour subvenir au besoin de vos habitants, vous avez perdu"
                            + killHabitants + " habitants");
        }

        this.nourriture -= 1 * habitants;
        System.out.println("Vous avez fini un tour de jeu mais les habitants ont mangé, vous avez perdu " + (habitants)
                + " de nourritures");
    }

    public void gameOver() {
        if (habitants == 0) {
            System.out.println("GAME OVER");
            gameOverO = true;
        }
    }

    public void generateInt() {
        double valueDouble = Math.random();
        fireWood = false;
        if (valueDouble< 0.001){
            fireWood = true;
        } 
        System.out.println(" fire value " + valueDouble*100);
    }

    public void fire() {
        this.bois -= bois;
        this.habitants = 1;
        System.out.println(
                "Vous avez subis un incendie, vous avez perdu tout votre bois et il vous reste un seul habitant, courage");
    }

    public void chestMine() {
        int randomor = 2 + (int)(Math.random() * 20);
       int randomstones = 5 + (int)(Math.random() * 10);
        this.or += randomor * habitants;
        this.pierre += randomstones * habitants;
        System.out.println("Vous avez trouvé un coffre et gagné " +randomor+ " or, " + randomstones + " pierre");
    }
    public void generateChest() {
        double valueDouble = Math.random();
        chest = false;
        if (valueDouble< 0.1){
            chest = true;
        } 
        System.out.println("Chance de trouver un coffre : " + valueDouble*100);
    }
    public void chestForest() {
        int randomWood = 2 + (int)(Math.random() * 20);
       int randomFood = 5 + (int)(Math.random() * 10);
        this.bois += randomWood * habitants;
        this.nourriture += randomFood * habitants;
        System.out.println("Vous avez trouvé un coffre et gagné " +randomWood+ " bois, " + randomFood + " nourriture");
    }
    public void generateChestForest() {
        double valueDouble = Math.random();
        chest = false;
        if (valueDouble< 0.1){
            chest = true;
        } 
        System.out.println("Chance de trouver un coffre dans la forêt : " + valueDouble*100);
    }

    public void generateCovid (){
        double valueDoubleCovid = Math.random();
        covid = false;
        if (valueDoubleCovid< 0.01){
            covid = true;
        } 
        System.out.println(" Covid value: " + valueDoubleCovid*100);
    }

     public void covidEpidemi() {
         this.habitants = habitants/2;
        System.out.println(
                "Vous avez subis une épidémie de covid il vous reste "+ this.habitants +" habitants ");
    }

    
    public void generateWolf(){
        double valueDoubleWolf = Math.random();
        wolfForest = false;
        if (valueDoubleWolf< 0.01){
            wolfForest = true;
        } 
        System.out.println(" Wolf value: " + valueDoubleWolf*100);
    }

     public void wolf() {
         this.habitants = habitants-1;
        System.out.println(
                "Vous avez subis une attaque d'un loup dans la forêt, un habitant à été tué ");
    }
}

