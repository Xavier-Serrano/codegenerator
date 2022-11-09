package com.aaa.service.impl;

import com.aaa.entity.User;
import com.aaa.mapper.UserMapper;
import com.aaa.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ryan
 * @since 2022-11-05
 */
@Service
public class UserServiceImp extends ServiceImpl<UserMapper, User> implements UserService {

}
