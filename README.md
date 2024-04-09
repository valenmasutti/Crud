#Uso de Postman para Probar las Solicitudes HTTP

Consulta de Clientes:

GET /api/clientes: Obtiene todos los clientes registrados.

GET /api/clientes/page/{page}: Obtiene una página específica de clientes, donde {page} es el número de página deseado.
Consulta de un Cliente Específico

GET /api/clientes/{id}: Obtiene los detalles de un cliente específico, donde {id} es el ID del cliente.


Creación de un Nuevo Cliente:

POST /api/clientes: Crea un nuevo cliente. Envía una solicitud con el cuerpo del cliente en formato JSON.

Actualización de un Cliente Existente:

PUT /api/clientes/{id}: Actualiza los detalles de un cliente existente, donde {id} es el ID del cliente. Envía una solicitud con el cuerpo del cliente actualizado en formato JSON.

Eliminación de un Cliente:
DELETE /api/clientes/{id}: Elimina un cliente existente, donde {id} es el ID del cliente a eliminar.
Nota
