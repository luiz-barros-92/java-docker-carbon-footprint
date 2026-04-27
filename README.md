# Read Me
| Componente | Detalhes |
| :--- | :--- |
| **Tecnologias** | Java, Spring Boot, PostgreSQL, Docker e Thymeleaf (HTML5). |
| **Objetivo** | Registrar e comparar a pegada de carbono de funcionários (antes vs. depois). |
| **Cálculo Energia** | 0,090 kg CO2 por kWh (Total da conta ÷ nº de funcionários). |
| **Cálculo Transporte** | 0,120 kg CO2 por km rodado (veículo flex). |
| **Emissão Zero** | Carona, transporte coletivo ou bicicleta = 0 km rodados. |
| **Frequência** | Coleta de dados mensal para comparação de impacto. |


## Class Diagram
![img](https://github.com/luiz-barros-92/assets/blob/main/footprint/class-foot-2.png)

## Dashboard
![img](https://github.com/luiz-barros-92/assets/blob/main/footprint/p1.png)
![img](https://github.com/luiz-barros-92/assets/blob/main/footprint/p2.png)

## Como Executar o Projeto

Este projeto utiliza **Docker** para facilitar a configuração do ambiente de banco de dados e gerenciamento.

### Pré-requisitos
* Java 17 ou superior.
* Maven.
* Docker e Docker Compose instalados.

### Configuração da Infraestrutura (Banco de Dados)

Na raiz do projeto, onde se encontra o arquivo `docker-compose.yml`, execute o seguinte comando no terminal para subir os containers do **PostgreSQL** e do **pgAdmin**:

```bash
docker-compose up -d
```

**PostgreSQL**: Disponível na porta 5432.

**pgAdmin**: Interface de gerenciamento acessível em http://localhost:5050 \
Login: me@example.com \
Senha: 1234567

### Executando a Aplicação Spring Boot
Após os containers estarem "Up", você pode iniciar a aplicação pela sua IDE ou via terminal:

```bash
mvn spring-boot:run
```

O dashboard estará disponível em: http://localhost:8080/dashboard

