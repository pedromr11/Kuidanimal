<template>
  
  <img alt="Kuidanimal logo" src="../assets/Logo.jpg">
  <div class="anuncios">
    <h1>Aquí se crearán los anuncios</h1>
    <br>
    <Create/>
  </div>
</template>

<script>
import Create from '@/components/Create.vue'

export default {
  name: 'Crear',
  components: {
    Create
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
}
</style>