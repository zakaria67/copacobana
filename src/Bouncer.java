public class Bouncer {

    public boolean checkAge(Customer customer) {
        if (customer.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }
}
