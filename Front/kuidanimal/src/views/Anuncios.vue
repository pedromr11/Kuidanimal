<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <img alt="Kuidanimal logo" src="../assets/Logo.jpg">
        <div class="anuncios">
          <h1>Listado de anuncios</h1>
          <br>
          <Listar/>
        </div>
      </div>
    </div>
  </body>
</template>

<script>
import Listar from '@/components/Listar.vue'

export default {
  name: 'Anuncios',
  components: {
    Listar
  }
}
</script>


<style scoped>
img{
  width: 200px;
  height: 100px;
  margin-top: 30px;
  position: fixed;
  left: 500px;
  top: 0;
  right: 0;
}

.anuncios{
  width: 1600px; 
  height: 700px;
  margin-top: 150px;
  border: 1px solid black;
  overflow-y: scroll;
}
</style>
