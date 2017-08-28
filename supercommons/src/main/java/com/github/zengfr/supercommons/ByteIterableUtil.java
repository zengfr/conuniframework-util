package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteIterableUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable p0){
return ByteCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.io.File p0){
return BinIO.asByteIterable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.lang.CharSequence p0){
return BinIO.asByteIterable(p0);
}
}
