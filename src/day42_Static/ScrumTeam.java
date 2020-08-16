package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    //bunu instance yapiyoruz

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    //proje ownder, business analyt ve SM de STeamde bulunuru bunlarda eklendi
    String PO;
    String BA;
    String SM;
//simdi tester ve developerleri ekleyip cikardacagim

    public void setInfo(String PO, String BA, String SM){
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;

    }
    //simdi addTester yapiyoruz ve bu instance olacak zira sadece ilgili ozel team icine ekleneceginden
    public void addTester (Tester tester){
        //how do i add tester into Test
        testers.add(tester);//tester ArrayList uykarida acildi buradaki class Tester classi ise onceden olusturuldu


    }
    public void addTesters (Tester [] testers){
        if(testers.length==0){ return;}

        this.testers.addAll(Arrays.asList(testers));//this.testers inctance varialbe boylece local variable ile
        // instance variable arasindaki farki anlatmis olduk. ikinci testers ise local variable
    }
    public void removeTester(long emloyeeID){
        testers.removeIf(p-> p.employessID==emloyeeID);
    }
    public void addDeveloper(Developer developer){
        //how do i add tester into Test
        developers.add(developer);//tester ArrayList uykarida acildi buradaki class Tester classi ise onceden olusturuldu


    }
    public void addDevelopers (Developer [] developers){
        if(developers.length==0){ return;}

        this.developers.addAll(Arrays.asList(developers));//this.testers inctance varialbe boylece local variable ile
        // instance variable arasindaki farki anlatmis olduk. ikinci testers ise local variable
    }
    public void removeDeveloper(long emloyeeID){
        developers.removeIf(p-> p.employessID==emloyeeID);
    }

    public String toString(){
        return testers.size()+" testers, "+ developers.size()+" developers, PO: "+PO+", BA: "+BA+", SM: "+SM;
    }

}
