<!-- 取消预约最后那个表 -->
<template>

<div class="mainstyle">
    
    <div class="manager">预约信息管理</div>
    <div class="style">

        <div class="fine">

            <Table border :columns="column1" :data="historyForm"></Table>
            <Page :total="Formcount" :page-size="5" class="ct" @on-change="pageChange" simple></Page>

        </div>

        <div class="dialog">

            <router-view :parentToChild="historyData"></router-view>

        </div>

    </div>

</div>

</template>

<script>
export default {

    name: 'timemanage',
    data () {

    return {

        Formcount: 0,
        value: '',
        
        column1: [
        
            {
                title: '样品',
                key: 'item',
                width: 100,
                align: 'center'
            },

            {
                title: '预约时间',
                key: 'time',
                align: 'center'
            },

            {
                title: '地点',
                key: 'address',
                align: 'center'
            },

            {
                title: '状态',
                key: 'state',
                width: 100,
                align: 'center'
            },

            {
                title: '操作',
                key: 'operate',
                width: 200,
                align: 'center',

                render: (h, params) => {

                    return h('div', [

                        h('Button', {

                            style: {

                                marginRight: '5px',
                                background: 'red',
                                color: 'white'

                            },

                            on: {

                                click: () => {

                                    this.show(params.index)
                                
                                }
                            
                            }

                        }, '修改'),

                        h('Button', {

                            style: {

                            background: 'blue',
                            color: 'white'

                            },
                            on: {

                                click: () => {
                                    
                                    alert("您确定要取消吗?");
                                    this.cancel(params.index)

                                }

                            }

                        }, '取消')

                    ])

                }

            }

        ],

        testForm: [

            {
                item: '001',
                time: '2019-05-01  00:00-04:00',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '002',
                time: '2019-05-01  01:00-14:00',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '003',
                time: '2019-05-02  00:00-04:00',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '004',
                time: '2019-05-04 10:00-19:00',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '005',
                time: '2019-05-04 10:00-19:00',
                address: '锂电室',
                state: '已预约'
            },

            {
                item: '006',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '007',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '008',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '009',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '010',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '011',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '012',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '013',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '014',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '015',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            },

            {
                item: '016',
                time: '0321',
                address: '介电室TSDC',
                state: '已预约'
            }

        ],
        historyData: {

        },
        historyForm: [

        ],
        testData: [

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime2: '300'

            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            
            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {

                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'

            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime: '300'
            },

            {
                temperatureLow: '600',
                temperatureHigh: '1900',
                voltage: '60',
                heatingRate: '100',
                holdingTime: '20',
                popolarizationTime1: '300'
            }

        ]

    }

    },
    methods: {

        getForm () {

            this.historyForm = this.testForm.slice(0, 5)
            this.Formcount = this.testForm.length

        },

        pageChange (index) {

            const _start = (index - 1) * 5
            const _end = index * 5
            this.historyForm = this.testForm.slice(_start, _end)
        
        },

        show (index) {

            this.historyData = this.testData[index]
            this.$router.push('/managerOrder/formInfo')

        },

        cancel (index) {

            this.testForm.splice(index, 1)
            this.historyForm.splice(index, 1)
            this.Formcount = this.testForm.length

        }

    },

    created () {
    
        this.getForm()
    
    }

}
</script>

<style scoped lang="less">


.manager {

    position: absolute;
    top: 54px;
    left: 45%;
    font-size: 24px;
    color: white;
}


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



.fine {

    position: relative;
    top: 100px;
    left: 10%;
    width: 80%;

}


.ct {

    float: right;

}


.remove {

    float: left;

}

.dialog {

    position: relative;
    color: #2e2c2d;
    font-size: 16px;

}

.style {

    position: relative;
    height: 500px;
    width: 100%;

}

</style>
