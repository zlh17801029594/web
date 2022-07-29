/**
 * 版权所有(C)，上海海鼎信息科技有限公司，2019~2022，所有权利保留。
 * <p>
 * 项目名：	web
 * 文件名：	${file_name}
 * 模块说明：
 * 修改历史：
 * 2022/7/16 - zhoulihuang - 创建。
 */
package com.zm.web.program.skill._reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhoulihuang
 */
public class MemberInterface {

  private Integer integer;
  private int i;

  public MemberInterface() {
  }

  public MemberInterface(Integer integer, int i) {
    this.integer = integer;
    this.i = i;
  }

  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public static void main(String[] args) {
    Class<MemberInterface> memberInterfaceClass = MemberInterface.class;
    Field[] declaredFields = memberInterfaceClass.getDeclaredFields();
    printMember(declaredFields);
    Method[] declaredMethods = memberInterfaceClass.getDeclaredMethods();
    printMember(declaredMethods);
    Constructor<?>[] declaredConstructors = memberInterfaceClass.getDeclaredConstructors();
    printMember(declaredConstructors);

    Member[] members = {null, null};
    printMember(members);
    printMember02(members);

    /** cannot be applied to */
    // printMember(null, null);
    printMember02(null, null);

    /** cannot be applied to */
    // printMember();
    printMember02();
    /** Confusing argument 'null', unclear if a varargs or non-varargs call is desired */
    // printMember02(null);
  }

  private static void printMember(Member[] members) {
    Class<? extends Member[]> membersClass = members.getClass();
    System.out.println(String.format("-------------%s-------------", membersClass.getTypeName()));
    for (Member member : members) {
      if (member == null) {
        return;
      }
      String name = member.getName();
      System.out.println(name);
      Class<?> declaringClass = member.getDeclaringClass();
      System.out.println(declaringClass);
    }
  }

  private static void printMember02(Member... members) {
    printMember(members);
  }

  /**
   * List容器内部元素是不可以进行类型转换的
   */
  private static void test() {
    List<Object> objectList = new ArrayList<>();
    testList(objectList);
    ArrayList<Object> objectArrayList = new ArrayList<>();
    testList(objectArrayList);

    ArrayList<MemberInterface> memberInterfaceArrayList = new ArrayList<>();
    /** cannot be applied to */
    // testList(memberInterfaceArrayList);
    List<MemberInterface> memberInterfaceList = memberInterfaceArrayList;
    /** cannot be applied to */
    // testList(memberInterfaceList);

    /** Incompatible types. */
    // ArrayList<Object> objectArrayList = memberInterfaceArrayList;
    /** Incompatible types. */
    // List<Object> objectList = memberInterfaceArrayList;

    /** 数组元素是可以进行类型转换的 */
    MemberInterface[] memberInterfaces = new MemberInterface[10];
    Object[] objects = memberInterfaces;
    memberInterfaces = (MemberInterface[]) objects;
  }

  private static void testList(List<Object> objectList) {

  }

  /**
   * 数组可接收null
   * 原生类型数组同理可接收null
   * 原生类型不可接收null
   */
  private static void testPrimitive() {
    String[] strArr = null;
    Integer[] integerArr = null;
    int[] intArr = null;
    /** Incompatible types. */
    // int i = null;
  }
}
