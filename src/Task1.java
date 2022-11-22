public class Task1 {
    public static void main(String[] args) {
        int objectPrice = 20;
        double salesTax = .05;
        double tax;
        double total;
        tax = objectPrice * salesTax;
        total = tax + objectPrice;
        System.out.println (" The tax on an item valued at $"  + objectPrice +  " has a sales tax of $"  + tax +  " making the total $"  + total );


    }
}