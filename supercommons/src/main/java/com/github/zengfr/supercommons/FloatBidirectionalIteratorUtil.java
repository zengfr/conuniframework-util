package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatBidirectionalIterator p0){
return FloatIterators.unmodifiable(p0);
}
}
