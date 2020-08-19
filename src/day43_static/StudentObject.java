package day43_static;

public class StudentObject {

    public static void main(String[] args) {
        CybertekStudent obj1=new CybertekStudent();
        obj1.studentName="Ivan";

        CybertekStudent obj2=new CybertekStudent();
        obj2.studentName="Christina";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);
        A.a=4;//static te birinci A classname ikinci si ise variable adi
        System.out.println(A.a);
        System.out.println(obj1.schoolname);
    }
}
