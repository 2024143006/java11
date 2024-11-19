package day11_array;

import java.util.Scanner;

public class CharArrScan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. 배열에 키보드로 받은 문자를 입력하시오.
        char[] charArr = new char[10];
        
        System.out.println("문자를 입력하세요. 'r' 또는 'R'을 입력하면 종료됩니다.");

        int index = 0;
        while (index < charArr.length) {
            System.out.print("입력: ");
            char input = scan.next().charAt(0);

            // 2. while문으로 받아오되 'r' OR 'R'일 때 빠져나오시오.
            if (input == 'r' || input == 'R') {
                System.out.println("종료 문자 'r' 또는 'R'을 입력하였습니다. 프로그램을 종료합니다.");
                break;
            }
            
            charArr[index] = input;
            index++;
        }

        // 입력된 문자 배열 출력
        System.out.println("입력된 문자 배열:");
        for (int i = 0; i < index; i++) {
            System.out.print(charArr[i] + " ");
        }
        
        scan.close(); // Scanner 닫기
    }
}
