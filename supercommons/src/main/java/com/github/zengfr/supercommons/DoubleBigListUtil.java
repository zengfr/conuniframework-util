package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleBigListUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigList shuffle(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.util.Random p1){
return DoubleBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList singleton(double p0){
return DoubleBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList singleton(java.lang.Object p0){
return DoubleBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleBigList p0){
return DoubleBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList p0){
return DoubleBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.lang.Object p1){
return DoubleBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList asBigList(it.unimi.dsi.fastutil.doubles.DoubleList p0){
return DoubleBigLists.asBigList(p0);
}
}
