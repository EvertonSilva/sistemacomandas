# Sistema de Comandas

Projeto idealizado para a disciplina de Engenharia de Software 3
da FATEC - Mogi das Cruzes.

## Dependências

1. Git
2. Maven

## Configurações

Rode os scripts para criar as tabelas no banco:

```
$ mvn flyway:migrate
```
    
## Rodar a aplicação

Utilize o comando:

```
$ mvn jetty:run
```

Acesse o endereço `localhost:8080/sistemacomandas` no navegador