# Sales-Management-System - ModBeth

**Sistema integral de gestión de ventas, inventario, clientes y facturación para el comercio moderno.**

Control completo del ciclo de ventas: desde el registro de productos y proveedores hasta la gestión de clientes, emisión de facturas, control de inventario, configuración del sistema y reportes ejecutivos para optimizar la operación comercial.

![Java](https://img.shields.io/badge/Java-17%2B-007396?style=flat-square&logo=java&logoColor=white)
![JSharp](https://img.shields.io/badge/J%23-Compatibilidad-512BD4?style=flat-square&logo=.net&logoColor=white)
![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)
![PDF](https://img.shields.io/badge/Reporting-PDF%2FExcel-EA4335?style=flat-square&logo=adobeacrobatreader&logoColor=white)
![Print](https://img.shields.io/badge/Print-Tickets%2FFacturas-success?style=flat-square)
![MVC](https://img.shields.io/badge/Architecture-MVC-success?style=flat-square)

---

![imagen alt](https://github.com/DimasDaniel123/ModBeth-Sistema-de-Ventas-Java/blob/b9deb114403c0e932d236ce45e7a1b296783fc05/src/Imagenes/login.png)

---

# ¿Qué es Sales Management System (ModBeth)?

**Sales Management System (ModBeth)** es una plataforma diseñada para gestionar el ciclo completo de ventas de una empresa comercial o minorista.

Permite administrar productos, controlar inventarios, registrar clientes y proveedores, procesar ventas, emitir facturas y comprobantes, gestionar usuarios con diferentes niveles de acceso y configurar parámetros del sistema. Incluye impresión de facturas y actas de venta.

Su objetivo principal es optimizar el proceso comercial, mantener un inventario preciso, garantizar la satisfacción del cliente y proporcionar información confiable para la toma de decisiones.

---

# 🔄 Flujo Operativo de Ventas

| Etapa | Descripción                           |
| ----- | ------------------------------------- |
| 1     | Registro de productos                 |
| 2     | Registro de proveedores               |
| 3     | Alta de clientes                      |
| 4     | Creación de nueva venta               |
| 5     | Selección de productos y cantidades   |
| 6     | Cálculo de subtotales, impuestos y total |
| 7     | Registro de pago                      |
| 8     | Descuento de inventario               |
| 9     | Emisión de factura o ticket           |
| 10    | Impresión de acta de venta            |
| 11    | Reporte y cierre de caja              |

---

# 📊 Dashboard Principal

Centro de control comercial y financiero.

### Funcionalidades

- Visualización de ventas del día
- Productos más vendidos
- Stock crítico (bajo inventario)
- Clientes frecuentes
- Ingresos por período
- Métricas de rendimiento
- Alertas de inventario
- Próximos pedidos a proveedores

### Estados del Sistema

| Estado               | Color    |
| -------------------- | -------- |
| Venta Completada     | Verde    |
| Venta Pendiente      | Amarillo |
| Venta Cancelada      | Rojo     |
| Stock Normal         | Azul     |
| Stock Bajo           | Naranja  |
| Stock Crítico        | Rojo     |

---

# 🧾 Gestión de Ventas

Permite procesar y administrar todas las transacciones comerciales.

### Información registrada

- Número de factura / ticket
- Cliente (natural o empresarial)
- Fecha y hora de venta
- Productos (código, nombre, cantidad, precio)
- Subtotal, impuestos (IVA), total
- Método de pago (efectivo, tarjeta, transferencia)
- Vendedor / usuario
- Estado de la venta
- Notas adicionales

---

# 📦 Gestión de Productos

Administración completa del catálogo de productos.

### Incluye

- Código de barras / SKU
- Nombre y descripción
- Categoría
- Precio de compra
- Precio de venta (público)
- Impuesto aplicable
- Stock actual
- Stock mínimo (alerta)
- Stock máximo
- Ubicación en almacén
- Proveedor asociado
- Imagen del producto

### Operaciones

- Alta, baja y modificación
- Ajuste de inventario
- Entradas por compra a proveedores
- Salidas por ventas
- Transferencias entre almacenes
- Inventario físico

---

# 👥 Gestión de Clientes

Módulo para administrar la base de clientes.

### Datos registrados

- Nombre / Razón social
- Tipo (natural / jurídico)
- Documento (DNI, RUC, Pasaporte)
- Dirección
- Teléfonos
- Email
- Límite de crédito (si aplica)
- Saldo pendiente
- Historial de compras
- Frecuencia de compra

### Funciones

- Registro y actualización
- Búsqueda avanzada
- Historial de ventas por cliente
- Gestión de crédito y cobranzas

---

# 🏭 Gestión de Proveedores

Administración de proveedores de productos.

### Información

- Nombre / Razón social
- Documento (RUC)
- Dirección
- Contactos (teléfono, email)
- Productos que suministra
- Plazos de entrega
- Condiciones de pago
- Historial de compras
- Calificación

---

# 🆕 Nueva Venta

Proceso rápido e intuitivo para registrar ventas.

### Características

- Buscador de productos (código, nombre)
- Agregar productos con cantidad
- Modificar cantidades sobre la marcha
- Eliminar productos del carrito
- Aplicar descuentos globales o por producto
- Calcular impuestos automáticamente
- Seleccionar cliente (rápido: "Consumidor Final")
- Elegir método de pago
- Calcular cambio (efectivo)
- Guardar venta y generar comprobante

---

# 📄 Impresión de Facturas y Actas de Venta

Generación y salida a impresora de documentos comerciales.

### Tipos de documentos

| Documento            | Uso                                   |
| -------------------- | ------------------------------------- |
| Factura              | Clientes empresariales (con RUC)      |
| Ticket / Boleta      | Consumidor final                      |
| Nota de crédito      | Devoluciones y anulaciones parciales |
| Nota de débito       | Ajustes por diferencia                |
| Acta de venta        | Constancia de transacción comercial  |
| Reporte de cierre    | Resumen diario de ventas              |

### Formatos soportados

- Impresión directa (ticket térmico)
- Impresión en hoja A4 (factura formal)
- Exportación a PDF
- Envío por email al cliente

### Configuración de impresión

- Selección de impresora predeterminada
- Tamaño de papel (80mm, 58mm, A4)
- Copias (1, 2 o más)
- Encabezado y pie de página personalizado
- Incluir logo de la empresa
- Número de facturación automático

---

# ⚙️ Configuración del Sistema

Personalización de parámetros generales.

### Áreas de configuración

| Módulo                | Parámetros configurables                                      |
| --------------------- | ------------------------------------------------------------- |
| Empresa               | Nombre, RUC, dirección, teléfono, logo, mensajes en comprobante |
| Facturación           | Serie, correlativo, impuestos (IVA, ICE), tipo de comprobante |
| Inventario            | Stock mínimo global, alertas automáticas, ubicaciones        |
| Seguridad             | Roles (Admin, Vendedor, Almacén, Contador), permisos         |
| Preferencias          | Moneda, idioma, formato de fecha/hora                        |
| Impresión             | Impresora, tamaño de papel, copias, formato de ticket        |
| Notificaciones        | Alertas de stock bajo, ventas diarias, cobranzas             |

---

# 👤 Gestión de Usuarios

Administración de acceso al sistema.

### Roles disponibles

| Rol          | Permisos                                 |
| ------------ | ---------------------------------------- |
| Administrador | Acceso total, configuración, usuarios    |
| Vendedor      | Ventas, clientes, productos (consulta)   |
| Almacenero    | Inventario, productos, proveedores       |
| Contador      | Reportes, facturación, cierres           |
| Supervisor    | Monitoreo de ventas y vendedores         |

### Funciones

- Creación y desactivación de usuarios
- Asignación de roles
- Cambio de contraseña
- Registro de accesos (auditoría)
- Sesiones simultáneas controladas

---

# 📈 Dashboard de Indicadores

Análisis de desempeño comercial.

### Métricas clave

- Ventas totales (día / semana / mes / año)
- Número de transacciones
- Ticket promedio
- Producto más vendido
- Categoría con mayor facturación
- Cliente con mayores compras
- Rotación de inventario
- Rentabilidad por producto
- Comparativa vs período anterior
- Proyección de ventas

### Gráficos disponibles

- Línea de tiempo (ventas diarias)
- Barras (ventas por categoría)
- Pastel (participación por vendedor)
- Indicadores circulares (cumplimiento de metas)

---

# 🏗️ Arquitectura

El sistema utiliza arquitectura MVC (Modelo-Vista-Controlador).

| Capa       | Función                                    |
| ---------- | ------------------------------------------ |
| Model      | Lógica de negocio y acceso a base de datos |
| View       | Interfaces de usuario (Swing, JavaFX, web) |
| Controller | Gestión de eventos y procesos              |

### Compatibilidad J#

El sistema está desarrollado en **Java** con compatibilidad para entornos **J#** (Java para .NET), permitiendo integración con aplicaciones empresariales Microsoft.

---
---

![imagen alt](https://github.com/DimasDaniel123/ModBeth-Sistema-de-Ventas-Java/blob/b9deb114403c0e932d236ce45e7a1b296783fc05/src/Imagenes/Dashboard.png)

---

# 📁 Estructura del Proyecto

```text
Sales-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/           # Código fuente Java
│   │   ├── resources/      # Configuraciones, SQL, propiedades
│   │   └── webapp/         # Interfaces web (si aplica)
│   ├── model/              # Entidades y DAOs
│   ├── view/               # Interfaces gráficas
│   ├── controller/         # Controladores
│   └── utils/              # Utilidades (PDF, impresión, email)
│
├── db/
│   ├── schema.sql          # Estructura de base de datos
│   ├── data.sql            # Datos iniciales
│   └── procedures.sql      # Procedimientos almacenados
│
├── reports/                # Plantillas de reportes (JasperReports)
├── print/                  # Módulo de impresión
├── lib/                    # Librerías externas (JARs)
├── config/                 # Archivos de configuración
├── logs/                   # Registros del sistema
├── docs/                   # Documentación
│
├── build.gradle / pom.xml  # Gestión de dependencias
├── README.md
└── LICENSE
