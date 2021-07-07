package Modulo2;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner imc = new Scanner(System.in);
        //IMC	CLASSIFICAÇÃO	OBESIDADE (GRAU)
        //MENOR QUE 18,5	MAGREZA	0
        //ENTRE 18,5 E 24,9	NORMAL	0
        //ENTRE 25,0 E 29,9	SOBREPESO	I
        //ENTRE 30,0 E 39,9	OBESIDADE	II
        //MAIOR QUE 40,0	OBESIDADE GRAVE	III
        System.out.println("----------CÁLCULO DE IMC----------");

        System.out.println("Digite seu peso em Kg.");
        double peso = imc.nextDouble();
        System.out.println("Certo, agora entre com o valor da sua altura.");
        double altura = imc.nextDouble();
        double calculo = peso / (altura * altura);

        System.out.println("O valor do seu IMC é de: "+ calculo);
        System.out.println();
        System.out.println("--------------------------------------");

            if(calculo < 18.5){
                System.out.println("Você está abaixo do peso, cuidado");
            }
            if(calculo > 18.5 && calculo < 25) {
                System.out.println("Você está na faixa de peso adequado.");
            }
            if(calculo > 25.0 && calculo < 30){
                System.out.println("Você está na faixa de sobrepeso grau I");
            }
            if(calculo > 30 && calculo < 40){
                System.out.println("Você está na faixa de obesidade grau II");
            }
            if(calculo > 40){
                System.out.println("Você está na faixa de obesidade grau III");
            }

        System.out.println("--------------------------------------");
    }
}
