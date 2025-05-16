class Product {
    String pname, pcode;
    int price;

    Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price : " + this.price + "\n");
    }
}

class Car {

    public static void main(String[] args) {
        Product p1 = new Product("Benz","Car123",1000);
        System.out.println("Displaying p1:");
        p1.display();

        Product p2 = new Product("Jaguar", "Car426", 25000);
        System.out.println("Displaying p2:");
        p2.display();

        Product p3 = new Product("Maruthi", "Car800", 50000);
        System.out.println("Displaying p3:");
        p3.display();

        Product cheapest = p1;
        if (p2.getPrice() < cheapest.getPrice()) {
            cheapest = p2;
        }
        if (p3.getPrice() < cheapest.getPrice()) {
            cheapest = p3;
        }

        System.out.println("\nDisplaying product with the lowest price:");
        cheapest.display();
    }
}