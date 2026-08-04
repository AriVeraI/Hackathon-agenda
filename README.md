# Sistema de Gestión de Agenda Telefónica CLI

¡Bienvenido al repositorio del proyecto *Agenda Telefónica*! Este proyecto fue desarrollado colaborativamente durante el Hackathon como parte de la formación en Desarrollo Java Full Stack.

El sistema consiste en una aplicación de consola (CLI) que permite gestionar contactos en una agenda con capacidad configurable o por defecto, aplicando principios orientados a objetos, colecciones y buenas prácticas en Java.

---

## Características y Funcionalidades

El sistema cuenta con las siguientes características implementadas según la rúbrica de evaluación:

- *Contacto:* Definido por Nombre, Apellido y Teléfono, con una clasificación por Tipo (Personal / Empresa).
- *Control de Duplicados:* La agenda no permite registrar dos contactos con el mismo nombre y apellido (sin importar mayúsculas o minúsculas).
- *Capacidad Flexible:* Se puede definir un tamaño máximo personalizado o usar el tamaño por defecto de 10 contactos.
- *Listado Ordenado:* Muestra los contactos ordenados alfabéticamente.

### Métodos Disponibles

- anadirContacto(Contacto c): Añade un contacto validando espacios disponibles y duplicados.
- existeContacto(Contacto c): Verifica si un contacto ya pertenece a la agenda.
- listarContactos(): Despliega toda la agenda en formato Nombre Apellido - Teléfono.
- buscarContacto(String nombre, String apellido): Busca y muestra el teléfono de un contacto.
- eliminarContacto(Contacto c): Remueve un contacto e informa el resultado.
- agendaLlena(): Notifica si se ha alcanzado la capacidad máxima.
- espacioLibres(): Indica cuántos registros más se pueden agregar.

---

## Equipo de Desarrollo y Organización SCRUM

Para la realización de este proyecto aplicamos la metodología *SCRUM*, dividiendo la responsabilidad de cada método entre los integrantes del equipo:

| Desarrollador(a) | Funcionalidad / Asignación |
| :--- | :--- |
| *Eva* | añadirContacto |
| *Jose* | existeContacto |
| *Frida* | listarContactos |
| *Isra* | buscarContacto |
| *David* | eliminarContacto |
| *Ariadna* | agendaLlena |
| *Karem* | espacioLibres |

---

## Tecnologías Utilizadas

- *Lenguaje:* Java 17
- *Entorno de Desarrollo (IDE):* IntelliJ IDEA
- *Control de Versiones:* Git & GitHub
- *Estructura de Datos:* ArrayList / Java Collections

## Instrucciones para Clonar y Ejecutar el Repositorio

Sigue estos pasos para obtener una copia local del proyecto en tu computadora:

### Pre-requisitos
* Tener instalado *Java Development Kit (JDK)* .
* Tener instalado *Git*.

### Paso a Paso

1. *Clonar el repositorio:*
   Abre tu terminal o consola de comandos y ejecuta:
   ```bash
   git clone https://github.com/AriVeraI/Hackathon-agenda.git

---
