import java.util.Scanner;

public class Dog {
    private String name;
    private int age;
    private String color;

    Dog (String dogName, int dogAge, String dogColor){

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }
    void DogVoice(){

        System.out.println(this.name+" "+this.age+" "+this.color);
    }
    void HappyBirthday (){
        System.out.println("Happy birthday to me !!!");
        this.age = this.age+1;
    }
    void changeColor(){
        System.out.println("Which color do you want?");
        Scanner sc = new Scanner(System.in);
        String newColor = sc.nextLine();
        this.color = newColor;
    }
}

