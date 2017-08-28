package com.github.zengfr.supercommons;
import com.google.common.base.Enums;
import com.google.common.base.internal.Finalizer;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang.reflect.FieldUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldUtil{ 
public static java.lang.reflect.Field getField(java.lang.Enum<?> p0){
return Enums.getField(p0);
}
public static java.lang.reflect.Field getInheritableThreadLocalsField(){
return Finalizer.getInheritableThreadLocalsField();
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1){
return FieldUtils.getDeclaredField(p0,p1);
}
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1){
return FieldUtils.getField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.reflect.Field p0) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0);
}
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
 FieldUtils.removeFinalModifier(p0,p1);
}
public static void removeFinalModifier(java.lang.reflect.Field p0){
 FieldUtils.removeFinalModifier(p0);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getDeclaredField(p0,p1);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getField(p0,p1);
}
}
