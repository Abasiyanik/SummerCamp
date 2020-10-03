package day48_Inheritance;

class A{
    static int a=10;
}

class B extends A{// A is the parent of B
        static int b=20;
/*
variables: a, b
 */
}
class C extends B{// B is the parent of C and A is the greandparent of C
    static int c=30;
    /*
    variable : a,b,c
     */
}
public class inheritance {


}
