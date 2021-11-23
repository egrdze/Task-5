package cs.vsu.ru.lyashenko_e_v;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a height: ");
        patternLetter(readValue());
    }


    // - ряды(i)
    // - столбцы(j)
    public static void patternLetter(int h) {
        int m = 0;
        for (int i = 0; i < h; i++)
        {
            int j = 0;
            while (j <= i){
                if (m % 2 == 0){
                    System.out.print("A");
                }
                if (m % 2 == 1){
                    System.out.print("B");
                }
                m = m + 1;
                j = j + 1;
            }
            System.out.println();
        }
    }
    public static int readValue(){
        Scanner scanner = new Scanner(System.in);
        int height =  scanner.nextInt();

        // check error
        if (height <= 1) {
            System.out.println("Error, this value cannot be applied. Change the value");
            System.exit(1);
        }
        return height;
    }

}




