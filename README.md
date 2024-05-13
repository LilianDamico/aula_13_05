/*


public class Equipamento {: Define a classe Equipamento, que é pública e pode ser acessada de qualquer lugar.

protected boolean ligado;: Declara um atributo ligado do tipo boolean, protegido (protected), o que significa que ele é visível para subclasses.

public Equipamento() {: Define um construtor padrão para a classe Equipamento.

this.ligado = false;: Inicializa o atributo ligado como false quando um novo objeto Equipamento é criado.

public void ligar() {: Define um método público ligar(), que muda o atributo ligado para true.

public void desligar() {: Define um método público desligar(), que muda o atributo ligado para false.

@Override: Indica que o método toString() está sendo sobrescrito da classe Object.

public String toString() {: Define o método toString(), que retorna uma representação em string do objeto Equipamento.

return "Equipamento está " + (ligado ? "ligado" : "desligado");: Retorna uma string indicando se o equipamento está ligado ou desligado, com base no valor do atributo ligado.




public class EquipamentoSonoro extends Equipamento {: Define a classe EquipamentoSonoro, que herda da classe Equipamento.

private boolean stereo;: Declara um atributo stereo do tipo boolean.

private int volume;: Declara um atributo volume do tipo int.

public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {: Define um construtor para a classe EquipamentoSonoro que aceita três parâmetros: ligado, stereo e volume.

super();: Chama o construtor da classe pai (Equipamento) para inicializar o objeto.

this.ligado = ligado;: Inicializa o atributo ligado da classe pai com o valor passado como parâmetro.

this.stereo = stereo;: Inicializa o atributo stereo da própria classe com o valor passado como parâmetro.

this.volume = volume;: Inicializa o atributo volume da própria classe com o valor passado como parâmetro.

public void mono() {, public void stereo() {, public void diminuirVolume() {: Define métodos para alternar entre os modos mono e stereo e diminuir o volume.

@Override: Indica que o método toString() está sendo sobrescrito da classe Equipamento.

public String toString() {: Define o método toString(), que retorna uma representação em string do objeto EquipamentoSonoro.

String estado = super.toString();: Chama o método toString() da classe pai (Equipamento) para obter o estado do equipamento.

estado += ", Modo: " + (stereo ? "Stereo" : "Mono") + ", Volume: " + volume;: Adiciona informações sobre o modo e o volume do equipamento à string de estado.

return estado;: Retorna a string de estado completa.



*/# aula_13_05
# aula_13_05
