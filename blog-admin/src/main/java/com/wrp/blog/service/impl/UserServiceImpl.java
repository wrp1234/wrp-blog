package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.controller.support.LoginUserParam;
import com.wrp.blog.controller.support.RegisterUserParam;
import com.wrp.blog.controller.support.UpdateUserParam;
import com.wrp.blog.domain.User;
import com.wrp.blog.mapper.UserMapper;
import com.wrp.blog.service.UserService;
import com.wrp.blog.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * @author wrp
 * @since 2024-09-08 21:19
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public Long register(RegisterUserParam registerUser) {
        return 0L;
    }

    @Override
    public UserVo login(LoginUserParam loginUser) {
        return null;
    }

    @Override
    public Long updateUser(UpdateUserParam updateUser) {
        return 0L;
    }
}
