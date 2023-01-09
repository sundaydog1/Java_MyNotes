package day18_garbageCollection;

/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping
			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */
public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniToppings;

    // calculates the total price of the pizza, returns it as a double
    public double calCost(){
        double totalPrice = 0;


        switch (size){
            case 'S':
            case 's':
                totalPrice=10 +2* (numberOfCheeseTopping+numberOfPepperoniToppings);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfCheeseTopping+numberOfPepperoniToppings);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2*(numberOfCheeseTopping+numberOfPepperoniToppings);
                break;
            default:
                System.out.println("Invalid size" + size);
        }

        return totalPrice;



    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price=" + calCost()+
                '}';
    }

                        //local variable size
    public void setInfo( char size, int numberOfCheeseTopping, int numberOfPepperoniToppings) {
        this.size = size; // by default the compilier will call the local variable. this keyword will force the compiler
        // to call the instance variable size
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }
}
