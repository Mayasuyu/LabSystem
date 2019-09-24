package service;

import dao.LabDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Lab;

import java.util.List;


@Service("labService")
@Transactional
public class LabServiceImpl implements LabService {

    @Autowired
    private LabDao labDao;


    @Override
    public List<Lab> selectAllLab() {

        return labDao.selectAllLab();

    }

}
