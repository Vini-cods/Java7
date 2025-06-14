import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscola {

    static class Aluno {
        String nome;
        int idade;
        double nota1;
        double nota2;

        Aluno(String nome, int idade, double nota1, double nota2) {
            this.nome = nome;
            this.idade = idade;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade + ", Média: " + calcularMedia();
        }
    }
}

