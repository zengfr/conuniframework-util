package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ByteMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2ByteMap singleton(char p0,byte p1){
return Char2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteMap singleton(java.lang.Character p0,java.lang.Byte p1){
return Char2ByteMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
return Char2ByteMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
return Char2ByteMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.lang.Object p1){
return Char2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
return Char2ByteMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> p1){
 Char2ByteMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
return Char2ByteMaps.fastIterable(p0);
}
}
