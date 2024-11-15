# Game List

**Game List** é um projeto backend desenvolvido em **Java** utilizando o framework **Spring Boot** e gerenciado pelo **Maven**. Ele permite a leitura e reordenação de listas de games.

---

## 🚀 Funcionalidades

- **Listagem de Games:** Exibe uma lista de jogos cadastrados.
- **Reordenação de Listas:** Permite reordenar os jogos dentro de uma lista.

---

## 🛠️ Tecnologias Utilizadas

- **Java 21+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **Banco de Dados:** H2 (desenvolvimento) ou PostgreSQL (produção)
- **Maven**
  
---

## 📦 Estrutura do Projeto

```
game-list/
├── src/
│   ├── main/
│   │   ├── java/dev/rodrigoramos/game_list/
│   │   │   ├── config/        # Configurações de Projeto
│   │   │   ├── controllers/   # Controladores REST
│   │   │   ├── dto/           # Objetos de Transferência de Dados (opcional)
│   │   │   ├── entities/      # Entidades do Domínio
│   │   │   ├── projections/   # Consultas JPA
│   │   │   ├── repositories/  # Repositórios JPA
│   │   │   ├── services/      # Regras de Negócio
│   │   └── resources/
│   │       ├── application.properties  # Configurações do Spring
│   │       └── import.sql  # Script de inicialização (opcional)
├── pom.xml
└── README.md
```

---

## 📄 Modelo de Domínio e Banco de Dados
![image](https://github.com/user-attachments/assets/2dc80c67-b022-425c-ad5d-8cb6542c2b04)

![image](https://github.com/user-attachments/assets/9cf9784d-cfeb-4ab2-a7fd-3f89109e77d5)

---

## 🔧 Configuração e Execução

### Pré-requisitos

- **Java 21+**
- Um banco de dados configurado (H2 ou PostgreSQL)

### Configuração

1. Clone o repositório:
   ```bash
   git clone git@github.com:rodrigofx3/game-list.git
   cd game-list
   ```

2. Configure o arquivo `application.properties` com as informações do banco de dados:
   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driver-class-name=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação:
   - URL base: `http://localhost:8080`

---

## 📝 Endpoints Principais

### Games
- **GET** `/api/games`: Retorna a lista de jogos.
- **GET** `/api/games/{id}`: Retorna um jogo detalhado.

### Listas
- **GET** `/api/lists`: Retorna as listas de jogos.
- **GET** `/api/lists/{listId}/games`: Retorna os jogos de uma lista.
- **POST** `/api/lists/{listId}/replacement`: Reordena os jogos em uma lista.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/rodrigofx3/game-list/blob/572cfed803980f40079492b631e77b444c990abc/LICENSE)
