package pojo;

import util.Utils;

import java.io.Serializable;
import java.util.ArrayList;

public class Lab implements Serializable {

    private Integer lId;
    private String labName;
    private ArrayList<String> equipments;


    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public ArrayList<String> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<String> equipments) {

        this.equipments = (ArrayList<String>) Utils.deepCopy(equipments);

    }

}
