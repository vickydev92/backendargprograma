# Backend API 💻

Este es el archivo `readme.md` para el backend de mi proyecto. Se trata de una API basada en el modelo REST, que proporciona servicios y endpoints para la gestión de datos de mi porfolio personal.

## Características

La API backend tiene las siguientes características:

- Implementación del modelo REST
- Gestión de datos mediante endpoints
- Comunicación con el frontend y la base de datos MySQL.

## Tecnologías Utilizadas 🛠️🔧

El backend de la API fue desarrollado utilizando las siguientes tecnologías:

- Framework: Spring Boot (Java)
- Base de Datos: MySQL

## Instalación y Configuración

Sigue estos pasos para instalar y configurar el backend de la API:

1. Clona el repositorio: `git clone https://github.com/tu-usuario/tu-repositorio.git`
2. Navega al directorio del proyecto: `cd tu-proyecto`
3. Configura las variables de entorno: Crea un archivo `.env` y establece las variables necesarias.
4. Compila y ejecuta el proyecto: `mvn spring-boot:run` o `java -jar nombre-del-jar.jar`

## Endpoints

La API backend proporciona los siguientes endpoints para gestionar los datos:

- `GET /api/personas`: Obtiene la información de un recurso específico.
- `POST /api/personas`: Crea un nuevo recurso.
- `PUT /api/personas/{id}`: Actualiza un recurso existente.
- `DELETE /api/personas/{id}`: Elimina un recurso.

- `GET /api/educaciones`: Obtiene la información de un recurso específico.
- `POST /api/educaciones`: Crea un nuevo recurso.
- `PUT /api/educaciones/{id}`: Actualiza un recurso existente.
- `DELETE /api/educaciones/{id}`: Elimina un recurso.

- `GET /api/proyectos`: Obtiene la información de un recurso específico.
- `POST /api/proyectos`: Crea un nuevo recurso.
- `PUT /api/proyectos/{id}`: Actualiza un recurso existente.
- `DELETE /api/proyectos/{id}`: Elimina un recurso.

- `GET /api/skills`: Obtiene la información de un recurso específico.
- `POST /api/skills`: Crea un nuevo recurso.
- `PUT /api/skills/{id}`: Actualiza un recurso existente.
- `DELETE /api/skills/{id}`: Elimina un recurso.

- `GET /api/experiencia`: Obtiene la información de un recurso específico.
- `POST /api/experiencia`: Crea un nuevo recurso.
- `PUT /api/experiencia/{id}`: Actualiza un recurso existente.
- `DELETE /api/experiencia/{id}`: Elimina un recurso.
