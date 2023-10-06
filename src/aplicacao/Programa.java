package aplicacao;

import java.util.Scanner;
import entidades.SalaCinema;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SalaCinema cinema = new SalaCinema(12, 14);

        System.out.println("\nBem-vindo ao Cinema!");
        cinema.mostrarMapaAssentos();

        while (true) {
            System.out.print("\n ##--Menu de reserva de assentos cinema--##\n");
            System.out.println("|-----------------------------------------|");
            System.out.println("| Opção 1 - Mostrar assentos              |");
            System.out.println("| Opção 2 - Reservar assento              |");
            System.out.println("| Opção 3 - Desocupar assento             |");
            System.out.println("| Opção 4 - Assentos disponíveis/ocupados |");
            System.out.println("| Opção 5 - (Sair)                        |");
            System.out.println("|-----------------------------------------|");
            System.out.print("Digite uma opção: ");

            int opcao = sc.nextInt();

            if (opcao == 5) {
                System.out.println(" ");
                System.out.print("\nJá vai? :(");
                sc.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println(" ");
                    System.out.print("\nMapa de Assentos");
                    cinema.mostrarMapaAssentos();
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.print("\nReservar Assento:\n");
                    System.out.print("Informe a letra da fileira (A a L): ");

                    char inputFileira = sc.next().charAt(0);
                    int valorInt;

                    if (Character.isUpperCase(inputFileira)) {
                        valorInt = inputFileira - 'A' + 1;
                    } else if (Character.isLowerCase(inputFileira)) {
                        valorInt = inputFileira - 'a' + 1;
                    } else {
                        valorInt = -1;
                    }

                    System.out.print("Informe o número da coluna (1 a 14): ");
                    int inputColuna = sc.nextInt();
                    cinema.ocuparAssento(valorInt, inputColuna);
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.print("\nDesocupar Assento:\n");
                    System.out.print("Informe a letra da fileira (A a L): ");
                    int valorInt2;
                    int dFileira = sc.next().charAt(0);
                    if (Character.isUpperCase(dFileira)) {
                        valorInt2 = dFileira - 'A' + 1;
                    } else if (Character.isLowerCase(dFileira)) {
                        valorInt2 = dFileira - 'a' + 1;
                    } else {
                        valorInt2 = -1;
                    }

                    System.out.print("Informe o número da coluna (1 a 14): ");
                    int dColuna = sc.nextInt();
                    cinema.desocuparAssento(valorInt2, dColuna);
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("Assentos livres: " +  cinema.contaAssentosLivres());
                    System.out.println("Assentos ocupados: " + cinema.contarAssentosOcupados());
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
