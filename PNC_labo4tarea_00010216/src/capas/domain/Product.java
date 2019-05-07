package capas.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	
	static final String txtE_2and30 = "The name of the product must be between 2 and 30 characters";
	static final  String txtE_4and30 = "The name of the product must be between 4 and 30 characters";
	static final String regex = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	
	@Size(message = txtE_2and30, min = 2, max = 30)
	@NotNull(message = "The name can not be null")
	private String name;
	
	@Size(message = txtE_2and30, min = 2, max = 30)
	@NotNull(message = "The brand can not be null")
	private String brand;
	
	@Size(message = txtE_4and30, min = 4, max = 30)
	@NotNull(message = "The description can not be null")
	private String description;
	
	@Size(message = txtE_4and30, min = 4, max = 30)
	@NotNull(message = "The category can not be null")
	private String category;
	
	@PositiveOrZero(message = "The price must be a positive number")
	@NotNull(message = "The price can not be null")
	private double price;
	
	@Pattern(message = "The date does not follow the  format date/month/year or it doesn't exist", regexp = regex)
	@NotNull(message = "The expiration date can not be null")
	private String exp_date;
	
	
	public Product(String name, String brand, String description, String category, double price, String exp_date) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.price = price;
		this.exp_date = exp_date;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
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
