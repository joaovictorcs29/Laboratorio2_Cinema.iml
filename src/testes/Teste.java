package testes;

import entidades.SalaCinema;

public class Teste {
    public static void main(String[] args) {

        SalaCinema cinema = new SalaCinema(12, 14);
        cinema.mostrarMapaAssentos();
        cinema.ocuparAssento(3, 5);
        cinema.ocuparAssento(6,13 );
        cinema.mostrarMapaAssentos();
        cinema.desocuparAssento(3, 5);
        cinema.mostrarMapaAssentos();
        System.out.println(" ");
        System.out.println("Assentos livres: " +  cinema.contaAssentosLivres());
        System.out.println("Assentos ocupados: " + cinema.contarAssentosOcupados());
    }
}
