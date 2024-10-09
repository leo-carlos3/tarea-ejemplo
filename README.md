Dos programas en java pensados para usarse juntos y comunicarse mediante una tubería.
Abre cmd en la carpeta que contenga sus jar y usa el comando:
java -jar numeros_lmp.jar 5
para obtener 5 números primos aleatorios. Usa:
java -jar numeros_lmp.jar 5 | java -jar ordenar_lmp.jar
para recibir en la salida estándar otros 5 números ordenados de menor a mayor
