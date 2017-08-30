package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharIteratorUtil{ 
/**
*public static java.io.Reader org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(org.apache.commons.collections.primitives.CharIterator)
*/ 
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(p0);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(java.io.Reader)
*/ 
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
	return org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(p0);
}
/**
*public static boolean it.unimi.dsi.fastutil.chars.CharIterators.all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.chars.CharIterators.any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[])
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator... p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.getEmptyCharIterator()
*/ 
public static org.apache.commons.collections.primitives.CharIterator getEmptyCharIterator(){
	return org.apache.commons.collections.primitives.CharCollections.getEmptyCharIterator();
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,int)
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.singletonCharIterator(char)
*/ 
public static org.apache.commons.collections.primitives.CharIterator singletonCharIterator(char p0){
	return org.apache.commons.collections.primitives.CharCollections.singletonCharIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator)
*/ 
public static org.apache.commons.collections.primitives.CharIterator unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.CharCollections.unmodifiableCharIterator(p0);
}
/**
*public static char[] it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator)
*/ 
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0);
}
/**
*public static char[] it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,int)
*/ 
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char... p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(org.apache.commons.collections.primitives.CharIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.IteratorCharIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.CharIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorCharIterator.wrap(p0);
}
}
