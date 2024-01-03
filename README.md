<a href="https://github.com/Rodolfo-Sampaio/Adopet/blob/main/LICENSE"><img src="https://img.shields.io/npm/l/react" alt="NPM" align="right"></a>
# Sistema Adopet Console 🐾✨ 
Sob a orientação do instrutor João Victor Martins no curso:
### Java e refatoração: melhorando códigos com boas práticas da [Alura](https://cursos.alura.com.br/course/java-refatoracao-melhorando-codigos-boas-praticas) ⭐
Desenvolvido em Java com padrão de projeto Command, este sistema permite o cadastro e listagem de abrigos, importação e listagem de pets associados a cada um dos abrigos.
Foi utilizado as bibliotecas Gson e Jackson-databind para manipulação de dados além de uma API Rest para as chamadas GET e POST, também foi realizado testes de unidade com JUnit e Mockito.

<br>

## Execução local
### Como executar a aplicação
Para executar a aplicação, é necessário ter o Java 17 ou superior e o Maven (mvn) instalados em sua máquina, com as variáveis de ambiente configuradas corretamente. Siga os passos abaixo:

- ###### Escolha uma pasta e abra o terminal para clonar o repositório:
```bash
$ git clone https://github.com/Rodolfo-Sampaio/Adopet.git
```
- ###### Entre na pasta do projeto Adopet:
```bash
$ cd Adopet
```
- ###### Execute o Maven clean package para compilar o projeto e gerar o arquivo JAR:
```bash
$ mvn clean package
```
- ###### Aguarde a compilação dos novos arquivos dentro da pasta target.
- ###### Enquanto isso abra um novo terminal dentro da pasta Adopet e inicie a aplicação da biblioteca `api.jar` com o seguinte comando:
```bash
$ java -jar api.jar
```

- ######  Após compilação no primeiro terminal inicie a aplicação principal com o comando:
```bash
$ java -jar target/adopet-console-1.0.jar
```
A aplicação estará disponível para uso após esses passos.

Lembre-se de verificar se todas as dependências estão instaladas corretamente e se as variáveis de ambiente do Java e Maven estão configuradas.

### Como usar a aplicação
![image](https://github.com/Rodolfo-Sampaio/Adopet/assets/96917363/8123e3ac-31c9-48bf-9678-c0b49e445b9f)
<br>
- ###### 2 -> Cadastrar novo abrigo: Nome / Telefone / Email do Abrigo
```bash
$ Petmais / 1198765432 / petmais@gmail.com
```
- ###### 4 -> Importar pets do abrigo: Digite o id ou nome do abrigo / Digite o nome do arquivo CSV
```bash
$ 1 / pets.csv
```

- ###### 3 -> Listar pets do abrigo: Digite o id ou nome do abrigo
```bash
$ 1 
```

### Tecnologias utilizadas nesse projeto ⚡
<span style="letter-spacing: 10px">
   <img src="https://skillicons.dev/icons?i=java" title="Java" alt="Java" width="60px"/>
</span>

[![Jackson Databind](https://img.shields.io/badge/Jackson%20Databind-007396?style=for-the-badge&logo=jackson)](https://github.com/FasterXML/jackson-databind)
[![Google Gson](https://img.shields.io/badge/Google%20Gson-orange?style=for-the-badge&logo=google)](https://github.com/google/gson)
[![JUnit Jupiter](https://img.shields.io/badge/JUnit%20Jupiter-25A162?style=for-the-badge&logo=junit)](https://junit.org/junit5/)
[![Mockito](https://img.shields.io/badge/Mockito-DA282A?style=for-the-badge&logo=mockito)](https://site.mockito.org/)

<br>

### Instrutor(a):

<a href="https://github.com/joao0212/">
  <img src="https://avatars.githubusercontent.com/u/10758086?v=4" alt="João Victor Martins" style="border-radius: 50%; width: 50px; height: 50px;">
</a>

[João Victor Martins](https://github.com/joao0212/)
<br>
<br>
### 🚀 Valeu pela passada no meu Git. Se curtiu, bora trocar ideias! Dá um [`Follow`](https://github.com/Rodolfo-Sampaio) que tô sempre por aqui.  😎👩‍💻

<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=6378f7&height=100&section=footer"/>

[🠉 Volta para o Topo](#sistema-adopet-console-)

