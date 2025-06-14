# Sistema Integrado - Escola e Academia

Este projeto demonstra conceitos avançados de Programação Orientada a Objetos (POO) em Java, implementando dois sistemas distintos em uma única aplicação: um sistema de gestão escolar e um sistema de academia com funcionalidades interativas via menu.

## 📋 Descrição

O sistema combina duas funcionalidades principais:
1. **Sistema Escola**: Gerencia alunos e calcula médias de notas
2. **Sistema Academia**: Gerencia alunos e calcula IMC (Índice de Massa Corporal)

Ambos os sistemas utilizam menus interativos para cadastro e listagem de alunos, demonstrando o uso de coleções dinâmicas e entrada de dados pelo usuário.

## 🏗️ Estrutura do Projeto

### Classe `SistemaEscola`
Contém uma classe interna `Aluno` específica para o contexto escolar:

#### Atributos:
- **nome**: Nome do aluno
- **idade**: Idade em anos  
- **nota1**: Primeira nota (0-10)
- **nota2**: Segunda nota (0-10)

#### Métodos:
- `Aluno(String nome, int idade, double nota1, double nota2)`: Construtor
- `calcularMedia()`: Calcula a média aritmética das duas notas
- `toString()`: Retorna representação formatada do aluno

### Classe `SistemaAcademia`
Contém uma classe interna `Aluno` específica para o contexto da academia:

#### Atributos:
- **nome**: Nome do aluno
- **idade**: Idade em anos
- **peso**: Peso em quilogramas
- **altura**: Altura em metros

#### Métodos:
- `Aluno(String nome, int idade, double peso, double altura)`: Construtor
- `calcularIMC()`: Calcula o IMC usando a fórmula peso ÷ altura²
- `toString()`: Retorna representação formatada com IMC formatado (2 casas decimais)

### Classe `Main`
Classe principal que gerencia a execução dos dois sistemas:

#### Métodos:
- `main(String[] args)`: Método principal que executa ambos os menus sequencialmente
- `menuEscola()`: Interface interativa para o sistema escolar
- `menuAcademia()`: Interface interativa para o sistema da academia

## 🎯 Funcionalidades

### Sistema Escola
1. **Cadastrar Aluno**: Permite inserir nome, idade e duas notas
2. **Listar Alunos**: Exibe todos os alunos cadastrados com suas médias
3. **Sair**: Encerra o sistema escolar

### Sistema Academia  
1. **Cadastrar Aluno**: Permite inserir nome, idade, peso e altura
2. **Listar Alunos e IMC**: Exibe todos os alunos com seus IMCs calculados
3. **Sair**: Encerra o sistema da academia

## 🚀 Como Executar

1. Compile todas as classes:
```bash
javac SistemaEscola.java SistemaAcademia.java Main.java
```

2. Execute o programa:
```bash
java Main
```

3. O sistema executará primeiro o menu da escola, e após sair, executará o menu da academia.

## 💻 Exemplo de Uso

### Sistema Escola:
```
====== MENU ESCOLA ======
1. Cadastrar aluno
2. Listar alunos  
3. Sair
Escolha uma opção: 1

Nome: João Silva
Idade: 16
Nota 1: 8.5
Nota 2: 7.0

====== MENU ESCOLA ======
1. Cadastrar aluno
2. Listar alunos
3. Sair
Escolha uma opção: 2

--- Lista de Alunos ---
Nome: João Silva, Idade: 16, Média: 7.75
```

### Sistema Academia:
```
====== MENU ACADEMIA ======
1. Cadastrar aluno
2. Listar alunos e IMC
3. Sair
Escolha uma opção: 1

Nome: Maria Santos
Idade: 25
Peso (kg): 65.0
Altura (m): 1.70

====== MENU ACADEMIA ======
1. Cadastrar aluno
2. Listar alunos e IMC
3. Sair
Escolha uma opção: 2

--- Lista de Alunos ---
Nome: Maria Santos, Idade: 25, IMC: 22.49
```

## 🎓 Conceitos Demonstrados

### Programação Orientada a Objetos:
- **Classes Internas Estáticas**: `SistemaEscola.Aluno` e `SistemaAcademia.Aluno`
- **Encapsulamento**: Organização de dados e métodos em classes
- **Sobrescrita de Métodos**: Implementação personalizada do `toString()`
- **Construtores**: Inicialização adequada de objetos

### Estruturas de Dados:
- **ArrayList**: Armazenamento dinâmico de alunos
- **Generics**: Tipagem específica das coleções

### Programação Interativa:
- **Scanner**: Captura de entrada do usuário
- **Estruturas de Controle**: `do-while`, `switch-case`
- **Validação de Menu**: Tratamento de opções inválidas

### Formatação e Apresentação:
- **String.format()**: Formatação de números decimais
- **Enhanced for-loop**: Iteração sobre coleções
- **Interface de usuário em console**: Menus organizados e informativos

## 🔧 Recursos Técnicos

- **Modularização**: Separação clara entre diferentes sistemas
- **Reutilização de Código**: Padrões similares nos dois menus
- **Polimorfismo**: Diferentes implementações da classe `Aluno`
- **Gestão de Memória**: Uso eficiente de coleções dinâmicas

## 📝 Observações Importantes

- Cada sistema mantém sua própria lista de alunos independente
- Os sistemas são executados sequencialmente (primeiro escola, depois academia)
- O IMC é formatado com 2 casas decimais para melhor legibilidade
- Ambos os sistemas incluem verificação para listas vazias
