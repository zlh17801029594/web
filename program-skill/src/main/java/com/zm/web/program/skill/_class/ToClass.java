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

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author zhoulihuang
 */
public class ToClass {

  private static String staticStr;
  public static Character staticC;
  private String str;
  private Integer integer;
  private int i;
  public Character c;

  public ToClass() {
  }

  public ToClass(String str, Integer integer, int i, Character c) {
    this.str = str;
    this.integer = integer;
    this.i = i;
    this.c = c;
  }

  public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
    Class<ToClass> toClassClass = ToClass.class;
    Type type = toClassClass;
    System.out.println(type);
    /** public class com.zm.web.program.skill._class.ToClass */
    System.out.println(toClassClass.toGenericString());

    Class<? super ToClass> superclass = toClassClass.getSuperclass();
    System.out.println(superclass);
    Type genericSuperclass = toClassClass.getGenericSuperclass();
    System.out.println(genericSuperclass);
    Class<?>[] interfaces = toClassClass.getInterfaces();
    System.out.println(Arrays.toString(interfaces));
    Type[] genericInterfaces = toClassClass.getGenericInterfaces();
    System.out.println(Arrays.toString(genericInterfaces));

    /** getClass为从Object继承过来的方法 */
    Class<? extends Class> getClass = toClassClass.getClass();
    System.out.println(getClass);
    Class<?> declaringClass = toClassClass.getDeclaringClass();
    System.out.println(declaringClass);
    Class<?> enclosingClass = toClassClass.getEnclosingClass();
    System.out.println(enclosingClass);
    Class<?>[] classes = toClassClass.getClasses();
    System.out.println(Arrays.toString(classes));
    Class<?>[] declaredClasses = toClassClass.getDeclaredClasses();
    System.out.println(Arrays.toString(declaredClasses));

    Field[] fields = toClassClass.getFields();
    System.out.println(Arrays.toString(fields));
    Field[] declaredFields = toClassClass.getDeclaredFields();
    System.out.println(Arrays.toString(declaredFields));
    Method[] methods = toClassClass.getMethods();
    System.out.println(Arrays.toString(methods));
    Method[] declaredMethods = toClassClass.getDeclaredMethods();
    System.out.println(Arrays.toString(declaredMethods));
    Method enclosingMethod = toClassClass.getEnclosingMethod();
    System.out.println(enclosingMethod);
    Constructor<?>[] constructors = toClassClass.getConstructors();
    System.out.println(Arrays.toString(constructors));
    Constructor<?>[] declaredConstructors = toClassClass.getDeclaredConstructors();
    System.out.println(Arrays.toString(declaredConstructors));
    Constructor<?> enclosingConstructor = toClassClass.getEnclosingConstructor();
    System.out.println(enclosingConstructor);
    /** 原生类型int也属于Class对象 */
    Class<?>[] parameterTypes = constructors[1].getParameterTypes();
    System.out.println(Arrays.toString(parameterTypes));
    /** 原生类型.class=对应封装类型Class对象 */
    Class<Integer> integerClass = int.class;
    System.out.println(integerClass);
    Class<Integer> integerClass1 = Integer.class;
    System.out.println(integerClass1);
    Class<Void> voidClass = void.class;
    System.out.println(voidClass);
    Class<Void> voidClass1 = Void.class;
    System.out.println(voidClass1);

    ToClass toClass = toClassClass.newInstance();
    System.out.println("主动调用toString: " + toClass);
    Object invoke = methods[5].invoke(toClass);
    System.out.println("反射调用toString: " + invoke);
  }
}
