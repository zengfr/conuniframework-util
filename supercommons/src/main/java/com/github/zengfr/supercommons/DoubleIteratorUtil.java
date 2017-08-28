package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableDoubleIterator;
import org.apache.commons.collections.primitives.DoubleCollections;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleIteratorUtil{ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
return DoubleIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleIterator wrap(java.util.Iterator p0){
return IteratorDoubleIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleIterator singletonDoubleIterator(double p0){
return DoubleCollections.singletonDoubleIterator(p0);
}
public static org.apache.commons.collections.primitives.DoubleIterator getEmptyDoubleIterator(){
return DoubleCollections.getEmptyDoubleIterator();
}
public static org.apache.commons.collections.primitives.DoubleIterator unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator p0){
return DoubleCollections.unmodifiableDoubleIterator(p0);
}
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2){
return DoubleIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0){
return DoubleIterators.concat(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
return DoubleIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return DoubleIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return DoubleIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return DoubleIterators.wrap(p0);
}
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1,int p2,int p3){
return DoubleIterators.unwrap(p0,p1,p2,p3);
}
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.unwrap(p0,p1,p2);
}
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
return DoubleIterators.unwrap(p0);
}
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
return DoubleIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
return DoubleIterators.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
return DoubleIterators.pour(p0);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
return DoubleIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
return DoubleIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
return DoubleIterators.pour(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.DataInput p0){
return BinIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asDoubleIterator(p0);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1){
 TextIO.storeDoubles(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.BufferedReader p0){
return TextIO.asDoubleIterator(p0);
}
}
