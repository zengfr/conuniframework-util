package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator singleton(short p0){
return ShortBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortBigListIterator p0){
return ShortBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator p0){
return ShortBigListIterators.asBigListIterator(p0);
}
}
