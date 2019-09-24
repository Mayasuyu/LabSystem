import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Qs from 'qs'
import iView from 'iview'
import 'iview/dist/styles/iview.css';     // 很重要, 必须加

import App from './App.vue'
import router from './router'
import store from './store'

Vue.config.productionTip = false

Vue.use(VueAxios, axios)

Vue.use(iView)

Vue.prototype.$Qs = Qs

new Vue({

  router,
  store,
  render: h => h(App)
  
}).$mount('#app')
