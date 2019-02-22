package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class ByteArrayUtil{ 
/**
*{@link it.unimi.dsi.fastutil.BigArrays#add(byte[][],long,byte)}
*@see it.unimi.dsi.fastutil.BigArrays#add(byte[][],long,byte)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.add(byte[][],long,byte)
*add(byte[][] p0,long p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void add(byte[][] p0,long p1,byte p2){
	 it.unimi.dsi.fastutil.BigArrays.add(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],long,long,byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3,it.unimi.dsi.fastutil.bytes.ByteComparator p4){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],long,long,byte)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],long,long,byte)
*binarySearch(byte[][] p0,long p1,long p2,byte p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,long p1,long p2,byte p3){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],byte)
*binarySearch(byte[][] p0,byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,byte p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(byte[][],byte,it.unimi.dsi.fastutil.bytes.ByteComparator)
*binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(byte[][] p0,byte p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link com.google.common.primitives.Bytes#concat(byte[]...)}
*@see com.google.common.primitives.Bytes#concat(byte[]...)
*<code>public static byte[] com.google.common.primitives.Bytes.concat(byte[]...)
*concat(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] concat(byte[]... p0){
	return com.google.common.primitives.Bytes.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(byte[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(byte[]...)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.copy(byte[][])
*copy(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] copy(byte[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(byte[][],long,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.copy(byte[][],long,long)
*copy(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] copy(byte[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(byte[][],long,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(byte[][],long,byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copy(byte[][],long,byte[][],long,long)
*copy(byte[][] p0,long p1,byte[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[][] p0,long p1,byte[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyFromBig(byte[][],long,byte[],int,int)}
*@see it.unimi.dsi.fastutil.BigArrays#copyFromBig(byte[][],long,byte[],int,int)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyFromBig(byte[][],long,byte[],int,int)
*copyFromBig(byte[][] p0,long p1,byte[] p2,int p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFromBig(byte[][] p0,long p1,byte[] p2,int p3,int p4){
	 it.unimi.dsi.fastutil.BigArrays.copyFromBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copyToBig(byte[],int,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copyToBig(byte[],int,byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.copyToBig(byte[],int,byte[][],long,long)
*copyToBig(byte[] p0,int p1,byte[][] p2,long p3,long p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToBig(byte[] p0,int p1,byte[][] p2,long p3,long p4){
	 it.unimi.dsi.fastutil.BigArrays.copyToBig(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#decr(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#decr(byte[][],long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.decr(byte[][],long)
*decr(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void decr(byte[][] p0,long p1){
	 it.unimi.dsi.fastutil.BigArrays.decr(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(byte[][],long,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(byte[][],long,long)
*ensureCapacity(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] ensureCapacity(byte[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(byte[][],long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(byte[][],long)
*ensureCapacity(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] ensureCapacity(byte[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureFromTo(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureFromTo(byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureFromTo(byte[][],long,long)
*ensureFromTo(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureFromTo(byte[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureFromTo(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureOffsetLength(byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(byte[][],long,long)
*ensureOffsetLength(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureOffsetLength(byte[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.ensureOffsetLength(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureSameLength(byte[][],byte[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureSameLength(byte[][],byte[]...)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.ensureSameLength(byte[][],byte[][])
*ensureSameLength(byte[][] p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void ensureSameLength(byte[][] p0,byte[]... p1){
	 it.unimi.dsi.fastutil.BigArrays.ensureSameLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(byte[][],byte)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(byte[][],byte)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(byte[][],byte)
*fill(byte[][] p0,byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(byte[][] p0,byte p1){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(byte[][],long,long,byte)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(byte[][],long,long,byte)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(byte[][],long,long,byte)
*fill(byte[][] p0,long p1,long p2,byte p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(byte[][] p0,long p1,long p2,byte p3){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#forceCapacity(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#forceCapacity(byte[][],long,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.forceCapacity(byte[][],long,long)
*forceCapacity(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] forceCapacity(byte[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.forceCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(byte[][],long,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.grow(byte[][],long,long)
*grow(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] grow(byte[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(byte[][],long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.grow(byte[][],long)
*grow(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] grow(byte[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#incr(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#incr(byte[][],long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.incr(byte[][],long)
*incr(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void incr(byte[][] p0,long p1){
	 it.unimi.dsi.fastutil.BigArrays.incr(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#length(byte[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#length(byte[]...)
*<code>public static long it.unimi.dsi.fastutil.BigArrays.length(byte[][])
*length(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long length(byte[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.length(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.DataInput,byte[][],long,long) throws java.io.IOException
*loadBytes(java.io.DataInput p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.DataInput p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.lang.CharSequence,byte[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.lang.CharSequence,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[][]) throws java.io.IOException
*loadBytes(java.lang.CharSequence p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.lang.CharSequence p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[][]) throws java.io.IOException
*loadBytes(java.io.File p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.File p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.lang.CharSequence,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.lang.CharSequence,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.lang.CharSequence,byte[][],long,long) throws java.io.IOException
*loadBytes(java.lang.CharSequence p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.lang.CharSequence p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[][],long,long) throws java.io.IOException
*loadBytes(java.io.File p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.File p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.DataInput,byte[][]) throws java.io.IOException
*loadBytes(java.io.DataInput p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.DataInput p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[][]) throws java.io.IOException
*loadBytes(java.io.InputStream p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.InputStream p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[][],long,long) throws java.io.IOException
*loadBytes(java.io.InputStream p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.InputStream p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[][],long,long) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[][]) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.BufferedReader p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytesBig(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytesBig(java.lang.CharSequence)
*<code>public static byte[][] it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(java.lang.CharSequence) throws java.io.IOException
*loadBytesBig(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] loadBytesBig(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytesBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytesBig(java.io.File)
*<code>public static byte[][] it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(java.io.File) throws java.io.IOException
*loadBytesBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] loadBytesBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#mul(byte[][],long,byte)}
*@see it.unimi.dsi.fastutil.BigArrays#mul(byte[][],long,byte)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.mul(byte[][],long,byte)
*mul(byte[][] p0,long p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mul(byte[][] p0,long p1,byte p2){
	 it.unimi.dsi.fastutil.BigArrays.mul(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#newBigArray(long)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#newBigArray(long)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteBigArrays.newBigArray(long)
*newBigArray(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] newBigArray(long p0){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.newBigArray(p0);
}
/**
*{@link com.facebook.collections.PackedByteArray#pack(byte[]...)}
*@see com.facebook.collections.PackedByteArray#pack(byte[]...)
*<code>public static byte[] com.facebook.collections.PackedByteArray.pack(byte[]...)
*pack(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] pack(byte[]... p0){
	return com.facebook.collections.PackedByteArray.pack(p0);
}
/**
*{@link com.facebook.collections.PackedByteArray#packComparable(byte[]...)}
*@see com.facebook.collections.PackedByteArray#packComparable(byte[]...)
*<code>public static byte[] com.facebook.collections.PackedByteArray.packComparable(byte[]...)
*packComparable(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] packComparable(byte[]... p0){
	return com.facebook.collections.PackedByteArray.packComparable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][],long,long,it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[][] p0,long p1,long p2,it.unimi.dsi.fastutil.bytes.ByteComparator p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][],it.unimi.dsi.fastutil.bytes.ByteComparator)
*quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[][] p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][],long,long)
*quickSort(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#quickSort(byte[]...)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(byte[][])
*quickSort(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(byte[]... p0){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.quickSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSort(byte[][],int,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSort(byte[][],int,int)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSort(byte[][],int,int)
*radixSort(byte[][] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(byte[][] p0,int p1,int p2){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSort(byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSort(byte[]...)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSort(byte[][])
*radixSort(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(byte[]... p0){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSort(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],byte[][],long,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(byte[][],byte[][],long,long)
*radixSort(byte[][] p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(byte[][] p0,byte[][] p1,long p2,long p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],byte[]...)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(byte[][],byte[][])
*radixSort(byte[][] p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(byte[][] p0,byte[]... p1){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSort(byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(byte[][],long,long)
*radixSort(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSort(byte[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSort(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#set(byte[][],long,byte)}
*@see it.unimi.dsi.fastutil.BigArrays#set(byte[][],long,byte)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.set(byte[][],long,byte)
*set(byte[][] p0,long p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void set(byte[][] p0,long p1,byte p2){
	 it.unimi.dsi.fastutil.BigArrays.set(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#setLength(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#setLength(byte[][],long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.setLength(byte[][],long)
*setLength(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] setLength(byte[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.setLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#shuffle(byte[][],long,long,java.util.Random)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#shuffle(byte[][],long,long,java.util.Random)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(byte[][],long,long,java.util.Random)
*shuffle(byte[][] p0,long p1,long p2,java.util.Random p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] shuffle(byte[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#shuffle(byte[][],java.util.Random)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#shuffle(byte[][],java.util.Random)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(byte[][],java.util.Random)
*shuffle(byte[][] p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] shuffle(byte[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.io.DataOutput) throws java.io.IOException
*storeBytes(byte[][] p0,long p1,long p2,java.io.DataOutput p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.DataOutput p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.io.DataOutput) throws java.io.IOException
*storeBytes(byte[][] p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.io.File) throws java.io.IOException
*storeBytes(byte[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.io.OutputStream) throws java.io.IOException
*storeBytes(byte[][] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,java.io.OutputStream p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.io.OutputStream) throws java.io.IOException
*storeBytes(byte[][] p0,long p1,long p2,java.io.OutputStream p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.OutputStream p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.io.File) throws java.io.IOException
*storeBytes(byte[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.lang.CharSequence) throws java.io.IOException
*storeBytes(byte[][] p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[][],long,long,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.lang.CharSequence) throws java.io.IOException
*storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.lang.CharSequence p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeBytes(byte[][],long,long,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeBytes(byte[][],long,long,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeBytes(byte[][],long,long,java.io.PrintStream)
*storeBytes(byte[][] p0,long p1,long p2,java.io.PrintStream p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.PrintStream p3){
	 it.unimi.dsi.fastutil.io.TextIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeBytes(byte[][],java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeBytes(byte[][],java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeBytes(byte[][],java.io.PrintStream)
*storeBytes(byte[][] p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[][] p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#swap(byte[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#swap(byte[][],long,long)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.swap(byte[][],long,long)
*swap(byte[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void swap(byte[][] p0,long p1,long p2){
	 it.unimi.dsi.fastutil.BigArrays.swap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#trim(byte[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#trim(byte[][],long)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.trim(byte[][],long)
*trim(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] trim(byte[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.trim(p0,p1);
}
/**
*{@link com.facebook.collections.PackedByteArray#unpack(byte...)}
*@see com.facebook.collections.PackedByteArray#unpack(byte...)
*<code>public static byte[][] com.facebook.collections.PackedByteArray.unpack(byte[])
*unpack(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] unpack(byte... p0){
	return com.facebook.collections.PackedByteArray.unpack(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][])
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[]... p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)
*unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0,long p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#wrap(byte...)}
*@see it.unimi.dsi.fastutil.BigArrays#wrap(byte...)
*<code>public static byte[][] it.unimi.dsi.fastutil.BigArrays.wrap(byte[])
*wrap(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] wrap(byte... p0){
	return it.unimi.dsi.fastutil.BigArrays.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList#wrap(byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList#wrap(byte[]...)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList.wrap(byte[][])
*wrap(byte[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList wrap(byte[]... p0){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList#wrap(byte[][],long)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList#wrap(byte[][],long)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList.wrap(byte[][],long)
*wrap(byte[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList wrap(byte[][] p0,long p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList.wrap(p0,p1);
}
}
