# courseStoreMicroservice-springBoot-React

### Endpoints

### Save Course
```
POST /api/course HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic YXBkYXBkOmFwZGFwZA==

{
    "title": "test-course IOS",
    "subtitle": "test-course-subtitle",
    "price": 500
}
```

### Get Courses

```
GET /api/course HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic YXBkYXBkOmFwZGFwZA==
```

### Delete Course

```
DELETE /api/course/2 HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic YXBkYXBkOmFwZGFwZA==
```