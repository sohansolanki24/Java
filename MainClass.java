import java.io.*;

// Class to handle product details, calculation, and display
class ProductHandler {
    int pno;
    String pname;
    int qty;
    double price;
    double gst;
    double netAmount;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Method to take input, calculate GST, and display
    void processProducts() throws IOException {
        ProductHandler[] products = new ProductHandler[3];

        // Input details for 3 products
        for (int i = 0; i < 3; i++) {
            products[i] = new ProductHandler();
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product No: ");
            products[i].pno = Integer.parseInt(br.readLine());
            System.out.print("Product Name: ");
            products[i].pname = br.readLine();
            System.out.print("Quantity: ");
            products[i].qty = Integer.parseInt(br.readLine());
            System.out.print("Price: ");
            products[i].price = Double.parseDouble(br.readLine());

            // Calculate GST and Net Amount
            products[i].gst = products[i].price * products[i].qty * 0.08;
            products[i].netAmount = (products[i].price * products[i].qty) + products[i].gst;
            System.out.println();
        }

        // Display products column-wise
        System.out.println("PNo\tPName\tQty\tPrice\tGST\tNet Amount");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(products[i].pno + "\t" + products[i].pname + "\t" + products[i].qty
                    + "\t" + products[i].price + "\t" + products[i].gst + "\t" + products[i].netAmount);
        }
    }
}

// Main class to call the method
public class MainClass {
    public static void main(String[] args) throws IOException {
        ProductHandler ph = new ProductHandler();
        ph.processProducts();  // Call the method that handles everything
    }
}