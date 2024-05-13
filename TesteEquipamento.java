public class TesteEquipamento {
    public static void main(String[] args) {
        // Criando um equipamento simples
        Equipamento equipamento = new Equipamento();
        
        // Testando o equipamento
        System.out.println("Estado do equipamento:");
        System.out.println(equipamento); // Deve imprimir "Equipamento está desligado"

        equipamento.ligar();
        System.out.println("\nLigando o equipamento...");
        System.out.println(equipamento); // Deve imprimir "Equipamento está ligado"

        equipamento.desligar();
        System.out.println("\nDesligando o equipamento...");
        System.out.println(equipamento); // Deve imprimir "Equipamento está desligado"

        // Criando um equipamento sonoro
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(true, true, 50);
        
        // Testando o equipamento sonoro
        System.out.println("\nEstado do equipamento sonoro:");
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Stereo, Volume: 50"

        equipamentoSonoro.mono();
        System.out.println("\nAlterando para modo mono...");
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Mono, Volume: 50"

        equipamentoSonoro.diminuirVolume();
        System.out.println("\nDiminuindo o volume...");
        System.out.println(equipamentoSonoro); // Deve imprimir "Equipamento está ligado, Modo: Mono, Volume: 49"
    }
}
