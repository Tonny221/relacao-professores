// import src.*;
import src.utils.Relacao;

public class Main {
    public static void main(String[] args) {
        // Atribuicao atr = new Atribuicao("./src/data/relacao.txt");
        Relacao rel = new Relacao("./src/data/professores.txt", "./src/data/disciplinas.txt", "./src/data/relacao.txt");

        rel.gerarListaDeAtribuicoes();
    }
}