package Predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSamples {
    private static int usersCount = 0;

    public static User findUserById(int id) {
        List<User> users = new ArrayList<>();
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));

        // The "? super User" is a wildcard indicating that the Predicate can work with any superclass of User as well.
        Predicate<? super User> predicate = user -> user.getId().equals(id);  // Checks if id of a user is equal to the id that is passed in

        return users.stream().filter(predicate).findFirst().get();  // Filtering a list based on a predicate
    }

    public static void main(String[] args) {
        // Predicate example 1 - checks if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(7));  // false

        // Predicate example 2 - checks if a string has more than 5 characters
        Predicate<String> hasMoreThan5Chars = str -> str.length() > 5;
        System.out.println(hasMoreThan5Chars.test("hello"));  // false

        // Predicate example 3 - a more complex predicate
        System.out.println(findUserById(2));
    }
}


class User {
    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
