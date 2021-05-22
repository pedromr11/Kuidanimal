<template>

  <img alt="Kuidanimal logo" src="../assets/Logo.jpg">
  <div class="home">
    
    <HelloWorld/>
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
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

.home{
  background-image: url("../assets/Perrete.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;
  width: 1600px; 
  height: 800px;
  margin-top: 70px;
  float: right;
}
</style>
