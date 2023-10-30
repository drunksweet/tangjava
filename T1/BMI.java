package T1;

public class BMI{
    double height;
    double weight;
    double bmi;



    public void operation(double height,double weight) {
        bmi=weight/(height *height);
        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("过轻：低于18.5");
        } else if (bmi<24) {
            System.out.println("正常：18.5-23.99");
        } else if (bmi<28) {
            System.out.println("过重：24-28");
        } else  {
            System.out.println("非常肥胖：高于32");
        }

    }

    public static void main(String[] args) {

    }

}


