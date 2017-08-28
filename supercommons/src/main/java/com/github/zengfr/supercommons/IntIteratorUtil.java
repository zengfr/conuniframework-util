package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.IntIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorIntIterator;
import org.apache.commons.collections.primitives.IntCollections;
import org.apache.commons.collections.primitives.decorators.UnmodifiableIntIterator;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntIteratorUtil{ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
return IntIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntIterator wrap(java.util.Iterator p0){
return IteratorIntIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntIterator singletonIntIterator(int p0){
return IntCollections.singletonIntIterator(p0);
}
public static org.apache.commons.collections.primitives.IntIterator getEmptyIntIterator(){
return IntCollections.getEmptyIntIterator();
}
public static org.apache.commons.collections.primitives.IntIterator unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator p0){
return IntCollections.unmodifiableIntIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
return DoubleIterators.wrap(p0);
}
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2){
return IntIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0){
return IntIterators.concat(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return IntIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return IntIterators.wrap(p0);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1){
return IntIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1,int p2,int p3){
return IntIterators.unwrap(p0,p1,p2,p3);
}
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
return IntIterators.unwrap(p0);
}
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
return IntIterators.unwrap(p0,p1);
}
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.unwrap(p0,p1,p2);
}
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
return IntIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
return IntIterators.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator p0){
return IntIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
return IntIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
return IntIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
return IntIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0){
return IntIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.DataInput p0){
return BinIO.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asIntIterator(p0);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.BufferedReader p0){
return TextIO.asIntIterator(p0);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1){
 TextIO.storeInts(p0,p1);
}
}
