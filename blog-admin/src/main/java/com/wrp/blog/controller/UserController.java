package com.wrp.blog.controller;

import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import com.wrp.blog.controller.support.LoginUserParam;
import com.wrp.blog.controller.support.RegisterUserParam;
import com.wrp.blog.controller.support.UpdateUserParam;
import com.wrp.blog.service.UserService;
import com.wrp.blog.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wrp
 * @since 2024-09-08 21:45
 **/
@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("register")
    public Result<Long> register(@RequestBody @Validated RegisterUserParam registerUser) {
        Long id = userService.register(registerUser);
        return ResultUtils.success(id);
    }

    @PostMapping("login")
    public Result<UserVo> login(@RequestBody @Validated LoginUserParam loginUser) {
        UserVo userVo = userService.login(loginUser);
        return ResultUtils.success(userVo);
    }

    @PutMapping()
    public Result<Long> updateUser(@RequestBody @Validated UpdateUserParam updateUser) {
        Long id = userService.updateUser(updateUser);
        return ResultUtils.success(id);
    }

}
