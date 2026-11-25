import java.util.Scanner;
class TwoDArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 8
        int counter = 0;
        int a [][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        /*for(;;){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            for(int i = 0;i<a.length;i++){
                for(int j =0;j<a[i].length;j++){
                    if (num<a[i][j]) {
                        counter++;
                    }
                }
            }
            System.out.println("There is "+counter+" numbers greater than input number");
        }*/


        /////////////////////////////////////
        //Task 9
       /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean found = true;
        for(int i = 0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++) {
                if (num == a[i][j]) {
                    System.out.println("Find a equal number! It's row " + i + " and column is " + j);
                    found = true;
                    System.exit(0);
                } else {
                    found = false;
                }
            }
        }
        if(found!=true)
            System.out.println("Not found");*/


        //////////////////////////////////////
        //Task10
        int sumD = 0;
        for(int i=0;i< a.length;i++){
            System.out.print(a[i][i]+",");
            sumD+=a[i][i];
        }
        System.out.println(sumD);

        ///////////////////////////////////////
        //Task11
        int b [][]= {
                {1,-2,3},
                {-4,5,6},
                {7,8,-9}
        };
        System.out.println("Original:");
        for(int i = 0;i<b.length;i++){
            for(int j =0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<b.length;i++){
            for(int j =0;j<b[i].length;j++){
                if(b[i][j]<0)
                    b[i][j]=0;
            }
        }
        System.out.println("Modified:");
        for(int i = 0;i<b.length;i++){
            for(int j =0;j<b[i].length;j++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }

        ///////////////////////////////////////
        //Task12
        double studentsScores [][]={
                {70,80,75,90},
                {50,90,80,95},
                {75,80,70,75}
        };
        double maxA = studentsScores[0][0];
        double maxB = studentsScores[1][0];
        double maxC = studentsScores[2][0];
        double sumA = 0;
        double sumB = 0;
        double sumC = 0;
        for(int i = 0;i <studentsScores.length;i++){
            for(int j =0;j<studentsScores[i].length;j++){
                if(i==0){
                    sumA+=studentsScores[i][j];
                    if(maxA<studentsScores[i][j])
                        maxA=studentsScores[i][j];
                }
                else if(i==1){
                    sumB+=studentsScores[i][j];
                    if(maxB<studentsScores[i][j])
                        maxB=studentsScores[i][j];
                }
                else  {
                    sumC += studentsScores[i][j];
                    if (maxC < studentsScores[i][j])
                        maxC = studentsScores[i][j];
                }
            }
        }

        double averA = (sumA/studentsScores[0].length);
        double averB = (sumB/studentsScores[1].length);
        double averC = (sumC/studentsScores[2].length);
        double sumBig = sumA+sumB+sumC;
        double totalAver = sumBig/(studentsScores.length*studentsScores[0].length);
        System.out.println("Max score of student A = "+maxA+"  Average score of student A = "+averA+"\nMax value of student B = "+maxB+"  Average score of student B = "+averB+"\nMax value of student C = "+maxC+"  Average score of student C = "+averC);
        System.out.println("Average value of all students = "+totalAver);
        sc.close();
    }
}
