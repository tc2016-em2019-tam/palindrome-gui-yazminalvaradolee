package com.Yasmin;

import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        char[] caracteres = entrada.toCharArray();
        char[] volteado = new char[caracteres.length];
        int num = 0;
        for(int i = caracteres.length; i>0; i--){
            volteado[num] = caracteres[i-1];
            num++;
        }
        String volteado2 = new String(volteado);
        if(entrada.equalsIgnoreCase(volteado2)){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }

}

