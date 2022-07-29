/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/26 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill._bigdecimal;

import java.math.BigDecimal;

/**
 * @author zhoulihuang
 */
public class IntValue {

  public static void main(String[] args) {
    BigDecimal bigDecimal = new BigDecimal("10");
    BigDecimal bigDecimal1 = new BigDecimal("10.1234");
    BigDecimal bigDecimal2 = new BigDecimal("-10.1234");

    int i = bigDecimal.intValue();
    int i1 = bigDecimal1.intValue();
    int i2 = bigDecimal2.intValue();

    int i3 = bigDecimal.intValueExact();

    /** java.lang.ArithmeticException: Rounding necessary */
    int i4 = bigDecimal1.intValueExact();
    int i5 = bigDecimal2.intValueExact();

    System.out.println(i);
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);
    System.out.println(i5);
  }
}
