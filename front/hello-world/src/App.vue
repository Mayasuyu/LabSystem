<template>
  <div id="app">         
      
      <!-- <router-link to="/address"></router-link>          -->
        <!-- <router-link>会被渲染为一个<a>标签, to是一个prop, 指定需要跳转的路径
        tag：改变渲染结果; replace: 不会留下Hsitory; 
        active-class: 高亮显示当前页面对应的菜单      -->  

    <router-view name="nav"></router-view>   <!-- router.js对应的path项的components中若有name就渲染, 没有name则不渲染 -->
    <router-view/>     <!-- 默认挂载router.js中default对应的路径 -->
        
        <!-- 路由视图, 挂载所有路由组件; 根据当前路由动态渲染不同的页面组件; 路由切换时, 切换的是<router-view>挂载的组件 -->

  </div>
</template>



<script>
export default {
  name: 'app',
  components: {

  }
}
</script>


<style lang="less">
#app {

  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin: 0px 0px;
  padding: 0px 0px;

}
</style>
