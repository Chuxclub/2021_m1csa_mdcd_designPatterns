public class BackLogProduct extends BackLog {

	private String nameProduct;
	
	public BackLogProduct(String nameProduct) {
		super();
		this.nameProduct = nameProduct;
	}

	@Override
	public String toString() {
		return this.nameProduct + '\n' + super.toString();
	}
	
}
