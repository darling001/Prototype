package com.gupao.vip.prototype.serializables;

/**
 * Created with IntelliJ IDEA
 *
 * @author : ShenJiaQing
 * @date : 2019/3/19
 * Time: 17:35
 * Description:
 */
public class UserModel {

    private UserMapper userMapper;

    public void addUser(UserRequest request) {
        User user = PrototypeUtil.deepClone(request);
        userMapper.addUser(user);
    }

}
