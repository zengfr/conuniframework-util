package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortBidirectionalIterator p0){
return ShortIterators.unmodifiable(p0);
}
}
