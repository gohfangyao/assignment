public class main 
{
 public static void main(String [] args)
 {
   Book1 b1 = new Book1();
   Book2 b2 = new Book2();
   Book3 b3 = new Book3();
   
   System.out.println("The title of the book is " + (b3.title));//take data from variable in class Book1
   System.out.println("The number of pages of the book is " + (b3.numberOfPages));
   System.out.println("The author of the book is " + (b3.author));
   System.out.println("The published date of the book is " + (b3.published_date));
   
   
   b2.outlet();//take data from method in class Book2
   b2.material();
   b1.content();
   }
}
