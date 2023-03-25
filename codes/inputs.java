import java.util.Scanner;


class inputs{

    public static void main(String[]args){

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Your Name");

        // String userName = sc.nextLine();

        // System.out.println("Username is: "+userName);


        Scanner sc = new Scanner(System.in);

        // string input
        System.out.println("Enter name");
        String name = sc.nextLine();

        //boolean input
        System.out.println("Enter boolean");
        boolean isPrime = sc.nextBoolean();

        // numerical input
         System.out.println("Enter number");
        int age = sc.nextInt();

        //double input
        System.out.println("Enter Double");
        double salary = sc.nextDouble();


        // byte input 
        System.out.println("Enter byte");
        byte num = sc.nextByte();

        // float input
        System.out.println("Enter float");
        float avg = sc.nextFloat();

        // long input
        System.out.println("Enter long");
        long num2 = sc.nextLong();

        // Sort input 
        System.out.println("Enter short ");
        short num3 = sc.nextShort();



        System.out.println("String "+name);
        System.out.println("boolean "+isPrime);
        System.out.println("int "+age);
        System.out.println("double "+salary);
        System.out.println("byte "+num);
        System.out.println("float "+avg);
        System.out.println("long "+num2);
        System.out.println("short "+num3);


        
    }
}