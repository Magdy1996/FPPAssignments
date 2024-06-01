package assignments.lesson2.problem5;

enum PizzaSize {SMALL, MEDIUM, LARGE};
enum PizzaType {VEGGIE, PEPPERONI, CHEEZE, BBQCHICKEN}

final public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;

    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice(){
        int sizePrice = switch (this.pizzaSize) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };
        double typePrice = switch (this.pizzaType){
            case CHEEZE -> 1.5;
            case PEPPERONI, BBQCHICKEN -> 2;
            case VEGGIE -> 1;
        };
        this.price = (sizePrice + typePrice) * this.quantity;
    }

    public String printOrderSummary(){
        double tax = this.price * 0.03;
        double totalPrice = this.price + tax;
        return String.format(
                "Pizza Order:%nSize: %s%nType: %s%nQuantity: %d%nPrice: $%.2f%nTax: $%.2f%nTotal Price: $%.2f",
                this.pizzaSize, this.pizzaType, this.quantity, this.price, tax, totalPrice
        );
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE,2);
        Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI,1);
        Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQCHICKEN,2);
        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }

}
