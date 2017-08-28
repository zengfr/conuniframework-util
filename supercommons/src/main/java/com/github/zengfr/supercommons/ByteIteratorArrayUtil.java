package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
return ByteIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0){
return ByteIterators.concat(p0);
}
}
