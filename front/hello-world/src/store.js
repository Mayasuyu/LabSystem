import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {    // 数据保存在state内，在任何组件内通过this.$store.state.XX来读取
              // 来自state内的数据，只能被读取不能手动修改

  },
  
  mutations: {    // 用来直接修改state内的数据；在组件内，通过·this.$store.commit(方法名)来执行mutations
                  // mutations可以接受第二个参数, 可以是数字、字符串或对象类型
                  // 当一个参数不够用时，可以传入一个对象，无限扩展
                  // 作用：改变数据

  },
  
  actions: {      // 提交的是mutation, 并且可以异步操作
                  // action在组件内通过this.$store.dipatch(方法名)来触发
                  // 作用：存在业务逻辑

  },

  getters: {    // 将各个组件中的computed中的方法提取出来

  },

  modules: {    // 用来将store分割到不同模块

  }


})
