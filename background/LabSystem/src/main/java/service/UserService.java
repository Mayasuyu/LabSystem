package service;

import pojo.User;

import java.util.List;

public interface UserService {

    public String login(User user);     // 登录
    public String addUser(User user);   // 添加用户
    public String deleteUser(String userAccount);   // 删除用户
    public String updatePassword(String userAccount, String newPassword);   // 修改密码
    public String updateInfo(Integer userId, User user);    // 修改用户信息
    public String logout(User user);    // 退出
    public User selectUserByUserAccount(String userAccount);    // 通过账号查找用户
    public User selectUserByUserName(String userName);          // 通过姓名查找用户
    public List<User> selectAllUser();                 // 列出所有用户
    public String updateUserRole();     // 修改用户角色
                                        // 修改老师学生关系
}
