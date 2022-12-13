package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author zz
 * @create 2022-12-13 16:55
 */
public interface RegisterService {
    public Map<String ,String > register(String username, String password, String confirmedPassword);
}
