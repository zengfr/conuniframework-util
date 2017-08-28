package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.IteratorShortIterator;
import org.apache.commons.collections.primitives.adapters.ShortIteratorIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableShortIterator;
import org.apache.commons.collections.primitives.ShortCollections;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortIteratorUtil{ 
public static org.apache.commons.collections.primitives.ShortIterator wrap(java.util.Iterator p0){
return IteratorShortIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
return ShortIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ShortIterator getEmptyShortIterator(){
return ShortCollections.getEmptyShortIterator();
}
public static org.apache.commons.collections.primitives.ShortIterator unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator p0){
return ShortCollections.unmodifiableShortIterator(p0);
}
public static org.apache.commons.collections.primitives.ShortIterator singletonShortIterator(short p0){
return ShortCollections.singletonShortIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return DoubleIterators.wrap(p0);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asShortIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asShortIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.DataInput p0){
return BinIO.asShortIterator(p0);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1){
 TextIO.storeShorts(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.BufferedReader p0){
return TextIO.asShortIterator(p0);
}
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
return ShortIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0){
return ShortIterators.concat(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return ShortIterators.wrap(p0);
}
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
return ShortIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1){
return ShortIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1,int p2,int p3){
return ShortIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.unwrap(p0,p1,p2);
}
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.unwrap(p0,p1);
}
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return ShortIterators.unwrap(p0);
}
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
return ShortIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
return ShortIterators.asShortIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return ShortIterators.unmodifiable(p0);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
return ShortIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return ShortIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
return ShortIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
return ShortIterators.pour(p0,p1);
}
}
