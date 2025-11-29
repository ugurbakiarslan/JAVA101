package OOP1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					// Set Values
		Product product1 = new Product();
		product1.setName("Delonge Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStocks(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();	
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStocks(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStocks(3);
		product3.setImageUrl("image3.jpg");
		
		Product productyeni= new Product();
		productyeni.setName("GPT Kahve Makinesi");
		productyeni.setDiscount(7);
		productyeni.setUnitPrice(7500);
		productyeni.setUnitsInStocks(3);
		productyeni.setImageUrl("imageGPT1.jpg");
		
		Product productyeni2= new Product();
		productyeni2.setName("GPT2 Kahve Makinesi");
		productyeni2.setDiscount(7);
		productyeni2.setUnitPrice(7500);
		productyeni2.setUnitsInStocks(4);
		productyeni2.setImageUrl("imageGPT2.jpg");
		
		Product productyeni3= new Product();
		productyeni3.setName("GPT3 Kahve Makinesi");
		productyeni3.setDiscount(7);
		productyeni3.setUnitPrice(7500);
		productyeni3.setUnitsInStocks(5);
		productyeni3.setImageUrl("imageGPT3.jpg");
		
					// Get Values
		Product[] products = {productyeni,productyeni2,productyeni3};
		
			for (Product product : products) {
				System.out.println(product.getName());
			}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId("1");
		individualCustomer.setCustomerNumber("1234	");
		individualCustomer.setPhone("1112223344");
		individualCustomer.setFirstName("Uğur");
		individualCustomer.setLastName("Arslan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Arslanlar Holding");
		corporateCustomer.setTextNumber("1111222234");
		corporateCustomer.setId("5");
		
		
		Customer[] customers= {individualCustomer, corporateCustomer };
		
			for (Customer customer : customers) {
				System.out.println(customer.getId());
			}
	
		}
		

	}


