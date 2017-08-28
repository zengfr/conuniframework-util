package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.chars.CharBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharBidirectionalIterator p0){
return CharIterators.unmodifiable(p0);
}
}
