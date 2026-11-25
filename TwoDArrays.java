import java.util.Scanner; class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        //1 Task
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        ////////////
        //Task2
        int[][] nums = new int[][]{
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.println(nums[1][2]);
        nums[0][1] = 99;
        System.out.println(nums[0][1]);

        /////////////////////
        //3 Task
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
        /////////////
        //4 Task
        int odd = 0;
        var even = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 1)
                    odd += 1;
                else
                    even += 1;
            }
        }
        System.out.println("Odd nums: " + odd + "\nEven nums: " + even);

        /////////////
        //Task5
        int[][] b = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, -1, -2}
        };
        int max = b[0][0];
        int min = b[0][0];
        System.out.println("Array: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < b[i][j])
                    max = b[i][j];

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (min > b[i][j])
                    min = b[i][j];

            }
        }
        System.out.println("Maximum: "+max+"\nMinimum: "+ min);

        ///////////////
        //Task6
        /*int[][] c= new int[2][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
               c[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }*/

        ///////////////////
        //Task 7
        int colSum=0;//Task 7
        for (int i = 0; i < a.length; i++) {
            colSum=0;

            for (int j = 0; j < a[i].length; j++) {
                colSum+=a[j][i];
            }
            System.out.println("Column "+ i +": "+colSum);
        }
    }
}