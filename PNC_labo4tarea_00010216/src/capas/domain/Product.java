package capas.domain;

public class Product {
	private String name;
	private String brand;
	private String description;
	private String category;
	//private float price;
	//private String exp_date;
	public Product(String name, String brand, String description, String category) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
	}
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
