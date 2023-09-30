public class NumberTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int sum = 0;
        
        for (int i = 1; i <= rows; i++) {
            sum += 2 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * j);
                if (j < i) {
                    System.out.print("+");
                }
            }
   
            System.out.println();
        }
    }
}