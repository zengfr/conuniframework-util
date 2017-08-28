package com.zengfr.supercommons;
import com.google.common.base.Converter;
import com.google.common.base.Enums;
import com.google.common.collect.Maps;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import org.apache.commons.beanutils.ConvertUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConverterUtil{ 
public static <T> com.google.common.base.Converter<T, T> identity(){
return Converter.identity();
}
public static <A,B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> p0,com.google.common.base.Function<? super B, ? extends A> p1){
return Converter.from(p0,p1);
}
public static <T extends java.lang.Enum<T> > com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> p0){
return Enums.stringConverter(p0);
}
public static <A,B> com.google.common.base.Converter<A, B> asConverter(com.google.common.collect.BiMap<A, B> p0){
return Maps.asConverter(p0);
}
public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter(){
return Doubles.stringConverter();
}
public static void register(org.apache.commons.beanutils.Converter p0,java.lang.Class<?> p1){
 ConvertUtils.register(p0,p1);
}
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0){
return ConvertUtils.lookup(p0);
}
public static org.apache.commons.beanutils.Converter lookup(java.lang.Class<?> p0,java.lang.Class<?> p1){
return ConvertUtils.lookup(p0,p1);
}
}
