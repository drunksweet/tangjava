package jishiT2;

public class Dog extends Pet{

    @Override
    public void speak() {
        System.out.println("汪汪汪");
    }

    @Override
    public void show_happiness() {
        System.out.println("肚子饿饿，汪汪汪");

    }

    @Override
    public void display_info() {
        System.out.println("名字："+getName()+"，年龄："+getAge());
    }

    public  void fench(){
        System.out.println("要玩丢东西游戏，汪汪汪");
    }
}
