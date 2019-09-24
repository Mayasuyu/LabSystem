package pojo;

import java.util.HashMap;

public class Equipment {

    private String equipmentName;
    private HashMap<String, String> attributions;   // attrbution - value

    public String getEquipmentName() {

        return equipmentName;

    }

    public void setEquipmentName(String equipmentName) {

        this.equipmentName = equipmentName;

    }

    public HashMap<String, String> getAttributions() {

        return attributions;

    }

    public void setAttributions(HashMap<String, String> attributions) {

        this.attributions = attributions;

    }

}
