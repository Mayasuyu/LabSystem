package pojo;

import java.util.Date;

public class Order {

    private Integer orderId;
    private Integer numberId;   // 样品序号
    private String labName;
    private String equipmentName;
    private Date startTime;
    private Date endTime;
    private Integer userId;     // 此次实验用户
    private Integer state;

    public Integer getUserId() {

        return userId;

    }


    public void setUserId(Integer userId) {

        this.userId = userId;

    }

    public Integer getState() {

        return state;

    }

    public void setState(Integer state) {

        this.state = state;

    }

    public Integer getOrderId() {

        return orderId;

    }

    public void setOrderId(Integer orderId) {

        this.orderId = orderId;

    }

    public Integer getNumberId() {

        return numberId;

    }

    public void setNumberId(Integer numberId) {

        this.numberId = numberId;

    }

    public String getLabName() {

        return labName;

    }

    public void setLabName(String labName) {

        this.labName = labName;

    }

    public String getEquipmentName() {

        return equipmentName;

    }

    public void setEquipmentName(String equipmentName) {

        this.equipmentName = equipmentName;

    }

    public Date getStartTime() {

        return startTime;

    }

    public void setStartTime(Date startTime) {

        this.startTime = startTime;

    }

    public Date getEndTime() {

        return endTime;

    }

    public void setEndTime(Date endTime) {

        this.endTime = endTime;

    }

}
