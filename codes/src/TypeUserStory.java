

public enum TypeUserStory {

	BUG("Résolution d'un Bug"),
	FONCTIONALITY("Fonctionnalité attendue"),
	NOTDONE("UserStory non finie"), 
	POC("Proof of Concept"), 
	TECHNICAL("Nécessaire mais non fonctionnel");
	
	private String semantique;
	
	private TypeUserStory(String semantique) {  
        this.semantique = semantique ;  
    }

	public String getSemantique() {
		return semantique;
	}
	
}
