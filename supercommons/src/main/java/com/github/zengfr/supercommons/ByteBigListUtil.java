package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteBigListUtil{ 
public static it.unimi.dsi.fastutil.bytes.ByteBigList shuffle(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.util.Random p1){
return ByteBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList singleton(byte p0){
return ByteBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList singleton(java.lang.Object p0){
return ByteBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList unmodifiable(it.unimi.dsi.fastutil.bytes.ByteBigList p0){
return ByteBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList p0){
return ByteBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.lang.Object p1){
return ByteBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList asBigList(it.unimi.dsi.fastutil.bytes.ByteList p0){
return ByteBigLists.asBigList(p0);
}
}
