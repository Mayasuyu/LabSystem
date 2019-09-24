<template>
    <div>
        <div class="footer">

            <div class="word">预约时间:</div>

            <div class="footer_no1">
                <DatePicker type="date" :options="options3" size="large" placeholder="Select Date" confirm></DatePicker>
            </div>

            <div class="footer_no2">
                <TimePicker type="timerange" format="HH:mm" :steps="[1, 60, 1]" size="large"  :disabled-hours="hours" confirm></TimePicker>
            </div>

        </div>

    </div>
    
</template>

<script>
    export default {
        data() {

            return {

                    hours:[],           
                    options3: {

                    disabledDate (date) {

                        return date && date.valueOf() < Date.now() - 86400000;

                    }

                }

            }

        },
        
    }

</script>

<style scoped lang="less">

.footer {

    position: absolute;
    left: 0px;
    top: 445px;
    width: 1000px;
    height: 40px;
    background: none;
    font-size: 15px;

}


.footer_no1 {

    position: absolute;
    left: 200px;

}

.word {

    position: absolute;
    left: 76px;
    top: 5px;

}


.footer_no2 {

    position: absolute;
    right: 200px;

}

</style>