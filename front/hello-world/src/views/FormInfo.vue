<template>
    <div class="dialog-cover mainstyle">

        <div class="dialog-content">
            <div class="k">
                <div class="c" v-for="(value, key, index) in FormData" :key="index">
                    <Form :model="formTop" label-position="top">
                            <FormItem label=""> 
                                {{ key }} :
                                <Input v-bind="value" placeholder="value" />
                            </FormItem>
                    </Form>
                </div>
            </div>

            <div class="sureButton">
                <Button type="primary" shape="circle" @click="modifyData" long>修改</Button>
            </div>
            
            <div class="removeButton">
                <Button type="error" shape="circle" @click="dialogRemove" long>取消</Button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    
    props: ['parentToChild'],

    data () {

        return {

            FormData: {},
            testData: {}
        
        }

    },
    methods: {

        dialogRemove () {
            
            this.$router.replace('/managerOrder')
        
        },
        modifyData () {

            this.$emit('')
            this.$router.replace('/managerOrder')
            this.$Message.success("修改成功！");
    
        }
    
    },
    created () {
    
        this.FormData = this.parentToChild
        this.testData = this.parentToChild
    
    }

}
</script>

<style scoped lang="less">

.mainstyle {

    text-align: left;

}


.dialog-content {

    position: fixed;
    z-index: 11;
    top: 100px;
    left: 25%;
    width: 50%;
    height: 600px;
    border: 1px solid black;
    background: white;
    border-radius: 20px;
    overflow: hidden;

}


.dialog-cover {

    background: rgba(0, 0, 0, 0.8);
    position: fixed;
    z-index: 5;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;

}


.removeButton {

    position: absolute;
    z-index: 10;
    top: 520px;
    left: 60%;
    width: 100px;
    height: 56px;

}


.sureButton {

    position: absolute;
    z-index: 10;
    top: 520px;
    left: 27%;
    width: 100px;
    height: 56px;

}


.k {

    position: fixed;
    z-index: 10;
    top: 130px;
    left: 30%;
    width: 40%;
    height: 440px;
    background: white;
    overflow-y: scroll;

}


.c {

    width: 400px;

}



</style>
