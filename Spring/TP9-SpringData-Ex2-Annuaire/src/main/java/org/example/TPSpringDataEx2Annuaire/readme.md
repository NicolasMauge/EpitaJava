# create
http://localhost:8080/api/v1/contacts/create

{
"firstName":"sylvain",
"lastName": "durand",
"phoneNumber": "0123456789",
"email": "sylvain.durand@test.com"
}

{
"firstName":"michel",
"lastName": "dupond",
"phoneNumber": "0123456788",
"email": "michel.dupond@test.com"
}

# findById
http://localhost:8080/api/v1/contacts/1

retour :
{
"id": 1,
"firstName": "sylvain",
"lastName": "durand",
"phoneNumber": "0123456789",
"email": "sylvain.durand@test.com"
}

# findAll
http://localhost:8080/api/v1/contacts/all

retour :
'''json
[
{
"id": 1,
"firstName": "sylvain",
"lastName": "durand",
"phoneNumber": "0123456789",
"email": "sylvain.durand@test.com"
},
{
"id": 2,
"firstName": "michel",
"lastName": "dupond",
"phoneNumber": "0123456788",
"email": "michel.dupond@test.com"
}
]
'''

# findByPhoneNumber
http://localhost:8080/api/v1/contacts/phonenumber/0123456789

retour :
[
{
"id": 1,
"firstName": "sylvain",
"lastName": "durand",
"phoneNumber": "0123456789",
"email": "sylvain.durand@test.com"
}
]