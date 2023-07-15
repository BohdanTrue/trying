public class WorkingPeople {
    String name;
    int age;
    String work;
    String placeAtWork;

    public WorkingPeople(String name, int age, String work, String placeAtWork){
        this.name = name;
        this.age = age;
        this.work = work;
        this.placeAtWork = placeAtWork;
    }

    public void sayHello(){
        System.out.println("Hi! My name is " + name + ", i'm " + age + " years old. I'm working in a" + work + " I have a good place: " + placeAtWork);
    }

    public void sayHowOldAreYou(){
        System.out.println("I'm " + age + " years old");
    }
    public static void main(String[] args) {
        WorkingPeople person1 = new WorkingPeople("vasya", 43, "sirzavod", "gruz4ik");
        person1.sayHello();
        person1.sayHowOldAreYou();
    }
}

