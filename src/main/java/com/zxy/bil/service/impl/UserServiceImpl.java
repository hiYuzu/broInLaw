package com.zxy.bil.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxy.bil.dao.IUserDao;
import com.zxy.bil.pojo.User;
import com.zxy.bil.service.IUserService;

/**
 * <p>
 *
 * @author yuzu
 * @Description: User操作服务类实现
 * </p>
 * @date 2018/9/29 16:15
 */
@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUser();
    }

    @Override
    public String getPassword(String userName) {
        return userDao.getPassword(userName);
    }

    @Override
    public int getUserId(String userName) {
        return userDao.getUserId(userName);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}