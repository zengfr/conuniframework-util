package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.IteratorLongIterator;
import org.apache.commons.collections.primitives.adapters.LongIteratorIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableLongIterator;
import org.apache.commons.collections.primitives.LongCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongIteratorUtil{ 
public static org.apache.commons.collections.primitives.LongIterator wrap(java.util.Iterator p0){
return IteratorLongIterator.wrap(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
return LongIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.LongIterator unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator p0){
return LongCollections.unmodifiableLongIterator(p0);
}
public static org.apache.commons.collections.primitives.LongIterator singletonLongIterator(long p0){
return LongCollections.singletonLongIterator(p0);
}
public static org.apache.commons.collections.primitives.LongIterator getEmptyLongIterator(){
return LongCollections.getEmptyLongIterator();
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.DataInput p0){
return BinIO.asLongIterator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asLongIterator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asLongIterator(p0);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1){
 TextIO.storeLongs(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.BufferedReader p0){
return TextIO.asLongIterator(p0);
}
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
return LongIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0){
return LongIterators.concat(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
return LongIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return LongIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return LongIterators.wrap(p0);
}
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1,int p2,int p3){
return LongIterators.unwrap(p0,p1,p2,p3);
}
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.unwrap(p0,p1,p2);
}
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0){
return LongIterators.unwrap(p0);
}
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator p0){
return LongIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
return LongIterators.asLongIterator(p0);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
return LongIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
return LongIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0){
return LongIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
return LongIterators.pour(p0,p1);
}
}
