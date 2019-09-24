<template>
    <div class="detail">
        <div class="box">
            <router-link to="./order">
                <div class="total reserve_style" >
                    <div class="littel_reserve">
                        <img src="../assets/equip.png" class="positiontotal">
                        <div class="positionword">仪器预约</div>
                    </div>
                </div>
            </router-link>


            <router-link to="./managerOrder">
                    <div class="total update_style" >
                        <div class="littel_reserve">
                            <img src="../assets/manager.png" class="positiontotal">
                            <div class="positionword">预约管理</div>
                        </div>
                    </div>
                </router-link>

        </div>


    </div>
</template>

<script>
export default {
    
    data() {

        return {



        }


    },

    methods: {



    },

    computed: {
        


    },

    mounted() {
        


    },



}
</script>



<style lang="less" scoped>

img {

    width: 135px;
    height: 135px;

}

.positiontotal {
    
    position: absolute;
    top: 35px;
    left: 108px;

}

.positionword {
    
    position: absolute;
    top: 198px;
    width: 100%;
    color: #42b983;
    font-size: 25px;
    
}


.detail {

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
    width: 350px;
    height: 270px;
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
    top: 135px;
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

</style>