package capas.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(message = "The name of the product must be between 2 and 30 characters", min = 2, max = 30)
	@NotNull(message = "The name can not be empty")
	private String name;
	
	@Size(message = "The brand of the product must be between 2 and 30 characters", min = 2, max = 30)
	@NotNull(message = "The brand can not be empty")
	private String brand;
	
	@Size(message = "The description of the product must be between 4 and 30 characters", min = 4, max = 30)
	@NotNull(message = "The description can not be empty")
	private String description;
	
	@Size(message = "The name of the product must be between 4 and 30 characters", min = 4, max = 30)
	@NotNull(message = "The category can not be empty")
	private String category;
	
	@PositiveOrZero(message = "The price must be a positive number")
	@NotNull(message = "The price can not be empty")
	private double price;
	//private String exp_date;
	
	
	public Product(String name, String brand, String description, String category, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
