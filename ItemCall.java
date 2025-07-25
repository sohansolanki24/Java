import java.io.*;

class Item {
    String name;
    int qty;
    float rate, netAmt;

    void setItem(String n, int q, float r) {
        name = n;
        qty = q;
        rate = r;
        netAmt = q * r;
    }

    void printDetails() {
        System.out.print(name + "\t" + qty + "\t\t" + String.format("%.2f", rate) + "\t");
        System.out.printf("%.2f", netAmt);
    }
}
class ItemCall {
    public static void main(String args[]) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Item[] items = new Item[5];

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.print("Enter name of item " + (i + 1) + ": ");
            String name = rd.readLine();

            System.out.print("Enter quantity of item " + (i + 1) + ": ");
            int qty = Integer.parseInt(rd.readLine());

            System.out.print("Enter rate of item " + (i + 1) + ": ");
            float rate = Float.parseFloat(rd.readLine());

            items[i].setItem(name, qty, rate);
            System.out.println();
        }

        System.out.println("\nItem Details:");
        System.out.println("Name\tQuantity\tRate\tNet Amount");
        for (int i = 0; i < 5; i++) {
            items[i].printDetails();
            System.out.println();
        }

        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (items[i].netAmt > items[maxIndex].netAmt) {
                maxIndex = i;
            }
        }

        System.out.println("\nItem with highest net amount:");
        System.out.println(items[maxIndex].name + " with net amount " + items[maxIndex].netAmt);
    }
}