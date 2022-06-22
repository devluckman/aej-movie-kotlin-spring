# Movie API

## Base url

```
https://movie-aej.herokuapp.com
```

## Table endpoints
### movie

| Name              | Endpoint                                          | Method   | Bearer token | Body and response                     |
|-------------------|---------------------------------------------------|----------|--------------|---------------------------------------|
| Get movies        | `/v1/movie`                                       | `GET`    | no           | [example](#movie---get-movies)        |
| Get movie by Id   | `/v1/movie:id`                                    | `GET`    | no           | [example](#movie---get-movie-by-id)   |
| Add movie to list | `/v1/movie?name="{name_movie}"`                   | `POST`   | no           | [example](#movie---add-movie-to-list) |
| Delete movie      | `/v1/movie/delete/:id`                            | `DELETE` | no           | [example](#movie---delete-movie)      |
| Update movie      | `/v1/movie/update?name="{name_movie}"&id"{id}"`   | `PUT`    | no           | [example](#movie---update-movie)      |

## Run on localhost
- Run `./gradlew bootRun`

---

### Movie - Get movies

```
GET /v1/movie
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": [
    {
      "id": "4f9bab24-8162-43df-8b5e-cf571c2bfb76",
      "name": "Hulk"
    },
    {
      "id": "d2b7bc8e-5ca7-450d-abfe-5a9e43494f1b",
      "name": "The Avengers"
    },
    {
      "id": "34b2dfe1-57cb-4b6a-a9b6-433cef137f43",
      "name": "Captain America"
    },
    {
      "id": "888c2a59-e0e2-4197-af29-a64bd959d137",
      "name": "Thor Ragnarok"
    },
    {
      "id": "fb2a7104-4e49-4005-8be4-f924e0689cd1",
      "name": "Loki"
    },
    {
      "id": "5af14539-18cf-493b-9185-79f9a706ac66",
      "name": "Antman"
    },
    {
      "id": "fe910518-2d8e-4183-8786-fb5579c51c36",
      "name": "Black Widow"
    }
  ]
}
```

### movie - Get movie by Id

```
GET /v1/movie?id=5af14539-18cf-493b-9185-79f9a706ac66
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": {
    "id": "5af14539-18cf-493b-9185-79f9a706ac66",
    "name": "Antman"
  }
}
```

### movie - Add movie to list

```
POST /v1/movie?name="Black Widow"
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": [
    {
      "id": "4f9bab24-8162-43df-8b5e-cf571c2bfb76",
      "name": "Hulk"
    },
    {
      "id": "d2b7bc8e-5ca7-450d-abfe-5a9e43494f1b",
      "name": "The Avengers"
    },
    {
      "id": "34b2dfe1-57cb-4b6a-a9b6-433cef137f43",
      "name": "Captain America"
    },
    {
      "id": "888c2a59-e0e2-4197-af29-a64bd959d137",
      "name": "Thor Ragnarok"
    },
    {
      "id": "fb2a7104-4e49-4005-8be4-f924e0689cd1",
      "name": "Loki"
    },
    {
      "id": "5af14539-18cf-493b-9185-79f9a706ac66",
      "name": "Antman"
    },
    {
      "id": "fe910518-2d8e-4183-8786-fb5579c51c36",
      "name": "Black Widow"
    }
  ]
}
```

### movie - Delete movie

```
DELETE /v1/movie/delete/fb2a7104-4e49-4005-8be4-f924e0689cd1 
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": [
    {
      "id": "4f9bab24-8162-43df-8b5e-cf571c2bfb76",
      "name": "Hulk"
    },
    {
      "id": "d2b7bc8e-5ca7-450d-abfe-5a9e43494f1b",
      "name": "The Avengers"
    },
    {
      "id": "34b2dfe1-57cb-4b6a-a9b6-433cef137f43",
      "name": "Captain America"
    },
    {
      "id": "888c2a59-e0e2-4197-af29-a64bd959d137",
      "name": "Thor Ragnarok"
    },
    {
      "id": "5af14539-18cf-493b-9185-79f9a706ac66",
      "name": "Antman"
    },
    {
      "id": "fe910518-2d8e-4183-8786-fb5579c51c36",
      "name": "Black Widow"
    }
  ]
}
```

### movie - Update movie

```
PUT /v1/movie/update?name="Thor"&id="888c2a59-e0e2-4197-af29-a64bd959d137"
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": [
    {
      "id": "4f9bab24-8162-43df-8b5e-cf571c2bfb76",
      "name": "Hulk"
    },
    {
      "id": "d2b7bc8e-5ca7-450d-abfe-5a9e43494f1b",
      "name": "The Avengers"
    },
    {
      "id": "34b2dfe1-57cb-4b6a-a9b6-433cef137f43",
      "name": "Captain America"
    },
    {
      "id": "888c2a59-e0e2-4197-af29-a64bd959d137",
      "name": "Thor"
    },
    {
      "id": "5af14539-18cf-493b-9185-79f9a706ac66",
      "name": "Antman"
    },
    {
      "id": "fe910518-2d8e-4183-8786-fb5579c51c36",
      "name": "Black Widow"
    }
  ]
}
```