# Getting Started

### Requirements
For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the ` com.testApi.apiMovie.apiMovie.ApiMovieApplication` class from your IDE.

Alternatively you can build the project by running ```mvn clean package```

Once successfully built, you can run the service by one of these two methods:
```
        java -jar target/apiMovie-0.0.1-SNAPSHOT.jar
or
        mvn spring-boot:run"
```

## Database
Database is already set up in `application.properties` with test seeds.
If you want another seeds can uncomment `loadData` function from  ` com.testApi.apiMovie.apiMovie.ApiMovieApplication`.

If you want to connect your own mongodb database create a new mongodb database:
[MongoDB](https://www.mongodb.com/basics/create-database).
After that get connection string: 
[Connection String](https://www.mongodb.com/basics/mongodb-connection-string).

Connection string must be placed in `application.properties` `spring.data.mongodb.uri` then in `spring.data.mongodb.uri` specify desired database and into `server.port` locally running port.

### Get information about movies and users.

```
http://localhost:8080/api/movies
http://localhost:8080/api/movies/category={category}
http://localhost:8080/api/movies/tag={tag}
http://localhost:8080/api/users
http://localhost:8080/api/users/{id}
```

### GET all movies

```
GET /api/movies
Accept: application/json
Content-Type: application/json

curl command:
curl http://localhost:8080/api/movies -H "Accept: application/json" -H "Content-Type: application/json"

[
    {
        "id": "652ee065360a5329e8965bd2",
        "title": "Movie1",
        "description": "Horror test ... ",
        "genre": "Horror",
        "tag": "TAG1",
        "length": 120,
        "dateReleased": "2023-10-17T22:28:37.575",
        "dateAvailableUntil": "2024-07-13T10:12:00",
        "metadataInfo": {
            "images": [
                "url1",
                "url2"
            ],
            "metaTitle": "Metatada title movie 1",
            "metaDescription": "Metatada desc movie 1"
        }
    },
    {
        "id": "652ee066360a5329e8965bd3",
        "title": "Movie2",
        "description": "Drama test ... ",
        "genre": "Drama",
        "tag": "TAG2",
        "length": 140,
        "dateReleased": "2023-10-17T22:28:37.575",
        "dateAvailableUntil": "2025-09-12T10:12:00",
        "metadataInfo": {
            "images": [
                "url1",
                "url2"
            ],
            "metaTitle": "Metatada title movie 2",
            "metaDescription": "Metatada desc movie 2"
        }
    }
]

RESPONSE: HTTP 200 (OK)
```

### GET movies by category

```
GET /api/movies/category={category}
Accept: application/json
Content-Type: application/json

curl command:
curl http://localhost:8080/api/movies/category=Horror -H "Accept: application/json" -H "Content-Type: application/json"

[
    {
        "id": "652ee065360a5329e8965bd2",
        "title": "Movie1",
        "description": "Horror test ... ",
        "genre": "Horror",
        "tag": "TAG1",
        "length": 120,
        "dateReleased": "2023-10-17T22:28:37.575",
        "dateAvailableUntil": "2024-07-13T10:12:00",
        "metadataInfo": {
            "images": [
                "url1",
                "url2"
            ],
            "metaTitle": "Metatada title movie 1",
            "metaDescription": "Metatada desc movie 1"
        }
    }
]

RESPONSE: HTTP 200 (OK)
```

### GET movies by tag

```
GET /api/movies/tag={tag}
Accept: application/json
Content-Type: application/json

curl command:
curl http://localhost:8080/api/movies/tag=TAG2 -H "Accept: application/json" -H "Content-Type: application/json"

[
    {
        "id": "652ee066360a5329e8965bd3",
        "title": "Movie2",
        "description": "Drama test ... ",
        "genre": "Drama",
        "tag": "TAG2",
        "length": 140,
        "dateReleased": "2023-10-17T22:28:37.575",
        "dateAvailableUntil": "2025-09-12T10:12:00",
        "metadataInfo": {
            "images": [
                "url1",
                "url2"
            ],
            "metaTitle": "Metatada title movie 2",
            "metaDescription": "Metatada desc movie 2"
        }
    }
]

RESPONSE: HTTP 200 (OK)
```

### GET all users

```
GET /api/users
Accept: application/json
Content-Type: application/json

curl command:
curl http://localhost:8080/api/users -H "Accept: application/json" -H "Content-Type: application/json"

[
    {
        "id": "652ee066360a5329e8965bd4",
        "email": "alex@test.com",
        "phoneNumber": "0781302853",
        "movies": [
            {
                "id": "652ee065360a5329e8965bd2",
                "title": "Movie1",
                "description": "Horror test ... ",
                "genre": "Horror",
                "tag": "TAG1",
                "length": 120,
                "dateReleased": "2023-10-17T22:28:37.575",
                "dateAvailableUntil": "2024-07-13T10:12:00",
                "metadataInfo": {
                    "images": [
                        "url1",
                        "url2"
                    ],
                    "metaTitle": "Metatada title movie 1",
                    "metaDescription": "Metatada desc movie 1"
                }
            },
            {
                "id": "652ee066360a5329e8965bd3",
                "title": "Movie2",
                "description": "Drama test ... ",
                "genre": "Drama",
                "tag": "TAG2",
                "length": 140,
                "dateReleased": "2023-10-17T22:28:37.575",
                "dateAvailableUntil": "2025-09-12T10:12:00",
                "metadataInfo": {
                    "images": [
                        "url1",
                        "url2"
                    ],
                    "metaTitle": "Metatada title movie 2",
                    "metaDescription": "Metatada desc movie 2"
                }
            }
        ],
        "preferences": {
            "favoriteCategories": "Horror",
            "websiteTheme": "Dark"
        }
    },
    {
        "id": "652ee066360a5329e8965bd5",
        "email": "alex_123@test.com",
        "phoneNumber": "0741352871",
        "movies": [
            {
                "id": "652ee066360a5329e8965bd3",
                "title": "Movie2",
                "description": "Drama test ... ",
                "genre": "Drama",
                "tag": "TAG2",
                "length": 140,
                "dateReleased": "2023-10-17T22:28:37.575",
                "dateAvailableUntil": "2025-09-12T10:12:00",
                "metadataInfo": {
                    "images": [
                        "url1",
                        "url2"
                    ],
                    "metaTitle": "Metatada title movie 2",
                    "metaDescription": "Metatada desc movie 2"
                }
            }
        ],
        "preferences": {
            "favoriteCategories": "Drama",
            "websiteTheme": "Light"
        }
    }
]

RESPONSE: HTTP 200 (OK)
```

### GET all users

```
GET /api/users/{id}
Accept: application/json
Content-Type: application/json

curl command:
curl http://localhost:8080/api/users/652ee066360a5329e8965bd5 -H "Accept: application/json" -H "Content-Type: application/json"

{
    "id": "652ee066360a5329e8965bd5",
    "email": "alex_123@test.com",
    "phoneNumber": "0741352871",
    "movies": [
        {
            "id": "652ee066360a5329e8965bd3",
            "title": "Movie2",
            "description": "Drama test ... ",
            "genre": "Drama",
            "tag": "TAG2",
            "length": 140,
            "dateReleased": "2023-10-17T22:28:37.575",
            "dateAvailableUntil": "2025-09-12T10:12:00",
            "metadataInfo": {
                "images": [
                    "url1",
                    "url2"
                ],
                "metaTitle": "Metatada title movie 2",
                "metaDescription": "Metatada desc movie 2"
            }
        }
    ],
    "preferences": {
        "favoriteCategories": "Drama",
        "websiteTheme": "Light"
    }
}

RESPONSE: HTTP 200 (OK)
```