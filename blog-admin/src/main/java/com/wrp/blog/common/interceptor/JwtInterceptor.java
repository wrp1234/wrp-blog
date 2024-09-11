package com.wrp.blog.common.interceptor;

import com.wrp.blog.common.exception.BusinessException;
import com.wrp.blog.util.jwt.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author wrp
 * @since 2024-09-10 23:28
 **/
@Component
@Slf4j
@AllArgsConstructor
public class JwtInterceptor implements HandlerInterceptor {

    private JwtUtils jwtUtils;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断当前拦截到的是Controller的方法还是其他资源
        if(!(handler instanceof HandlerMethod)){
            // 当前拦截到的不是动态方法，直接放行
            return true;
        }
        //从请求头中获取令牌
        String token = request.getHeader(jwtUtils.getTokenName());
        if(!StringUtils.hasText(token)) {
            throw new BusinessException("miss token");
        }
        //校验令牌
        String username;
        try{
            username = jwtUtils.parseJWT(token);
            // TODO redis 获取登录的用户信息,并将用户信息存放在UserHolder中
        } catch (Exception e){
            throw new BusinessException("token error");
        }

        if(!StringUtils.hasText(username)){
            throw new BusinessException("token is invalid");
        }

        return true;
    }
}
