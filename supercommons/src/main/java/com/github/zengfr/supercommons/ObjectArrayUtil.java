package com.zengfr.supercommons;
import org.apache.commons.math3.util.MathArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectArrayUtil{ 
public static <T> T[][] buildArray(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return MathArrays.buildArray(p0,p1,p2);
}
public static <K> K[][] trim(K[][] p0,long p1){
return ObjectBigArrays.trim(p0,p1);
}
public static <K> K[][] copy(K[][] p0,long p1,long p2){
return ObjectBigArrays.copy(p0,p1,p2);
}
public static <K> K[][] copy(K[][] p0){
return ObjectBigArrays.copy(p0);
}
public static <K> K[][] wrap(K[] p0){
return ObjectBigArrays.wrap(p0);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1){
return ObjectBigArrays.ensureCapacity(p0,p1);
}
public static <K> K[][] ensureCapacity(K[][] p0,long p1,long p2){
return ObjectBigArrays.ensureCapacity(p0,p1,p2);
}
public static <K> K[][] setLength(K[][] p0,long p1){
return ObjectBigArrays.setLength(p0,p1);
}
public static <K> K[][] grow(K[][] p0,long p1,long p2){
return ObjectBigArrays.grow(p0,p1,p2);
}
public static <K> K[][] grow(K[][] p0,long p1){
return ObjectBigArrays.grow(p0,p1);
}
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
return ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
return ObjectBigArrays.shuffle(p0,p1);
}
public static <K> K[][] newBigArray(K[][] p0,long p1){
return ObjectBigArrays.newBigArray(p0,p1);
}
public static java.lang.Object[][] newBigArray(long p0){
return ObjectBigArrays.newBigArray(p0);
}
}
