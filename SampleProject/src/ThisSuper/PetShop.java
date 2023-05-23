package ThisSuper;
public class PetShop extends MainBranchOfPetShop {
	String shopName;
	int price;
	int discount;
	int petTreatment;
	PetShop()
	 {
		 System.out.println("Pet Shop Name is Lovely Pet Shop");
	 }
     PetShop (int price)
      {
    	  super("checken");
    	  //this();
	System.out.println("1Kg Pedigree Price of 1500");
          }
      PetShop(int price ,int discount)
      {
    	  this(price);
    	  System.out.println("1Kg Pedigree Discount in 5%");
    	  }
      PetShop(int price,int discount,int petTreatment)
      { 
    	  this(price,discount);
    	  System.out.println("3 age dog treatment 20% offer");
      }
      
     public static void main(String arg[])
     {
    	 PetShop C1=new PetShop();
    	 System.out.println();

    	 PetShop C2=new PetShop(24);
    	 System.out.println();
    	 
    	 PetShop C3=new PetShop(45,3);
    	 System.out.println();

    	PetShop C4=new PetShop(500,5,20);
   	 System.out.println();

     }
}













