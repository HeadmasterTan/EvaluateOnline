import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import animate from 'animate.css'

Vue.use(iView)

// api 请求前缀
axios.defaults.baseURL = '';

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
