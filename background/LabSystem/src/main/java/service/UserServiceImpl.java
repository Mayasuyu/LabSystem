package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;

import java.util.List;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String login(User user) {

        List<User> list = userDao.selectAllUser();

        for (User ui: list) {

            if (ui.getUserAccount().equals(user.getUserAccount()) && ui.getPassword().equals(user.getPassword())) {

                return "1";

            }

        }

        return null;

    }


    @Override
    public String addUser(User user) {



        return null;

    }

    @Override
    public String deleteUser(String userAccount) {

        return null;

    }

    @Override
    public String updatePassword(String userAccount, String newPassword) {

        return null;

    }

    @Override
    public String updateInfo(Integer userId, User user) {

        return null;

    }

    @Override
    public String logout(User user) {

        return null;

    }

    @Override
    public User selectUserByUserAccount(String userAccount) {

        return null;

    }

    @Override
    public User selectUserByUserName(String userName) {

        return null;

    }

    @Override
    public List<User> selectAllUser() {

        return null;

    }

    @Override
    public String updateUserRole() {

        return null;

    }


}
