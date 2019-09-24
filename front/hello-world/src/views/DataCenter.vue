<template>
    
    <div class="center">

        <img src="../assets/dataCenter.jpg" alt="数据中心">


        <div class="title">

            <div class="zn">
                数据中心
            </div>

            <div class="en">
                DATA&nbsp;&nbsp;&nbsp;CENTER
            </div>

        </div>

        <div class="bts">

            <Button :size="btSize" icon="ios-cloud-upload-outline" type="success" class="write">数据采集</Button>
            <Button :size="btSize" icon="ios-download-outline" type="primary" class="download">数据下载</Button>

        </div>

    </div>

</template>


<script>
export default {
    
    data() {

        return {

            btSize: 'large'
            
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


.title {

    position: absolute;
    top: 335px;
    left: 120px;
    width: 200px;
    height: 140px;

}


.zn {

    font-size: 35px;
    text-align: center;
    color: black;
    line-height: 2em;

}


.en {

    font-size: 25px;
    text-align: center;
    color: rgb(182, 173, 173);

}



.download {

    position: absolute;
    top: 460px;
    left: 240px;

}


.write {

    position: absolute;
    top: 460px;
    left: 100px;

}


// .center {



// }


.center img {

    width: 100%;
    height: 100%;

    position: absolute;
    top: 68px;

    z-index: -11;

}




</style>


