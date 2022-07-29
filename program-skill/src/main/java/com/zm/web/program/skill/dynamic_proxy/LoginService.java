/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/3 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill.dynamic_proxy;

import org.springframework.stereotype.Service;

/**
 * @author zhoulihuang
 */
@Service
public class LoginService {

  public String login(String username, String password) {
    return "token";
  }

  public void obtainUserInfo(String param) {
    try {
      System.out.println("调用获取用户信息接口！" + param);
    } catch (Exception e) {
      e.printStackTrace();
      if (e instanceof RuntimeException) {
        // 要保证如果是获取用户信息接口401异常，则一直调用；其他异常则跳出循环。
        String zlh = login("zlh", "123456");
        // System.out.println("调用获取用户信息接口！");
        obtainUserInfo(param);
      }
    }
  }
}
