package day44_Constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Merim", 20, 'F');
        Student student2 = new Student("Rakhat", 28, 'F');
        Student student3 = new Student("Belek", 30, 'M');
        //as soon as we exextudeted the file object will be executed.

        //her zaman bunlar executed olur ve bu bilgileri alir
/*
        student1.setInfoStudent("Mike", 18, 'M');
        student2.setInfoStudent("Rakhat", 28, 'F');
        student3.setInfoStudent("Belek", 30, 'M');

 */
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        //bu sayede setinfo method bypass oldu ve kullanilmayacak
        

    }
}
