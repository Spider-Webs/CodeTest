package study.TEST;

class Person {

    public String food="사과";

    void eat(){
        System.out.println(this.food);
    }
}

class Man extends Person {
    public String food="포도";

    @Override
    void eat() {
        System.out.println(this.food);
    }
}
public class PersonTest{
    public static void main(String[] args) {
        Person p1 = new Man();

        System.out.println(p1.food);

        p1.eat();
    }
}