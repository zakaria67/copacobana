import java.util.function.Function;

public class Bar {
    public static void main(String[] args) {

        Customer customer = new Customer(18);
        Customer customer1 = new Customer(8);
        Customer customer2 = new Customer(81);
        Customer customer3 = new Customer(16);

        // Bouncer bouncer = new Bouncer();
        Promoter promoter = new Promoter();
        Bartender bartender = new Bartender();
        WCLady wcLady = new WCLady();

        // if (bouncer.checkAge(customer))
        AgeChecker ageChecker = (Customer c) -> {
            if (c.getAge() < 18) {
                return false;
            } else {
                return true;
            }
        };

        AgeChecker ageCheckerForAmerica = (Customer c) -> {
            if (c.getAge() < 21) {
                return false;
            } else {
                return true;
            }
        };

        Function <Customer, Boolean> ageFunction = (Customer c) -> {
            if (c.getAge() < 18) {
                return false;
            } else {
                return true;
            }
        };

        if (ageChecker.checkAge(customer)) {
            bartender.serveADrink("pina colada", customer);
        }

        if (ageCheckerForAmerica.checkAge(customer3)) {
            bartender.serveADrink("pina colada", customer3);
        }

        if (ageFunction.apply(customer2)) {
            bartender.serveADrink("pina colada", customer3);
        }

    }
}
