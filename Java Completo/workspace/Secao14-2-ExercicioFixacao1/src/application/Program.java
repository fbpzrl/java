package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Product: ");
			sc.nextLine(); //consumir a quebra de linha da leitura anterior
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'c') {
				
				Product product = new Product(name, price);
				list.add(product);
			}
			else if (ch == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			}
			else {
				
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customs);
				list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
