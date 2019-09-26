class MultiEx{
       public static void main(String [] a)
{
      int i,j,k=0;
int b[] =new int[4];
       
     i=8;
     j=2;
   try{ 
          k=i/j;
                for(int z=0;z<=4;z++){
                                a[z]=z+1; } 
                                     for(int p : b) {
                                        System.out.println(p);
                                                    }
 }
catch(ArithmeticException e){    
            System.out.println("Cannot divide by zero"+ e);
                                                                    }
               catch(ArrayIndexOutOfBoundsException e)
                    {     System.out.println("Out of Range limit "); 
                                                                    }
         catch (Exception e){
                     System.out.println("Unknown Errrorrr");
                                                                    }
         
                System.out.println(k);
                                     }
}