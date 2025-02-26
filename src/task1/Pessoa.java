package task1;

public class Pessoa {
    // atributos
    String name;
    int age;
    String country;

    // metodo void
    void speak(){
        System.out.println("Hello my name is " + name +" ");
    }
    void years(){
        System.out.println("I am "+ age +" years");
    }

    //metodo com retorno

    public String speakName(){
        return name;
    }
    public int speakAge(){
        return age;
    }
    public String speakCountry(){
        return country;
    }

}
