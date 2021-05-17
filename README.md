# Proyecto PRUEBA del BICE

_Proyecto de Prueba del BICE - Microservicio de consulta de indicadores_

## Comenzando 🚀

_Siga estas instrucciones que te permitirán obtener una copia del proyecto y así poder ejecutarlo en tu máquina local._


### Clonar el proyecto 📋

```
git clone https://github.com/elvisteck/PruebaBice.git
```

### Compilación 🔧
_Ingresar a la carpeta del proyecto y compilarlo con maven._

```
cd PruebaBice
mvn clean install
```

### Ejecución del proyecto 🚀

```
java -jar target/PruebaProgramacion-0.0.1-SNAPSHOT.jar
```


## Realizando Pruebas 

_Al ejecutar el proyecto se levanta un servidor tomcat de springboot el cual esta documentado con Swwagger para facilitar las pruebas. Desde un navegador web ingrese a la URL http://localhost:8080/swagger-ui.html donde se abrirá la interfaz de swagger para poder probar._

<img src="https://i.imgur.com/F83Q1a7.png"/>

_Seleccionar el IndicadoresController y comenzar a realizar pruebas._


## Pruebas de calidad de código 📋

_Para realizar pruebas de codigo se agregaron dependencias de Sonarqube al proyecto. para ejecutarlo debe ejecutar_

```
mvn clean install sonar:sonar
```

<img src="https://i.imgur.com/1b4hWuP.png"/>
