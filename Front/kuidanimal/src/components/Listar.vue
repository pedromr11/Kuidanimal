<template>
  <div class="listado">
      <table>
          <tr>
              <th>Id anuncio</th>
              <th>Animal</th>
              <th>Teléfono</th>
              <th>Correo Eletrónico</th>
              <th>Precio</th>
          </tr>

          <tr v-for="(anuncios) in anuncio" :key="anuncios">
              <td>{{anuncios.id_anuncio}}</td>
              <td>{{anuncios.animal}}</td>
              <td>{{anuncios.telefono}}</td>
              <td>{{anuncios.correo_electronico}}</td>
              <td>{{anuncios.precio}}</td>
          </tr>
      </table>
  </div>
</template>

<script>

import axios from 'axios';

export default {
  
  data(){
      return{
          anuncio: []
      }      
  },
  created(){
      axios.get("http://localhost:8080/kuidanimal/v1/anuncios").then((response) => {
         this.anuncio = response.data
      })
  }
}
</script>

<style scoped>
table{
    border: 1px solid black;
    border-collapse: collapse;
    margin-left: 25%;
    width: 60%;
}
</style>