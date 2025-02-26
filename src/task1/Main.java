package task1;

public class Main {
    public static void main(String[] args) {
        //criando pessoas
        Pessoa person1 = new Pessoa();

        person1.name= "Pedro";
        person1.age= 20;
        person1.country= "Brazil";

        Pessoa person2 = new Pessoa();

        person2.name= "Ana";
        person2.age= 21;
        person2.country= "Spain";

        //imprimindo valores
        System.out.println("Person 1 name " + person1.name + " , age " + person1.age + ", height " + person1.country+ " ");
        System.out.println("Person 2 name " + person2.name + " , age " + person2.age + ", height " + person2.country+" ");

        //alterando resultado
        person1.name= "Carlos";
        person1.age= 10;
        person1.country= "Germany";

        person2.name= "Laura";
        person2.age= 17;
        person2.country= "Italy";

        //imprimindo alteração
        System.out.println("Person 1 name " + person1.name + " , age " + person1.age + ", height " + person1.country+ " ");
        System.out.println("Person 2 name " + person2.name + " , age " + person2.age + ", height " + person2.country +" ");

    }
}
