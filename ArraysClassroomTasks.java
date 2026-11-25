import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
class ArraysClassroomTasks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Task 1
        int [] nums = {1,2,3,4,5,6,7,8};
        System.out.println("Task1");
        System.out.print("\nNumbers: ");
        for(int numbers: nums){
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.print("Modified: ");
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+ "   ");
            i++;
        }
        System.out.println("\n");

        //////////////////////////////
        //Task 2
        int nums2[]={3,-2,0,7,-4,5,3,-5,0,1};
        int sum = 0;
        System.out.print("Task2");
        System.out.print("\nNumbers: ");
        for(int numbers: nums2){
            System.out.print(numbers+ " ");
        }
        for(int i = 0;i< nums2.length;i++){
            if(nums2[i]>0)
                sum+=nums2[i];
        }
        System.out.print("\nSum of array: "+ sum);
        System.out.println("\n");

        ////////////////////////////////
        //Task3
        int []nums3 = {90,20,15,25,2,3,21,30};
        int count = 0;
        System.out.println("Task3");
        System.out.print("\nNumbers: ");
        for(int numbers: nums3){
            System.out.print(numbers+ " ");
        }
        for(int i = 0;i< nums3.length;i++){
            if(nums3[i]>=10 && nums3[i]<=20)
                count+=1;
        }
        System.out.println("\nCount: "+count);
        System.out.println("\n");

        ///////////////////////////////////
        //Task4
        int nums4 []={3,1,9,0,5,-2,10};
        int min = 0;
        System.out.println("Task4");
        System.out.print("\nNumbers: ");
        for(int numbers: nums4){
            System.out.print(numbers+ " ");
        }
        for(int i = 1;i< nums4.length;i++){
            if(nums4[min]>nums4[i])
                min = i;
            else
                continue;
        }
        System.out.println("\nMin: "+ nums4[min]+", Index: "+ min);
        System.out.println("\n");

        /////////////////////////////////////
        //Task5
        int nums5 [] = {1,7,-3,10,0,3};
        System.out.println("Task5");
        System.out.print("Original: ");
        for(int numbers: nums5){
            System.out.print(numbers + " ");
        }
        System.out.print("\nModified: ");
        for(int numbers: nums5){
            System.out.print(numbers+5 + " ");
        }
        System.out.println("\n");

        ///////////////////////////////////
        //Task6
        int nums6 []= {5,8,1,-9,0,2,5,2};
        int count2 = 0;
        System.out.println("Task6");
        System.out.print("\nNumbers: ");
        for(int numbers: nums6){
            System.out.print(numbers+ " ");
        }
        for(int i = 1;i< nums6.length;i++){
            if(nums6[0]<nums6[i]){
                count2 +=1;
            }
        }
        System.out.println("\nCount: "+count2);
        System.out.println("\n");

        ////////////////////////////////////////////
        //Task7
        int []nums7 = {2,11,3,-1,10,3,9,1};
        int index = 0;
        int count3 = 0;
        System.out.println("Task7");
        System.out.print("Numbers:");
        for(int numbers: nums7){
            System.out.print(numbers+ " ");
        }
        for(int i = 0;i< nums7.length;i++){
            if(nums7[i]%2==0){
                index++;
            }
        }
        int [] evenNumS = new int[index];
        for(int i = 0;i< nums7.length;i++){
            if(nums7[i]%2==0){
                evenNumS[count3]=nums7[i];
                count3++;
            }
        }
        System.out.print("\nEven numbers: ");
        for(int numbers: evenNumS){
            System.out.print(numbers+ " ");
        }
        System.out.println("\n");

        //////////////////////////////////////
        //Task8
        int []nums8={12,30,23,21,1,10,36};
        int sum2=0;
        int count4=0;
        System.out.println("Task8");
        System.out.print("Numbers: ");
        for(int numbers: nums8){
            System.out.print(numbers+ " ");
        }
        for(int i = 0;i< nums8.length;i++){
            sum2+=nums8[i];
        }
        int average = sum2/ nums8.length;
        for(int i = 0;i< nums8.length;i++){
            if(nums8[i]>average)
                count4++;
        }
        System.out.print("\nAverage: "+average+" above: "+ count4);
        System.out.println("\n");

        /////////////////////////////////////
        //Task9
        int[][]nums9 = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Task9");
        for(int i=0;i<nums9.length;i++){
            for(int j=0;j < nums9[i].length; j++){
                System.out.print(nums9[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        ///////////////////////////////////
        //Task10
        int[][]nums10={
                {2,6,1},
                {0,4,9},
                {1,0,0}
        };
        int zero =0;
        System.out.print("Task10");
        System.out.println("\nMatrix 3x3");
        for(int i=0;i<nums10.length;i++){
            for(int j=0;j < nums10[i].length; j++){
                System.out.print(nums10[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<nums10.length;i++) {
            for (int j = 0; j < nums10[i].length; j++) {
                if(nums10[i][j]==0)
                    zero+=1;
            }
        }
        System.out.println("Zeros: " + zero);
    }
}
