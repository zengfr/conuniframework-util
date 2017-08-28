package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator singleton(double p0){
return DoubleBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleBigListIterator p0){
return DoubleBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0){
return DoubleBigListIterators.asBigListIterator(p0);
}
}
