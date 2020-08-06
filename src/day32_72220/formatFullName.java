package day32_72220;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {
        /*
 write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

 */
        Scanner s=new Scanner(System.in);

        //String firstName="mustAFA";
        //String lastName="aBaSiyAniK";
        String firstName=s.next();
        String lastName=s.next();
        firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);
        System.out.println(formatFullName(firstName,lastName));
        //formatName(firstName)


    }
  public static String formatFullName(String firstName, String lastName) {
      firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
      lastName=lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
      String fullName=firstName+" "+lastName;

return fullName;
    }
    }

