<template>

<div class="main">
    <div class="all">

        <div class="logo">
            <img src="../assets/014.jpg"> 
            <p>Laboratory System</p>
        </div>

        <div class="per1">
            <p><span>*</span>账号</p>
            <input type="text" v-model="user.userAccount">
        </div>
        
        <div class="per2">
            <p><span>*</span>密码</p>
            <input type="password" v-model="user.password">
        </div>

        <div class="operation">
            <button v-on:click="login">登&nbsp;录</button>
    
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">忘记密码?</a></p>
            <p>尚未拥有账户?&nbsp;<a href="#">注册</a></p>
        </div>

    </div>
</div>

</template>


<script>

export default {
    
    name: 'login',

    data () {

        return {

            user: {

                userAccount: '',
                password: '',

            },

            // mesage: 0

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
                    
                //     mesage: _this.mesage

                // }),
                
                responseType: 'json'

            }).then (function (response) {
                
                if (response.data == '1') {
                
                    console.log("successful!!!");
                    _this.$router.replace('/main');
                    alert("登陆成功！");

                } else if (response.data == '0') {
                    
                    console.log("failed!");
                    alert("用户名或密码输入错误!");

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


<style lang="less" scoped>

.main {

    height: 688px;
    width: 100%;
    background-color: #f8f8f9;
    margin: 0px 0px;
    padding: 0px 0px;   

}

.all {

    width: 400px;
    height: 500px;
    position: absolute;
    top: 90px;
    left: 520px;
    background-color: #fff;
    /* border: solid 1px black; */

}

.all span {

    color: red;

}

.all input {

    width: 330px;
    height: 30px;
    border: 1px solid rgb(226, 223, 223);
    border-radius: 4%;
    font-size: 16px;

}


.logo {

    margin-left: 24px;
    margin-top: 35px;
    border-bottom: solid 1px rgb(218, 216, 216);
    width: 330px;
    height: 80px;
    /* border: solid 1px black; */

}

.logo p {

    font-size: 24px;
    margin-left: 75px;
    margin-top: -49px;
    color: rgb(38, 96, 255);

}


.logo img {

    width: 55px;
    height: 55px;
    border-radius: 50%;
    margin-left: 12px;
    margin-top: 16px;

}


.per1 {

    margin-left: 25px;
    margin-top: 30px;

}

.per1 input {

    margin-top: -15px;

}


.per2 {

    margin-left: 25px;
    margin-top: 18px;

}


.per2 input {

    margin-top: -15px;

}




.operation {

    width: 350px;
    height: 155px;
    margin-top: 22px;
    margin-left: 20px;
    
    /* border: solid 1px black;  */

}


.operation button {

    width: 100px;
    height: 35px;
    color: white;
    border: 0px;
    font-size: 20px;
    border-radius: 6%;

    margin-top: 22px;
    margin-left: 116px;
    border-color: #19be6b;
    background-color: #19be6b;

}




.operation a {

    color: #2d8cf0;
    cursor: pointer;
    text-decoration: none;
    margin-left: 8px;

}


.operation p {

    color: black;
    margin-left: 97px;
    margin-top: 20px;

}

a:hover {

    color: red;

}


</style>
