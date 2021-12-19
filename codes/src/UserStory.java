

public class UserStory {
	
	private TypeUserStory type;
	private String name;
	private int complexiteEnPoints;
	private int businessValueEnEuro;
	
	public UserStory(TypeUserStory type, String name, int complexiteEnPoints, int businessValueEnEuro) {
		this.type = type;
		this.name = name;
		this.complexiteEnPoints = complexiteEnPoints;
		this.businessValueEnEuro = businessValueEnEuro;
	}

	@Override
	public String toString() {
		return "type= " + type.getSemantique() + ", name= " + name + ", complexite= "
				+ complexiteEnPoints + ", businessValue= " + businessValueEnEuro;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserStory other = (UserStory) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public TypeUserStory getType() {
		return type;
	}

	public int getComplexiteEnPoints() {
		return complexiteEnPoints;
	}

	public int getBusinessValueEnEuro() {
		return businessValueEnEuro;
	}
	
}
