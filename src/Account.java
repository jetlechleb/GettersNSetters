public class Account {

    String name;
    int age;

    public static void main(String[] args) {

        Account a = new Account();

        a.age = 34;
        a.name = "Michal";

        System.out.println(a.age);
        System.out.println(a.name);
    }
}
