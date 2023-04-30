package src.utils;
import java.io.*;
import src.*;
import java.util.*;

public class Relacao {
    String caminhoProfessores;
    String caminhoDisciplinas;
    String caminhoAtribuicao;

    ArrayList<Professor> listaDeProfessores = new ArrayList<Professor>();
    ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<Disciplina>();
    ArrayList<Atribuicao> listaDeAtribuicoes = new ArrayList<Atribuicao>();
    
    public class Relacionado {
        
    }
 
    public Relacao(String arquivoProfessor, String arquivoDisciplina, String arquivoAtribuicao) {
        this.caminhoProfessores = arquivoProfessor;
        this.caminhoDisciplinas = arquivoDisciplina;
        this.caminhoAtribuicao = arquivoAtribuicao;
    }

    public ArrayList<Professor> gerarListaDeProfessores() {
        try {
            FileReader arquivo = new FileReader(this.caminhoProfessores);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;
            // System.out.println(linha);

            while((linha = leitor.readLine()) != null) {
                listaDeProfessores.add(new Professor(linha));
                // System.out.println(linha);
            }

            // for (Professor elemento: listaDeProfessores) {
            //     System.out.println(elemento.nome);
            //     System.out.println(elemento.matricula);
            // }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro! " + e.getMessage());
        }
        return this.listaDeProfessores;
    }

    public ArrayList<Disciplina> gerarListaDeDisciplinas() {
        try {
            FileReader arquivo = new FileReader(this.caminhoDisciplinas);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            while ((linha = leitor.readLine()) != null) {
                listaDeDisciplinas.add(new Disciplina(linha));
                // System.out.println(linha);
            }

            // for (Disciplina elemento : listaDeDisciplinas) {
            //     System.out.println(elemento.nome);
            //     System.out.println(elemento.codigo);
            //     System.out.println(elemento.cargaHoraria);
            // }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro! " + e.getMessage());
        }
        
        return this.listaDeDisciplinas;
    }

    public ArrayList<Atribuicao> gerarListaDeAtribuicoes() {
        try {
            FileReader arquivo = new FileReader(this.caminhoAtribuicao);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;
            
            while ((linha = leitor.readLine()) != null) {
                listaDeAtribuicoes.add(new Atribuicao(linha));
                // System.out.println(linha);
            }

            for (Atribuicao element : listaDeAtribuicoes) {
                System.out.println(element.codigoDaDisciplina);
                System.out.println(element.codigoDoProfessor);
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro! " + e.getMessage());
        }

        return this.listaDeAtribuicoes;
    }
}
