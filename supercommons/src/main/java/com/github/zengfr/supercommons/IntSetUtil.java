package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntSetUtil{ 
public static it.unimi.dsi.fastutil.ints.IntSet singleton(java.lang.Integer p0){
return IntSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSet singleton(int p0){
return IntSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSet unmodifiable(it.unimi.dsi.fastutil.ints.IntSet p0){
return IntSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSet synchronize(it.unimi.dsi.fastutil.ints.IntSet p0){
return IntSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntSet synchronize(it.unimi.dsi.fastutil.ints.IntSet p0,java.lang.Object p1){
return IntSets.synchronize(p0,p1);
}
}
