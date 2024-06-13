# Practica Clase Programación 3
## Juego Avatar
Este juego se va construyendo durante la clase de Porgramación 3.
Las tecnologías utilizadas son:
- HTML
- CSS
- JAVASCRIPT

### Comandos en GitBash para la creación de las carpetas y archivos correspondientes:
```
- cd practicas //entramos a la carpeta practicas
- mkdir avatar //creamos la carpeta 
- cd avatar //entramos a esa carpeta
- mkdir public //creamos la carpeta public
- cd public // entramos a esa carpeta
- mkdir js
- mkdir css
- touch README.md //creamos archivo readme.md
- touch avatar.html //creamos archivo .html
```

### Primer clase:
Creamos el html y una función en JS para mostrar un mensaje por pantalla cuando seleccionamos uno de los personajes.
Utilizamos el manejo de DOM con los métodos: <br>
[Document.getElementById](https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById)<br>
[Document.getElementsByName](https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByName)<br>
[element.addEventListener](https://developer.mozilla.org/es/docs/Web/API/EventTarget/addEventListener)
### Segunda clase: 
Modificamos la función anterior para que modifique el documento html con el personaje que elegimos en vez de mostrar un alert.
Agregamos una función para que se elgia un enemigo de forma random. <br>
Uitlizamos el método [element.InnerHTMl](https://developer.mozilla.org/es/docs/Web/API/Element/innerHTML)
### Tercer clase: 
En esta clase creamos diferentes funciones para poder poder elegir el ataque de nuestro personaje y también que el enemigo eliga de forma aleatorio su ataque. 
### Cuarta clase:
En esta clase usamos [Document.createElement](https://developer.mozilla.org/es/docs/Web/API/Document/createElement) y [Document.appendChild](https://developer.mozilla.org/es/docs/Web/API/Node/appendChild) para crear el párrafo dinámico en html donde se va relatando los ataques elegiso por el personaje y enemigo y quien ganó la ronda.
