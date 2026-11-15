# Full-Stack Product Maintenance System

---

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot 3, Maven, SQL Server Express, SLF4J / Logback (File Logging)
* **Frontend:** React, Vite, Tailwind CSS v4
* **Testing & Documentation:** Postman

---

## Run steps 
     
1. start frontend with terminal same location as project structure by command
npm run dev
React App will running at
http://localhost:5173/
      
2. start backend service by running main method from Spring Application
Backend restful API starting at
http://localhost:8080/api/products

3. Database CRUD with Postman / webapp
Customize CORS configurate with added @Configuration allow React communicate with spring component

 postman
 <img width="539" height="331" alt="image" src="https://github.com/user-attachments/assets/a0056bfe-498b-43ab-8a8f-133a76d0bb95" />

 frontend
 <img width="899" height="710" alt="image" src="https://github.com/user-attachments/assets/967e1344-4dfe-4de8-8749-5e10ab739c5d" />

Postman Collection JSON 
{
  "info": {
    "name": "Product Maintenance API",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "1. Get All Products (Paginated)",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/api/products?page=0&size=10",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["api", "products"],
          "query": [
            {
              "key": "page",
              "value": "0"
            },
            {
              "key": "size",
              "value": "10"
            }
          ]
        }
      }
    },
    {
      "name": "2. Create Product (Valid)",
      "request": {
        "method": "POST",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\n    \"name\": \"Graphic Card\",\n    \"description\": \"visual enhancer\",\n    \"price\": 89.99,\n    \"quantity\": 5\n}"
        },
        "url": {
          "raw": "http://localhost:8080/api/products",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["api", "products"]
        }
      }
    },
    {
      "name": "3. Test Validation Error (Expected 400 Bad Request)",
      "request": {
        "method": "POST",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\n    \"name\": \"\",\n    \"description\": \"bad data test\",\n    \"price\": -10.00,\n    \"quantity\": -2\n}"
        },
        "url": {
          "raw": "http://localhost:8080/api/products",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["api", "products"]
        }
      }
    },
    {
      "name": "4. Update Product",
      "request": {
        "method": "PUT",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\n    \"name\": \"Graphic Card Updated\",\n    \"description\": \"high performance visual enhancer\",\n    \"price\": 99.99,\n    \"quantity\": 10\n}"
        },
        "url": {
          "raw": "http://localhost:8080/api/products/1",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["api", "products", "1"]
        }
      }
    },
    {
      "name": "5. Delete Product",
      "request": {
        "method": "DELETE",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/api/products/1",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["api", "products", "1"]
        }
      }
    }
  ]
}
