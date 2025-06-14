import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademia {

    static class Aluno {
        String nome;
        int idade;
        double peso;
        double altura;

        Aluno(String nome, int idade, double peso, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }

        double calcularIMC() {
            return peso / (altura * altura);
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade +
                    ", IMC: " + String.format("%.2f", calcularIMC());
        }
    }

}
