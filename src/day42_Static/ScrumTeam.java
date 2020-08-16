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
    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        if(testers.length ==0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers) );
    }

    public void removeTester(long employeeID){ // 007
        testers.removeIf( p -> p.employessID == employeeID);
        //              each employee id,  == 007
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        if(developers.length ==0){ // to check if the array is empty
            return;
        }
        this.developers.addAll(Arrays.asList(developers) );
    }

    public void removeDeveloper(long employeeID){
        developers.removeIf( p -> p.employessID == employeeID );
    }
    public String toString(){
        return testers.size()+" testers, "+ developers.size()+" developers, PO: "+PO+", BA: "+BA+", SM: "+SM;
    }

}
