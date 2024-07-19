public class Person {
    private String lastname;
    private String firstname;
    private int age;

    public Person(String last, String first, int a) {
        lastname = last;
        firstname = first;
        age = a;
    }

    public void displayPerson() {
        System.out.println("    Last name: " + lastname);
        System.out.println(",    first name: " + firstname);
        System.out.println(",   Age: " + age);
    }
    public String getLast(){
        return lastname;
    }
}
