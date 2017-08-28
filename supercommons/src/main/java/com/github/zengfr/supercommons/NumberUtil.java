package com.zengfr.supercommons;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.util.CompositeFormat;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.NumberUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NumberUtil{ 
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1){
return MapUtils.getNumber(p0,p1);
}
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2){
return MapUtils.getNumber(p0,p1,p2);
}
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1){
return MapUtils.getNumber(p0,p1);
}
public static <K> java.lang.Number getNumber(java.util.Map<? super K, ?> p0,K p1,java.lang.Number p2){
return MapUtils.getNumber(p0,p1,p2);
}
public static java.lang.Number createNumber(java.lang.String p0) throws java.lang.NumberFormatException{
return NumberUtils.createNumber(p0);
}
public static java.lang.Number parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2){
return CompositeFormat.parseNumber(p0,p1,p2);
}
}
