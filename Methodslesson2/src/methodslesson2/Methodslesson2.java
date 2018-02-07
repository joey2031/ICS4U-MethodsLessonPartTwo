
package methodslesson2;

public class Methodslesson2 {

    public static void main(String[] args) {
        calcArea(5);
        calcArea(2,3); // same method names but different paramaters. 

    }
    public static void calcArea (int s){
    
        System.out.println("Area is " + (s*s));
    }
    
     public static void calcArea (int l, int w){
         int area = l*w;
         System.out.println("Area is " + area);

     
     }
     // All these methods have the same name, nut that is ok since they have differenr paramaters
     public static void displayWord (){

     }
       public static void displayWord (int x){ // int x and string x is ok since they are different data types.

     }
         public static void displayWord (String x){

     }
           public static void displayWord (int a, String b){

     }
           
//       public static void displayWord (int b, String a){ would not work because paramater is still
//                                                       int, string like the method above.       
//     }       // Only different: variables are different names.
     
     
   
    
}
