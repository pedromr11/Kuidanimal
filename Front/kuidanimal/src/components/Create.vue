<template>
  <div class="create">
      <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      </head>
      <body>  
        <form>
          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Animal</span>
              <input type="text" class="form-control" placeholder="Animal" aria-label="Animal" aria-describedby="basic-addon1" v-model="var1">
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Provincia</span>
              <select class="form-select" aria-label="Default select example" v-model="var2">
                  <option v-for="(provincia, index) in provincias" :key="index" v-bind:value="provincia.id_provincia">{{provincia.nombre}}</option>
              </select>
          </div>
          <br>
          
          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Teléfono de contacto</span>
              <input type="number" class="form-control" placeholder="Teléfono de contacto" aria-label="Teléfono de contacto" aria-describedby="basic-addon2" v-model="var3">
          </div>

          <div class="input-group mb-3">
              <input type="text" class="form-control" placeholder="Correo electrónico" aria-label="Correo electrónico" aria-describedby="basic-addon3" v-model="var4">
              <span class="input-group-text" id="basic-addon3">@example.com/es</span>
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Precio</span>
              <input type="number" class="form-control" placeholder="Precio" aria-label="Precio" aria-describedby="basic-addon2" v-model="var5">
              <span class="input-group-text" id="basic-addon2">€</span>
          </div>

          <div class="input-group mb-3">
              <button type="submit" class="btn btn-primary mb-3" @click="enviar">Crear</button>
          </div>
        </form>
      </body>
  </div>
</template>

<script>

import axios from 'axios';

export default {
  
  data(){
      return{
          provincias: [],
          var1: '',
          var2: '',
          var3: '',
          var4: '',
          var5: ''
      }      
  },
  methods:{
    obtenerProvincias(){
       axios.get("http://localhost:8080/kuidanimal/v1/provincias").then((response) => {
          this.provincias = response.data
      })
    },
    enviar(){
        let post = {
            animal: this.var1,
            id_provincia: this.var2,
            telefono: this.var3,
            correo_electronico: this.var4,
            precio: this.var5
        };
        axios.post('http://localhost:8080/kuidanimal/v1/anuncios', post)
        .then((result) => {
            console.log(result)
        })
    }
  },
  created(){
      this.obtenerProvincias();   
  }
}

</script>

