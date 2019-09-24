package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.User;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {

    /**
     *
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     *
     **/
    public List<User> selectAllUser();
    public Integer addUser(User user);
    public Integer deleteUser(String userAccount);
    public User selectUserByUserName(String userAccount);

}
