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

import java.util.Arrays;

/**
 * @author zhoulihuang
 */
public class SimpleName {

  public static void main(String[] args) {
    String name = SimpleName.class.getName();
    System.out.println(name);
    String simpleName = SimpleName.class.getSimpleName();
    System.out.println(simpleName);
    char c = simpleName.charAt(0);
    System.out.println(c);
    /** 原生类型 */
    char[] chars = simpleName.toCharArray();
    System.out.println(chars);
    System.out.println(Arrays.toString(chars));
    System.out.println(Arrays.asList(chars));

    /** 原生类型封装类 */
    Character[] arrChar = {'M', 'a'};
    System.out.println(arrChar);
    System.out.println(Arrays.toString(arrChar));
    System.out.println(Arrays.asList(arrChar));
    /** 类 */
    String[] arrStr = {"M", "a"};
    System.out.println(arrStr);
    System.out.println(Arrays.toString(arrStr));
    System.out.println(Arrays.asList(arrStr));
  }
}
