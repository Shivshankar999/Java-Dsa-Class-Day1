class Day1{
    public static void main(String[] args){
        //  int a = 1000000000;// range 10^-9 to 10^9
        // System.out.println(a);
        long a = 1000000000000000000L;// range 10^-18 to 10^18
        // System.out.println(a);

        float a = 3.14F;// range 10^-9 to 10^9
        // System.out.println(a);

        double a = 3.14;// range 10^-18 to 10^18
        // System.out.println(a);

        // char a = 's';
        // char b='@';
        // System.out.println(a);
        // System.out.println(b);
       
        // variables

        // boolean a = true;
        // System.out.println(a);
        
        // int 5age=22;(invalid)
        // int age5=22;
        // System.out.println(age5);
        // //String First name="Sumit";
        // String First_name="Sumit";
        // System.out.println(First_name);
        // //String while="firstclass"(invalid)


        // condition statement
        int age = 20;
        if (age > 18) {
        int a = 25;
        int b = 25;
        System.out.println(a + b);
        } else {
        int a = 25;
        int b = 25;
        System.out.println(a*b);
        }

        int grade = 'C';
        if (grade == 'A') {
            System.out.println("Grade A");
        } else if (grade == 'B') {
            System.out.println("Grade B");
        } else if (grade == 'C') {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}