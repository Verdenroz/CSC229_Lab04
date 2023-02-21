public class Task2 {
    
    public static int gcd(int x, int y) {

        //using substraction
        while (x != y){     //until both x and y are equal, subtract from each other -- the gcd is when they are equal
            if (x > y){
                x = x - y;
            }
            else
                y = y - x;
        }
        return x;

  
  }
    public static void main(String[] args) {
        System.out.println(gcd(10004,17));
    }
}
