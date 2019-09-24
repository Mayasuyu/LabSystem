<template>
    <div class="back">

        <div class="title">样品清单</div>

        <div class="fine2">

            <Table border :columns="column1" :data="historyItem"></Table>
            
                <Page :total="itemCount" :page-size="PageSize" class="page" @on-change="pageChange" simple></Page>
            
            <div class="addBox">
            
                <Button type="primary" @click="addItem">添加样品</Button>
            
            </div>
        
        </div>

        <div class="dialog">
        
            <router-view></router-view>
        
        </div>

    </div>

</template>

<script>

export default {
    
    data () {

        return {

            ifvisible: false,

            itemCount: 0,

            PageSize: 7,

            column1: [

                {

                    title: '序号',
                    key: 'item',
                    width: 100

                },

                {

                    title: '样品',
                    key: 'name',
                    align: 'center'

                },
                {

                    title: ' ',
                    key: 'operate',
                    width: 100,

                    render: (h, params) => {
                        
                        return h('Button', {

                            on: {
                        
                                click: () => {
                                
                                    this.makeAppointment(params.index)
                                
                                }
                            
                            },

                            style: {

                                background: 'rgb(18, 107, 240)',
                                color: 'white'

                            },
                        
                        }, '预约')

                    }

                }

            ],

            testItem: [

                {

                    item: '001',
                    name: 'BaCO3'
                
                },
                
                {

                    item: '002',
                    name: 'KPO4'

                },

                {

                    item: '003',
                    name: 'BaSO4'

                },

                {

                    item: '004',
                    name: 'KCO3'

                },

                {

                    item: '001',
                    name: 'BaCO3'
                
                },

                {
                item: '002',
                name: 'KPO4'
                },
                {
                item: '003',
                name: 'BaSO4'
                },
                {
                item: '004',
                name: 'KCO3'
                },
                {
                item: '001',
                name: 'BaCO3'
                },
                {
                item: '002',
                name: 'KPO4'
                },
                {
                item: '003',
                name: 'BaSO4'
                },
                {
                item: '004',
                name: 'KCO3'
                }
            ],

            historyItem: [],

        }
    },
    methods: {

        getItem () {

            this.historyItem = this.testItem.slice(0, this.PageSize)
            this.itemCount = this.testItem.length
        
        },
        
        pageChange (index) {
        
            const _start = (index - 1) * this.PageSize
            const _end = index * this.PageSize
            this.historyItem = this.testItem.slice(_start, _end)
        
        },
        
        makeAppointment (index) {
        
            this.$router.push('/orderInfo')

        },
        
        addItem () {
            
            this.$router.push('/order/bar')
        
        }
    
    },

    watch: {

        $route: {

            handler: function () {
            
                this.historyItem = this.testItem.slice(0, this.PageSize);
                this.itemCount = this.testItem.length;
            
            }
        
        }
    
    },

    created () {

        this.getItem();
    
    }

}
</script>


<style lang="less">

.title {
    
    position: absolute;
    top: 50px;
    left: 45%;
    color: white;
    font-size: 25px;
    font-display: initial;

}


.addBox button {

    margin-top: 40%;
    width: 80px;
    height: 40px;
    font-size: 16px;
    text-indent: -0.5em;
    font-weight: bold;

}


.back {

    position: absolute;
    left: 0px;
    top: 68px;
    width: 100%;
    height: 100%;
    background: -webkit-linear-gradient( rgb(102, 176, 236) ,rgb(179, 200, 211)); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient( rgb(102, 176, 236), rgb(179, 200, 211)); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(rgb(102, 176, 236),rgb(179, 200, 211)); /* Firefox 3.6 - 15 */
    background: linear-gradient( rgb(59, 158, 238) , rgb(94, 180, 226)); /* 标准的语法 */

}


.fine2 {

    position: absolute;
    top: 100px;
    left: 18%;
    width: 60%;

}


.page {

    left: 712px;
    margin-top: 1%;
    position: absolute;

}


.addBox {

    margin-top: 10px;
    float: right;
    
}


.dialog-input {

    position: fixed;
    z-index: 11;
    top: 250px;
    left: 35%;
    width: 30%;
    height: 100px;
    border: 1px solid black;
    background: white;
    border-radius: 15px;
    text-align: center;
    overflow: hidden;

}


.bl {

    position: absolute;
    top: 15px;
    left: 20px;
    width: 350px;

}


.mk {

    position: absolute;
    top: 58px;
    left: 98px;
    
}


.mk2 {

    position: absolute;
    top: 58px;
    left: 220px;

}


.dialog {

    position: relative;
    color: #2e2c2d;
    font-size: 16px;

}

.ivu-table .demo-table-info-row td{

    background-color: #2db7f5;
    color: #fff;

}

</style>