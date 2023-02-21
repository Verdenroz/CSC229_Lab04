public class Lab4HW{

    //Question 1
    public static void recursiveHello(int n){
        if (n == 0){
            //do nothing -- printing here will result in "Hello World" printing n + 1 times
        }
        else{
            System.out.println("Hello World");
            recursiveHello(n-1);
        }
    }


    //Question 2
    public static int multiple7Sum(int n1, int n2){

        if (n1 == n2){  //base case
            return n1;
        }
        
        if (n1 % 7 == 0){  //check if n1 is a multiple of 7, if so, return n1 and continue
            return n1 + multiple7Sum(n1 + 1, n2);
        }
        else{
            //if n1 != n2 and n1 is not a multiple of 7, continue the recursion
           return multiple7Sum(n1 + 1, n2);
        }

    }

    //Question 3
    public static int recursiveBinarySearch(int[] arr, int target, int lowBound, int upBound){

        if (lowBound <= arr.length - 1 && upBound >= lowBound){ //checks if array out of bounds is about to occur, if so, element is not in the array
            int mid = (lowBound + upBound) / 2;

            if (arr[mid] == target){    //base case
                return mid;
            }

            if (arr[mid] > target){ //if the middle is greater than target, the target must be in the left portion of arr[]
                return recursiveBinarySearch(arr, target, lowBound, mid - 1);
            }

            if (arr[mid] < target){ // if the middle is lesser than target, it must be in the right poriton of arr[]
                return recursiveBinarySearch(arr, target, mid+1, upBound);
            }

        }

        return -1;      //return -1 if element is not found
    }
    public static void main(String[] args) {
       // recursiveHello(5);

        System.out.println(multiple7Sum(1, 49));


       // int[] test = {1,5,7,9,10,23,67};
       // System.out.println(recursiveBinarySearch(test, 5, 0,test.length - 1 ));
        
    }

}