import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductOwner {
	
	private BackLogProduct sonBackLog;
	
	public ProductOwner(String nameProduct) {
		this.sonBackLog = new BackLogProduct(nameProduct);
		this.sonBackLog.add(new UserStory(TypeUserStory.BUG, "problème dans panier - suppression trajet aléatoire", 50, 10));
		this.sonBackLog.add(new UserStory(TypeUserStory.BUG, "connexion Banque Populaire pour paiement sécurisé", 5, 100));
		this.sonBackLog.add(new UserStory(TypeUserStory.BUG, "connexion Caisse Epargne pour paiement sécurisé", 5, 100));
		this.sonBackLog.add(new UserStory(TypeUserStory.BUG, "connexion Banque Rotschild pour paiement sécurisé", 5, 1));
		this.sonBackLog.add(new UserStory(TypeUserStory.FONCTIONALITY, "historique dernière recherche à remplacer par historique des voyages", 30, 15));
		this.sonBackLog.add(new UserStory(TypeUserStory.FONCTIONALITY, "calcul gain émission carbonne pour même voyage en voiture", 35, 50));
		this.sonBackLog.add(new UserStory(TypeUserStory.FONCTIONALITY, "calcul gain émission carbonne pour même voyage en avion s'il eiste", 50, 50));
		this.sonBackLog.add(new UserStory(TypeUserStory.FONCTIONALITY, "calcul gain ou perte pour même voyage en voiture", 20, 20));
		this.sonBackLog.add(new UserStory(TypeUserStory.FONCTIONALITY, "calcul gain ou perte pour même voyage en avion", 25, 25));
		this.sonBackLog.add(new UserStory(TypeUserStory.NOTDONE, "synchronisation des données WEB et appli mobile", 144, 200));
		this.sonBackLog.add(new UserStory(TypeUserStory.NOTDONE, "protection par mot de passe", 77, 14));
		this.sonBackLog.add(new UserStory(TypeUserStory.POC, "vente flash dernière minute", 75, 12));
		this.sonBackLog.add(new UserStory(TypeUserStory.POC, "vente privée pour bons clients", 95, 12));
		this.sonBackLog.add(new UserStory(TypeUserStory.TECHNICAL, "dette : faire des tests automatisés par les IHMs", 350, 250));
		this.sonBackLog.add(new UserStory(TypeUserStory.TECHNICAL, "dette : faire des tests fonctionnels automatisés pour éviter régression", 410, 100));
		this.sonBackLog.add(new UserStory(TypeUserStory.TECHNICAL, "mettre en place l'intégration continue", 31, 350));
	}
	
	public SprintBackLog productToSprintBacklogStrategieOneDeprecated() {
		List<UserStory> aFiltrer = new ArrayList<UserStory>(this.sonBackLog.getUserStories());
		
		// on enlève les user stories trop complexes
		Iterator<UserStory> it1 = aFiltrer.iterator();
		while (it1.hasNext()) {
			UserStory userStory = it1.next();
			if  (userStory.getComplexiteEnPoints() > 150)
				it1.remove();
		}
		
		// on enlève les user stories qui ne rapportent pas assez
		Iterator<UserStory> it2 = aFiltrer.iterator();
		while (it2.hasNext()) {
			UserStory userStory = it2.next();
			if  (userStory.getBusinessValueEnEuro() < 30)
				it2.remove();
		}
		
		// on enlève les user stories nécessaires mais non fonctionnels
		Iterator<UserStory> it3 = aFiltrer.iterator();
		while (it3.hasNext()) {
			UserStory userStory = it3.next();
			if  (userStory.getType() == TypeUserStory.TECHNICAL)
				it3.remove();
		}
		
		return new SprintBackLog(99, aFiltrer);
	}
	
	public SprintBackLog productToSprintBacklogStrategieOne() {
		List<UserStory> aFiltrer = new ArrayList<UserStory>(this.sonBackLog.getUserStories());
		
		FilterComplexity filterComplexity = new FilterComplexity(150);
		FilterBusinessValue filterBusinessValue = new FilterBusinessValue(30);
		FilterStoryType filterStoryType = new FilterStoryType(TypeUserStory.TECHNICAL);

		filterComplexity.setNextFilter(filterBusinessValue);
		filterBusinessValue.setNextFilter(filterStoryType);

		filterComplexity.applyFilter(aFiltrer);
		
		return new SprintBackLog(99, aFiltrer);
	}
	
	public SprintBackLog productToSprintBacklogStrategieTwoDeprecated() {
		List<UserStory> aFiltrer = new ArrayList<UserStory>(this.sonBackLog.getUserStories());
		
		// on enlève les user stories exploratoires
		Iterator<UserStory> it1 = aFiltrer.iterator();
		while (it1.hasNext()) {
			UserStory userStory = it1.next();
			if  (userStory.getType() == TypeUserStory.POC)
				it1.remove();
		}
		
		// on enlève les user stories qui ne rapportent pas beaucoup
		Iterator<UserStory> it2 = aFiltrer.iterator();
		while (it2.hasNext()) {
			UserStory userStory = it2.next();
			if  (userStory.getBusinessValueEnEuro() < 10)
				it2.remove();
		}
		
		// on enlève les user stories extremement complexes
		Iterator<UserStory> it3 = aFiltrer.iterator();
		while (it3.hasNext()) {
			UserStory userStory = it3.next();
			if  (userStory.getComplexiteEnPoints() > 300)
				it3.remove();
		}
		
		return new SprintBackLog(99, aFiltrer);
	}
	
	public SprintBackLog productToSprintBacklogStrategieTwo() {
		List<UserStory> aFiltrer = new ArrayList<UserStory>(this.sonBackLog.getUserStories());

		FilterStoryType filterStoryType = new FilterStoryType(TypeUserStory.POC);
		FilterBusinessValue filterBusinessValue = new FilterBusinessValue(10);
		FilterComplexity filterComplexity = new FilterComplexity(300);

		filterStoryType.setNextFilter(filterBusinessValue);
		filterBusinessValue.setNextFilter(filterComplexity);

		filterStoryType.applyFilter(aFiltrer);
		
		return new SprintBackLog(99, aFiltrer);
	}
	
	public static void main(String[] args) {
		ProductOwner martineDeLaSNCF = new ProductOwner("Oui_SNCF");
		System.out.println(martineDeLaSNCF.sonBackLog);
		
		// première stratégie pour définir le sprint Backlog
		SprintBackLog sprint99premiere = martineDeLaSNCF.productToSprintBacklogStrategieOneDeprecated();
		System.out.println(sprint99premiere);
		
		// deuxième stratégie pour définir le sprint Backlog
		SprintBackLog sprint99deuxieme = martineDeLaSNCF.productToSprintBacklogStrategieTwoDeprecated();
		System.out.println(sprint99deuxieme);
	}

}
