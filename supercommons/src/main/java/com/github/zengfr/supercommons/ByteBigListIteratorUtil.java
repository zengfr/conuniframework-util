package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator singleton(byte p0){
return ByteBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteBigListIterator p0){
return ByteBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
return ByteBigListIterators.asBigListIterator(p0);
}
}
