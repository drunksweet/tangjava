package interface_demo;

import java.util.ArrayList;

public class ClazzManage {
    private StudentOperator studentOperatorn=new StudentOperatorImpl1();
    private ArrayList<Student> students=new ArrayList<>();
    public  ClazzManage(){
        new Student("王东洋","男",60);
        new Student("赖景康","男",70);
        new Student("韦子沫","女",80);
        new Student("焦新亨","男",100);
    }
    public  void printIofo(){
        studentOperatorn.printAllInfo(students);

    }
    public  void printScore(){
        studentOperatorn.printAverageScore(students);

    }
}
