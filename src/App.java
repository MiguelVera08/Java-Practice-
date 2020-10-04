class Person{

    String name;
    int age;


    void speak(){
        System.out.println("My name is: " + name);
    }

    void sayHello(){
        System.out.println("Hello there!");
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    //Getters
    int getAge(){

        return age;
    }

    String getName(){
        return name;
    }
}








public class App {

    public static void main(String[] args){


        Person person1 = new Person();
        person1.sayHello();
        person1.name =  "Miguel";
        person1.age = 30;
//        person1.speak();


        int years = person1.calculateYearsToRetirement();

        System.out.println("Years until retirement " + years);

        int age = person1.getAge();
        String name = person1.getName();


        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
}
