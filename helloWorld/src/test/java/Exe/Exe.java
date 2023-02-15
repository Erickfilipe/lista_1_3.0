package Exe;


import java.util.Scanner;

import static java.lang.System.out;

public class Exe {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        double md;
        Scanner input = new Scanner(System.in);

        out.println("informe a primeira nota");
        n1 = input.nextDouble();

        out.println("informe a segunda nota");
        n2 = input.nextDouble();

        out.println("informe a terceira nota");
        n3 = input.nextDouble();

        out.println("informe a quarta nota");
        n4 = input.nextDouble();

        md = (n1 + n2 + n3 + n4) / 4;

        if (md >= 5{
            System.out.println("Aprovado, parabéns);


        }else {
            System.out.println("Reprovado,ganhou uma passagem para jogar no vasco,vacilão.");
        }
         System.out.println("média:  " + md);
          input.close();
        }
    }
