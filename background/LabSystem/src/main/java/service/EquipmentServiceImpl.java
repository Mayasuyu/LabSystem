package service;

import dao.EquipmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("equipmentService")
@Transactional
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentDao equipmentDao;

    @Override
    public List<String> selectEquipmentByLabId(Integer lId) {

        return equipmentDao.selectEquipmentByLabId(lId);

    }

}
