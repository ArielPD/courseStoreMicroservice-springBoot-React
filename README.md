# courseStoreMicroservice-springBoot-React

### Endpoints -- Courses Module Service

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

### Endpoints -- Purchase Module Service

### Save Purchase
```
POST /api/purchase HTTP/1.1
Host: localhost:4444
Content-Type: application/json
Authorization: Basic YXBkYXBkOmFwZGFwZA==
{
    "userId": 1,
    "courseId": 1,
    "title": "course 1",
    "price": 500
}
```

### Get Purchases of User
```
GET /api/purchase/1 HTTP/1.1
Host: localhost:4444
Content-Type: application/json
Authorization: Basic YXBkYXBkOmFwZGFwZA==
```