/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/15 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill._object;

/**
 * @author zhoulihuang
 */
public class ToString {

  public static void main(String[] args) {
    ToString toString = new ToString();
    System.out.println(toString);
    int hashCode = toString.hashCode();
    System.out.println(hashCode);
    String hexString = Integer.toHexString(hashCode);
    System.out.println(hexString);
  }
}
