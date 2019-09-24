package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("equipmentDao")
@Mapper
public interface EquipmentDao {

    public List<String> selectEquipmentByLabId(Integer lId);

}
