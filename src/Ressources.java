public class Ressources {
	int bois;
	int pierre;
	int or;
	int nourriture;
	int habitants;
	
	public Ressources() {
		this.bois = 0;
		this.pierre = 0;
        this.or = 50;
		this.nourriture = 100;
		this.habitants = 1;
		
	}
    public void exploreforest(){
        this.bois += 5;
        this.nourriture += 3;
        System.out.println("Vous avez exploré la forêt et récolté 5 bois et 3 nourriture.");
    }
}


