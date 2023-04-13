# create :
http://localhost:8080/api/v1/tasks/create

{
    "title":"première tâche",
    "description": "première tâche pour tester le fonctionnement",
    "dueDate":"2023-04-12",
    "status":"NonDebute"
}

# findById :
http://localhost:8080/api/v1/tasks/1

retour : 
{
    "id": 1,
    "title": "première tâche",
    "description": "première tâche pour tester le fonctionnement",
    "dueDate": "2023-04-12",
    "status": "NonDebute"
}

# findByStatus :
http://localhost:8080/api/v1/tasks/status/NonDebute

retour : 
[
    {
        "id": 1,
        "title": "première tâche",
        "description": "première tâche pour tester le fonctionnement",
        "dueDate": "2023-04-12",
        "status": "NonDebute"
    }
]

# findByTitle :
http://localhost:8080/api/v1/tasks/title/première tâche

retour : 
[
    {
        "id": 1,
        "title": "première tâche",
        "description": "première tâche pour tester le fonctionnement",
        "dueDate": "2023-04-12",
        "status": "NonDebute"
    }
]

# delete :
http://localhost:8080/api/v1/tasks/delete/1

plus de ligne dans la base