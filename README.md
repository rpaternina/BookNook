<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>BookNook Backend README</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      margin: 0;
      padding: 20px;
    }
    h1, h2, h3 {
      margin-top: 30px;
    }
    h1 {
      display: flex;
      align-items: center;
      font-size: 32px;
    }
    h1 img {
      height: 40px;
      margin-right: 10px;
    }
    code {
      background-color: #f4f4f4;
      padding: 2px 4px;
      border-radius: 4px;
      font-family: 'Courier New', monospace;
    }
    pre {
      background-color: #f4f4f4;
      padding: 10px;
      border-radius: 4px;
      overflow-x: auto;
    }
    table {
      width: 100%;
      border-collapse: collapse;
    }
    th, td {
      padding: 8px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
    th {
      background-color: #f4f4f4;
    }
    ul {
      list-style-type: none;
      padding: 0;
    }
    ul li {
      display: flex;
      align-items: center;
      margin-bottom: 10px;
    }
    ul li img {
      height: 20px;
      margin-right: 10px;
    }
    .author-info {
      display: flex;
      align-items: center;
      margin-top: 30px;
    }
    .author-info img {
      height: 50px;
      border-radius: 50%;
      margin-right: 15px;
    }
  </style>
</head>
<body>
  <h1><img src="https://via.placeholder.com/40x40" alt="BookNook Logo"> BookNook Backend - Readme</h1>

  <h2>Introducción</h2>
  <p>Este documento proporciona una descripción general de la implementación del backend para la plataforma BookNook Digital Library, que se construye utilizando Java, Spring Boot, PostgreSQL, JPA, Lombok y Spring Security.</p>

  <h2>Tecnologías Utilizadas</h2>
  <table>
    <tr>
      <th>Tecnología</th>
      <th>Descripción</th>
    </tr>
    <tr>
      <td><code>Java</code></td>
      <td>El lenguaje de programación principal utilizado para el desarrollo del backend.</td>
    </tr>
    <tr>
      <td><code>Spring Boot</code></td>
      <td>El framework de Java utilizado para construir la API RESTful y gestionar el ciclo de vida de la aplicación.</td>
    </tr>
    <tr>
      <td><code>PostgreSQL</code></td>
      <td>El sistema de gestión de bases de datos relacionales utilizado para almacenar datos de usuarios, libros y otros datos de la aplicación.</td>
    </tr>
    <tr>
      <td><code>JPA (Java Persistence API)</code></td>
      <td>La especificación de Java para la persistencia de datos, utilizada para interactuar con la base de datos PostgreSQL.</td>
    </tr>
    <tr>
      <td><code>Lombok</code></td>
      <td>Una biblioteca de Java que proporciona anotaciones para reducir el código repetitivo, como getters, setters y constructores.</td>
    </tr>
    <tr>
      <td><code>Spring Security</code></td>
      <td>El framework de seguridad utilizado para gestionar la autenticación, autorización y otras preocupaciones relacionadas con la seguridad de los usuarios.</td>
    </tr>
    <tr>
      <td><code>Docker</code></td>
      <td>La plataforma de containerización utilizada para empaquetar la base de datos PostgreSQL como una imagen de Docker.</td>
    </tr>
  </table>

  <h2>Descripción General de la Arquitectura</h2>
  <p>El backend de BookNook está diseñado utilizando una arquitectura de microservicios, lo que proporciona beneficios como escalabilidad, modularidad y mantenibilidad. Los principales microservicios y sus responsabilidades son los siguientes:</p>

  <ul>
    <li><img src="https://via.placeholder.com/20x20" alt="User Icon"> Servicio de Usuario: Gestiona el registro, autenticación y administración de perfiles de usuario, y administra los datos específicos de los usuarios.</li>
    <li><img src="https://via.placeholder.com/20x20" alt="Catalog Icon"> Servicio de Catálogo: Mantiene el catálogo de libros, incluyendo metadatos, disponibilidad y precios, y gestiona las funciones de búsqueda, filtrado y recomendación de libros.</li>
    <li><img src="https://via.placeholder.com/20x20" alt="Membership Icon"> Servicio de Membresía: Administra las suscripciones y planes de pago de los usuarios, y gestiona las actualizaciones, downgrads y cancelaciones de suscripciones.</li>
    <li><img src="https://via.placeholder.com/20x20" alt="Content Icon"> Servicio de Contenido: Proporciona acceso al contenido de los libros, incluyendo libros electrónicos y audiolibros, y gestiona la sincronización y transmisión de contenido sin conexión.</li>
    <li><img src="https://via.placeholder.com/20x20" alt="Admin Icon"> Servicio Administrativo: Proporciona una interfaz centralizada para gestionar usuarios, libros, membresías y datos de ventas, y genera informes y análisis para la plataforma BookNook.</li>
  </ul>

  <h2>Desarrollo y Despliegue</h2>
  <h3>Desarrollo Local</h3>
  <p>Para ejecutar el backend de BookNook de forma local, necesitarás tener instalado lo siguiente:</p>
  <ul>
    <li><img src="https://via.placeholder.com/20x20" alt="Java Icon"> Java 11 o superior</li>
    <li><img src="https://via.placeholder.com/20x20" alt="Maven Icon"> Maven</li>
    <li><img src="https://via.placeholder.com/20x20" alt="PostgreSQL Icon"> PostgreSQL (o utilizar la imagen de Docker proporcionada)</li>
  </ul>
  <p>Después de clonar el repositorio, puedes iniciar la aplicación utilizando Maven:</p>
  <pre>mvn spring-boot:run</pre>

  <h3>Despliegue con Docker</h3>
  <p>El backend de BookNook se puede desplegar utilizando Docker. El archivo Docker Compose proporcionado incluye los servicios necesarios, como la base de datos PostgreSQL y la aplicación Spring Boot.</p>
  <p>Para iniciar la aplicación utilizando Docker Compose, ejecuta el siguiente comando:</p>
  <pre>docker-compose up -d</pre>

  <h2>Documentación y Recursos</h2>
  <p>Para obtener información más detallada sobre el backend de BookNook, consulta los siguientes recursos:</p>
  <ul>
    <li><img src="https://via.placeholder.com/20x20" alt="Wiki Icon"> <a href="https://github.com/your-org/booknook-backend/wiki">Wiki del Proyecto</a></li>
    <li><img src="https://via.placeholder.com/20x20" alt="Issue Tracker Icon"> <a href="https://github.com/your-org/booknook-backend/issues">Seguimiento de Incidencias</a></li>
    <li><img src="https://via.placeholder.com/20x20" alt="Contributing Icon"> <a href="https://github.com/your-org/booknook-backend/blob/main/CONTRIBUTING.md">Pautas de Contribución</a></li>
  </ul>

  <div class="author-info">
    <img src="https://via.placeholder.com/50x50" alt="Author Avatar">
    <div>
      <h3>Sobre el Autor</h3>
      <p>Este proyecto fue desarrollado por Robert Paternina. Puedes contactarme en <a href="mailto:paterninayolir@gmail.com">paterninayolir@gmail.com</a> o conectar conmigo en <a href="https://www.linkedin.com/in/robert-paternina/">LinkedIn</a>.</p>
    </div>
  </div>
</body>
</html>
