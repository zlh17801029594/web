/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/15 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill._class;

/**
 * @author zhoulihuang
 */
public class NewInstance {

  private String msg = "hello world!";

  @Override
  public String toString() {
    return "NewInstance{" +
        "msg='" + msg + '\'' +
        '}';
  }

  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    Class<NewInstance> newInstanceClass = NewInstance.class;
    NewInstance newInstance = newInstanceClass.newInstance();
    System.out.println(newInstance);
  }
}
