public class Ressources {
    int bois;
    int pierre;
    int or;
    int nourriture;
    int habitants;
    boolean mineCreate;
    boolean gameOverO;

    public Ressources() {
        this.bois = 0;
        this.pierre = 0;
        this.or = 50;
        this.nourriture = 100;
        this.habitants = 1;
        this.mineCreate = false;
        this.gameOverO = false;

    }

    public void exploreForest() {
        this.bois += 5;
        this.nourriture += 3 * habitants;

        System.out.println("Vous avez exploré la forêt et récolté 5 bois et 3 nourriture.");
    }

    public void mine() {
        if (bois>=10){
            this.bois -= 10;
            System.out.println("Vous avez crée une mine et débloquer la ressource pierre (-10 bois).");
        }
        System.out.println("Vous devez augmenter vos ressources en bois");
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
        if(pierre > 5){
            this.or += 10;
            this.pierre -= 5;
            System.out.println("Vous avez fait du commerce et gagné 10 or en échange de 5 pierre.");
        }
    }

    public void buildCastle() {
        if(bois >= 100 || pierre>=100 || or>=200 || habitants>40 ){

            this.bois -= 100;
            this.pierre -= 100;
            this.or -= 200;
            this.habitants -= 40;
            System.out.println("Vous avez construit un château, partie gagné!.");
        }
        System.out.println("Vous devez augmenter toutes vos ressources");

    }

    public void deleteFood (){
        if(habitants>nourriture) {
            int killHabitants = habitants-nourriture;
            habitants -=killHabitants;
            System.out.println("Vous n'avez pas assez de nourriture pour subvenir au besoin de vos habitants, vous avez perdu"+ killHabitants+ " habitants");
        }
      
        this.nourriture -= 1 * habitants;
        System.out.println("Vous avez fini un tour de jeu mais les habitants ont mangé, vous avez perdu "+ (habitants) +" de nourritures" );
    }

    public void gameOver (){
        if(habitants==0) {
            System.out.println("GAME OVER");
            gameOverO = true;
        }
        
       
    }
}
