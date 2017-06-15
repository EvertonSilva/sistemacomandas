# Sistema de Comandas

Projeto idealizado para a disciplina de Engenharia de Software 3
da FATEC - Mogi das Cruzes.

## Dependências

1. Git
2. Maven

## Configurações

1. Crie o arquivo com o nome **custom-config.properties** na pasta `src/main/resources` com a seguinte 
propriedade:

    ```
    H2DBURL = jdbc:h2:C:/User/Documents/pasta-do-banco/nome-do-banco
    ```

    Obs: Como o banco de dados será incorporado à aplicação, você pode especificar a PASTA
    e o NOME DO BANCO que quiser.

2. Rode os scripts para criar as tabelas no banco:

    ```
    $ mvn flyway:migrate
    ```
    
## Rodar a aplicação

Após clonar o repositório entre na pasta do projeto

```
$ cd sistemacomandas
```

Rode o comando:

```
$ mvn jetty:run
```

Acesse o endereço `localhost:8080` no navegador


