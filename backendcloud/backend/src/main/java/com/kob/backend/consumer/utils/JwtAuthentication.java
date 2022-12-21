package com.kob.backend.consumer.utils;

import com.kob.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * @author zz
 * @create 2022-12-21 16:50
 */
public class JwtAuthentication {
    public static Integer getUserId(String token){
        int userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e){
            throw new RuntimeException();
        }

        return userId;
    }
}
