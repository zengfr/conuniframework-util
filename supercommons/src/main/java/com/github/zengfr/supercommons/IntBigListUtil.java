package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntBigListUtil{ 
public static it.unimi.dsi.fastutil.ints.IntBigList shuffle(it.unimi.dsi.fastutil.ints.IntBigList p0,java.util.Random p1){
return IntBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntBigList singleton(int p0){
return IntBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigList singleton(java.lang.Object p0){
return IntBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigList unmodifiable(it.unimi.dsi.fastutil.ints.IntBigList p0){
return IntBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigList synchronize(it.unimi.dsi.fastutil.ints.IntBigList p0){
return IntBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigList synchronize(it.unimi.dsi.fastutil.ints.IntBigList p0,java.lang.Object p1){
return IntBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntBigList asBigList(it.unimi.dsi.fastutil.ints.IntList p0){
return IntBigLists.asBigList(p0);
}
}
