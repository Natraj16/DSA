package Pattern;

public class Main {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        //for(int i=1;i<=n;i++){
        //for(int j=1;j<=n-1-i;j++)

        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        static void pattern10(int n){
        for(int row=0;row<n;row++){
            int column=row;
            int spaces=n-column;
            for(int col=0;col<spaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=column;col++){
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void pattern28(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            int noofSpaces=n-totalColsinRow;
            for (int col = 0; col < noofSpaces; col++) {
                System.out.print(" ");
            }

            for(int col=0;col<totalColsinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row=0;row<n;row++){
            int spaces=n-row;
            for(int col=0;col<spaces;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    static void pattern11(int n){
        for(int row=n;row>0;row--){
            int column=row;
            int spaces=n-column;
            for(int col=spaces;col>0;col--){
                System.out.print(" ");
            }
            for(int col=column;col>0;col--){
                System.out.print("* ");

            }
            System.out.println();

        }
    }
//    static void pattern12(int n){
//        for(int row=2*n-1;row>0;row--){
//            int column=row;
//            int totalColumn=row>n?row:2*n-row;
//            int spaces=n-column;
//            for(int col=spaces;col>0;col--){
//                System.out.print(" ");
//            }
//            for(int col=column;col>0;col--){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//    }
    static void pattern30(int n){
        for (int row=1;row<=n;row++){

            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);

            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
    static void pattern8(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print("*");
            }
            for(int col=2;col<=row;col++){
                System.out.print("*");}
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row=1;row<=2*n;row++){
            int c=row > n ? 2 * n - row : row;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col);

            }
            for(int col=2;col<=c;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
    static void pattern31(int n){
        for(int row=1;row<2*n-1;row++){
//            int totalcolumn=row>n?row

                    for(int col=1;col<2*n-1;col++){
                        System.out.print(n);
                    }
                    n--;
            System.out.println();
        }
    }
}
