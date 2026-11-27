import java.util.Scanner;
class ArraysClassroomTasks2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Task 11
        int [] nums11 = {1,2,3,4,5,6,7,8};
        int sumEven=0;
        System.out.println("Task11");
        System.out.print("Numbers: ");
        for(int numbers: nums11){
            System.out.print(numbers + " ");
        }
        System.out.println();
        for(int i = 1;i< nums11.length;i++){
            sumEven+=nums11[i];
            i++;
        }
        System.out.println("Sum: "+sumEven);
        System.out.println("\n");

        //////////////////////////////////////
        //Task 12
        int [] nums12 = {2,1,6,7,3,0,1,3,12};
        int three = 0;
        System.out.println("Task12");
        System.out.print("Numbers: ");
        for(int numbers: nums12){
            System.out.print(numbers + " ");
        }
        System.out.println();
        for(int i = 0;i< nums12.length;i++){
            if(nums12[i]%3==0)
                three+=1;
        }
        System.out.println("Count: "+three);
        System.out.println("\n");

        ////////////////////////////////
        //Task 13
        /*int [] nums13 = {2,5,9,1,2,0,7,8};
        boolean found = false;
        System.out.println("Task13");
        System.out.print("Numbers: ");
        for(int numbers: nums13){
            System.out.print(numbers + " ");
        }
        System.out.print(" search: ");
        int index = sc.nextInt();
        for(int i = 0;i< nums13.length;i++){
            if(index == nums13[i]) {
                System.out.println("Index: " + i);
                found=true;
            }
        }
        if(found!=true)
            System.out.println("Not found");
        System.out.println("\n");*/

        ////////////////////////////////
        //Task 14
        /*int [] nums14 = {3,6,5,8,4,9,0};
        System.out.println("Task14");
        System.out.print("Numbers: ");
        for(int numbers: nums14){
            System.out.print(numbers + " ");
        }
        System.out.print(" limit: ");
        int limit = sc.nextInt();
        System.out.print("Modified: ");
        for(int i = 0;i< nums14.length;i++) {
            if(nums14[i]<=limit)
                System.out.print(nums14[i]+" ");
        }
        System.out.println("\n");*/

        //////////////////////////////////////
        //Task 15
        int [] nums15 = {10,20,15,5,25};
        int sum = 0;
        System.out.println("Task15");
        System.out.print("Numbers: ");
        for(int numbers: nums15){
            System.out.print(numbers + " ");
        }
        for(int i = 0;i< nums15.length;i++){
            sum+=nums15[i];
        }
        int average = sum/ nums15.length;
        System.out.print("Total: "+ sum);
        System.out.print(" average: "+ average);
        System.out.println("\n");

        //////////////////////////////////////
        //Task 16
        /*int [] nums18 = new int[6];
        int pass = 0;
        System.out.println("Task16");
        for(int i = 0;i< nums18.length;i++){
            for(;;) {
                System.out.println("Enter " + (i + 1) + " score(0-100): ");
                nums18[i] = sc.nextInt();
                if(nums18[i]>100 || nums18[i]<=0)
                    System.out.println("Invalid score! ");
                else
                    break;
            }
            if (nums18[i] >= 60)
                pass += 1;
        }
        System.out.print("Scores: ");
        for(int numbers: nums18){
            System.out.print(numbers + " ");
        }
        System.out.print("-> Passed: "+ pass);
        System.out.println("\n");*/

        /////////////////////////////////
        //Task 17
        int [] nums17 = {1,2,3,4,5,6};
        int [] nums17Doubled = new int[6];
        System.out.println("Task17");
        System.out.print("Numbers: ");
        for(int numbers: nums17){
            System.out.print(numbers + " ");
        }
        System.out.print("\nNumbers doubled: ");
        for(int i = 0;i< nums17.length;i++){
            nums17Doubled[i]=nums17[i]*2;
            System.out.print(nums17Doubled[i]+ " ");
        }
        System.out.println("\n");

        //////////////////////////////////////
        //Task 18
        int [] nums18 = {1,6,4,0};
        int [] nums18second = {3,6,4,1};
        int sumPos = 0;
        System.out.println("Task18");
        System.out.print("Numbers: ");
        for(int numbers: nums18){
            System.out.print(numbers + " ");
        }
        System.out.print("\nSecond numbers: ");
        for(int numbers: nums18second){
            System.out.print(numbers + " ");
        }
        for(int i = 0;i< nums18.length;i++){
            if(nums18[i]==nums18second[i])
                sumPos+=1;
        }
        System.out.print("Matches "+sumPos);
        System.out.println("\n");

        /////////////////////////////////
        //Task 19
        int [][] nums19 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sumM=0;
        System.out.println("Task19");
        System.out.println("Matrix:");
        for(int i = 0;i<nums19.length;i++){
            for(int j =0;j<nums19[i].length;j++){
                System.out.print(nums19[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<nums19.length;i++){
            sumM=0;
            for(int j =0;j<nums19[i].length;j++){
                sumM+=nums19[i][j];
            }
            System.out.print(sumM + " ");
        }
        System.out.println("\n");

        ///////////////////////////
        //Task 20
        int [][] nums20 = {
                {2,8,3,1},
                {9,4,6,5},
                {7,0,11,2}
        };
        int largest = nums20[0][0];
        System.out.println("Task20");
        System.out.println("Matrix:");
        for(int i = 0;i<nums20.length;i++){
            for(int j =0;j<nums20[i].length;j++){
                System.out.print(nums20[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<nums20.length;i++){
            largest =0;
            for(int j =0;j<nums20[i].length;j++){
                if(largest<nums20[i][j])
                    largest=nums20[i][j];
            }
            System.out.print(largest + " ");
        }
        System.out.println("\n");

    }
}
