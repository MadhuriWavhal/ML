import java.util.*;

class StringsExamples{


    public static void main(String[]args){
            
        Scanner sc = new Scanner(System.in);
        
        // String str1 = "hello world hello world hello world hello world";
        // String str2 = "world";

        // System.out.println("Enter a String");
        // str2 = sc.nextLine();

        // System.out.println(str1+str2);
        // System.out.println(str1.length());
        // System.out.println(str1.toLowerCase());
        // System.out.println(str1.concat(str2));

        // System.out.println(str1.indexOf(str2));
        // System.out.println(str1.length());
        // System.out.println(str1.indexOf('o'));
        // System.out.println(str1.charAt(4));
        // System.out.println(str1.codePointBefore(47));
        // String  name = "Virat Virat Virat";
        // String name2 = "gvv";
        // System.out.println(name.compareTo(name2));
        // System.out.println(name.contains("Virat"));
        // System.out.println(name.contentEquals("Virat Virat"));
        // System.out.println(name2.copyValueOf());

        // char[] n = {'H','e','l','l','o'};
        // String new1 = "";

        // new1 =  new1.copyValueOf(n,0,5);
        // System.out.println(new1);
        // System.out.println(new1+n);
        // new1 = new1 + n[0];
        // new1 = new1 + n[1];
        // new1 = new1 + n[2];
        // new1 = new1 + n[3];
        // new1 = new1 + n[4];
        // System.out.println(new1);


        // String str1 = "       hello       ";
        
        
        // System.out.println(str1.equals(str2));
        // // System.out.println(str1.contentEquals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2));
        // System.out.println(str1.replace('R', 'p'));

        // String[] str2  = str1.split("@",3);

        // System.out.println(str2[0]);
        // System.out.println(str2[1]);
        // System.out.println(str2[2]);
        // System.out.println(str2[3]);
        // System.out.println(str2[4]);
        // System.out.println(str1.length());
        
        // String str3 = str1.trim();
        // System.out.println(str3.length());
        // System.out.println(str1);       
        // System.out.println(str3);       

        // String[] name = {"YASH","VIRAT","rOHIT"};

        // char[]  ch = {'A','b'};

        // String[] numbers = new String[25];

        // for(int i=0;i<5;i++){
        //     numbers[i]=sc.nextLine();
        // }

        // for(int i=0;i<5;i++){
        //     System.out.println(numbers[i]);
        // }
        // System.out.println(numbers.length);
        
        // char A = sc.next().charAt(0);

        // int[][] myArrays = {{1,2,3,4},{2,3,6,4}};

        int[][] arr = new int[2][4];

        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("*****************************");
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }  
    
    
    
    
    
    
    // 9130490132 -  yash deshmukh 
}