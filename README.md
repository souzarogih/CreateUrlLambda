<p align="center">Create Url Lambda</p>

Este projeto possui o código fonte para uma AWS Lambda utilizando Java, esta lambda tem acesso ao S3 para gravar 
dados de um link encurtado e pode ser acionado via url da AWS API Gateway.  

Body:
```
json
{
"originalUrl": "https://www.youtube.com/watch?v=T1CigiqX17I",
"expirationTime": "1737385205"
}
```

ENDPOINT
- [X] /create
- [X] /{UrlCode}