# Gestor de Cuentas Corrientes

Una aplicación de escritorio en **Java** para gestionar cuentas corrientes de socios. Incluye funcionalidades CRUD (Crear, Leer, Actualizar y Eliminar).

---

## Características

- Gestión completa de cuentas corrientes.
- Operaciones CRUD para los registros de cuentas.
- Cálculo automático de saldos, ingresos y deudas.
- Interfaz gráfica amigable desarrollada con **Swing**.
- Documentación detallada en **JavaDoc**.

---

## Requisitos

- **Java 17** o superior.
- **NetBeans IDE** (opcional, pero recomendado).
- **MySQL** como base de datos.

---

## Instalación

### 1. Clonar el repositorio
Clona este repositorio en tu máquina local:
```bash
git clone https://github.com/maximarquezz/CRUDCuentaCorriente.git
```

### 2. Importar el proyecto en NetBeans IDE
1. Abre NetBeans.  
2. Selecciona `File > Open Project` y navega hasta el directorio clonado.  

### 3. Configurar la base de datos
1. Importa el archivo `clubsoftcuentacorriente.sql` (si está incluido) en tu servidor MySQL.  
2. Ejecuta las SQL queries para crear la base de datos y las tablas.

### 4. Compila y ejecuta el proyecto
En NetBeans, haz clic derecho sobre el proyecto y selecciona `Run`.

---

## Uso

### Ejecución desde NetBeans
1. Abre el proyecto en NetBeans.  
2. Haz clic derecho sobre la clase principal `frmPrincipal` y selecciona `Run File`.

### Ejecución desde un archivo JAR
1. Genera un archivo JAR ejecutable:  
   En NetBeans, selecciona `Clean and Build Project`.  
2. Encuentra el archivo `.jar` en la carpeta `dist/`.  
3. Ejecuta el archivo JAR desde la terminal:  
   ```bash
   java -jar dist/CRUDCuentaCorriente.jar
   ```

---

## Acceso al JavaDoc

1. Genera el JavaDoc en NetBeans:  
   Haz clic derecho sobre el proyecto y selecciona `Generate Javadoc`.  
2. Encuentra la documentación generada en la carpeta `dist/javadoc/`.  
3. Abre el archivo `index.html` en tu navegador para acceder a la documentación.

---

## Funcionalidades Principales

- **Crear Registros**: Agrega nuevas transacciones.  
- **Leer Registros**: Visualiza todas las transacciones existentes.  
- **Actualizar Registros**: Modifica detalles de transacciones existentes.  
- **Eliminar Registros**: Borra transacciones seleccionadas.  

---

## Contribuciones

1. Haz un fork del repositorio.  
2. Crea una rama para tu funcionalidad:  
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza tus cambios y súbelos:  
   ```bash
   git commit -m "Agregada nueva funcionalidad"
   git push origin feature/nueva-funcionalidad
   ```
4. Abre un Pull Request.
