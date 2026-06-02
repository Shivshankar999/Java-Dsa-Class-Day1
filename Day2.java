public class Day2 {
    static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static void printFibSeries(int n){
        int p1=0;
        int p2=1;

        System.out.println(p1);
        System.out.println(p2);

        for(int i=2; i<n; i++){
           int curr=p1+p2;
           System.out.println(curr);
           p1=p2;
           p2=curr;
        }
    }
    public static void main(String[] args) {
        // nested if else
        int age = 20;
        boolean islicense=true;
        if (age>=18) {
        if(islicense){
        System.out.println("U can Drive");
        }
        else{
        System.out.println("U can't drive");
        }
        }


        // while loop
        int i = 1;
        while(i <= 5) {
        System.out.println(i);
        i++;
        }

        // Sum of n Natural no
        int n = 10;
        int i = 1;
        int sum = 0;
        
        while (i <= n) {
        sum = sum + i;
        i++;
        }
        System.out.println("Sum = " + sum);

        // Sum of n odd no

        int n = 20;
        int i = 1;
        int sum = 0;
        while (i<=n) {
        if(i%2!=0){
        sum = sum + i;
        }
        i++;
        }
        System.out.println("Sum = " + sum);

        // Sum of n even no

        int n = 20;
        int i = 1;
        int sum = 0;
        while (i<=n) {
        if(i%2==0){
        sum = sum + i;
        }
        i++;
        }
        System.out.println("Sum = " + sum);

        // Prime number
        int n = 15;
        if(isPrime(n)){
            System.out.println("Yes it is Prime Number");
        }
        else{
            System.out.println("No its not a prime number");
        }

        // fibonacci series
        int n=10;
        printFibSeries(n);
        

        //  Reverse Integer

        int n = 1234;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse = " + rev);
    }
}
