class Person{

    String name;
    int age;


    void speak(){
        System.out.println("My name is: " + name + " and I am " + age + " years old. ");
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}








public class App {

    public static void main(String[] args){


        Person person1 = new Person();
        person1.sayHello();
        person1.name =  "Miguel";
        person1.age = 30;
        person1.speak();


        Person person2 = new Person();
        person2.name = "Anderson Cardoso";
        person2.age = 27;
        person2.speak();




    }
}
