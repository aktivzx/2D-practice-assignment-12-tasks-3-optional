public class Optional2D {
    public static void main(String[] args) {
        //Task A
        int b[][] = new int[][]{
                {4, 2, 0, 6},
                {2, 3, 1, 2},
                {0, 9, 8, 1}
        };
        int row = 0;
        double sumA = 0;
        double sumB = 0;
        double sumC = 0;
        double largestSum = 0;
        for(int i = 0;i < b.length;i++){
            for(int j =0;j<b[i].length;j++){
                if(i==0)
                    sumA+=b[i][j];
                else if(i==1)
                    sumB+=b[i][j];
                else
                    sumC += b[i][j];
            }
        }

        if(sumA>sumB && sumA>sumC) {
            largestSum = sumA;
            row = 1;
        }
        else if(sumB>sumA && sumB>sumC) {
            largestSum = sumB;
            row=2;
        }
        if(sumC>sumB && sumC>sumA) {
            largestSum = sumC;
            row=3;
        }
        System.out.println("The largest sum is "+largestSum+" a it's row is "+row);


        /////////////////////////////
        //Task B
        int[][] t = new int[2][3];
        for(int i = 0;i < t.length;i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
        t = new int[3][2];
        for(int i = 0;i < t.length;i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }

        ////////////////////////
        //Task C
        int [][] kal = {
                {1,2,3},
                {4,5,6}
        };
        int [][] mocha = {
                {7,8,9},
                {0,-1,-2}
        };
        int [][] blevota = new int[2][3];
        for(int i = 0;i < kal.length;i++) {
            for (int j = 0; j < kal[i].length; j++) {
                blevota[i][j]=kal[i][j]+mocha[i][j];
            }
        }
        for(int i = 0;i < kal.length;i++) {
            for (int j = 0; j < kal[i].length; j++) {
                System.out.print(blevota[i][j]+" ");
            }
            System.out.println();
        }
        int [][]a=new int[2][4];
        System.out.println(a.length+" "+ a[0].length);
    }
}