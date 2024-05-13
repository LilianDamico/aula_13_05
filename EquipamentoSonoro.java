public class EquipamentoSonoro extends Equipamento {
    private boolean stereo;
    private int volume;

    // Construtor
    public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
        super(); // Chama o construtor da superclasse Equipamento
        this.ligado = ligado;
        this.stereo = stereo;
        this.volume = volume;
    }

    // Método para alternar para modo mono
    public void mono() {
        stereo = false;
    }

    // Método para alternar para modo stereo
    public void stereo() {
        stereo = true;
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    // Método para obter uma representação em string do estado atual do equipamento sonoro
    @Override
    public String toString() {
        String estado = super.toString(); // Chama o método toString da superclasse Equipamento
        estado += ", Modo: " + (stereo ? "Stereo" : "Mono") + ", Volume: " + volume;
        return estado;
    }

    public static void main(String[] args) {
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(true, true, 10);
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Stereo, Volume: 10"

        equipamentoSonoro.mono();
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Mono, Volume: 10"

        equipamentoSonoro.diminuirVolume();
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Mono, Volume: 9"
    }
}

