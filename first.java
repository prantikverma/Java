import java.util.*;
public class first{
        public static int printhelllo(){
                System.out.println("hello");
                System.out.println("helloparas");
                System.out.println('a');

                 return 0;
        }
    public static void main(String[] args)
    {

        //output in java
        System.out.print("hii world\n");
        System.out.println("my name is prantik");
        System.out.print("my name is paras");
        System.out.print("verma");
        System.out.print("\n");

        //input in java
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);
   /*     System.out.print("enter any number:");
           int num = sc.nextInt();
        System.out.println("bro you entered number "+num);
    */
        //this is single line comment
        
        //below down is multiline comment in java
        /*char c='a';//multi
        int d=c;
        System.out.println(d);*/

        //PROGRAM FOR CALCULATING AREA OF CIRCLE
        
 /*      
        System.out.print("enter the radius of circle=");
        float rad =sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println("AREA OF CIRCLE WITH RADIUS "+rad +" unit is "+ area+" unit ^2");
*/
        //its time for type conversion

        //arithmetic operators

        //binary : add subtract multiply divide modulus
/* 
        //1 add
        int a=1,b=2;
        System.out.println(a+b);
        //2.subtract
        System.out.println(a-b);
        //3.multiply
        System.out.println(a*b);
        //4.divide
        System.out.println((a/b));
        //5.modulo
        System.out.println(a%b);
*/
        //unary operators: increment and decrement
         //increment operators : pre and post

         //pre increment
 /*        System.out.println("pre increment");
         int i= 10;
         int j= ++i;
         System.out.println(i);
         System.out.println(j);
*/
         //post increment

/* 
         System.out.println("post increment");
         int k=10;
         int l=k++;
         System.out.println(k);
         System.out.println(l);
*/

        System.out.println("hii");
        char ch='A';
        for(int row=1;row<=4;row++)
        {
                for(int col=1;col<=row;col++)
                {
                        System.out.print(ch);ch++;
                }     System.out.println();
        }
        char a = 'a';
        a++;
        System.out.println(a);
        System.out.println();
        printhelllo();
         
        
        for(int i=3 ;i>=1;i--)
{
        int fact=1;
        fact=fact*i;
        System.out.println(fact);


}

     }
}



