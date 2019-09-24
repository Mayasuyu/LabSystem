<template>
    
<div class="mainstyle">
    <div class="learn">
        
        <Menu active-name="1-2" :open-names="['1']" :theme="theme">

            <Submenu name="1">

                <template slot="title">
                    <Icon type="ios-analytics" />
                    分类
                </template>

                <MenuGroup title="线性算法">
                    <MenuItem name="1-1">逻辑回归</MenuItem>
                    <MenuItem name="1-2">线性判别分析</MenuItem>
                </MenuGroup>

                <MenuGroup title="非线性算法">
                    <MenuItem name="1-3">贝叶斯分类器</MenuItem>
                    <MenuItem name="1-4">分类与回归树</MenuItem>
                    <MenuItem name="1-5">支持向量机</MenuItem>
                </MenuGroup>

            </Submenu>

            <Submenu name="2">

                <template slot="title">
                    <Icon type="ios-filing" />
                    回归
                </template>

                <MenuItem name="2-1">线性回归</MenuItem>
                <MenuItem name="2-2">弹性网络回归</MenuItem>

                <Submenu name="3">

                    <template slot="title">非线性算法</template>
                    <MenuItem name="3-1">分类与回归树</MenuItem>
                    <MenuItem name="3-2">支持向量机</MenuItem>

                </Submenu>

            </Submenu>

            <Submenu name="4">

                <template slot="title">
                    <Icon type="ios-cog" />
                    集成算法
                </template>

                <MenuItem name="4-1">装袋决策树</MenuItem>
                <MenuItem name="4-2">随机森林</MenuItem>
                <MenuItem name="4-3">随机梯度提升</MenuItem>
                <MenuItem name="4-4">投票算法</MenuItem>

            </Submenu>

        </Menu>
    </div>

    <div class="am">
        <img src="../assets/qq.jpg">
    </div>

</div>

</template>

<script>
export default {
    
    data() {

        return {

            theme: 'dark'

        }

    }

}
</script>


<style lang="less" scoped>


.mainstyle {

    position: absolute;
    left: 0px;
    top: 68px;
    width: 100%;
    height: 127%;
    text-align: center;
    background: -webkit-linear-gradient( rgb(102, 176, 236) ,rgb(179, 200, 211)); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient( rgb(102, 176, 236), rgb(179, 200, 211)); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(rgb(102, 176, 236),rgb(179, 200, 211)); /* Firefox 3.6 - 15 */
    background: linear-gradient( rgb(59, 158, 238) , rgb(94, 180, 226)); /* 标准的语法 */

}


.learn {

    position: absolute;
    top: 0px;
    left: 0px;

}


.am img {

    width: 1300px;
    height: 620px;
    position: absolute;
    top: 0px;
    left: 240px;

}


</style>

