package entidades;

public class SalaCinema {
    private Assento[][] matrizAssentos;

    public SalaCinema(int fileira, int coluna) {
        matrizAssentos = new Assento[fileira][coluna];
        for (int f = 0; f < fileira; f++) {
            for (int c = 0; c < coluna; c++) {
                matrizAssentos[f][c] = new Assento();
            }
        }
    }

    public boolean ocuparAssento(int fileira, int coluna) {
        if (assentoValido(fileira, coluna)) {
            Assento assento = matrizAssentos[fileira - 1][coluna - 1];
            if (!assento.estaOcupado()) {
                assento.ocupar();
                System.out.println("Assento ocupado com sucesso");
                return true;
            } else {
                System.out.println("* Assento já está ocupado");
            }
        } else {
            System.out.println(" * Assento inválido");
        }
        return false;
    }

    public void desocuparAssento(int fileira, int coluna) {
        if (assentoValido(fileira, coluna)) {
            matrizAssentos[fileira - 1][coluna - 1].desocupar();
            System.out.println("\nAssento desocupado com sucesso");
        } else {
            System.out.println("* Assento inválido");
        }
    }

    public int contaAssentosLivres() {
        int assentosLivres = 0;
        for (int f = 0; f < matrizAssentos.length; f++) {
            for (int c = 0; c < matrizAssentos[0].length; c++) {
                if (!matrizAssentos[f][c].estaOcupado()) {
                    assentosLivres++;
                }
            }
        }
        return assentosLivres;
    }

    public int contarAssentosOcupados() {
        int assentosOcupados = 0;
        for (int f = 0; f < matrizAssentos.length; f++) {
            for (int c = 0; c < matrizAssentos[0].length; c++) {
                if (matrizAssentos[f][c].estaOcupado()) {
                    assentosOcupados++;
                }
            }
        }
        return assentosOcupados;
    }

    public void mostrarMapaAssentos() {
            System.out.println("\n   ==========================================================" +
                    "\n                              TELA                     \n" +
                    "   ==========================================================\n");

            //imprime letras
            for (int f = 0; f < matrizAssentos.length; f++) {
                char letraFileira = (char) ('A' + f);
                System.out.print(letraFileira + "  ");

                //imprime matriz
                for (int c = 0; c < matrizAssentos[0].length; c++) {
                    if (c == 7) System.out.print("   ");
                    System.out.print(matrizAssentos[f][c] + " ");
                }
                System.out.println();
            }

            //imprime números da coluna
            for (int n = 0; n < matrizAssentos[0].length; n++) {
                if (n == 7) {
                    System.out.print("    ");
                }
                if (n < 10) {
                    System.out.print("   ");
                    System.out.print(n + 1);
                } else if (n < 14) {
                    System.out.print("  ");
                    System.out.print(n + 1);
                }
            }
        System.out.println(" ");
    }

    private boolean assentoValido(int fileira, int coluna) {
        return fileira >= 1 && fileira <= matrizAssentos.length && coluna >= 1 && coluna <= matrizAssentos[0].length;
    }
}
