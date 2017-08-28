package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.ints.IntBigListIterator singleton(int p0){
return IntBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigListIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntBigListIterator p0){
return IntBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigListIterator asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator p0){
return IntBigListIterators.asBigListIterator(p0);
}
}
