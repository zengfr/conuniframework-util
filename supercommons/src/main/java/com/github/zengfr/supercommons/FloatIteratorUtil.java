package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.FloatIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorFloatIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableFloatIterator;
import org.apache.commons.collections.primitives.FloatCollections;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatIteratorUtil{ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
return FloatIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatIterator wrap(java.util.Iterator p0){
return IteratorFloatIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatIterator getEmptyFloatIterator(){
return FloatCollections.getEmptyFloatIterator();
}
public static org.apache.commons.collections.primitives.FloatIterator unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator p0){
return FloatCollections.unmodifiableFloatIterator(p0);
}
public static org.apache.commons.collections.primitives.FloatIterator singletonFloatIterator(float p0){
return FloatCollections.singletonFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return DoubleIterators.wrap(p0);
}
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2){
return FloatIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0){
return FloatIterators.concat(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return FloatIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return FloatIterators.wrap(p0);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
return FloatIterators.unwrap(p0,p1,p2,p3);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1){
return FloatIterators.unwrap(p0,p1);
}
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.unwrap(p0,p1);
}
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.unwrap(p0,p1,p2);
}
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return FloatIterators.unwrap(p0);
}
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return FloatIterators.unmodifiable(p0);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
return FloatIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
return FloatIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return FloatIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
return FloatIterators.asFloatIterator(p0);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.DataInput p0){
return BinIO.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asFloatIterator(p0);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1){
 TextIO.storeFloats(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.BufferedReader p0){
return TextIO.asFloatIterator(p0);
}
}
