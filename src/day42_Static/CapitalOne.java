package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {
        Tester [] testers={new Tester(), new Tester(),new Tester()};
       // Tester[] testers = {new Tester(), new Tester(), new Tester())};
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);
        System.out.println(testers[0]);
        //how can we add testers to scrum team

        Developer[] developers={ new Developer(),new Developer(),new Developer(),new Developer(),new Developer() };
        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 150000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 150000);
        developers[2].setInfo("burak", 'M', 431213L, "Dev", 150000);
        developers[3].setInfo("virginia", 'F', 49813L, "Dev", 160000);
        developers[4].setInfo("Akbar", 'M', 439814L, "Dev", 145000);

        ScrumTeam team1=new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        System.out.println(team1);

        //STdeki testerlarin ismini yazdirablim
        System.out.println("===========================");
        for (Tester each:team1.testers){//team1.testers'each everysingle elemant sahip
            System.out.println("Name: "+each.name + ", Salary: "+each.salary+", Job Title: "+each.jobTitle); }

        for (Developer each:team1.developers){//team1.testers'each everysingle elemant sahip
            System.out.println("Name: "+each.name + ", Salary: "+each.salary+", Job Title: "+each.jobTitle); }

        //remove team members by using ID
        System.out.println("===================");
        team1.removeTester(15222);
        for (Tester each:team1.testers){//team1.testers'each everysingle elemant sahip
            System.out.println("Name: "+each.name + ", Salary: "+each.salary+", Job Title: "+each.jobTitle); }
        team1.removeDeveloper(3222);
        team1.removeDeveloper(2111);
        for (Developer each:team1.developers){//team1.testers'each everysingle elemant sahip
            System.out.println("Name: "+each.name + ", Salary: "+each.salary+", Job Title: "+each.jobTitle); }

        //lets add developers
        System.out.println("===========================");
        Developer dev1=new Developer();
        dev1.setInfo("lusia", 'F', 2345L, "Dev Lead", 342000);
        team1.addDeveloper(dev1);

        System.out.println(team1);
        // eger ikinci scrum team yapmak istersek
        ScrumTeam [] scrumTeams={team1, new ScrumTeam(), new ScrumTeam()};
        /*
        print all developers and testers from scrum team
        find the maximum salary

         */
    }
}
