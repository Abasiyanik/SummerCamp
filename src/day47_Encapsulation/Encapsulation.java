package day47_Encapsulation;

public class Encapsulation {
    private long ssn=1232145;
    public long getSsn (){//no parameter ve amac read only
        return this.ssn;//this is how to genarete getter
         }
    public void setSsn(long ssn){
        this.ssn=ssn; }



}
