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

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author zhoulihuang
 */
public class MessageQueue {

  private Queue<String> queue = new PriorityQueue<>();

  public synchronized void add(String str) {
    queue.add(str);
    this.notify();
  }

  public synchronized String get() throws InterruptedException {
    while (queue.isEmpty()) {
      this.wait();
    }
    return queue.poll();
  }
}
