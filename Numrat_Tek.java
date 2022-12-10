package detyrat_polis;
import java.util.Scanner;


public class Numrat_Tek
{
    public static void main(String[] args){

    try (Scanner in = new Scanner(System.in)) {
    System.out.println(" Vendosni numrin :");
    long numri=in.nextLong();

    long shuma=0;
    while(numri>0){

    if ((numri%10)%2==0) 

    shuma=shuma+numri%10;

    numri=numri/10;
    }
    System.out.println("Shuma e numrave tek eshte : "+shuma);
    
}}}


    
