package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator singleton(float p0){
return FloatBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatBigListIterator p0){
return FloatBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
return FloatBigListIterators.asBigListIterator(p0);
}
}
