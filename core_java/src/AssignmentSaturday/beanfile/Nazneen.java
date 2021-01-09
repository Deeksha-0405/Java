package AssignmentSaturday.beanfile;

public class Nazneen {
	
	   private String perfumeName;
	   private String brand;
	   private double net_Content;
	   private int price;
	   
	public  Nazneen()
	   {
		   
	   }

	public String getPerfumeName() {
		return perfumeName;
	}

	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getNet_Content() {
		return net_Content;
	}

	public void setNet_Content(double net_Content) {
		this.net_Content = net_Content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Nazneen(String perfumeName, String brand, double net_Content, int price) {
		super();
		this.perfumeName = perfumeName;
		this.brand = brand;
		this.net_Content = net_Content;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Nazneen [perfumeName=" + perfumeName + ", brand=" + brand + ", net_Content=" + net_Content + "gm , price="
				+ price + "Rs. ]";
	}

	

}
