package jishiT2;

public class Bird extends Pet{
    @Override
    public void speak() {
        System.out.println("叽叽叽");
    }

    @Override
    public void show_happiness() {
        System.out.println("咋咋咋");

    }

    @Override
    public void display_info() {
        System.out.println("名字："+getName()+"，年龄："+getAge());
    }

    public  void fly(){
        System.out.println("我飞飞飞");
    }
}
