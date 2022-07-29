/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/26 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill._util;

import java.util.Collections;
import java.util.Map;

/**
 * @author zhoulihuang
 */
public class CollectionsEmpty {

  public static void main(String[] args) {
    try {
      Map<Object, Object> emptyMap = Collections.emptyMap();
      boolean containsKey = emptyMap.containsKey("key");
      emptyMap.put("key", "value");
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }
}
