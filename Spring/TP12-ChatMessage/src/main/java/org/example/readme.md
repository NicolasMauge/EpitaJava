http://localhost:8080/api/v1/chatmessage/send/

Dans Postman :
{
"content": "test contenu",
"sender": "moi",
"recipient": "toi",
"timestamp": "2023-04-14"
}

Résultat dans la sout :
"---------------------------------
Sender: moi
To: toi
Content: test contenu
---------------------------------"