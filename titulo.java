import java.util.Scanner;
 
public class titulo {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu titulo");
 
        long titulo = sc.nextLong();
 
        int[] vetor = new int[13];
        int[] vetor2 = new int[13];
 
        int i = 0, n = 0, mult = 2, soma = 0, div = 0, aux1 = 0;
 
        for (i = 0; i <= 12; i++) {
            vetor[i] = (int) (titulo % 10);
            vetor2[i] = (int) (titulo % 10);
            // System.out.println(vetor[i]);
            titulo /= 10;
        }
 
        for (n = 11; n > 2; n--) {
            vetor[n] *= mult;
            soma += vetor[n];
            div = soma;
            System.out.println(vetor2[n] + " x " + mult + " = " + vetor[n]);
 
            mult++;
        }
 
        System.out.println("soma: " + soma);
        div %= 11;
 
        aux1 = div;
        System.out.println("dv1: " + div);
 
        soma = 0;
 
        mult = 7;
        for (n = 3; n > 0; n--) {
            vetor[n] *= mult;
            soma += vetor[n];
            div = soma;
            System.out.println(vetor2[n] + " x " + mult + " = " + vetor[n]);
 
            mult++;
        }
 
        System.out.println("soma: " + soma);
        div %= 11;
 
        if (div == 10) {
            div = 0;
        }
 
        aux1 = div;
        System.out.println("dv2: " + div);
 
        if (aux1 > 2) {
            aux1 = 12 - aux1;
            System.out.println(aux1);
 
        } else {
 
            aux1 = 0;
            System.out.println(aux1);
        }
    }
 
}
 