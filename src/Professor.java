package src;

import java.io.*;
import java.util.*;

public class Professor {
    public String nome;
    public int matricula;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Professor(String data) {
        StringTokenizer token = new java.util.StringTokenizer(data, ",");

        while (token.hasMoreTokens()) {
            this.nome = token.nextToken();
            this.matricula = Integer.parseInt(token.nextToken());
        }
    }

    public void print() {
        String message;
        message = this.nome + " ";
        message += this.matricula + "\n";
        // javax.swing.JOptionPane.showMessageDialog(null, message);
        System.out.print(message);
    }

    void write(PrintWriter file) {
        String message;
        message = this.nome + " ";
        message += this.matricula + "\n";
        file.print(message);
    }
}
