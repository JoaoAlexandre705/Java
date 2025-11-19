public class Garrafa {
    String material;
    String cor;
    int volume;
    boolean termica;
    boolean abrir = false;
    boolean encher = false;




    void Caracteristica() {
        IO.println("O material da garrafa é " + material);
        IO.println("A cor da garrafa é " + cor );
        IO.println("A garrafa é termica " + termica);
        IO.println("O volume da garrafa é " + volume+"ml");
        IO.println("A garrafa esta aberta?" + abrir);
        IO.println("A garrafa esta encher?" + encher);
    }




    void abrir() {
        abrir = true;
    }
    void fechar() {
        abrir = false;
    }
    void encher() {
        if (abrir == false) {
            IO.println("A garrafa esta fechada");
        }
        else {
            encher = true;
            IO.println("A garrafa esta cheia");

        }
    }
    void esvaziar() {
        encher = false;
    }

}
