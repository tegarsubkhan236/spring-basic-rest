
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

### Guide Reference
[Building REST services with Spring](https://spring.io/guides/tutorials/rest)

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
#### Get All Orders
```bash
curl -v DELETE localhost:8080/orders
```
```json
{
    "_embedded": {
        "orderList": [
            {
                "id": 1,
                "description": "Macbook Pro",
                "status": "IN_PROGRESS",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/orders/1"
                    },
                    "orders": {
                        "href": "http://localhost:8080/orders"
                    },
                    "cancel": {
                        "href": "http://localhost:8080/orders/1/cancel"
                    },
                    "complete": {
                        "href": "http://localhost:8080/orders/1/complete"
                    }
                }
            },
            {
                "id": 2,
                "description": "Iphone",
                "status": "IN_PROGRESS",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/orders/2"
                    },
                    "orders": {
                        "href": "http://localhost:8080/orders"
                    },
                    "cancel": {
                        "href": "http://localhost:8080/orders/2/cancel"
                    },
                    "complete": {
                        "href": "http://localhost:8080/orders/2/complete"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders"
        }
    }
}
```
#### Get detail order
```bash
curl -v localhost:8080/orders/1
```
```json
{
    "id": 1,
    "description": "Macbook Pro",
    "status": "IN_PROGRESS",
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders/1"
        },
        "orders": {
            "href": "http://localhost:8080/orders"
        },
        "cancel": {
            "href": "http://localhost:8080/orders/1/cancel"
        },
        "complete": {
            "href": "http://localhost:8080/orders/1/complete"
        }
    }
}
```
#### Cancel Order
```bash
curl -v DELETE localhost:8080/orders/1/cancel
```
```json
{
    "id": 1,
    "description": "Macbook Pro",
    "status": "CANCELED",
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders/1"
        },
        "orders": {
            "href": "http://localhost:8080/orders"
        }
    }
}
```
#### Complete Order
```bash
curl -v PUT localhost:8080/orders/2/complete
```
```json
{
    "id": 2,
    "description": "Iphone",
    "status": "COMPLETED",
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders/2"
        },
        "orders": {
            "href": "http://localhost:8080/orders"
        }
    }
}
```
#### Create new Order
```bash
curl -v POST localhost:8080/orders -H 'Content-Type:application/json' -d '{"description": "Jengkol Goreng"}'
```
```json
{
    "id": 3,
    "description": "Jengkol Goreng",
    "status": "IN_PROGRESS",
    "_links": {
        "self": {
            "href": "http://localhost:8080/orders/3"
        },
        "orders": {
            "href": "http://localhost:8080/orders"
        },
        "cancel": {
            "href": "http://localhost:8080/orders/3/cancel"
        },
        "complete": {
            "href": "http://localhost:8080/orders/3/complete"
        }
    }
}
```
