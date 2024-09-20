### **Atividade Prática: Sistema de Gerenciamento de Pessoas**

**Objetivo:**  
Você deve desenvolver um sistema simples de gerenciamento de pessoas que permita o cadastro de indivíduos, a consulta de informações e a atualização de dados pessoais, aplicando todos os conceitos aprendidos nos capítulos estudados. O projeto será entregue por meio de um repositório no GitHub.

**Instruções:**

1. **Configuração do Ambiente:**
    
    - Inicie um novo projeto Java em sua IDE preferida (VS Code).
    - Certifique-se de que o ambiente está corretamente configurado para compilar e executar o código.
2. **Criação das Classes:**
    
    - **Classe `Pessoa`:**
        
        - Atributos: `nome` (String), `cpf` (String), `idade` (int).
        - Métodos: `getNome()`, `setNome(String nome)`, `getCpf()`, `setCpf(String cpf)`, `getIdade()`, `setIdade(int idade)`.
        - Encapsule os atributos da classe utilizando modificadores de acesso `private` e forneça métodos `get` e `set` conforme necessário.
    - **Classe `GerenciadorDePessoas`:**
        
        - Atributos: `pessoa1` (Pessoa), `pessoa2` (Pessoa).
        - Métodos: `cadastrarPessoa1(Pessoa pessoa)`, `cadastrarPessoa2(Pessoa pessoa)`, `atualizarPessoa1(Pessoa pessoa)`, `atualizarPessoa2(Pessoa pessoa)`, `exibirPessoa1()`, `exibirPessoa2()`.
        - Implemente a lógica para gerenciar o cadastro e a atualização dos dados de duas pessoas.
3. **Implementação de Lógica de Negócio:**
    
    - No método `cadastrarPessoa1()` e `cadastrarPessoa2()` da classe `GerenciadorDePessoas`, adicione a lógica para armazenar os dados de cada pessoa.
    - Nos métodos `atualizarPessoa1()` e `atualizarPessoa2()`, permita que os dados de cada pessoa sejam atualizados.
    - Nos métodos `exibirPessoa1()` e `exibirPessoa2()`, exiba as informações armazenadas para cada pessoa.
4. **Testes do Sistema:**
    
    - Crie um método `main()` em uma classe separada para testar o sistema.
    - Cadastre duas pessoas utilizando os métodos de `GerenciadorDePessoas` e, em seguida, atualize as informações de uma das pessoas.
    - Exiba as informações cadastradas para verificar se o sistema está funcionando corretamente e se as regras de encapsulamento foram respeitadas.
5. **Configuração do Repositório GitHub:**
    
    - Crie um repositório público no GitHub para o seu projeto.
    - Organize o repositório de maneira clara, com uma estrutura de pastas adequada (por exemplo, src/ para o código-fonte).
    - Inclua um arquivo README.md na raiz do repositório com as seguintes informações:
        - Breve descrição do sistema.
        - Instruções de compilação e execução.
        - Exemplo de uso.
        - Explicação de como a lógica de encapsulamento foi aplicada no sistema.
6. **Entrega:**
    
    - Após completar a implementação e testar o sistema, faça o commit de todas as alterações e faça o push para o repositório no GitHub.
    - Envie o link do repositório através do sistema de submissão da disciplina.