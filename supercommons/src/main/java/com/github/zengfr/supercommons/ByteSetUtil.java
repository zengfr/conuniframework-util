package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSetUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteSet singleton(java.lang.Byte p0){
return ByteSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet singleton(byte p0){
return ByteSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet unmodifiable(it.unimi.dsi.fastutil.bytes.ByteSet p0){
return ByteSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSet p0){
return ByteSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSet p0,java.lang.Object p1){
return ByteSets.synchronize(p0,p1);
}
}
