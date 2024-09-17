import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array com tamanho 10 (índices de 0 a 9)
        String[] nomes = new String[10];
        
        // Leitura de 10 nomes
        for(int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }
        
        // Impressão dos valores nas posições 2, 6 e 8
        System.out.println(nomes[2]); // Valor na terceira posição
        System.out.println(nomes[6]); // Valor na sétima posição
        System.out.println(nomes[8]); // Valor na nona posição
        
        sc.close();
    }
}