package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleSetUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleSet singleton(java.lang.Double p0){
return DoubleSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet singleton(double p0){
return DoubleSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleSet p0){
return DoubleSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet p0){
return DoubleSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet p0,java.lang.Object p1){
return DoubleSets.synchronize(p0,p1);
}
}
