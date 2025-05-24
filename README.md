# 💱 Conversor de Monedas - Java + API REST

Este es un proyecto de consola en Java que permite convertir entre diferentes monedas latinoamericanas
y el dólar estadounidense, utilizando tasas de cambio en tiempo real obtenidas desde la [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🚀 Características

- Conversión entre:
  - ARS (Peso argentino)
  - BOB (Boliviano boliviano)
  - BRL (Real brasileño)
  - CLP (Peso chileno)
  - COP (Peso colombiano)
  - USD (Dólar estadounidense)
- Llamadas a API REST con `HttpClient` de Java 11.
- Respuesta JSON parseada con la biblioteca `Gson`.
- Estructura limpia con clases separadas: `Conversor`, `Moneda`, `Menu` y `Principal`.
- Interfaz en consola interactiva con validaciones.

---

## 📦 Requisitos

- Java 11 o superior
- Internet para conectarse a la API con tu propia clave obtenida de ExchangeRate-API.
- [API Key de ExchangeRate-API](https://app.exchangerate-api.com/dashboard)
- [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) (si no usas Maven)

  ***  BIENVENIDO AL CAMBIO DE MONEDA ***
      Seleccione el tipo de cambio:
          1 - ARS → USD
          2 - USD → ARS
          ...
          
          Ingrese su opción: 1
          Ingrese la cantidad en ARS: 10000
          
          Resultado: 10000.00 ARS = 11.27 USD


## 🔧 Instalación

### Clonar el repositorio

```bash
git clone [ https://github.com/JMSJHOO/ConversorDeMoneda.git ]
cd conversor-monedas-java



---

## 📜 Licencia

Este proyecto está bajo la [Licencia MIT](./LICENSE).
