package day41_Static;

public class Cat {
    String name;
    int age;
    char gender;
    String color;
    String breed;
    //String eat;
    public void setCatInfo1 (String name, int age, char gender, String color, String breed){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.color=color;
        this.breed=breed;

    }


    public void eat(String catfood){
        System.out.println(name+" is eating "+catfood);

    }

    public void drink(String catDrink){
        System.out.println(name+" is drinking "+catDrink);

    }

   public String toString (){

        return "Name: "+name+ ", Breed: "+breed+", Color: "+color;
    }

}
