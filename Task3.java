public class Task3 {
    public static int fib(int n)

    {
        //The time complexity is exponential O(2^n) as each recursive call will branch to two
        //As such, it will continously step where each step has 2^n calls

           if (n <= 0) // base case
    
                return 0;
    
          else if (n == 1) // base case
    
                 return 1;
    
           else
    
                 return fib(n - 1) + fib(n - 2);
    
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
