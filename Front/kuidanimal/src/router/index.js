import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/anuncios',
    name: 'Anuncios',
    component: () => import('../views/Anuncios.vue')
  },
  {
    path: '/crear',
    name: 'Crear',
    component: () => import('../views/Crear.vue')
  },
  {
    path: '/modificar',
    name: 'Modificar',
    component: () => import('../views/Modificar.vue')
  },
  {
    path: '/eliminar',
    name: 'Eliminar',
    component: () => import('../views/Eliminar.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
