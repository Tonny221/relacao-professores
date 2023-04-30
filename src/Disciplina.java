package src;

import java.io.*;
import java.util.*;
// import javax.swing.*;

public class Disciplina {
    public String nome;
    public int cargaHoraria;
    public int codigo;

    public Disciplina(String data) {

        StringTokenizer token = new StringTokenizer(data, ",");

        while (token.hasMoreTokens()) {
            this.codigo = Integer.parseInt(token.nextToken());
            this.cargaHoraria = Integer.parseInt(token.nextToken());
            this.nome = token.nextToken();
        }
    }

    public void print() {
        String message;

        message = "Disciplina: " + this.nome + ";\n";
        message += "Carga Horária: " + this.cargaHoraria + ";\n";
        message += "Código: " + this.codigo + ";\n";

        // JOptionPane.showMessageDialog(null, message);
        System.out.print(message);
    }

    public void write(PrintWriter file) {
        String message;

        message = "Disciplina: " + this.nome + ";\n";
        message += "Carga Horária: " + this.cargaHoraria + ";\n";
        message += "Código: " + this.codigo + ";\n";

        file.print(message);
    }
}
