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

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author zhoulihuang
 */
public class LoginServiceProxy {

  @Autowired
  private LoginService loginService;

  /** 登录接口没有401一说，仅用于演示Supplier */
  public String login(String username, String password) {
    Supplier<String> loginProxy = () -> loginService.login(username, password);
    try {
      return loginProxy.get();
    } catch (Exception e) {
      if (e instanceof RuntimeException) { // 401
        // 调用登录接口
        System.out.println("登录");
        // return loginProxy.get();
        return login(username, password);
      }
      throw e;
    }
  }

  public void obtainUserInfo(String param) {
    Consumer<String> obtainUserInfoProxy = (param1) -> loginService.obtainUserInfo(param1);
    try {
      obtainUserInfoProxy.accept(param);
    } catch (Exception e) {
      if (e instanceof RuntimeException) { // 401
        // 调用登录接口
        loginService.login("zlh", "123456");
        // obtainUserInfoProxy.accept(param);
        obtainUserInfo(param);
        return;
      }
      throw e;
    }
  }

  public void obtainUserInfo02(String param) {
    for (int i = 0; i < 11; i++) {
      try {
        loginService.obtainUserInfo(param);
        break;
      } catch (Exception e) {
        if (e instanceof RuntimeException && i < 10) { // 401
          // 调用登录接口
          loginService.login("zlh", "123456");
          continue;
        }
        throw e;
      }
    }
  }

  public String login02(String username, String password) {
    int i = 0;
    do {
      try {
        return loginService.login(username, password);
      } catch (Exception e) {
        if (e instanceof RuntimeException && i < 10) { // 401
          // 调用登录接口
          System.out.println("调用登录接口");
          i++;
          continue;
        }
        throw e;
      }
    } while (true);
  }
}
