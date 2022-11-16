import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDEmo {
    public static void main(String[] args) {
        String[] myCollectionsOfString = {"catapult", "turtle", "blue"};

        Stream.of(myCollectionsOfString)
                .map(String::toLowerCase)
                .filter(word -> word.contains("e"))
                .map(String::length)
                .filter(number -> number % 2 == 0)
                .map(number -> number / 2)
                .sorted()
                .forEach(System.out::println);

        Customer[] customers = {new Customer("Annie", 30), new Customer("Pablo", 15),
                new Customer("Said", 23), new Customer("Kofi", 17),
                new Customer("Yulian", 40)};

        Customer[] legalCustomers = Stream.of(customers)
                .filter(customer -> customer.getAge() >= 18)
                .map(customer -> customer.setName("Slim Shady"))
                //.sorted()
                // this won't work because Customer foesn't implenteert van copmare...
               

                //.forEach(customer -> System.out.println(customer));
                .toArray(Customer[]::new);
        System.out.println(Arrays.toString(legalCustomers));

    }
}
