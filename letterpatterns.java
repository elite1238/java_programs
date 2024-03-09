import java.util.Scanner;
public class letterpatterns {
    public static void main(String[] args) {
        int n,i,k,j,a=0,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n=sc.nextInt();
        int m = n/2 +1;
        sc.close();
        System.out.println("------------------------------------");
        System.out.println("Pattern of B :");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || ((i==1 || i==n) && (j!=n) ) || i==m || (j==n && i!=n && i!=1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of C:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (((i==1 || i==n) && j!=1) || (j==1 && i!=1 && i!=n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of D :");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || ((i==1 || i==n) && j!=n) || (j==n && i!=1 && i!=n) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of E:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || i==n || i==m || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of F:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || i==m || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        System.out.println("Pattern of G:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (((i==1 || i==n) && j!=1) || (j==1 && i!=1 && i!=n) || (j==n && i>=m) || (i==m && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of H:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || j==n || i==m ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of I:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || i==n || j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of J:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || (j==m && i!=n) || (i==n && j<m) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of K:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if (j==1 || (i==j && j>=m) || (i==k && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of L:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of M:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if (j==1 || j==n || (i==j &&j<=m) || (i==k && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of N:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || j==n ||(i==j)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of O:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (((i==1 || i==n) && j!=1 && j!=n) || ((j==1 || j==n) && i!=1 && i!=n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        System.out.println("Pattern of P:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || ((i==1 || i==m) && j!=n) || (j==n && i!=1 && i<m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of Q:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (((i==2 || i==n-1) && j>2 && j<n-1) || ((j==2 || j==n-1) && i>2 && i<n-1) || (i==j && j>m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of R:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (j==1 || ((i==1 || i==m) && j!=n) || (j==n && i!=1 && i<m) || (i==j && j>m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of S:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || i==n || i==m || (j==1 && i<=m) || (j==n && i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of T:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if (i==1 || j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of U:");
        for (i=1 ; i<=n ; i++){
            for (j=1 ; j<=n ; j++){
                if  (((j==1 || j==n) && i!=n) || (i==n && j!=1 && j!=n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of V:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if  ((j<=m && i==j) || (j>=m && i==k)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of W:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if  (j==1 || j==n || (i==j && i>=m) || (i==k && i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of x :");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if (i==j || i==k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of Y:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if  ((i==j && j<=m) || (i==k && j>=m) || (j==m && i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Pattern of Z:");
        for (i=1 ; i<=n ; i++){
            for (j=1,k=n ; j<=n ; j++,k--){
                if  (i==1 || i==n || i==k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}