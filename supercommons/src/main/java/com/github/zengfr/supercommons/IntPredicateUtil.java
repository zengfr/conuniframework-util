package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntPredicateUtil{ 
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.any(p0,p1);
}
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.any(p0,p1);
}
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.any(p0,p1);
}
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.any(p0,p1);
}
}
