public class Exercise1 {
public static void main(String[] args) {
    int n = 10;
    drawTriangle(n);
}
public static void drawTriangle (int n) {
    int i=1;
    int row = 0;
    while (i<=n){
        while(row<i){
            System.out.print("*");
            row++;
            }
        System.out.println("");
        i++;
        row =0;
        }
    }
}