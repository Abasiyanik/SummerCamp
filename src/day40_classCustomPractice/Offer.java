package day40_classCustomPractice;

public class Offer {
    /*
    Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword
     */
// instance variables /
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;
    //set info of all

    public void setOfferInfo(// lcoal parameters
            double salary, String state, boolean hasPTO, boolean isFullTime, boolean isWFH,
            String jobTitle,
            boolean hasBenefit) {
        this.salary=salary;
        this.state=state;
        this.hasPTO=hasPTO;
        this.isFullTime=isFullTime;
        this.isWFH=isWFH;
        this.jobTitle=jobTitle;
        this.hasBenefit=hasBenefit;
// instance variable lar ile local veriable ayni isimde oldugundan instancelari cagirmak icin biz this keywordu kullanidk

    }
    public void getOfferInfo() { // displays offer  info
        System.out.println("============================");
        System.out.println("Salary: " + this.salary);
        System.out.println("Location: " +this.state);
        System.out.println("Does it have PTO? " + this.hasPTO);
        System.out.println("Is it a fulltime job? " + this.isFullTime);
        System.out.println("Do you work at home? " + this.isWFH);
        System.out.println("Job Title: " + this.jobTitle);
        System.out.println("Does it have benefith? " + this.hasBenefit);
        System.out.println("============================");
    }
}
