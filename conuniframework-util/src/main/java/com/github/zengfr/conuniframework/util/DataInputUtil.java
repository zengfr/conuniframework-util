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
public final class DataInputUtil{ 
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.DataInput)
*asBooleanIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.DataInput)
*asByteIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.DataInput)
*asCharIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.DataInput)
*asDoubleIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.DataInput)
*asFloatIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.DataInput)
*asIntIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.DataInput)
*asLongIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.DataInput)
*asShortIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.DataInput,boolean[][]) throws java.io.IOException
*loadBooleans(java.io.DataInput p0,boolean[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.DataInput p0,boolean[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.DataInput,boolean[][],long,long) throws java.io.IOException
*loadBooleans(java.io.DataInput p0,boolean[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.DataInput p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.DataInput,boolean[]) throws java.io.IOException
*loadBooleans(java.io.DataInput p0,boolean... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.DataInput p0,boolean... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.DataInput,boolean[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.DataInput,boolean[],int,int) throws java.io.IOException
*loadBooleans(java.io.DataInput p0,boolean[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.DataInput p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.DataInput,byte[]) throws java.io.IOException
*loadBytes(java.io.DataInput p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.DataInput p0,byte... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.DataInput,byte[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.DataInput,byte[],int,int) throws java.io.IOException
*loadBytes(java.io.DataInput p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.DataInput p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.DataInput,char[][]) throws java.io.IOException
*loadChars(java.io.DataInput p0,char[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadChars(java.io.DataInput p0,char[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.DataInput,char[]) throws java.io.IOException
*loadChars(java.io.DataInput p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadChars(java.io.DataInput p0,char... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.DataInput,char[],int,int) throws java.io.IOException
*loadChars(java.io.DataInput p0,char[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadChars(java.io.DataInput p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.DataInput,char[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.DataInput,char[][],long,long) throws java.io.IOException
*loadChars(java.io.DataInput p0,char[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadChars(java.io.DataInput p0,char[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.DataInput,double[],int,int) throws java.io.IOException
*loadDoubles(java.io.DataInput p0,double[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.DataInput p0,double[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.DataInput,double[]) throws java.io.IOException
*loadDoubles(java.io.DataInput p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.DataInput p0,double... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.DataInput,double[][],long,long) throws java.io.IOException
*loadDoubles(java.io.DataInput p0,double[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.DataInput p0,double[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.DataInput,double[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.DataInput,double[][]) throws java.io.IOException
*loadDoubles(java.io.DataInput p0,double[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.DataInput p0,double[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[][]) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.DataInput p0,float[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[][],long,long) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.DataInput p0,float[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[],int,int) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.DataInput p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.DataInput,float...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.DataInput,float[]) throws java.io.IOException
*loadFloats(java.io.DataInput p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.DataInput p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.DataInput,int[][]) throws java.io.IOException
*loadInts(java.io.DataInput p0,int[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.DataInput p0,int[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.DataInput,int[]) throws java.io.IOException
*loadInts(java.io.DataInput p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.DataInput p0,int... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.DataInput,int[],int,int) throws java.io.IOException
*loadInts(java.io.DataInput p0,int[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.DataInput p0,int[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.DataInput,int[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.DataInput,int[][],long,long) throws java.io.IOException
*loadInts(java.io.DataInput p0,int[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.DataInput p0,int[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[][]) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.DataInput p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.DataInput p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[]) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.DataInput p0,long... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.DataInput,long[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.DataInput,long[],int,int) throws java.io.IOException
*loadLongs(java.io.DataInput p0,long[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.DataInput p0,long[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.DataInput,short[]) throws java.io.IOException
*loadShorts(java.io.DataInput p0,short... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.DataInput p0,short... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.DataInput,short[][],long,long) throws java.io.IOException
*loadShorts(java.io.DataInput p0,short[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.DataInput p0,short[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.DataInput,short[][]) throws java.io.IOException
*loadShorts(java.io.DataInput p0,short[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.DataInput p0,short[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.DataInput,short[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.DataInput,short[],int,int) throws java.io.IOException
*loadShorts(java.io.DataInput p0,short[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.DataInput p0,short[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link com.facebook.collections.PackedByteArray#readByteArray(java.io.DataInput,byte)}
*@see com.facebook.collections.PackedByteArray#readByteArray(java.io.DataInput,byte)
*<code>public static byte[] com.facebook.collections.PackedByteArray.readByteArray(java.io.DataInput,byte) throws java.io.IOException
*readByteArray(java.io.DataInput p0,byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] readByteArray(java.io.DataInput p0,byte p1) throws java.io.IOException{
	return com.facebook.collections.PackedByteArray.readByteArray(p0,p1);
}
/**
*{@link com.facebook.collections.PackedByteArray#readByteArrayList(java.io.DataInput,byte,byte)}
*@see com.facebook.collections.PackedByteArray#readByteArrayList(java.io.DataInput,byte,byte)
*<code>public static java.util.List<byte[]> com.facebook.collections.PackedByteArray.readByteArrayList(java.io.DataInput,byte,byte) throws java.io.IOException
*readByteArrayList(java.io.DataInput p0,byte p1,byte p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<byte[]> readByteArrayList(java.io.DataInput p0,byte p1,byte p2) throws java.io.IOException{
	return com.facebook.collections.PackedByteArray.readByteArrayList(p0,p1,p2);
}
}
