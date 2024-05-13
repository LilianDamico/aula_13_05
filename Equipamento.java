public class Equipamento {
    protected boolean ligado;

    // Construtor
    public Equipamento() {
        this.ligado = false; // Equipamento começa desligado por padrão
    }

    // Método para ligar o equipamento
    public void ligar() {
        this.ligado = true;
    }

    // Método para desligar o equipamento
    public void desligar() {
        this.ligado = false;
    }

    // Método para obter o estado atual do equipamento (ligado/desligado)
    @Override
    public String toString() {
        return "Equipamento está " + (ligado ? "ligado" : "desligado");
    }
}


/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */