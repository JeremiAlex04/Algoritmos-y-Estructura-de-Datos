# 📚 Portafolio de Algoritmos y Estructuras de Datos

Bienvenido a este repositorio. Aquí encontrarás una colección de implementaciones en **Java** de estructuras de datos lineales fundamentales, desarrolladas como parte del curso de Algoritmos y Estructura de Datos. Cada proyecto incluye una interfaz gráfica (GUI) construida con **Swing** para visualizar el funcionamiento interno de las estructuras.

## 🗂️ Estructura del Repositorio

El proyecto está organizado en tres módulos principales dentro del entorno de NetBeans:

1.  **`/Pilas`** (Proyecto: `Alg_Estr_S11`)
2.  **`/Colas`** (Proyecto: `Alg_Estr_S12_`)
3.  **`/Listas`**
    * **P_ListaSimple** (Proyecto: `Conduct_Uber`)
    * **P_ListasDobles** (Proyecto: `ListasDobles_S09`)

---

## 🚀 Descripción de los Módulos

### 1. Pilas (Stacks) 🥞
Implementación de una estructura LIFO (Last In, First Out) utilizando arreglos.

* **Clase Principal:** `PILAS.Principal_Pilas`
* **Características:**
    * **Construir Pila:** Define el tamaño del arreglo dinámicamente.
    * **Push (Agregar):** Inserta elementos en la cima.
    * **Pop (Eliminar):** Remueve el elemento superior.
    * **Peek (Ver Cima):** Muestra el valor y la posición del tope.
    * **Estado:** Validaciones visuales para "¿Está llena?" y "¿Está vacía?".

### 2. Colas (Queues) 🚶‍♂️🚶‍♀️
Implementación de una estructura FIFO (First In, First Out) gestionando punteros de `inicio` y `fin`.

* **Clase Principal:** `COLAS.Principal_Colas`
* **Características:**
    * **Encolar:** Agrega datos al final de la cola.
    * **Desencolar:** Elimina y retorna el dato del inicio, desplazando los elementos restantes.
    * **Contadores:** Muestra la cantidad de datos actuales en la cola.
    * **Visualización:** Representación gráfica del vector en un `JTextArea`.

### 3. Listas Enlazadas (Linked Lists) 🔗

#### A. Listas Simples - Gestión de Conductores Uber 🚗
Lista simplemente enlazada donde cada nodo representa a un conductor.

* **Clase Principal:** `ListaSimples.listas`
* **Datos del Nodo:** ID, Nombre, Años de Experiencia, Vehículo, Calificación.
* **Funcionalidades:**
    * Inserción al inicio de la lista.
    * Búsqueda de conductores por ID.
    * Actualización y eliminación de registros.
    * Reporte tabular en área de texto.

#### B. Listas Dobles - Registro de Empleados 👥
Lista doblemente enlazada que permite la navegación bidireccional (punteros `sig` y `ant`).

* **Clase Principal:** `Ejercicio.listas_dobles`
* **Datos del Nodo:** Código, Nombre, Apellido, Sexo, Sueldo.
* **Funcionalidades Avanzadas:**
    * **Navegación:** Botones para recorrer la lista "Adelante-Atrás" y "Atrás-Adelante".
    * **Estadísticas:** Cálculo automático del monto acumulado de sueldos y detección del empleado con mayor sueldo.
    * **CRUD:** Guardar, Consultar, Actualizar y Eliminar nodos.

---

## 🛠️ Tecnologías

* **Lenguaje:** Java (JDK 8+)
* **IDE Recomendado:** Apache NetBeans
* **Interfaz:** Java Swing (JFrame, JTable, JOptionPane)
* **Compilación:** Ant Build System (`build.xml`)

## 💻 Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/algoritmos-y-estructura-de-datos.git](https://github.com/tu-usuario/algoritmos-y-estructura-de-datos.git)
    ```

2.  **Abrir en NetBeans:**
    * Ve a `File` -> `Open Project`.
    * Selecciona las carpetas `Pilas`, `Colas`, `Listas/P_ListaSimple` o `Listas/P_ListasDobles`.

3.  **Ejecutar:**
    * Haz clic derecho sobre el proyecto que deseas probar.
    * Selecciona **Run** o presiona `F6`.

## 👤 Autor

**Jeremi Alexander Olivares Chavez**
* Estudiante de Ingeniería
* Curso: Algoritmos y Estructura de Datos

---
*Este proyecto tiene fines educativos para demostrar el dominio de TDA (Tipos de Datos Abstractos) en Java.*
