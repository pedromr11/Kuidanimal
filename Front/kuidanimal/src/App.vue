<template>
  <div id="menu">
    <router-link to="/">Inicio</router-link> 
    <br><br>
    <router-link to="/anuncios">Anuncios</router-link>
    <br><br>
    <router-link to="/crear">Crear</router-link>
    <br><br>
    <router-link to="/modificar">Modificar</router-link>
    <br><br>
    <router-link to="/eliminar">Eliminar</router-link>
    <br><br>
    <router-link to="/aboutus">About us</router-link>
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
  padding: 30px;
  width: 230px;
  height: 150px;
  position: absolute;
  top: 200px;
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
