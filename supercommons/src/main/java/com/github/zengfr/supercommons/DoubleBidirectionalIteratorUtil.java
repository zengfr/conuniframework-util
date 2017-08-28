package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleBidirectionalIterator p0){
return DoubleIterators.unmodifiable(p0);
}
}
