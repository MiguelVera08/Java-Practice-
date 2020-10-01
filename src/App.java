class Person{

    String name;
    int age;
}








public class App {

    public static void main(String[] args){


        Person person1 = new Person();
        person1.name =  "Miguel Vera";
        person1.age = 30;

        Person person2 = new Person();
        person2.name = "Anderson Cardoso";
        person2.age = 27;


        System.out.println(person1.name + " \nAge: " + person1.age);
        System.out.println(person2.name + " \nAge: " + person2.age);



    }
}
