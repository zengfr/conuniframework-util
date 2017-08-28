package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream;
import org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator;
import org.apache.commons.collections.primitives.adapters.ByteIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorByteIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableByteIterator;
import org.apache.commons.collections.primitives.ByteCollections;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
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
public final class ByteIteratorUtil{ 
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
return ByteIteratorInputStream.adapt(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
return InputStreamByteIterator.adapt(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
return ByteIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
return IteratorByteIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator getEmptyByteIterator(){
return ByteCollections.getEmptyByteIterator();
}
public static org.apache.commons.collections.primitives.ByteIterator singletonByteIterator(byte p0){
return ByteCollections.singletonByteIterator(p0);
}
public static org.apache.commons.collections.primitives.ByteIterator unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator p0){
return ByteCollections.unmodifiableByteIterator(p0);
}
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
return ByteIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0){
return ByteIterators.concat(p0);
}
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return ByteIterators.unwrap(p0);
}
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1,int p2,int p3){
return ByteIterators.unwrap(p0,p1,p2,p3);
}
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.unwrap(p0,p1,p2);
}
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
return ByteIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return ByteIterators.unmodifiable(p0);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
return ByteIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return ByteIterators.pour(p0);
}
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
return ByteIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
return ByteIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
return ByteIterators.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return DoubleIterators.wrap(p0);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.DataInput p0){
return BinIO.asByteIterator(p0);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1){
 TextIO.storeBytes(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.BufferedReader p0){
return TextIO.asByteIterator(p0);
}
}
