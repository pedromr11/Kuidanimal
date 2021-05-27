<template>
  
  <img alt="Kuidanimal logo" src="../assets/Logo.jpg">
  <div class="anuncios">
    <h1>Listado de anuncios</h1>
    <br>
    <Listar/>
  </div>
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
  width: 300px;
  height: 150px;
  float: left;
  margin-top: 60px;
}

.anuncios{
  width: 1600px; 
  height: 800px;
  margin-top: 70px;
  float: right;
  border: 1px solid black;
  overflow-y: scroll; 
}
</style>
