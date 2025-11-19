//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Garrafa garrafa1 = new Garrafa();
    garrafa1.material = "plastico";
    garrafa1.cor = "Azul";
    garrafa1.volume = 750;
    garrafa1.termica = false ;

    garrafa1.encher();
    garrafa1.abrir();
    garrafa1.Caracteristica();

    IO.println();

    IO.println();

    Garrafa garrafa2 = new Garrafa();
    garrafa2.material = "Metal";
    garrafa2.cor = "Cinza";
    garrafa2.volume = 150;
    garrafa2.termica = true ;

    IO.println();

    garrafa2.Caracteristica();
    IO.println();
    IO.println("Os métodos dela:");
    garrafa2.abrir();
    garrafa2.fechar();
    garrafa2.encher();
    garrafa2.esvaziar();
    IO.println("");
    Garrafa garrafa3 = new Garrafa();
    garrafa3.material = "Vidro";
    garrafa3.cor = "Transparente";
    garrafa3.volume = 500;
    garrafa3.termica = false ;
    IO.println("");
    garrafa3.Caracteristica();
    IO.println("");
    IO.println("Os métodos dela:");
    garrafa3.abrir();
    garrafa3.fechar();
    garrafa3.encher();
    garrafa3.esvaziar();
}
