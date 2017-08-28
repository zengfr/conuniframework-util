package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.io.CharIteratorReader;
import org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator;
import org.apache.commons.collections.primitives.adapters.CharIteratorIterator;
import org.apache.commons.collections.primitives.adapters.IteratorCharIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableCharIterator;
import org.apache.commons.collections.primitives.CharCollections;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.io.BinIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharIteratorUtil{ 
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
return CharIteratorReader.adapt(p0);
}
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
return ReaderCharIterator.adapt(p0);
}
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
return CharIteratorIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharIterator wrap(java.util.Iterator p0){
return IteratorCharIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharIterator unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator p0){
return CharCollections.unmodifiableCharIterator(p0);
}
public static org.apache.commons.collections.primitives.CharIterator getEmptyCharIterator(){
return CharCollections.getEmptyCharIterator();
}
public static org.apache.commons.collections.primitives.CharIterator singletonCharIterator(char p0){
return CharCollections.singletonCharIterator(p0);
}
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2){
return CharIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0){
return CharIterators.concat(p0);
}
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0){
return CharIterators.unwrap(p0);
}
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3){
return CharIterators.unwrap(p0,p1,p2,p3);
}
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.unwrap(p0,p1,p2);
}
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
return CharIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator p0){
return CharIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
return CharIterators.asCharIterator(p0);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
return CharIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
return CharIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0){
return CharIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.pour(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.DataInput p0){
return BinIO.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asCharIterator(p0);
}
}
