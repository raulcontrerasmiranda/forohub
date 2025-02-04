# ForoHub - API REST para un Foro

**ForoHub** es una API REST desarrollada con Java y Spring Boot para administrar un foro donde los usuarios pueden crear, listar y eliminar tópicos, con autenticación mediante JWT (JSON Web Tokens).

---

## **Características Principales**
1. **Autenticación Segura:**
   - Inicio de sesión con email y contraseña.
   - Generación de tokens JWT para acceder a endpoints protegidos.

2. **Endpoints CRUD para Tópicos:**
   - **Listar Tópicos:** Recupera todos los tópicos registrados.
   - **Crear Tópico:** Permite a usuarios autenticados crear nuevos tópicos.
   - **Eliminar Tópico:** Los usuarios autenticados pueden eliminar tópicos específicos.

3. **Validación de Datos:**
   - Los datos de entrada son validados para garantizar integridad y seguridad.

4. **Base de Datos MySQL:**
   - Gestión de usuarios y tópicos mediante una base de datos relacional.

---

## **Estructura del Proyecto**
- **controlador:** Contiene los controladores REST para manejar las solicitudes de los usuarios.
- **servicio:** Implementa la lógica del negocio para la manipulación de datos.
- **repositorio:** Define las interfaces para la interacción con la base de datos.
- **modelo:** Incluye las entidades principales (`Usuario`, `Topico`).
- **dto:** Define los objetos de transferencia de datos.
- **seguridad:** Configuración de seguridad y utilidades para JWT.

---

## **Endpoints Disponibles**

### **Autenticación**
- `POST /auth/login`: Genera un token JWT para usuarios registrados.

### **Tópicos**
- `GET /topicos`: Lista todos los tópicos.
- `POST /topicos`: Crea un nuevo tópico (requiere autenticación).
- `DELETE /topicos/{id}`: Elimina un tópico por ID (requiere autenticación).

