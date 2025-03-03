package prefix_sum;

import java.util.Scanner;

public class PrefixSum {

//    Cho mảng số nguyên A[] gồm N phần tử, có Q thao tác, mỗi thao tác yêu cầu các
//    bạn tăng tất cả các phần tử từ chỉ số L tới chỉ số R lên K đơn vị. Bạn hãy in ra
//    mảng sau khi thực hiện các thao tác trên.
//            Input Format
// Dòng 1 là N và Q
// Dòng 2 là N phần tử trong mảng A[]
// Q dòng tiếp theo mỗi dòng là 3 số L, R, K
//    Constraints
// 1<=N<=10^6
//             1<=Q<=10^5
//             0<=L<=R<=N-1, 0<=A[i],K<=1000
//Output Format
//    In ra mảng sau Q thao tác
//    Sample Input 0
//            7 3
//            8 5 8 9 7 6 9
//            0 5 0
//            0 5 0
//            1 5 1
//    Sample Output 0
//            8 6 9 10 8 7 9
    static void updateOperation(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr =  new int [length];
        int q = sc.nextInt();
        System.out.println("Enter elements value: ");
        for (int i = 0; i< length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Left & right $ k value: ");
        while (q > 0){

            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

            for(int i = l; i<=r; i++){
                arr[i] += k;
            }
            q--;
        }
        for(int item: arr){
            System.out.print(item + " - ");
        }

    }
    public static void main(String[] args) {

        boolean check = true;
        while(check){

            System.out.println(" Prefix sum");
            System.out.println("EX1: Total from 0 to index i");
            System.out.println("EX2: Total from index x to index y");
            System.out.println("EX3: Harvest carrots");
            System.out.println("EX4: Build difference array");
            System.out.println("EX5: Print Array with condition");
            System.out.println("EX6: Biggest sum");
            System.out.println("EX7: Make milk tea");
            System.out.println("EX8: Prefix Prefix");
            System.out.println("Press enter your choice to play algo ...");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:{

                    break;
                }
                case 2:{


                }
                case 3:{

                }
                case 4:{

                }
                case 5:{
                    System.out.println("Update Operation: ");
                    updateOperation();
                    break;

                }
                case 6:{

                }
                case 7:{

                }
                case 8:{

                }
                case 9:{
                    check = false;
                }


                default:{
                    System.out.println("make money!!!");
                }
            }
        }

    }
}
