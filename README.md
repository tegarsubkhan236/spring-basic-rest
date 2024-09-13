
## Spring Basic Rest
### Run Locally

Clone the project

```bash
  git clone git@github.com:tegarsubkhan236/spring-basic-rest.git
```

Go to the project directory

```bash
  cd spring-basic-rest
```

Start the server

```bash
  ./mvnw clean spring-boot:run
```


### API Reference

#### Get all employees
```bash
  curl -v localhost:8080/employees
```
```json
{
    "_embedded": {
        "employeeList": [
            {
                "id": 1,
                "firstName": "Bilbo",
                "lastName": "Baggins",
                "name": "Bilbo Baggins",
                "role": "burglar",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/employees/1"
                    },
                    "employees": {
                        "href": "http://localhost:8080/employees"
                    }
                }
            },
            {
                "id": 2,
                "firstName": "Frodo",
                "lastName": "Baggins",
                "name": "Frodo Baggins",
                "role": "thief",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/employees/2"
                    },
                    "employees": {
                        "href": "http://localhost:8080/employees"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```
#### Get detail employee
```bash
  curl -v localhost:8080/employees/1
```
```json
{
    "id": 1,
    "firstName": "Bilbo",
    "lastName": "Baggins",
    "name": "Bilbo Baggins",
    "role": "burglar",
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees/1"
        },
        "employees": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```
#### Post employee
```bash
  curl -v POST localhost:8080/employees -H 'Content-Type:application/json' -d '{"name": "joko widodo", "role": "presiden"}'
```
```json
{
    "id": 3,
    "firstName": "joko",
    "lastName": "widodo",
    "name": "joko widodo",
    "role": "presiden",
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees/3"
        },
        "employees": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```
#### Put employee
```bash
  curl -v PUT localhost:8080/employees/3 -H 'Content-Type: application/json' -d '{"name": "prabowo subianto", "role": "presiden"}'
```
```json
{
    "id": 3,
    "firstName": "prabowo",
    "lastName": "subianto",
    "name": "prabowo subianto",
    "role": "presiden",
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees/3"
        },
        "employees": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```
#### Delete employee
```bash
  curl -v DELETE localhost:8080/employees/3
```
