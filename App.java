    import java.util.Scanner;
    public class App {
        public static void main(String[] args) throws Exception {
        int n;
        Scanner teclado =new Scanner (System.in);   
        System.out.println("informe o numero");
        n = teclado.nextInt();
        teclado.close();
        
        imprimenumeros(n);
    }
         public static void imprimenumeros(int n) {
        int c, d;
        for (c = 1; c <= n; c++){
        for (d = 0; d < c; d++) {
        System.out.print(c +" ");
        }
        System.out.println(" ");

    }
    }
    }
