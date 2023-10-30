package T1;

import T1.BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BMI person1=new BMI();
        System.out.println("输入身高（m）");
        System.out.println("输入体重（kg）");
        double height=sc.nextDouble();
        double weight=sc.nextDouble();
    person1.operation(height,weight);
    }
}