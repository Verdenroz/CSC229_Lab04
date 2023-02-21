public class Task1 {
    
    public static void countDown(int num)
 {

      if (num == 0) // test     Time complexity is linear O(n)

                  System.out.println("Blastoff!");

       else {

            if (num % 2 == 0){  //print only even numbers
                System.out.println(num + "...");
            }
                
                countDown(num-1); // recursive call    

    }
 }
public static void main(String[] args) {
        countDown(5);
    }
}
