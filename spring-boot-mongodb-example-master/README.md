# Spring MongoDB CRUD
```
localhost:8095/rest/
```

#Employee

##Create
```
localhost:8095/rest/employee/new   (Request Body required)
```
##Update
```
localhost:8095/rest/employee/update/{id}  (Request Body required)
```

##Delete
```
localhost:8095/rest/employee/delete/{id}
```
## Employee table JSON format
```
{
                "id": 1,
                "name": "Peter",
                "salary": 3000
}
```
#Department
##Create
```
localhost:8095/rest/department/new   (Request Body required)
```
##Update
```
localhost:8095/rest/department/update/{id}  (Request Body required)
```

##Delete
```
localhost:8095/rest/department/delete/{id}
```
## Department table JSON format
```
{
        "id": 100,
        "orgname": "CVT",
        "location": "Laxmi Nagar",
        "employee": [
            {
                "id": 1,
                "name": "Peter",
                "salary": 3000
            },
            {
                "id": 2,
                "name": "Nick",
                "salary": 4000
            }
        ]
}



##Employee data in the Department table should also be separately entered in the Employee table.
