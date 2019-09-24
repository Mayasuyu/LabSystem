package test;

import controller.LabController;
import dao.EquipmentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Equipment;
import pojo.Lab;
import service.EquipmentService;
import service.LabService;



public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        EquipmentService ls = (EquipmentService) context.getBean("equipmentService");

//        EquipmentDao dao = (EquipmentDao) context.getBean("equipmentDao");
//
//        for (String c: ls.selectEquipmentByLabId(3)) {
//
//            System.out.println(c);
//
//        }

        LabController lc = (LabController) context.getBean("labController");

//        lc.selectLabsAndEquipments("labList");

//        for (Lab l: lc.selectLabsAndEquipments()) {
//
//            System.out.println(l.getlId() + l.getLabName() + l.getEquipments());
//
//        }

    }

}
