

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);

        System.out.println("|      MENU DE OPÇÕES    |");
        System.out.println("|        Opção 1         |");
        System.out.println("|        Opção 2         |");
        System.out.println("|        Opção 3 - sair  |");
        System.out.println();
        System.out.println("Por favor, selecione a opção desejada.");
        int opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a primeira opção.");
                break;
            case 2:
                System.out.println("Você escolheu a segunda opção.");
                break;
            case 3:
                System.out.println("Opção 3 confirmada, programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println();

        while(opcao < 3){
            System.out.println("|      MENU DE OPÇÕES    |");
            System.out.println("|        Opção 1         |");
            System.out.println("|        Opção 2         |");
            System.out.println("|        Opção 3 - sair  |");
            System.out.println();
            System.out.println("Por favor, selecione a opção desejada.");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção.");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção.");
                    break;
                case 3:
                    System.out.println("Opção 3 confirmada, programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        }

    }

}