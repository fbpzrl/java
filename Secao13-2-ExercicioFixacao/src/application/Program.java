package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY: ");
		Date birth = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birth);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items for this order? ");
		int n = sc.nextInt();
		System.out.println();
		
		OrderItem item = new OrderItem();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
		    Product product = new Product(productName, productPrice);
			item = new OrderItem(productPrice, productQuantity, product);
			
			order.addItem(item);
			order.total();
			
			System.out.println();
			
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		System.out.println();
		
		sc.close();
	}

}
