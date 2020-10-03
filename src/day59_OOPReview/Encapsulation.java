package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;// i need to hide here

    private final LocalDate Published= LocalDate.of(1970,6,12);//cannot be modified

    public int getSsn() {// you cannot use static method here //if i use private as AM i will not let me use it outside
        return ssn;
    }

    public void setSsn(int ssn) {//setter means to modify only
        this.ssn = ssn;
    }

    public LocalDate getPublished() {
        return Published;
    }
}
