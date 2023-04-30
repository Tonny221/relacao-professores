package src;

import java.io.*;
import java.util.*;

public class Atribuicao {
    public int codigoDoProfessor;
    public int codigoDaDisciplina;

    public Atribuicao(String data) {
        StringTokenizer token = new StringTokenizer(data, ",");

        // FAZER A ATRIBUIÇÃO DE CADA TOKEN A SUA DEVIDA VARIAVEL
        while (token.hasMoreTokens()) {
            this.codigoDoProfessor = Integer.parseInt(token.nextToken());
            this.codigoDaDisciplina = Integer.parseInt(token.nextToken());
        }
    }

    public void print() {
        String message;

        message = "Código do professor: " + this.codigoDoProfessor + ";\n";
        message += "Código da disciplina: " + this.codigoDaDisciplina + ";\n";

        System.out.print(message);
    }

    public void write(PrintWriter file) {
        String message;

        message = "Código do professor: " + this.codigoDoProfessor + ";\n";
        message += "Código da disciplina: " + this.codigoDaDisciplina + ";\n";

        file.print(message);
    }

}
