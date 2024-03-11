# Enunciado
>
Se gestionará la cola de despegue de los vuelos de un aeropuerto. El sistema tendrá dos operaciones principales:
>
* Añadir vuelo: que añadirá un nuevo vuelo a la cola de espera de despegues autorizados.
*Asignar vuelo: que tomará el vuelo que lleva más tiempo en espera y visualizará sus datos.
>
Mientras no se seleccione la opción de salir, permaneceremos en el sistema, pudiendo realizar cualquiera de las dos operaciones anteriores.
De los vuelos es necesario almacenar tanto el número de vuelo, que estará formado por 3 letras seguidas de 4 números, el nombre de la compañía y el nombre del destino. También se deberá guardar la hora en que el vuelo se dio de alta en el sistema.
>
Al añadir un vuelo al sistema se deberán leer los datos del vuelo a añadir, y tanto si la inserción fue satisfactoria como si no lo fue, deberá mostrarse el mensaje adecuado. No se podrá insertar ningún vuelo que no tenga un número de vuelo correcto.
>
Cuando se seleccione la opción de asignar vuelo, en caso de que no haya ningún vuelo en espera deberá indicarse con un aviso. En caso de que sí haya un vuelo en espera, se seleccionará el que lleve más tiempo en espera. Se mostrarán los datos de este vuelo, así como cuánto tiempo lleva en espera. A continuación, se solicitará si desea eliminar el vuelo del sistema, ya que pueden darse dos situaciones:
>
Por un lado, puede ocurrir que aparezca algún problema en el despegue o bien que se realice el despegue correctamente. En ambos casos, el vuelo debe eliminarse de la lista, ya que no está en espera para despegar.
Por otro lado, puede suceder que el vuelo aún tenga que mantenerse en espera, con lo cual aún no se debe sacar del sistema.