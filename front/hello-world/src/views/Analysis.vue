<template>
    
<div class="mainstyle">

    <div class="box">
                
        <!-- <router-link to="./orderDetail"> -->
        <a href="#">
            <div class="total reserve_style" >
                <div class="littel_reserve">
                    <img src="../assets/gradient.png" class="positiontotal">
                    <div class="positionword">
                        Line Gradient
                    </div>
                </div>
            </div>
        </a>
        <!-- </router-link> -->

        <!-- <router-link to="./learning"> -->
        <a href="#">
            <div class="total update_style">
                <div class="littel_update">
                    <img src="../assets/column.png" class="positiontotal">
                    <div class="positionword">
                        Column Diagram
                    </div>
                </div>
            </div>
        </a>
        <!-- </router-link> -->

        <!-- <router-link to="./dataCenter"> -->
        <a href="#">
            <div class="total data_style" >
                <div class="littel_data">
                    <img src="../assets/regression.png" class="positiontotal">
                    <div class="positionword">
                        Fitting Diagram
                    </div>
                </div>
            </div>
        </a>
        <!-- </router-link> -->

        <!-- <router-link to="./analysis"> -->
        <a href="#">
            <div class="total cancel_style">
                <div class="littel_cancel">
                    <img src="../assets/box.png" class="positiontotal">
                    <div class="positionword">
                        BoxPlot Diagram
                    </div>
                </div>
            </div>
        </a>
        <!-- </router-link> -->

    </div>



    <div class="analysis">
        
        <Menu active-name="1-2" :open-names="['1']" :theme="theme">

            <MenuItem name="1-1">折线图</MenuItem>
            <MenuItem name="1-2">柱状图</MenuItem>
            <MenuItem name="1-3">饼状图</MenuItem>
            <MenuItem name="1-4">散点图</MenuItem>
            <MenuItem name="1-5">K线图</MenuItem>


            <MenuItem name="2-1">相关矩阵图</MenuItem>
            <MenuItem name="2-2">散点矩阵图</MenuItem>


            <MenuItem name="3-1">条形图</MenuItem>
            <MenuItem name="3-2">关系图</MenuItem>

            <MenuItem name="4-1">密度图</MenuItem>
            <MenuItem name="4-2">箱线图</MenuItem>
            <MenuItem name="4-3">多变量图表</MenuItem>
            <MenuItem name="4-4">雷达图</MenuItem>

        </Menu>
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
    height: 92%;
    text-align: center;
    background: -webkit-linear-gradient( rgb(102, 176, 236) ,rgb(179, 200, 211)); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient( rgb(102, 176, 236), rgb(179, 200, 211)); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(rgb(102, 176, 236),rgb(179, 200, 211)); /* Firefox 3.6 - 15 */
    background: linear-gradient( rgb(59, 158, 238) , rgb(94, 180, 226)); /* 标准的语法 */

}


.analysis {

    position: absolute;
    top: 0px;
    left: 0px;

}






img {

    width: 180px;
    height:140px;

}


.positiontotal {
    
    position: absolute;
    top: 20px;
    left: 60px;

}


.positionword {
    
    position: absolute;
    top: 165px;
    width: 100%;
    color: #42b983;
    font-size: 20px;
    
}


.total {

    background: #fff;
    width: 300px;
    height: 200px;
    transition: all .4s;
    border-radius: 2%;

}

.total:hover {

    transform: translateY(-2%);
    box-shadow: 1px 4px 10px 2px #ccc;
    -webkit-box-shadow: 1px 4px 10px 2px #ccc;
    -moz-box-shadow: 1px 4px 10px 2px  #ccc;
    transition: all .4s;
    -webkit-transition: all .4s;
}

.box {

    position: relative;
    left: 268px;
    top:100px;
    height: 500px;
    width: 1000px;
    background: none;
    
}

.reserve_style {

    position: absolute;
    left: 80px;
    top: 20px;

}

.update_style {

    position: absolute;
    top: 20px;
    right: 80px;

}

.data_style {

    position: absolute;
    bottom: 20px;
    left: 80px;

}

.cancel_style {

    position: absolute;
    right: 80px;
    bottom: 20px;

}



</style>




