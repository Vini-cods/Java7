import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuEscola();
        menuAcademia();
    }

    public static void menuEscola() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SistemaEscola.Aluno> alunos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n====== MENU ESCOLA ======");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();
                    alunos.add(new SistemaEscola.Aluno(nome, idade, nota1, nota2));
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Alunos ---");
                        for (SistemaEscola.Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
    }

    public static void menuAcademia() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SistemaAcademia.Aluno> alunos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n====== MENU ACADEMIA ======");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos e IMC");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();
                    alunos.add(new SistemaAcademia.Aluno(nome, idade, peso, altura));
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Alunos ---");
                        for (SistemaAcademia.Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}

