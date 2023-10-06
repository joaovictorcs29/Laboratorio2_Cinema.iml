package entidades;

public class Assento {

    private boolean ocupado;

    public Assento() {
        this.ocupado = false;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void ocupar() {
        ocupado = true;
    }

    public void desocupar() {
        ocupado = false;
    }

    @Override
    public String toString() {
        return ocupado ? "[X]" : "[ ]";
    }
}

