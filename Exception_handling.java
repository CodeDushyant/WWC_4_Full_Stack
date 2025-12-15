import java.util.Scanner;
import java.util.*;

class customException extends Exception{
    customException(String message){
        super(message);
    }
}
public class Exception_handling {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        try{
           int a= sc.nextInt();
        System.out.println("The value of a is : "+a);
        if(a<0){
            throw new customException("Input is less tha 0 "+a);
        }
            System.out.println("Input Accepted");
        }catch(customException ce){
            System.out.println("Exception is occur ");
        }finally{
            System.out.println("Successfull run the try caathch block ");
        }
    }
}
