package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteBidirectionalIteratorUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteBidirectionalIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteBidirectionalIterator p0){
return ByteIterators.unmodifiable(p0);
}
}
