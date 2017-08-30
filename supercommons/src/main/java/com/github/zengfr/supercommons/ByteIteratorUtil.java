package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteIteratorUtil{ 
/**
*public static java.io.InputStream org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(org.apache.commons.collections.primitives.ByteIterator)
*/ 
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(java.io.InputStream)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
	return org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(p0);
}
/**
*public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.TextIO.asByteIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[])
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator... p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.getEmptyByteIterator()
*/ 
public static org.apache.commons.collections.primitives.ByteIterator getEmptyByteIterator(){
	return org.apache.commons.collections.primitives.ByteCollections.getEmptyByteIterator();
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.singletonByteIterator(byte)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator singletonByteIterator(byte p0){
	return org.apache.commons.collections.primitives.ByteCollections.singletonByteIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.PrintStream)
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeBytes(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteIterator(p0);
}
/**
*public static byte[] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0);
}
/**
*public static byte[] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*/ 
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte... p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(org.apache.commons.collections.primitives.ByteIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
}
