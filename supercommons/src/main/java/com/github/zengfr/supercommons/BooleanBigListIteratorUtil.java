package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator singleton(boolean p0){
return BooleanBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanBigListIterator p0){
return BooleanBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator asBigListIterator(it.unimi.dsi.fastutil.booleans.BooleanListIterator p0){
return BooleanBigListIterators.asBigListIterator(p0);
}
}
