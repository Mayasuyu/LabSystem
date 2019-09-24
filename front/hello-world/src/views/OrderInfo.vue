<!-- 预约功能页面 -->
<template>
    <div class="mainstyle">
        <div class="corresponding">
            实验室—仪器列表
        </div>
        <div class="box">

            <div class="lab">
                <Table :row-class-name="changeColorLab" :data="showLab"  :columns="column1" size="small" border simple @on-row-click="clickLab"></Table>

                <div class="page">
                    <Page :total="labNumber"  :current="1"  @on-change="changePageLab" :page-size="pageSize" size="small" simple></Page>
                </div>
            </div>


            <div class="equipment">
                <Table :row-class-name="changeColorEquip" :data="showEquip"  :columns="column2" size="small" border simple @on-row-click="clickEquip"></Table>

                <div class="page">
                    <Page :total="equipmentNumber"  :current="1"  @on-change="changePageEquip" :page-size="pageSize" size="small" simple></Page>
                </div>
            </div>

            <!-- 日期组件 -->
            <Date></Date>

            <div class="next">
                <Button type="success" @click="next">下一步</Button>
            </div>

        </div>

        <div class="alter">
            <router-view></router-view>
        </div>

    </div>
</template>

<script>
import Date from '@/components/Date.vue'
import store from '../store.js'

export default {

    name: 'orderInfo',
    components: {

        Date,

    },
    data () {

        return {
            
            message: '',

            checkedLab: '磁控溅射室',
            checkedEquipment: '',

            labIndex: 0,
            equipIndex: 0,

            container: [], 
            pageSize: 8,
                                    // 实验室表格
            labData: [],            // 总实验室
            showLab: [],            // 每页显示的实验室

            labNumber: 0,

            column1: [

                {

                    title: '编号',
                    key: 'index',
                    align: 'center',
                    width: 100,
                },

                {

                    title: '实验室',
                    key: 'lab',
                    align: 'center'

                },

            ],

                                    // 仪器表格
            equipmentData: [],      // 总仪器
            showEquip: [],          // 每页显示的仪器

            equipmentNumber: 0,

            column2: [

                {

                    title: '编号',
                    key: 'index',
                    align: 'center',
                    width: 100,
                
                },

                {

                    title: '仪器',
                    key: 'equipment',
                    align: 'center'

                },

            ],
            
            
            

        }
    
    },

    mounted () {    // 页面加载完成后发送请求

        var _this = this;

        _this.message = 'labList';

        this.axios({

            method:'post',
            
            url: "http://localhost:8080/LabSystem_war_exploded/getLabsAndEquipments",

            headers: {

                'Content-Type': 'application/json;charset=utf-8'
            
            },

            data: _this.message,

            responseType: 'json'    // 默认如此

        }).then((res) => {

            console.log("res.data: " + res.data[0].lId + res.data[0].labName + res.data[0].equipments);

            var resData = res.data;

            _this.container = res.data;

            console.log(_this.container);

            _this.labNumber = resData.length;

            for (var i = 0; i < resData.length; i++) {

                _this.labData.push({

                    index: resData[i].lId,
                    lab: resData[i].labName

                });

            }

            if (_this.labNumber <= _this.pageSize) {     // 实验室数 <= 每页容量

                _this.showLab = _this.labData;

            } else {    // 实验室数 > 每页容量

                _this.showLab = _this.labData.slice(0, _this.pageSize);

            }


            for (var j = 0; j < resData[0].equipments.length; j++) {        // 将仪器表初始化为一个实验室对应的仪器表

                _this.equipmentData.push({

                    index: j + 1,
                    equipment: resData[0].equipments[j]

                });

            }

            _this.equipmentNumber = resData[0].equipments.length;

            if (_this.equipmentNumber <= _this.pageSize) {     // 第一个实验室对应的仪器数量 <= 每页容量

                _this.showEquip = _this.equipmentData.slice(0, _this.equipmentNumber);

            } else {    // 仪器数量 > 每页容量

                _this.showEquip = _this.equipmentData.slice(0, _this.pageSize);

            }

        }).catch((err) => {

            console.log("error.data :" + err.data);
        
        })
            
    },

    methods: {

        next () {

            var _this = this;
            this.$router.push('/orderInfo/listInfo');
        },

        changePageLab(index) {      // 分页Page组件, 控制Lab

            var start = (index - 1) * this.pageSize;
            var end = index * this.pageSize;
            this.showLab = this.labData.slice(start, end);

        },


        changePageEquip(index) {      // 分页Page组件, 控制Equip

            var start = (index - 1) * this.pageSize;
            var end = index * this.pageSize;
            this.showEquip = this.equipmentData.slice(start, end); 

        },


        clickLab(data, index) {
            
            this.checkedLab = data.lab;
            this.labIndex = index;

            this.equipmentData.splice(0, this.equipmentData.length);    // 每次push前清空数组元素
            
            for (var j = 0; j < this.container[index].equipments.length; j++) {

                this.equipmentData.push({

                    index: j + 1,
                    equipment: this.container[index].equipments[j]

                });

            }
            
            this.equipmentNumber = this.container[index].equipments.length;
            
            if (this.equipmentNumber <= this.pageSize) {     // 每个实验室对应的仪器数量 <= 每页容量

                this.showEquip = this.equipmentData;

            } else {    // 仪器数量 > 每页容量

                this.showEquip = this.equipmentData.slice(0, this.pageSize);

            }

        },


        clickEquip(data, index) {

            this.checkedEquipment = data.equipment;
            this.equipIndex = index;

            // alert(this.checkedLab + this.checkedEquipment);

        },

        changeColorLab(row, index) {

            if (index === this.labIndex) {

                    return 'demo-table-info-row';
            
            }

        },

        changeColorEquip(row, index) {      

            if (index === this.equipIndex) {

                return 'demo-table-info-row';

            }

        }

    }

}

</script>

<style scoped lang="less">


.next Button {

    position: absolute;
    left: 735px;
    top: 522px;
    width: 130px;
    height: 40px;
    font-size: 17px;
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


.corresponding {

    position: absolute;
    font-size: 20px;
    color:white;
    left: 687px;
    top: 22px;

}



.box {
    
    position: absolute;
    left: 268px;
    top: 60px;
    width: 1000px;
    height: 580px;
    background: #fff;

}


.page {

    position: absolute;
    top: 362px;
    width: 160px;
    height: 36px;
    left: 155px;

}


.lab {

    position: absolute;
    left: 0px;
    top: 0px;
    width: 500px;
    height: 400px;
    background: #fff;

}


.equipment {

    position: absolute;
    right: 0px;
    top: 0px;
    width: 500px;
    height: 400px;
    background: #fff;

}

.ivu-table .demo-table-info-row td{

    background-color: #2db7f5;
    color: #fff;

}

</style>