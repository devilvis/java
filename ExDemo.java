

public class ExDemo{
       public static void main(String[] a)
{
      int i,j,k=0;
       
      i=8;
     j=0;
   try{ 
          k=i/j;   }
catch(ArithmeticException e)
{    
     System.out.println("Cannot divide by zero"+ e);
    }
        System.out.println(k);}}