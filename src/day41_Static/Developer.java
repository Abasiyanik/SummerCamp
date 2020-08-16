package day41_Static;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo (String name, double salary, String gender, int age){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;

    }
    public  String toString(){
        return "Name: "+name+", Gender :"+gender+", Age: "+age+", Salary: "+salary;

    }
    public void coding(){
        System.out.println(name+" is coding");

    }
    public void fixBugs(){
        System.out.println(name+" is crying");
    }
}

class DeveloperObject{

    public static void main(String[] args) {

    Developer[] developers={new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),new Developer() };
    developers[0].setInfo("Ahmet", 120_000, "Male", 36);
    developers[1].setInfo("Erhan ", 150_000, "Male", 29);
    developers[2].setInfo("Arpat", 150_000, "Male", 27);
    developers[3].setInfo("Ajit", 120_000, "M", 30);
    developers[4].setInfo("Massimo", 180_000, "Male", 36);
        developers[5].setInfo("Christina", 155_000, "Female", 36);
  //  developers[5].setInfo("Ahmet", 120_000, "Male", 36);

      //  System.out.println(developers[0]);

        for (int i=0; i<=developers.length-1; i++){
            System.out.println(developers[i]);
            //developers[i].fixBugs();
        }

        for (Developer each: developers){
            each.coding();
            each.fixBugs();
        }
    }

}
//BU ONE CLASS IN ONE FILE IS MORE CLEAR BUT MULTICLASSES IN ONE IS USED FOR COMMUNICATIONS
