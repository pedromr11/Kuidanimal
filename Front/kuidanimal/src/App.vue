<template>
  <div id="menu">
    
    <router-link to="/">Inicio</router-link> |
    
    <router-link to="/anuncios">Anuncios</router-link> |
    
    <router-link to="/crear">Crear</router-link> |
    
    <router-link to="/modificar">Modificar</router-link> |
    
    <router-link to="/eliminar">Eliminar</router-link>
    
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#menu {
  padding: 40px;
  margin-top: 35px;
  position: fixed;
  left: 670px;
  top: 0;
  right: 0;
  width: 30%;
  background-color: white;
  font-size: large;
}
#menu a {
  font-weight: bold;
  color: black;
}

#menu a.router-link-exact-active {
  color: white;
  text-shadow:
		0 0 5px rgba(0,178,255,1),
		0 0 10px rgba(0,178,255,1),
		0 0 20px rgba(0,178,255,1),
		0 0 40px rgba(38,104,127,1),
		0 0 80px rgba(38,104,127,1),
		0 0 90px rgba(38,104,127,1),
		0 0 100px rgba(38,104,127,1),
		0 0 140px rgba(38,104,127,1),
		0 0 180px rgba(38,104,127,1);
}
</style>
