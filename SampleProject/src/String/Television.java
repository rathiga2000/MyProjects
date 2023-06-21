package String;
import java.util.Arrays;

public class Television implements Comparable<Television> {
	private String name;
    private int price;
    private double size;
    private int warrantyear;
    
	
    public Television(String name, int price, double size, int warrantyear) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
		this.warrantyear = warrantyear;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}

	public int getWarrantyear() {
		return warrantyear;
	}


	public void setWarrantyear(int warrentyear) {
		this.warrantyear = warrentyear;
	}


	@Override
	public String toString() {
		return "Televion [name=" + name + ", price=" + price + ", size=" + size + ", warrentyear=" + warrantyear + "]";
	}

	

	
//	public int compareTo(Television o) {
//		 
//		 if( this.getPrice()> o.getPrice()) {
//			 return 1;
//		 }
//		 else if( this.getPrice()< o.getPrice()) {
//			 return -1;
//		 }
//		 else 
//			 return 0;
//		}
	public int compareTo(Television o) {
		  
		  return this.getName().compareTo(o.getName()); }
}
		
			
	
	
	
	




