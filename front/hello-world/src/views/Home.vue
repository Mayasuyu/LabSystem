<template>
    <div class="mainstyle">
        <div> 
            <div class="box">
                
                <router-link to="./orderDetail">
                    <div class="total reserve_style" >
                        <div class="littel_reserve">
                            <img src="../assets/predict.png" class="positiontotal">
                            <div class="positionword">预约系统</div>
                        </div>
                    </div>
                </router-link>

                <router-link to="./learning">
                    <div class="total update_style">
                        <div class="littel_update">
                            <img src="../assets/learning.png" class="positiontotal">
                            <div class="positionword">模型训练</div>
                        </div>
                    </div>
                </router-link>

                <router-link to="./dataCenter">
                    <div class="total data_style" >
                        <div class="littel_data">
                            <img src="../assets/center.png" class="positiontotal">
                            <div class="positionword">数据中心</div>
                        </div>
                    </div>
                </router-link>

                <router-link to="./analysis">
                    <div class="total cancel_style">
                        <div class="littel_cancel">
                            <img src="../assets/data.png" class="positiontotal">
                            <div class="positionword">数据分析</div>
                        </div>
                    </div>
                </router-link>

            </div>

        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style lang="less" scoped>

img {

    width: 100px;
    height:100px;

}

.positiontotal {
    
    position: absolute;
    top: 20px;
    left: 100px;

}

.positionword {
    
    position: absolute;
    top: 148px;
    width: 100%;
    color: #42b983;
    font-size: 20px;
    
}

// .mainstyle {

//     text-align: center;
//     width: 100%;
//     height: 698px;
//     background:#fafafb;

// }

.mainstyle {

    position: absolute;
    left: 0px;
    top: 68px;
    width: 100%;
    height: 670px;
    text-align: center;
    background: -webkit-linear-gradient( rgb(102, 176, 236) ,rgb(179, 200, 211)); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient( rgb(102, 176, 236), rgb(179, 200, 211)); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(rgb(102, 176, 236),rgb(179, 200, 211)); /* Firefox 3.6 - 15 */
    background: linear-gradient( rgb(59, 158, 238) , rgb(94, 180, 226)); /* 标准的语法 */

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
