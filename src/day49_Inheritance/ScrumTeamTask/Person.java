package day49_Inheritance.ScrumTeamTask;

import repline_tasks.string;

public class Person {
    /*
    create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

     */
    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    private void eat(){// we donot wnat this to be inherited to the sub classes
        System.out.println(name+" is eating.");
    }

    private void walk (){// we donot wnat this to be inherited to the sub classes
        System.out.println(name+" is walking.");
    }

    public void sleep(){
        System.out.println(name+" is sleeping.");
    } // we donot wnat this to be inherited to the sub classes



}
