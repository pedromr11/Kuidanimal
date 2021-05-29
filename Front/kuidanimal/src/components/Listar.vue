<template>
  <div class="listado">
      <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      </head>
      <body>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">Id anuncio</th>
                    <th scope="col">Animal</th>
                    <th scope="col">Provincia</th>
                    <th scope="col">Teléfono</th>
                    <th scope="col">Correo Electrónico</th>
                    <th scope="col">Precio en €</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="(anuncios) in anuncio" :key="anuncios">
                    <td>{{anuncios.id_anuncio}}</td>
                    <td>{{anuncios.animal}}</td>
                    <td>
                        <span>
                            <ul v-for="(provincias) in provincias" :key="provincias">
                                <li v-if="anuncios.id_provincia == provincias.id_provincia">{{provincias.nombre}}</li>
                            </ul>
                        </span>
                    </td>
                    <td>{{anuncios.telefono}}</td>
                    <td>{{anuncios.correo_electronico}}</td>
                    <td>{{anuncios.precio}}</td>
                </tr>
            </tbody>
        </table>       
      </body>
  </div>
</template>

<script>

import axios from 'axios';

export default {
  
  data(){
      return{
          anuncio: [],
          provincias: []
      }      
  },
  created(){
      axios.get("http://localhost:8080/kuidanimal/v1/anuncios").then((response) => {
         this.anuncio = response.data
      });
      axios.get("http://localhost:8080/kuidanimal/v1/provincias").then((response) => {
         this.provincias = response.data
      })
  }
}
</script>
