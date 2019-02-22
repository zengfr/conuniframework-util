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
public final class FileUtil{ 
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File)
*ageFileFilter(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File,boolean)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File,boolean)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)
*ageFileFilter(java.io.File p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*{@link com.google.common.io.Files#append(java.lang.CharSequence,java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#append(java.lang.CharSequence,java.io.File,java.nio.charset.Charset)
*<code>public static void com.google.common.io.Files.append(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.append(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterable it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(java.io.File)
*asBooleanIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.File) throws java.io.IOException
*asBooleanIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterable it.unimi.dsi.fastutil.io.BinIO.asByteIterable(java.io.File)
*asByteIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.File) throws java.io.IOException
*asByteIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*{@link com.google.common.io.Files#asByteSink(java.io.File,com.google.common.io.FileWriteMode...)}
*@see com.google.common.io.Files#asByteSink(java.io.File,com.google.common.io.FileWriteMode...)
*<code>public static com.google.common.io.ByteSink com.google.common.io.Files.asByteSink(java.io.File,com.google.common.io.FileWriteMode...)
*asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
	return com.google.common.io.Files.asByteSink(p0,p1);
}
/**
*{@link com.google.common.io.Files#asByteSource(java.io.File)}
*@see com.google.common.io.Files#asByteSource(java.io.File)
*<code>public static com.google.common.io.ByteSource com.google.common.io.Files.asByteSource(java.io.File)
*asByteSource(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.ByteSource asByteSource(java.io.File p0){
	return com.google.common.io.Files.asByteSource(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterable it.unimi.dsi.fastutil.io.BinIO.asCharIterable(java.io.File)
*asCharIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.File) throws java.io.IOException
*asCharIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*{@link com.google.common.io.Files#asCharSink(java.io.File,java.nio.charset.Charset,com.google.common.io.FileWriteMode...)}
*@see com.google.common.io.Files#asCharSink(java.io.File,java.nio.charset.Charset,com.google.common.io.FileWriteMode...)
*<code>public static com.google.common.io.CharSink com.google.common.io.Files.asCharSink(java.io.File,java.nio.charset.Charset,com.google.common.io.FileWriteMode...)
*asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.CharSink asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2){
	return com.google.common.io.Files.asCharSink(p0,p1,p2);
}
/**
*{@link com.google.common.io.Files#asCharSource(java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#asCharSource(java.io.File,java.nio.charset.Charset)
*<code>public static com.google.common.io.CharSource com.google.common.io.Files.asCharSource(java.io.File,java.nio.charset.Charset)
*asCharSource(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.CharSource asCharSource(java.io.File p0,java.nio.charset.Charset p1){
	return com.google.common.io.Files.asCharSource(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterable it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(java.io.File)
*asDoubleIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.File) throws java.io.IOException
*asDoubleIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterable it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(java.io.File)
*asFloatIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.File) throws java.io.IOException
*asFloatIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterable it.unimi.dsi.fastutil.io.BinIO.asIntIterable(java.io.File)
*asIntIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.File) throws java.io.IOException
*asIntIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterable it.unimi.dsi.fastutil.io.BinIO.asLongIterable(java.io.File)
*asLongIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.File) throws java.io.IOException
*asLongIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterable(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterable(java.io.File)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterable it.unimi.dsi.fastutil.io.BinIO.asShortIterable(java.io.File)
*asShortIterable(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.File) throws java.io.IOException
*asShortIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#checksum(java.io.File,java.util.zip.Checksum)}
*@see org.apache.commons.io.FileUtils#checksum(java.io.File,java.util.zip.Checksum)
*<code>public static java.util.zip.Checksum org.apache.commons.io.FileUtils.checksum(java.io.File,java.util.zip.Checksum) throws java.io.IOException
*checksum(java.io.File p0,java.util.zip.Checksum p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.zip.Checksum checksum(java.io.File p0,java.util.zip.Checksum p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.checksum(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#checksumCRC32(java.io.File)}
*@see org.apache.commons.io.FileUtils#checksumCRC32(java.io.File)
*<code>public static long org.apache.commons.io.FileUtils.checksumCRC32(java.io.File) throws java.io.IOException
*checksumCRC32(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long checksumCRC32(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.checksumCRC32(p0);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#chmod(java.io.File,int)}
*@see org.codehaus.plexus.util.NioFiles#chmod(java.io.File,int)
*<code>public static void org.codehaus.plexus.util.NioFiles.chmod(java.io.File,int) throws java.io.IOException
*chmod(java.io.File p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void chmod(java.io.File p0,int p1) throws java.io.IOException{
	 org.codehaus.plexus.util.NioFiles.chmod(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#cleanDirectory(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#cleanDirectory(java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.cleanDirectory(java.io.File) throws java.io.IOException
*cleanDirectory(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void cleanDirectory(java.io.File p0) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.cleanDirectory(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#contentEquals(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#contentEquals(java.io.File,java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.contentEquals(java.io.File,java.io.File) throws java.io.IOException
*contentEquals(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.contentEquals(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String)
*<code>public static boolean org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String) throws java.io.IOException
*contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#copy(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#copy(java.io.File,java.io.File)
*<code>public static java.io.File org.codehaus.plexus.util.NioFiles.copy(java.io.File,java.io.File) throws java.io.IOException
*copy(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File copy(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.copy(p0,p1);
}
/**
*{@link com.google.common.io.Files#copy(java.io.File,java.io.OutputStream)}
*@see com.google.common.io.Files#copy(java.io.File,java.io.OutputStream)
*<code>public static void com.google.common.io.Files.copy(java.io.File,java.io.OutputStream) throws java.io.IOException
*copy(java.io.File p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1);
}
/**
*{@link com.google.common.io.Files#copy(java.io.File,java.nio.charset.Charset,java.lang.Appendable)}
*@see com.google.common.io.Files#copy(java.io.File,java.nio.charset.Charset,java.lang.Appendable)
*<code>public static void com.google.common.io.Files.copy(java.io.File,java.nio.charset.Charset,java.lang.Appendable) throws java.io.IOException
*copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyDirectory(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyDirectory(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyDirectory(java.io.File,java.io.File) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyDirectory(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyDirectory(java.io.File,java.io.File,java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#copyDirectory(java.io.File,java.io.File,java.lang.String,java.lang.String)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyDirectory(java.io.File,java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,java.lang.String p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.lang.String p2,java.lang.String p3) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyDirectory(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean)}
*@see org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter)}
*@see org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyDirectoryLayout(java.io.File,java.io.File,java.lang.String[],java.lang.String...)}
*@see org.codehaus.plexus.util.FileUtils#copyDirectoryLayout(java.io.File,java.io.File,java.lang.String[],java.lang.String...)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyDirectoryLayout(java.io.File,java.io.File,java.lang.String[],java.lang.String[]) throws java.io.IOException
*copyDirectoryLayout(java.io.File p0,java.io.File p1,java.lang.String[] p2,java.lang.String... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectoryLayout(java.io.File p0,java.io.File p1,java.lang.String[] p2,java.lang.String... p3) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyDirectoryLayout(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyDirectoryStructure(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyDirectoryStructure(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyDirectoryStructure(java.io.File,java.io.File) throws java.io.IOException
*copyDirectoryStructure(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectoryStructure(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyDirectoryStructure(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyDirectoryStructureIfModified(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyDirectoryStructureIfModified(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyDirectoryStructureIfModified(java.io.File,java.io.File) throws java.io.IOException
*copyDirectoryStructureIfModified(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectoryStructureIfModified(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyDirectoryStructureIfModified(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectoryToDirectory(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#copyDirectoryToDirectory(java.io.File,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectoryToDirectory(java.io.File,java.io.File) throws java.io.IOException
*copyDirectoryToDirectory(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectoryToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectoryToDirectory(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper...)}
*@see org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper...)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[]) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils$FilterWrapper... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils.FilterWrapper... p3) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFile(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean)}
*@see org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils$FilterWrapper[] p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils.FilterWrapper[] p3,boolean p4) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFile(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFile(java.io.File,java.io.File) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.OutputStream)}
*@see org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.OutputStream)
*<code>public static long org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.OutputStream) throws java.io.IOException
*copyFile(java.io.File p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyFile(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.copyFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFile(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFileIfModified(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyFileIfModified(java.io.File,java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.copyFileIfModified(java.io.File,java.io.File) throws java.io.IOException
*copyFileIfModified(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean copyFileIfModified(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.copyFileIfModified(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFileToDirectory(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyFileToDirectory(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFileToDirectory(java.io.File,java.io.File) throws java.io.IOException
*copyFileToDirectory(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFileToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFileToDirectory(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyFileToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyFileToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFileToDirectory(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFileToDirectoryIfModified(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyFileToDirectoryIfModified(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFileToDirectoryIfModified(java.io.File,java.io.File) throws java.io.IOException
*copyFileToDirectoryIfModified(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFileToDirectoryIfModified(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFileToDirectoryIfModified(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyInputStreamToFile(java.io.InputStream,java.io.File)}
*@see org.apache.commons.io.FileUtils#copyInputStreamToFile(java.io.InputStream,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.copyInputStreamToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*copyInputStreamToFile(java.io.InputStream p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyInputStreamToFile(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade,java.io.File) throws java.io.IOException
*copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyStreamToFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyToDirectory(java.lang.Iterable<java.io.File>,java.io.File)}
*@see org.apache.commons.io.FileUtils#copyToDirectory(java.lang.Iterable<java.io.File>,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.copyToDirectory(java.lang.Iterable<java.io.File>,java.io.File) throws java.io.IOException
*copyToDirectory(java.lang.Iterable<java.io.File> p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToDirectory(java.lang.Iterable<java.io.File> p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyToDirectory(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyToDirectory(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#copyToDirectory(java.io.File,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.copyToDirectory(java.io.File,java.io.File) throws java.io.IOException
*copyToDirectory(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyToDirectory(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyToFile(java.io.InputStream,java.io.File)}
*@see org.apache.commons.io.FileUtils#copyToFile(java.io.InputStream,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.copyToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*copyToFile(java.io.InputStream p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyToFile(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyURLToFile(java.net.URL,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyURLToFile(java.net.URL,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyURLToFile(java.net.URL,java.io.File) throws java.io.IOException
*copyURLToFile(java.net.URL p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyURLToFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyURLToFile(java.net.URL,java.io.File,int,int)}
*@see org.apache.commons.io.FileUtils#copyURLToFile(java.net.URL,java.io.File,int,int)
*<code>public static void org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File,int,int) throws java.io.IOException
*copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyURLToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1){
	return org.apache.commons.io.input.Tailer.create(p0,p1);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2);
}
/**
*{@link com.google.common.io.Files#createParentDirs(java.io.File)}
*@see com.google.common.io.Files#createParentDirs(java.io.File)
*<code>public static void com.google.common.io.Files.createParentDirs(java.io.File) throws java.io.IOException
*createParentDirs(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void createParentDirs(java.io.File p0) throws java.io.IOException{
	 com.google.common.io.Files.createParentDirs(p0);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#createSymbolicLink(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#createSymbolicLink(java.io.File,java.io.File)
*<code>public static java.io.File org.codehaus.plexus.util.NioFiles.createSymbolicLink(java.io.File,java.io.File) throws java.io.IOException
*createSymbolicLink(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File createSymbolicLink(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.createSymbolicLink(p0,p1);
}
/**
*{@link com.google.common.io.Files#createTempDir()}
*@see com.google.common.io.Files#createTempDir()
*<code>public static java.io.File com.google.common.io.Files.createTempDir()
*createTempDir()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File createTempDir(){
	return com.google.common.io.Files.createTempDir();
}
/**
*{@link org.codehaus.plexus.util.FileUtils#createTempFile(java.lang.String,java.lang.String,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#createTempFile(java.lang.String,java.lang.String,java.io.File)
*<code>public static java.io.File org.codehaus.plexus.util.FileUtils.createTempFile(java.lang.String,java.lang.String,java.io.File)
*createTempFile(java.lang.String p0,java.lang.String p1,java.io.File p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File createTempFile(java.lang.String p0,java.lang.String p1,java.io.File p2){
	return org.codehaus.plexus.util.FileUtils.createTempFile(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#deleteDirectory(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#deleteDirectory(java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.deleteDirectory(java.io.File) throws java.io.IOException
*deleteDirectory(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void deleteDirectory(java.io.File p0) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.deleteDirectory(p0);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#deleteIfExists(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#deleteIfExists(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.NioFiles.deleteIfExists(java.io.File) throws java.io.IOException
*deleteIfExists(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean deleteIfExists(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.deleteIfExists(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#deleteQuietly(java.io.File)}
*@see org.apache.commons.io.FileUtils#deleteQuietly(java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.deleteQuietly(java.io.File)
*deleteQuietly(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean deleteQuietly(java.io.File p0){
	return org.apache.commons.io.FileUtils.deleteQuietly(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#directoryContains(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#directoryContains(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.directoryContains(java.io.File,java.io.File) throws java.io.IOException
*directoryContains(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.directoryContains(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#fileRead(java.io.File,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#fileRead(java.io.File,java.lang.String)
*<code>public static java.lang.String org.codehaus.plexus.util.FileUtils.fileRead(java.io.File,java.lang.String) throws java.io.IOException
*fileRead(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String fileRead(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.fileRead(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#fileRead(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#fileRead(java.io.File)
*<code>public static java.lang.String org.codehaus.plexus.util.FileUtils.fileRead(java.io.File) throws java.io.IOException
*fileRead(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String fileRead(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.fileRead(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#fileWrite(java.io.File,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#fileWrite(java.io.File,java.lang.String)
*<code>public static void org.codehaus.plexus.util.FileUtils.fileWrite(java.io.File,java.lang.String) throws java.io.IOException
*fileWrite(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fileWrite(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.fileWrite(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#fileWrite(java.io.File,java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#fileWrite(java.io.File,java.lang.String,java.lang.String)
*<code>public static void org.codehaus.plexus.util.FileUtils.fileWrite(java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*fileWrite(java.io.File p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fileWrite(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.fileWrite(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#forceDelete(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#forceDelete(java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.forceDelete(java.io.File) throws java.io.IOException
*forceDelete(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forceDelete(java.io.File p0) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.forceDelete(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#forceDeleteOnExit(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#forceDeleteOnExit(java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.forceDeleteOnExit(java.io.File) throws java.io.IOException
*forceDeleteOnExit(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.forceDeleteOnExit(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#forceMkdir(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#forceMkdir(java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.forceMkdir(java.io.File) throws java.io.IOException
*forceMkdir(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forceMkdir(java.io.File p0) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.forceMkdir(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#forceMkdirParent(java.io.File)}
*@see org.apache.commons.io.FileUtils#forceMkdirParent(java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.forceMkdirParent(java.io.File) throws java.io.IOException
*forceMkdirParent(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void forceMkdirParent(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.forceMkdirParent(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFile(java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#getFile(java.lang.String)
*<code>public static java.io.File org.codehaus.plexus.util.FileUtils.getFile(java.lang.String)
*getFile(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getFile(java.lang.String p0){
	return org.codehaus.plexus.util.FileUtils.getFile(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#getFile(java.lang.String...)}
*@see org.apache.commons.io.FileUtils#getFile(java.lang.String...)
*<code>public static java.io.File org.apache.commons.io.FileUtils.getFile(java.lang.String...)
*getFile(java.lang.String... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getFile(java.lang.String... p0){
	return org.apache.commons.io.FileUtils.getFile(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#getFile(java.io.File,java.lang.String...)}
*@see org.apache.commons.io.FileUtils#getFile(java.io.File,java.lang.String...)
*<code>public static java.io.File org.apache.commons.io.FileUtils.getFile(java.io.File,java.lang.String...)
*getFile(java.io.File p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getFile(java.io.File p0,java.lang.String... p1){
	return org.apache.commons.io.FileUtils.getFile(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean) throws java.io.IOException
*getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.io.File> org.codehaus.plexus.util.FileUtils.getFiles(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFiles(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String)
*<code>public static java.util.List<java.io.File> org.codehaus.plexus.util.FileUtils.getFiles(java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.SystemUtils#getJavaHome()}
*@see org.apache.commons.lang3.SystemUtils#getJavaHome()
*<code>public static java.io.File org.apache.commons.lang3.SystemUtils.getJavaHome()
*getJavaHome()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getJavaHome(){
	return org.apache.commons.lang3.SystemUtils.getJavaHome();
}
/**
*{@link org.apache.commons.lang3.SystemUtils#getJavaIoTmpDir()}
*@see org.apache.commons.lang3.SystemUtils#getJavaIoTmpDir()
*<code>public static java.io.File org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()
*getJavaIoTmpDir()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getJavaIoTmpDir(){
	return org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir();
}
/**
*{@link org.codehaus.plexus.util.NioFiles#getLastModified(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#getLastModified(java.io.File)
*<code>public static long org.codehaus.plexus.util.NioFiles.getLastModified(java.io.File) throws java.io.IOException
*getLastModified(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long getLastModified(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.getLastModified(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#getTempDirectory()}
*@see org.apache.commons.io.FileUtils#getTempDirectory()
*<code>public static java.io.File org.apache.commons.io.FileUtils.getTempDirectory()
*getTempDirectory()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getTempDirectory(){
	return org.apache.commons.io.FileUtils.getTempDirectory();
}
/**
*{@link org.apache.commons.lang3.SystemUtils#getUserDir()}
*@see org.apache.commons.lang3.SystemUtils#getUserDir()
*<code>public static java.io.File org.apache.commons.lang3.SystemUtils.getUserDir()
*getUserDir()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getUserDir(){
	return org.apache.commons.lang3.SystemUtils.getUserDir();
}
/**
*{@link org.apache.commons.io.FileUtils#getUserDirectory()}
*@see org.apache.commons.io.FileUtils#getUserDirectory()
*<code>public static java.io.File org.apache.commons.io.FileUtils.getUserDirectory()
*getUserDirectory()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getUserDirectory(){
	return org.apache.commons.io.FileUtils.getUserDirectory();
}
/**
*{@link org.apache.commons.lang3.SystemUtils#getUserHome()}
*@see org.apache.commons.lang3.SystemUtils#getUserHome()
*<code>public static java.io.File org.apache.commons.lang3.SystemUtils.getUserHome()
*getUserHome()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File getUserHome(){
	return org.apache.commons.lang3.SystemUtils.getUserHome();
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,long)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,long)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,long)
*isFileNewer(java.io.File p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.util.Date)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.util.Date)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.util.Date)
*isFileNewer(java.io.File p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.io.File)
*isFileNewer(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.io.File)
*isFileOlder(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,long)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,long)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,long)
*isFileOlder(java.io.File p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.util.Date)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.util.Date)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.util.Date)
*isFileOlder(java.io.File p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#isOutOfDate(java.io.File,java.io.File,int)}
*@see org.codehaus.plexus.util.SelectorUtils#isOutOfDate(java.io.File,java.io.File,int)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.isOutOfDate(java.io.File,java.io.File,int)
*isOutOfDate(java.io.File p0,java.io.File p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isOutOfDate(java.io.File p0,java.io.File p1,int p2){
	return org.codehaus.plexus.util.SelectorUtils.isOutOfDate(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#isSymbolicLink(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#isSymbolicLink(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.NioFiles.isSymbolicLink(java.io.File)
*isSymbolicLink(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymbolicLink(java.io.File p0){
	return org.codehaus.plexus.util.NioFiles.isSymbolicLink(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#isSymlink(java.io.File)}
*@see org.apache.commons.io.FileUtils#isSymlink(java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isSymlink(java.io.File) throws java.io.IOException
*isSymlink(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.isSymlink(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#isValidWindowsFileName(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#isValidWindowsFileName(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(java.io.File)
*isValidWindowsFileName(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isValidWindowsFileName(java.io.File p0){
	return org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(p0);
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#isXml(java.io.File)}
*@see org.codehaus.plexus.util.xml.XmlUtil#isXml(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.xml.XmlUtil.isXml(java.io.File)
*isXml(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isXml(java.io.File p0){
	return org.codehaus.plexus.util.xml.XmlUtil.isXml(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#lineIterator(java.io.File)}
*@see org.apache.commons.io.FileUtils#lineIterator(java.io.File)
*<code>public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File) throws java.io.IOException
*lineIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#lineIterator(java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#lineIterator(java.io.File,java.lang.String)
*<code>public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File,java.lang.String) throws java.io.IOException
*lineIterator(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*listFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)}
*@see org.apache.commons.io.FileUtils#listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFilesAndDirs(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[][],long,long) throws java.io.IOException
*loadBooleans(java.io.File p0,boolean[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.File p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[][]) throws java.io.IOException
*loadBooleans(java.io.File p0,boolean[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.File p0,boolean[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[]) throws java.io.IOException
*loadBooleans(java.io.File p0,boolean... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.File p0,boolean... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File,boolean[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[],int,int) throws java.io.IOException
*loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleans(java.io.File)
*<code>public static boolean[] it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File) throws java.io.IOException
*loadBooleans(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] loadBooleans(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBooleansBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBooleansBig(java.io.File)
*<code>public static boolean[][] it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(java.io.File) throws java.io.IOException
*loadBooleansBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[][] loadBooleansBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(p0);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[],int,int) throws java.io.IOException
*loadBytes(java.io.File p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File)
*<code>public static byte[] it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File) throws java.io.IOException
*loadBytes(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] loadBytes(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.File,byte...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[]) throws java.io.IOException
*loadBytes(java.io.File p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.File p0,byte... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[]) throws java.io.IOException
*loadChars(java.io.File p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadChars(java.io.File p0,char... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[],int,int) throws java.io.IOException
*loadChars(java.io.File p0,char[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadChars(java.io.File p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File)
*<code>public static char[] it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File) throws java.io.IOException
*loadChars(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] loadChars(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[][]) throws java.io.IOException
*loadChars(java.io.File p0,char[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadChars(java.io.File p0,char[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadChars(java.io.File,char[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[][],long,long) throws java.io.IOException
*loadChars(java.io.File p0,char[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadChars(java.io.File p0,char[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadCharsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadCharsBig(java.io.File)
*<code>public static char[][] it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(java.io.File) throws java.io.IOException
*loadCharsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[][] loadCharsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[]) throws java.io.IOException
*loadDoubles(java.io.File p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.File p0,double... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[],int,int) throws java.io.IOException
*loadDoubles(java.io.File p0,double[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.File p0,double[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[][],long,long) throws java.io.IOException
*loadDoubles(java.io.File p0,double[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.File p0,double[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File,double[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[][]) throws java.io.IOException
*loadDoubles(java.io.File p0,double[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.File p0,double[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoubles(java.io.File)
*<code>public static double[] it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File) throws java.io.IOException
*loadDoubles(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] loadDoubles(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadDoublesBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadDoublesBig(java.io.File)
*<code>public static double[][] it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(java.io.File) throws java.io.IOException
*loadDoublesBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[][] loadDoublesBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#loadFile(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#loadFile(java.io.File)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.loadFile(java.io.File) throws java.io.IOException
*loadFile(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> loadFile(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.loadFile(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[][],long,long) throws java.io.IOException
*loadFloats(java.io.File p0,float[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.File p0,float[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[]) throws java.io.IOException
*loadFloats(java.io.File p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.File p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File)
*<code>public static float[] it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File) throws java.io.IOException
*loadFloats(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] loadFloats(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[],int,int) throws java.io.IOException
*loadFloats(java.io.File p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloats(java.io.File,float[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[][]) throws java.io.IOException
*loadFloats(java.io.File p0,float[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.File p0,float[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadFloatsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadFloatsBig(java.io.File)
*<code>public static float[][] it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(java.io.File) throws java.io.IOException
*loadFloatsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[][] loadFloatsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[][],long,long) throws java.io.IOException
*loadInts(java.io.File p0,int[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.File p0,int[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[][]) throws java.io.IOException
*loadInts(java.io.File p0,int[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.File p0,int[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File)
*<code>public static int[] it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File) throws java.io.IOException
*loadInts(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] loadInts(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[],int,int) throws java.io.IOException
*loadInts(java.io.File p0,int[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.File p0,int[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadInts(java.io.File,int...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[]) throws java.io.IOException
*loadInts(java.io.File p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.File p0,int... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadIntsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadIntsBig(java.io.File)
*<code>public static int[][] it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(java.io.File) throws java.io.IOException
*loadIntsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[][] loadIntsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File)
*<code>public static long[] it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File) throws java.io.IOException
*loadLongs(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[] loadLongs(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.File p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[],int,int) throws java.io.IOException
*loadLongs(java.io.File p0,long[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.File p0,long[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[]) throws java.io.IOException
*loadLongs(java.io.File p0,long... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.File p0,long... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongs(java.io.File,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][]) throws java.io.IOException
*loadLongs(java.io.File p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.File p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadLongsBig(java.io.File)
*<code>public static long[][] it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(java.io.File) throws java.io.IOException
*loadLongsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] loadLongsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.File)
*<code>public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.File) throws java.io.IOException,java.lang.ClassNotFoundException
*loadObject(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object loadObject(java.io.File p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.File)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.File)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.io.File) throws java.io.IOException
*loadProperties(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[],int,int) throws java.io.IOException
*loadShorts(java.io.File p0,short[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.File p0,short[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[][],long,long)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[][],long,long) throws java.io.IOException
*loadShorts(java.io.File p0,short[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.File p0,short[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[]) throws java.io.IOException
*loadShorts(java.io.File p0,short... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.File p0,short... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File)
*<code>public static short[] it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File) throws java.io.IOException
*loadShorts(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[] loadShorts(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[]...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShorts(java.io.File,short[]...)
*<code>public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[][]) throws java.io.IOException
*loadShorts(java.io.File p0,short[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.File p0,short[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadShortsBig(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadShortsBig(java.io.File)
*<code>public static short[][] it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(java.io.File) throws java.io.IOException
*loadShortsBig(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[][] loadShortsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(p0);
}
/**
*{@link com.google.common.io.Files#map(java.io.File,java.nio.channels.FileChannel$MapMode,long)}
*@see com.google.common.io.Files#map(java.io.File,java.nio.channels.FileChannel$MapMode,long)
*<code>public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode,long) throws java.io.FileNotFoundException,java.io.IOException
*map(java.io.File p0,java.nio.channels.FileChannel$MapMode p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
	return com.google.common.io.Files.map(p0,p1,p2);
}
/**
*{@link com.google.common.io.Files#map(java.io.File,java.nio.channels.FileChannel$MapMode)}
*@see com.google.common.io.Files#map(java.io.File,java.nio.channels.FileChannel$MapMode)
*<code>public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode) throws java.io.IOException
*map(java.io.File p0,java.nio.channels.FileChannel$MapMode p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1) throws java.io.IOException{
	return com.google.common.io.Files.map(p0,p1);
}
/**
*{@link com.google.common.io.Files#map(java.io.File)}
*@see com.google.common.io.Files#map(java.io.File)
*<code>public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File) throws java.io.IOException
*map(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0) throws java.io.IOException{
	return com.google.common.io.Files.map(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#mkDirs(java.io.File,java.lang.String[],java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#mkDirs(java.io.File,java.lang.String[],java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.mkDirs(java.io.File,java.lang.String[],java.io.File) throws java.io.IOException
*mkDirs(java.io.File p0,java.lang.String[] p1,java.io.File p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mkDirs(java.io.File p0,java.lang.String[] p1,java.io.File p2) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.mkDirs(p0,p1,p2);
}
/**
*{@link com.google.common.io.Files#move(java.io.File,java.io.File)}
*@see com.google.common.io.Files#move(java.io.File,java.io.File)
*<code>public static void com.google.common.io.Files.move(java.io.File,java.io.File) throws java.io.IOException
*move(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void move(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 com.google.common.io.Files.move(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#moveDirectory(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#moveDirectory(java.io.File,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.moveDirectory(java.io.File,java.io.File) throws java.io.IOException
*moveDirectory(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectory(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#moveDirectoryToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveDirectoryToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveDirectoryToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#moveFile(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#moveFile(java.io.File,java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.moveFile(java.io.File,java.io.File) throws java.io.IOException
*moveFile(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#moveFileToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveFileToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFileToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#moveToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveToDirectory(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.io.File)}
*@see org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.io.File)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newPlatformReader(java.io.File) throws java.io.FileNotFoundException
*newPlatformReader(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newPlatformReader(java.io.File p0) throws java.io.FileNotFoundException{
	return org.codehaus.plexus.util.ReaderFactory.newPlatformReader(p0);
}
/**
*{@link org.codehaus.plexus.util.WriterFactory#newPlatformWriter(java.io.File)}
*@see org.codehaus.plexus.util.WriterFactory#newPlatformWriter(java.io.File)
*<code>public static java.io.Writer org.codehaus.plexus.util.WriterFactory.newPlatformWriter(java.io.File) throws java.io.IOException
*newPlatformWriter(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer newPlatformWriter(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.WriterFactory.newPlatformWriter(p0);
}
/**
*{@link org.codehaus.plexus.util.ReaderFactory#newReader(java.io.File,java.lang.String)}
*@see org.codehaus.plexus.util.ReaderFactory#newReader(java.io.File,java.lang.String)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newReader(java.io.File,java.lang.String) throws java.io.FileNotFoundException,java.io.UnsupportedEncodingException
*newReader(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newReader(java.io.File p0,java.lang.String p1) throws java.io.FileNotFoundException,java.io.UnsupportedEncodingException{
	return org.codehaus.plexus.util.ReaderFactory.newReader(p0,p1);
}
/**
*{@link com.google.common.io.Files#newReader(java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#newReader(java.io.File,java.nio.charset.Charset)
*<code>public static java.io.BufferedReader com.google.common.io.Files.newReader(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*newReader(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader newReader(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newReader(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.WriterFactory#newWriter(java.io.File,java.lang.String)}
*@see org.codehaus.plexus.util.WriterFactory#newWriter(java.io.File,java.lang.String)
*<code>public static java.io.Writer org.codehaus.plexus.util.WriterFactory.newWriter(java.io.File,java.lang.String) throws java.io.UnsupportedEncodingException,java.io.FileNotFoundException
*newWriter(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer newWriter(java.io.File p0,java.lang.String p1) throws java.io.UnsupportedEncodingException,java.io.FileNotFoundException{
	return org.codehaus.plexus.util.WriterFactory.newWriter(p0,p1);
}
/**
*{@link com.google.common.io.Files#newWriter(java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#newWriter(java.io.File,java.nio.charset.Charset)
*<code>public static java.io.BufferedWriter com.google.common.io.Files.newWriter(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*newWriter(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedWriter newWriter(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newWriter(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.io.File)}
*@see org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.io.File)
*<code>public static org.codehaus.plexus.util.xml.XmlStreamReader org.codehaus.plexus.util.ReaderFactory.newXmlReader(java.io.File) throws java.io.IOException
*newXmlReader(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.ReaderFactory.newXmlReader(p0);
}
/**
*{@link org.codehaus.plexus.util.WriterFactory#newXmlWriter(java.io.File)}
*@see org.codehaus.plexus.util.WriterFactory#newXmlWriter(java.io.File)
*<code>public static org.codehaus.plexus.util.xml.XmlStreamWriter org.codehaus.plexus.util.WriterFactory.newXmlWriter(java.io.File) throws java.io.IOException
*newXmlWriter(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.XmlStreamWriter newXmlWriter(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.WriterFactory.newXmlWriter(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#openInputStream(java.io.File)}
*@see org.apache.commons.io.FileUtils#openInputStream(java.io.File)
*<code>public static java.io.FileInputStream org.apache.commons.io.FileUtils.openInputStream(java.io.File) throws java.io.IOException
*openInputStream(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.FileInputStream openInputStream(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openInputStream(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#openOutputStream(java.io.File)}
*@see org.apache.commons.io.FileUtils#openOutputStream(java.io.File)
*<code>public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File) throws java.io.IOException
*openOutputStream(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#openOutputStream(java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#openOutputStream(java.io.File,boolean)
*<code>public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean) throws java.io.IOException
*openOutputStream(java.io.File p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0,p1);
}
/**
*{@link com.google.common.io.Files#readBytes(java.io.File,com.google.common.io.ByteProcessor<T>)}
*@see com.google.common.io.Files#readBytes(java.io.File,com.google.common.io.ByteProcessor<T>)
*<code>public static <T> T com.google.common.io.Files.readBytes(java.io.File,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.Files.readBytes(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readFileToByteArray(java.io.File)}
*@see org.apache.commons.io.FileUtils#readFileToByteArray(java.io.File)
*<code>public static byte[] org.apache.commons.io.FileUtils.readFileToByteArray(java.io.File) throws java.io.IOException
*readFileToByteArray(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] readFileToByteArray(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToByteArray(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#readFileToString(java.io.File,java.nio.charset.Charset)}
*@see org.apache.commons.io.FileUtils#readFileToString(java.io.File,java.nio.charset.Charset)
*<code>public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*readFileToString(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String readFileToString(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readFileToString(java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#readFileToString(java.io.File,java.lang.String)
*<code>public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.lang.String) throws java.io.IOException
*readFileToString(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String readFileToString(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readFileToString(java.io.File)}
*@see org.apache.commons.io.FileUtils#readFileToString(java.io.File)
*<code>public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File) throws java.io.IOException
*readFileToString(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String readFileToString(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0);
}
/**
*{@link com.google.common.io.Files#readFirstLine(java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#readFirstLine(java.io.File,java.nio.charset.Charset)
*<code>public static java.lang.String com.google.common.io.Files.readFirstLine(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*readFirstLine(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String readFirstLine(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Files.readFirstLine(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File,java.lang.String)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File,java.lang.String) throws java.io.IOException
*readLines(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File) throws java.io.IOException
*readLines(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#readLines(java.io.File,java.nio.charset.Charset)}
*@see org.apache.commons.io.FileUtils#readLines(java.io.File,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0,p1);
}
/**
*{@link com.google.common.io.Files#readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)}
*@see com.google.common.io.Files#readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)
*<code>public static <T> T com.google.common.io.Files.readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Files.readLines(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#readSymbolicLink(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#readSymbolicLink(java.io.File)
*<code>public static java.io.File org.codehaus.plexus.util.NioFiles.readSymbolicLink(java.io.File) throws java.io.IOException
*readSymbolicLink(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File readSymbolicLink(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.readSymbolicLink(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#rename(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#rename(java.io.File,java.io.File)
*<code>public static void org.codehaus.plexus.util.FileUtils.rename(java.io.File,java.io.File) throws java.io.IOException
*rename(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void rename(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.rename(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#resolveFile(java.io.File,java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#resolveFile(java.io.File,java.lang.String)
*<code>public static java.io.File org.codehaus.plexus.util.FileUtils.resolveFile(java.io.File,java.lang.String)
*resolveFile(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File resolveFile(java.io.File p0,java.lang.String p1){
	return org.codehaus.plexus.util.FileUtils.resolveFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#sizeOf(java.io.File)}
*@see org.apache.commons.io.FileUtils#sizeOf(java.io.File)
*<code>public static long org.apache.commons.io.FileUtils.sizeOf(java.io.File)
*sizeOf(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long sizeOf(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOf(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#sizeOfAsBigInteger(java.io.File)}
*@see org.apache.commons.io.FileUtils#sizeOfAsBigInteger(java.io.File)
*<code>public static java.math.BigInteger org.apache.commons.io.FileUtils.sizeOfAsBigInteger(java.io.File)
*sizeOfAsBigInteger(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigInteger sizeOfAsBigInteger(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOfAsBigInteger(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#sizeOfDirectory(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#sizeOfDirectory(java.io.File)
*<code>public static long org.codehaus.plexus.util.FileUtils.sizeOfDirectory(java.io.File)
*sizeOfDirectory(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long sizeOfDirectory(java.io.File p0){
	return org.codehaus.plexus.util.FileUtils.sizeOfDirectory(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#sizeOfDirectoryAsBigInteger(java.io.File)}
*@see org.apache.commons.io.FileUtils#sizeOfDirectoryAsBigInteger(java.io.File)
*<code>public static java.math.BigInteger org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(java.io.File)
*sizeOfDirectoryAsBigInteger(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],java.io.File) throws java.io.IOException
*storeBooleans(boolean[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(boolean[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],int,int,java.io.File) throws java.io.IOException
*storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File) throws java.io.IOException
*storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],long,long,java.io.File) throws java.io.IOException
*storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(boolean[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],java.io.File) throws java.io.IOException
*storeBooleans(boolean[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(boolean[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],java.io.File) throws java.io.IOException
*storeBytes(byte[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],int,int,java.io.File) throws java.io.IOException
*storeBytes(byte[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File) throws java.io.IOException
*storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(char[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(char[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],int,int,java.io.File) throws java.io.IOException
*storeChars(char[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File) throws java.io.IOException
*storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(char[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(char[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],java.io.File) throws java.io.IOException
*storeChars(char[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(char[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(char[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(char[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],long,long,java.io.File) throws java.io.IOException
*storeChars(char[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(char[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(char[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(char[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],java.io.File) throws java.io.IOException
*storeChars(char[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(char[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],java.io.File) throws java.io.IOException
*storeDoubles(double[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(double[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],long,long,java.io.File) throws java.io.IOException
*storeDoubles(double[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File) throws java.io.IOException
*storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],int,int,java.io.File) throws java.io.IOException
*storeDoubles(double[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(double[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(double[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],java.io.File) throws java.io.IOException
*storeDoubles(double[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(double[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File) throws java.io.IOException
*storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],java.io.File) throws java.io.IOException
*storeFloats(float[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.io.File) throws java.io.IOException
*storeFloats(float[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.io.File) throws java.io.IOException
*storeFloats(float[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(float[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],long,long,java.io.File) throws java.io.IOException
*storeFloats(float[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(float[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(int[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(int[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],java.io.File) throws java.io.IOException
*storeInts(int[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(int[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File) throws java.io.IOException
*storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(int[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(int[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],long,long,java.io.File) throws java.io.IOException
*storeInts(int[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(int[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(int[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],java.io.File) throws java.io.IOException
*storeInts(int[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(int[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(int[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(int[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],int,int,java.io.File) throws java.io.IOException
*storeInts(int[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(int[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.io.File) throws java.io.IOException
*storeLongs(long[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File) throws java.io.IOException
*storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],java.io.File) throws java.io.IOException
*storeLongs(long[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],int,int,java.io.File) throws java.io.IOException
*storeLongs(long[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(long[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.io.File) throws java.io.IOException
*storeLongs(long[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.io.File) throws java.io.IOException
*storeObject(java.lang.Object p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[][],long,long,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[][],long,long,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],long,long,java.io.File) throws java.io.IOException
*storeShorts(short[][] p0,long p1,long p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[][],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[][],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],java.io.File) throws java.io.IOException
*storeShorts(short[][] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(short[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File) throws java.io.IOException
*storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[],java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[],java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],java.io.File) throws java.io.IOException
*storeShorts(short[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(short[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[],int,int,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(short[],int,int,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],int,int,java.io.File) throws java.io.IOException
*storeShorts(short[] p0,int p1,int p2,java.io.File p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(short[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*{@link com.google.common.io.Files#toByteArray(java.io.File)}
*@see com.google.common.io.Files#toByteArray(java.io.File)
*<code>public static byte[] com.google.common.io.Files.toByteArray(java.io.File) throws java.io.IOException
*toByteArray(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.File p0) throws java.io.IOException{
	return com.google.common.io.Files.toByteArray(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#toFile(java.net.URL)}
*@see org.codehaus.plexus.util.FileUtils#toFile(java.net.URL)
*<code>public static java.io.File org.codehaus.plexus.util.FileUtils.toFile(java.net.URL)
*toFile(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.File toFile(java.net.URL p0){
	return org.codehaus.plexus.util.FileUtils.toFile(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#touch(java.io.File)}
*@see org.apache.commons.io.FileUtils#touch(java.io.File)
*<code>public static void org.apache.commons.io.FileUtils.touch(java.io.File) throws java.io.IOException
*touch(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void touch(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.touch(p0);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object)}
*@see org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object)
*track(java.io.File p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.io.File p0,java.lang.Object p1){
	 org.apache.commons.io.FileCleaner.track(p0,p1);
}
/**
*{@link org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)}
*@see org.apache.commons.io.FileCleaner#track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*<code>public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
	 org.apache.commons.io.FileCleaner.track(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#waitFor(java.io.File,int)}
*@see org.codehaus.plexus.util.FileUtils#waitFor(java.io.File,int)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.waitFor(java.io.File,int)
*waitFor(java.io.File p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean waitFor(java.io.File p0,int p1){
	return org.codehaus.plexus.util.FileUtils.waitFor(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*{@link com.google.common.io.Files#write(byte[],java.io.File)}
*@see com.google.common.io.Files#write(byte[],java.io.File)
*<code>public static void com.google.common.io.Files.write(byte[],java.io.File) throws java.io.IOException
*write(byte[] p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(byte[] p0,java.io.File p1) throws java.io.IOException{
	 com.google.common.io.Files.write(p0,p1);
}
/**
*{@link com.google.common.io.Files#write(java.lang.CharSequence,java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#write(java.lang.CharSequence,java.io.File,java.nio.charset.Charset)
*<code>public static void com.google.common.io.Files.write(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte...)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte...)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[]) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte... p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],boolean)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],boolean) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int,boolean)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int,boolean) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
}
