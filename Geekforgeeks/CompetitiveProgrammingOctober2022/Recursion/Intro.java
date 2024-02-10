package Recursion;
//How function executes
public class Intro {
    public static void func1(){
        System.out.println("func 1"); 
    }
    public static void func2(){
        System.out.println("Before func 1"); 
        func1();
        System.out.println("After Funct 1");
    }
    public static void main(String[] args) 
	{ 
		System.out.println("Before func 2"); 
        func2();
        System.out.println("After Funct 2");
	}
}

//Before func 2
//Before func 1
//func 1
//After func 1
//After funct2