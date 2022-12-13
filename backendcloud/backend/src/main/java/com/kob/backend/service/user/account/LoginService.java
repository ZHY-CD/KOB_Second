package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author zz
 * @create 2022-12-13 16:54
 */
public interface LoginService {
    public Map<String ,String > getToken(String username, String password);
}
