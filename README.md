# Snowman-labs API REST

Solução criada como parte do teste de aptidão da snowman labs, com objetivo de prover recursos para o APP Mobile.

## Cadastrar nova questão

### Request

`POST /add"`

    curl -i -H 'Accept: application/json' http://snowteste.herokuapp.com/add

### Response

    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 2

    {
        "id": "1",
        "question": "Qual a capital de Roraima?",
        "search":"Boa Vista",
        "color":"#ff10159a"
        }


## Listar todas as questões ou filtrar por uma específica

### Request

`GET /get?search=<algumacoisa>`

    curl -i -H 'Accept: application/json' http://snowteste.herokuapp.com/get?search=capital

### Response

    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 36

    {
        "id": "1",
        "question": "Qual a capital de Roraima?",
        "search":"Boa Vista",
        "color":"#ff10159a"
        }
