

public enum TypeUserStory {

	BUG("R�solution d'un Bug"), 
	FONCTIONALITY("Fonctionnalit� attendue"), 
	NOTDONE("UserStory non finie"), 
	POC("Proof of Concept"), 
	TECHNICAL("N�cessaire mais non fonctionnel");
	
	private String semantique;
	
	private TypeUserStory(String semantique) {  
        this.semantique = semantique ;  
    }

	public String getSemantique() {
		return semantique;
	}
	
}
