package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.Lab;

import java.util.List;

@Repository("labDao")
@Mapper
public interface LabDao {

    public List<Lab> selectAllLab();

}
