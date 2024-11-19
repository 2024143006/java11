package day11_array;

public class Sungjuk {

    public static void main(String[] args) {
        
        String[] names = {"tom", "ann", "jhon", "kiwook", "wookki", "taehyeon"};
        int[] kor = {50, 30, 90, 55, 66, 77};
        int[] math = {33, 44, 55, 99, 67, 88};
        
        int[] sum = new int[6];
        int[] avg = new int[6];
        
        // 총점 및 평균 계산
        for (int i = 0; i < names.length; i++) {
            sum[i] = kor[i] + math[i];
            avg[i] = sum[i] / 2;
        }
        
        // 학생별 점수 출력
        System.out.println(" no   name     kor   math   total   avg");
        System.out.println("=======================================");
        for (int i = 0; i < names.length; i++) {
            System.out.printf(
                    "%-3d   %-8s %3d   %3d    %3d    %3d\n",
                    (i + 1), names[i], kor[i], math[i], sum[i], avg[i]);
        }
        
        // 전체 총합 및 평균 계산
        int mathsum = 0, korsum = 0, totalsum = 0;
        for (int i = 0; i < 6; i++) {
            mathsum += math[i];
            korsum += kor[i];
            totalsum += sum[i];
        }
        
        System.out.println("---------------------------------------");
        System.out.printf("전체 총점 :  %3d   %3d    %3d\n", korsum, mathsum, totalsum);
        System.out.printf("전체 평균 : %3d\n", totalsum / 6);
    }
}
