# API REST de Gerenciamento de Usuários

Este projeto consiste em uma API RESTful desenvolvida em **Java** com **Spring Boot**

## 🚀 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e ferramentas:

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot 3**: Framework para inicialização, configuração e criação de aplicações stand-alone.
- **Spring Data JPA**: Utilizado para abstrair a camada de persistência, facilitando a implementação de repositórios e consultas SQL.
- **H2 Database**: Banco de dados relacional em memória, configurado para agilizar o desenvolvimento e testes de integração.
- **Lombok**: Biblioteca utilizada para reduzir a verbosidade do código (boilerplate), gerando automaticamente Getters, Setters, Construtores e Logs.
- **Maven**: Ferramenta de gerenciamento de dependências e build automatizado.
- **Postman**: Ferramenta utilizada para testes, validação dos endpoints e documentação das requisições.

## 📂 Arquitetura do Projeto

O sistema foi estruturado seguindo o padrão de **Arquitetura em Camadas** (Layered Architecture) para garantir o desacoplamento de responsabilidades, facilidade de manutenção e escalabilidade:

* **Controller (`/controller`)**: Camada de Apresentação. Responsável por expor os endpoints da API (REST) e lidar com as requisições HTTP recebidas do cliente.
* **Business (`/business`)**: Camada de Serviço. Contém toda a lógica de negócios, regras e validações necessárias antes que os dados sejam processados.
* **Infrastructure (`/infrastructure`)**: Camada de Dados. Responsável pela comunicação direta com o banco de dados através de repositórios JPA.

## ⚙️ Funcionalidades (Endpoints)

A API disponibiliza os seguintes endpoints para manipulação de usuários:

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| **POST** | `/users` | Cadastra um novo usuário no banco de dados. |
| **GET** | `/users` | Retorna uma lista com todos os usuários cadastrados. |
| **GET** | `/users/{email}` | Busca dados detalhados de um usuário específico pelo e-mail. |
| **DELETE** | `/users/{email}` | Remove um usuário do sistema. |
| **PUT** | `/users` | Atualiza as informações de um usuário existente. |

## 🧪 Testes e Validação

Todos os endpoints da API foram validados e testados utilizando o **Postman**.

Para realizar seus próprios testes:
1. Certifique-se de que a aplicação está rodando.
2. Utilize o Postman (ou ferramenta similar) para enviar as requisições para `http://localhost:8080`.
3. O Banco de Dados H2 pode ser acessado via console no navegador (se habilitado) para verificar a persistência dos dados.

## 🛠️ Como Executar o Projeto

Siga os passos abaixo para rodar a aplicação na sua máquina local:

1.  **Clone o repositório**:
    ```bash
    git clone [https://github.com/SEU-USUARIO/nome-do-repositorio.git](https://github.com/SEU-USUARIO/nome-do-repositorio.git)
    ```
2.  **Importe o projeto**:
    Abra a pasta do projeto na sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code).
3.  **Instale as dependências**:
    Deixe o Maven carregar todas as dependências listadas no arquivo `pom.xml`.
4.  **Execute a aplicação**:
    Navegue até a classe principal `CadastroUsuarioApplication.java` (localizada em `src/main/java/...`) e execute-a.
5.  **Acesse a API**:
    A aplicação iniciará na porta padrão `8080`.

---
## 📝 Licença

Este projeto foi desenvolvido para fins de estudo e construção de portfólio. Sinta-se à vontade para utilizar o código como referência.

---
**Desenvolvido por Gustavo Cardoso Machado**
www.linkedin.com/in/gustavocardosomachado 
