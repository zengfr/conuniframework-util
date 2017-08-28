package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanBidirectionalIterator p0){
return BooleanIterators.unmodifiable(p0);
}
}
