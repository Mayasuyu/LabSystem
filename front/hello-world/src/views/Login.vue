<!-- 登陆界面 -->
<template>
<div class="all">
    <div class="picture">

    </div>
    <div class="mydiv">

        <div class="left_div">
            <div class="left_div_h">
                材料实验室仪器预约系统
            </div>
        </div>

            <p class="p_Welcome">WELCOME!</p>

        <div class="input">

            <div class="user_id">
                用户名:
            </div>

            <Input type="text" prefix="ios-contact" v-model="user.userAccount" class="input_style" /><br/>
            
            <div class="user_pass">
                密码:
            </div>
            
            <Input type="password" prefix="ios-star" v-model="user.password" class="input_style" /><br/>

        </div>

        <router-link to="">
            <div class="forget">
                忘记密码?
            </div>
        </router-link>

        <router-view></router-view>
        
        <div class="button">

            <button  @click="login">登&nbsp;&nbsp;&nbsp;录</button>
        
        </div>

        <!-- <div class="success" v-show="show === true">
            <Alert type="success" show-icon closable>
                登录成功！
            </Alert>
        </div>


        <div class="fail" v-show="show === false">
            <Alert type="error" show-icon closable>
                用户名或密码输入错误！
            </Alert>
        </div> -->
    
    </div>

</div>
</template>

<script>
import store from '../store.js'
    export default {

        name:'login',
        data () {

        return {

            show: null,

            user: {

                userAccount: '',
                password: '',

            },

            // message: 0

        }

    },

    methods: {

        login: function () {

            var _this = this;

            this.axios({

                method: 'post',
                
                url: "http://localhost:8080/LabSystem_war_exploded/login",

                headers: {

                    'Content-Type': 'application/json;charset=utf-8'
                
                },

                data: JSON.stringify(_this.user),

                // data: _this.$Qs.stringify({
                    
                //     message: _this.message

                // }),
                
                responseType: 'json'

            }).then (function (response) {
                
                console.log("success!"); 
                if (response.data == '1') {
                    
                    _this.$router.replace('/main');
                    console.log("successful!!!");                                       
                    _this.$Message.success('登录成功');
                    
                } else if (response.data == '0') {
                    
                    _this.$Message.error('用户名或密码输入错误！');
                    console.log("failed!");

                    
                }

            }).catch (function (error) {

                console.log("error.data : " + error.data);

            });

        }

    },

    computed: {


    }
    }
</script>

<style lang="less"  scoped>

.forget {

    // margin-left: 432px;
    // margin-top: 135px;
    position: absolute;
    left: 416px;
    top: 188px;
    font-size: 15px;
    color: black;

}


.forget:hover {

    color: red;
    cursor: pointer;

}


.user_id {

    position: absolute;
    left: -3px;
    top: -27px;

}


.user_pass {

    position: absolute;
    left: -3px;
    top: 46px;

}

.picture {

    position: absolute;
    left: 595px;
    top: 63px;
    background-image: url('../assets/whut.png');
    width: 300px;
    height: 66px;

}

.button button {

    position: absolute;
    left: 245px;
    top: 238px;
    width: 160px;
    height: 36px;
    font-size: 18px;
    background: rgb(51, 152, 235);
    color: white;
    border: 0px;
    border-radius: 3%;
    cursor: pointer;

}


.button button:hover {

    color: aliceblue;

}

.input {

    position: absolute;
    left: 177px;
    top: 63px;
    width: 300px;
    height: 200px;
    font-size: 15px;

}

div .p_Welcome {

    width: 100px;
    height: 50px;
    font-size: 20PX;
    position: relative;
    left: 290px;
    top: 5px;

}


.all {

    position: absolute;
    top: -15px;
    left: -15px;
    width: 1536px;
    height: 722px;
    /* background-image: url('../assets/999.jpg'); */
    background-color: black;
    background-size: 1536px 722px;
    background-repeat: no-repeat;
}


.mydiv {
    
    position: absolute;
    top: 164px;
    left: 29%;
    background: rgb(255, 255, 255);
    width: 600px;
    height: 360px;

}

*{

    padding: 0;
    margin: 15px;

}


.input_style {

    width: 300px;
    height: 40px;

}


// div button {

//     font-family: fantasy;
//     font-size: 15px;
//     height: 36px;
//     width: 170px;

// }


.left_div {

    width: 140px;
    height: 100%;
    position: absolute;
    left: -15px;
    top: -15px;
    background: -webkit-linear-gradient( rgb(42, 132, 206) ,rgb(179, 200, 211)); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient( rgb(42, 132, 206), rgb(179, 200, 211)); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(rgb(42, 132, 206),rgb(179, 200, 211)); /* Firefox 3.6 - 15 */
    background: linear-gradient( rgb(42, 132, 206) , rgb(179, 200, 211)); /* 标准的语法 */

}


.left_div_h {

    font-size: 20px;
    // position:absolute;
    // left: 40px;
    // top: 0px;
    margin-left: 55px;
    margin-top: -12px;
    width: 20px;
    color: rgb(255, 255, 255);

}

</style>