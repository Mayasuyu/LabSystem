import Vue from 'vue'
import Router from 'vue-router'

import Login from './views/Login.vue'
import Nav from '@/components/Navigation'
import Home from '@/views/Home'
import Order from '@/views/Order'
import Bar from '@/components/Bar'
import OrderInfo from '@/views/OrderInfo'
import ManagerOrder from '@/views/ManagerOrder'
import FormInfo from '@/views/FormInfo'
import ListInfo from '@/views/ListInfo'
import OrderDetail from '@/views/OrderDetail'
import DataCenter from '@/views/DataCenter'
import Learning from '@/views/Learning'
import Analysis from '@/views/Analysis'



Vue.use(Router)

export default new Router({

  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
  
    {

      path: '/',    // path为/, 对应的组件为首页
      name: 'login',       // 映射的组件
      // component: () => import(/* webpackChunkName: "login" */ './views/Login.vue')
      component: Login

    },

    {
      
      path: '/main',
      name: 'main',
      components: {

        default: Home,
        nav: Nav,

      }
    
    },

    {
      path: '/order',
      name: 'order',
      components: {

        default: Order,
        nav: Nav,

      },
      children: [
        {
          path: 'bar',
          component: Bar
        },
      ]
    },

    {
      path: '/orderInfo',
      name: 'orderInfo',
      components: {

        default: OrderInfo,
        nav: Nav,

      },
      children: [
        {
          path: 'listInfo',
          component: ListInfo,
        },
      ]
    },

    {
      path: '/managerOrder',
      name: 'managerOrder',
      components: {
        default: ManagerOrder,
        nav: Nav
      },
      children: [
        {
          path: 'formInfo',
          component: FormInfo,
        },
      ]

    },

    {
      path: '/orderDetail',
      name: 'orderDetail',
      components: {

        default: OrderDetail,
        nav: Nav,

      }
    
    },

    {

      path: '/dataCenter',
      name: 'dataCenter',
      components: {

        default: DataCenter,
        nav: Nav

      }

    },


    {
      
      path: '/learning',
      name: 'learning',
      components: {

        default: Learning,
        nav: Nav

      }

    },


    {

      path: '/analysis',
      name: 'analysis',
      components: {

        default: Analysis,
        nav: Nav
      
      }
    
    },

    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },

    {
      path: '*',    // 访问路径不存在时, 重定向到首页
      redirect: '/main'
    },

  ]
})
