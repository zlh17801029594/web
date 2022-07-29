/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/6/18 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill.wait_notify;

import java.util.Scanner;

/**
 * @author zhoulihuang
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("主线程：" + Thread.currentThread().getName());
    MessageQueue messageQueue = new MessageQueue();
    new Thread(() -> {
      while (true) {
        String str;
        try {
          str = messageQueue.get();
          System.out.println(Thread.currentThread().getName() + "-收到消息：" + str);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String next = scanner.nextLine();
      messageQueue.add(next);
      if ("exit".equals(next)) {
        break;
      }
    }
  }
}
