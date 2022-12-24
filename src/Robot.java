public class Robot {
    String name;
    public void sayHello() {
        System.out.println("Hello, I am "+ getClass());
    }
    public void sayYourName(){
        System.out.println("Hello, my name is "+ name);
    }
    public Robot (){
    // пусто конструктор для создания роботов
    }
    public Robot(String robotName){
        this.name = robotName;
    }
}
