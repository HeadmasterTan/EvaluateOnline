import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
    path: '/',
    redirect: '/rate'
  }, {
    path: '/index',
    name: '首页',
    component: () => import('./views/index'),
    children: [{
      path: '/login',
      name: '登录',
      component: () => import('./views/login/index')
    }, {
      path: '/rate',
      name: '评分',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import( /* webpackChunkName: "about" */ './views/rate/index')
    }]
  }]
})
