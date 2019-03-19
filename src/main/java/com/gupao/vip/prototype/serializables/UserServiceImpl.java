package com.gupao.vip.prototype.serializables;

/**
 * Created with IntelliJ IDEA
 *
 * @author : ShenJiaQing
 * @date : 2019/3/19
 * Time: 17:34
 * Description:
 */

public class UserServiceImpl implements UserService{



    @Override
    public void addUser(UserRequest request) {
        UserModel userModel = new UserModel();
        userModel.addUser(request);
    }
}
