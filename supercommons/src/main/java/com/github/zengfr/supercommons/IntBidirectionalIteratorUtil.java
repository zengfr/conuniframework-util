package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.ints.IntBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntBidirectionalIterator p0){
return IntIterators.unmodifiable(p0);
}
}
