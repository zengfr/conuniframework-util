package com.zengfr.supercommons;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.AlphabetConverter;
import org.apache.commons.lang.ArrayUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntegerArrayUtil{ 
public static java.lang.Integer[] nullToEmpty(java.lang.Integer[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static java.lang.Integer[] toObject(int[] p0){
return ArrayUtils.toObject(p0);
}
public static int[] toPrimitive(java.lang.Integer[] p0,int p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static int[] toPrimitive(java.lang.Integer[] p0){
return ArrayUtils.toPrimitive(p0);
}
public static org.apache.commons.text.AlphabetConverter createConverter(java.lang.Integer[] p0,java.lang.Integer[] p1,java.lang.Integer[] p2){
return AlphabetConverter.createConverter(p0,p1,p2);
}
}
