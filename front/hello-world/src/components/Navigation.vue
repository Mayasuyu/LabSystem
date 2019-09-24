<template>

<div>
    <div class="hello">
        <!-- <img src="../assets/label.jpg"> -->
        <div class="name">
            <i>Laboratory System</i>
        </div>
        
        <div class="home">
            <router-link to="./main">
                首页
            </router-link>
        </div>
    </div>


    <div class="sea">
        <Input search enter-button placeholder="Enter something..." />
    </div>
    
    <div class="center">
        <Dropdown trigger="hover" @on-click="trigger">
            <div class="person">
                <a href="javascript:void(0)">
                    个人中心
                    <Icon type="ios-arrow-down"></Icon>
                </a>
            </div>
            <DropdownMenu slot="list">
                
                <DropdownItem name="update">
                        修改密码
                </DropdownItem>

                <DropdownItem name="logout">
                        退出
                </DropdownItem>
            
            </DropdownMenu>
        </Dropdown>
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
        
        trigger(name) {

            if (name == 'logout') {

                this.$router.replace('/login');

            } else if (name == 'update') {

                this.$router.push('/');

            }

        }

    },
    

    computed: {
        


    },

    mounted() {
        


    },


}
</script>


<style lang="less" scoped>


.sea {

    width: 320px;
    position: absolute;
    top: 24px;
    left: 58%;

}


.hello {

    font-size: 20px;
    color: white;
    width: 100%;
    height: 68px;
    background: rgb(51, 152, 235);
    position: absolute;
    top: 0px;
    left: 0px;
    border-bottom: solid gray 1px;
    color: white;
}

.hello img {

    width: 80px;
    height: 68px;


}


.center {

    position: absolute;
    left: 88%;
    top: 24px;
    z-index: 11;
    width: 140px;
    height: 32px;
    color: black;
    font-size: 20px;

}

.center:hover {

    color: aliceblue;
    cursor: pointer;
    float: right;

}


.person a {

    color: white;

}



.name {

    font-size: 25px;
    font-weight: bold;
    left: 4%;
    margin-top: 20px;
    position: absolute;

}

.name:hover {
    color: aliceblue;
    cursor: pointer;
}


.home {
    position: absolute;
    left: 25%;
    margin-top: 25px;
    font-size: 22px;
}



.update {
    position: absolute;
    left: 82%;
    margin-top: -40px;

}



.logout {
    position: absolute;     
    left: 92%;
    margin-top: -40px;

}



.hello a {

    text-decoration: none;
    color: white;

}

.hello a:hover {

    color: aliceblue;
    cursor: pointer;

}


</style>


