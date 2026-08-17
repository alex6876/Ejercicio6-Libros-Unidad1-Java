# Ejercicio 6 — Sistema de Préstamo de Libros

Proyecto orientado al diseño de un sistema de control de inventario y estado de disponibilidad para bibliotecas mediante Programación Orientada a Objetos (POO).

---

## 📝 Descripción

El sistema permite gestionar la información de ejemplares bibliográficos y controlar en tiempo real sus estados de disponibilidad (disponible / prestado), validando las reglas de negocio para evitar dobles préstamos de un mismo libro.

---

## 🚀 Funcionalidades y Requerimientos

### 📦 Clase `Libro`

* **Atributos:**
  * Título (String)
  * Autor (String)
  * Estado de préstamo (Boolean: true si está prestado, false si está disponible)

* **Métodos:**
  * `Prestar()`: Cambia el estado a prestado. Si el libro ya se encuentra prestado, despliega un mensaje de advertencia.
  * `Devolver()`: Cambia el estado a disponible. Si el libro no estaba prestado, notifica que ya se encontraba en biblioteca.
  * `MostrarEstado()`: Muestra en pantalla el título, autor y la disponibilidad actual del libro.

---

## 💻 Programa Principal (`main`)

El programa evalua diferentes funcionalidades:
1. Instancia diversos libros con su estado inicial (disponibles).
2. Simula un **préstamo exitoso**.
3. Intenta realizar un **préstamo fallido** sobre el mismo libro (verificando la regla de negocio).
4. Procesa la **devolución** del ejemplar y vuelve a verificar su disponibilidad.

---
