package com.github.zengfr.supercommons;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ToStringStyleUtil{ 
public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle(){
return ToStringBuilder.getDefaultStyle();
}
public static void setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle p0){
 ToStringBuilder.setDefaultStyle(p0);
}
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
public static void setDefaultStyle(org.apache.commons.lang.builder.ToStringStyle p0){
 ToStringBuilder.setDefaultStyle(p0);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
}
