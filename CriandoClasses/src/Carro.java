public class Carro {
    String modelo;
    String cor;
    String marca;
    String tipo;
    String placa;
    int anoFabrica;
    int anoModelo;
    void mostrarCarro(){
        IO.println("Modelo: " + modelo);
        IO.println("Cor: " + cor);
        IO.println("Marca: " + marca);
        IO.println("Tipo: " + tipo);
        IO.println("Placa: " + placa);
        IO.println("Ano Fabrica: " + anoFabrica);
        IO.println("Ano Modelo: " + anoModelo);

    }
}
