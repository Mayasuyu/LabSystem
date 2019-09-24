package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.Lab;
import service.EquipmentService;
import service.LabService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
public class LabController {

    @Autowired
    private LabService labService;

    @Autowired
    private EquipmentService equipmentService;

    public static Logger log = Logger.getLogger(LabController.class.getClass());

    @RequestMapping(value = "/getLabsAndEquipments", method = RequestMethod.POST)
    @ResponseBody
    public List<Lab> selectLabsAndEquipments(@RequestBody String message) {

        List<Lab> labs = new ArrayList<Lab>();
        Integer id;

        log.info(message);

        if (message.equals("labList")) {

            for (Lab lab: labService.selectAllLab()) {

                id = lab.getlId();
                lab.setEquipments((ArrayList<String>) equipmentService.selectEquipmentByLabId(id));
                labs.add(lab);

            }

            return labs;


        } else {

            return null;

        }

    }

}
