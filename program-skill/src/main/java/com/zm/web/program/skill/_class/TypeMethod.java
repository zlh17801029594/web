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

import org.springframework.core.convert.converter.Converter;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhoulihuang
 */
public class TypeMethod {

  public static void main(String[] args) {
    Class<TypeMethod> typeMethodClass = TypeMethod.class;
    /** Class本质上是个类，因此Class也继承自Object基类 */
    /** Class对象重写了Object对象toString方法 */
    System.out.println(typeMethodClass.toString());
    String typeName = typeMethodClass.getTypeName();
    System.out.println(typeName);
    TypeVariable<Class<TypeMethod>>[] typeParameters = typeMethodClass.getTypeParameters();
    System.out.println(Arrays.toString(typeParameters));

    Class<Serializable> serializableClass = Serializable.class;
    printClassInfo(serializableClass);

    Class<Type> typeClass = Type.class;
    printClassInfo(typeClass);
    Class<Class> classClass = Class.class;
    printClassInfo(classClass);
    Class<Object> objectClass = Object.class;
    printClassInfo(objectClass);

    Class<String[]> arrClass = String[].class;
    printClassInfo(arrClass);

    Class<List> listClass = List.class;
    printClassInfo(listClass);
    Class<Converter> converterClass = Converter.class;
    printClassInfo(converterClass);
  }

  private static void printClassInfo(Class clazz) {
    System.out.println(String.format("-------------%s-------------", clazz.getSimpleName()));
    System.out.println(clazz);
    System.out.println(clazz.getTypeName());
    System.out.println(Arrays.toString(clazz.getTypeParameters()));
  }
}
