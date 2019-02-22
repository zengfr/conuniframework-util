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
public final class ReaderUtil{ 
/**
*{@link org.apache.commons.collections.primitives.adapters.io.CharIteratorReader#adapt(org.apache.commons.collections.primitives.CharIterator)}
*@see org.apache.commons.collections.primitives.adapters.io.CharIteratorReader#adapt(org.apache.commons.collections.primitives.CharIterator)
*<code>public static java.io.Reader org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(org.apache.commons.collections.primitives.CharIterator)
*adapt(org.apache.commons.collections.primitives.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator#adapt(java.io.Reader)}
*@see org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator#adapt(java.io.Reader)
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(java.io.Reader)
*adapt(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
	return org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Reader)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader)
*buffer(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Reader,int)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Reader,int)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader,int)
*buffer(java.io.Reader p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder.InputLocationBuilder p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0,boolean p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0,org.codehaus.plexus.util.xml.Xpp3DomBuilder.InputLocationBuilder p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#close(java.io.Reader)}
*@see org.codehaus.plexus.util.IOUtil#close(java.io.Reader)
*<code>public static void org.codehaus.plexus.util.IOUtil.close(java.io.Reader)
*close(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void close(java.io.Reader p0){
	 org.codehaus.plexus.util.IOUtil.close(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#closeQuietly(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#closeQuietly(java.io.Reader)
*<code>public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.Reader)
*closeQuietly(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void closeQuietly(java.io.Reader p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#contentEquals(java.io.Reader,java.io.Reader)}
*@see org.apache.commons.io.IOUtils#contentEquals(java.io.Reader,java.io.Reader)
*<code>public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.Reader,java.io.Reader) throws java.io.IOException
*contentEquals(java.io.Reader p0,java.io.Reader p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader)}
*@see org.apache.commons.io.IOUtils#contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader)
*<code>public static boolean org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader) throws java.io.IOException
*contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.Writer)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.Writer)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.Reader,java.io.Writer) throws java.io.IOException
*copy(java.io.Reader p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.Writer,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.Writer,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.Reader,java.io.Writer,int) throws java.io.IOException
*copy(java.io.Reader p0,java.io.Writer p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.Writer p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.OutputStream,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.OutputStream,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.Reader,java.io.OutputStream,int) throws java.io.IOException
*copy(java.io.Reader p0,java.io.OutputStream p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.Reader,java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.Reader,java.io.OutputStream) throws java.io.IOException
*copy(java.io.Reader p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.apache.commons.io.CopyUtils#copy(java.io.Reader,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.CopyUtils#copy(java.io.Reader,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.CopyUtils.copy(java.io.Reader,java.io.OutputStream,java.lang.String) throws java.io.IOException
*copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.CopyUtils.copy(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#copy(java.io.Reader,java.io.OutputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#copy(java.io.Reader,java.io.OutputStream,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.copy(java.io.Reader,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*copy(java.io.Reader p0,java.io.OutputStream p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.Reader p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.copy(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,long,long,char...)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,long,long,char...)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,long,long,char[]) throws java.io.IOException
*copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3,char... p4) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,long,long)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,long,long)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,long,long) throws java.io.IOException
*copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,long p2,long p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,char...)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer,char...)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer,char[]) throws java.io.IOException
*copyLarge(java.io.Reader p0,java.io.Writer p1,char... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1,char... p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.Reader,java.io.Writer)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.Reader,java.io.Writer) throws java.io.IOException
*copyLarge(java.io.Reader p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#lineIterator(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#lineIterator(java.io.Reader)
*<code>public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.Reader)
*lineIterator(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.lineIterator(p0);
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
*{@link org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.net.URL)}
*@see org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.net.URL)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newPlatformReader(java.net.URL) throws java.io.IOException
*newPlatformReader(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newPlatformReader(java.net.URL p0) throws java.io.IOException{
	return org.codehaus.plexus.util.ReaderFactory.newPlatformReader(p0);
}
/**
*{@link org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.io.InputStream)}
*@see org.codehaus.plexus.util.ReaderFactory#newPlatformReader(java.io.InputStream)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newPlatformReader(java.io.InputStream)
*newPlatformReader(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newPlatformReader(java.io.InputStream p0){
	return org.codehaus.plexus.util.ReaderFactory.newPlatformReader(p0);
}
/**
*{@link org.codehaus.plexus.util.ReaderFactory#newReader(java.io.InputStream,java.lang.String)}
*@see org.codehaus.plexus.util.ReaderFactory#newReader(java.io.InputStream,java.lang.String)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newReader(java.io.InputStream,java.lang.String) throws java.io.UnsupportedEncodingException
*newReader(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newReader(java.io.InputStream p0,java.lang.String p1) throws java.io.UnsupportedEncodingException{
	return org.codehaus.plexus.util.ReaderFactory.newReader(p0,p1);
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
*{@link org.codehaus.plexus.util.ReaderFactory#newReader(java.net.URL,java.lang.String)}
*@see org.codehaus.plexus.util.ReaderFactory#newReader(java.net.URL,java.lang.String)
*<code>public static java.io.Reader org.codehaus.plexus.util.ReaderFactory.newReader(java.net.URL,java.lang.String) throws java.io.IOException
*newReader(java.net.URL p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader newReader(java.net.URL p0,java.lang.String p1) throws java.io.IOException{
	return org.codehaus.plexus.util.ReaderFactory.newReader(p0,p1);
}
/**
*{@link java.io.Reader#nullReader()}
*@see java.io.Reader#nullReader()
*<code>public static java.io.Reader java.io.Reader.nullReader()
*nullReader()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader nullReader(){
	return java.io.Reader.nullReader();
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.Reader,java.io.Writer,int,java.lang.String)}
*@see org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.Reader,java.io.Writer,int,java.lang.String)
*<code>public static void org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(java.io.Reader,java.io.Writer,int,java.lang.String) throws java.io.IOException
*prettyFormat(java.io.Reader p0,java.io.Writer p1,int p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void prettyFormat(java.io.Reader p0,java.io.Writer p1,int p2,java.lang.String p3) throws java.io.IOException{
	 org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.Reader,java.io.Writer)}
*@see org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.Reader,java.io.Writer)
*<code>public static void org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(java.io.Reader,java.io.Writer) throws java.io.IOException
*prettyFormat(java.io.Reader p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void prettyFormat(java.io.Reader p0,java.io.Writer p1) throws java.io.IOException{
	 org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#read(java.io.Reader,char...)}
*@see org.apache.commons.io.IOUtils#read(java.io.Reader,char...)
*<code>public static int org.apache.commons.io.IOUtils.read(java.io.Reader,char[]) throws java.io.IOException
*read(java.io.Reader p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int read(java.io.Reader p0,char... p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#read(java.io.Reader,char[],int,int)}
*@see org.apache.commons.io.IOUtils#read(java.io.Reader,char[],int,int)
*<code>public static int org.apache.commons.io.IOUtils.read(java.io.Reader,char[],int,int) throws java.io.IOException
*read(java.io.Reader p0,char[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int read(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#readFully(java.io.Reader,char...)}
*@see org.apache.commons.io.IOUtils#readFully(java.io.Reader,char...)
*<code>public static void org.apache.commons.io.IOUtils.readFully(java.io.Reader,char[]) throws java.io.IOException
*readFully(java.io.Reader p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void readFully(java.io.Reader p0,char... p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readFully(java.io.Reader,char[],int,int)}
*@see org.apache.commons.io.IOUtils#readFully(java.io.Reader,char[],int,int)
*<code>public static void org.apache.commons.io.IOUtils.readFully(java.io.Reader,char[],int,int) throws java.io.IOException
*readFully(java.io.Reader p0,char[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void readFully(java.io.Reader p0,char[] p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.Reader)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.Reader) throws java.io.IOException
*readLines(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#skip(java.io.Reader,long)}
*@see org.apache.commons.io.IOUtils#skip(java.io.Reader,long)
*<code>public static long org.apache.commons.io.IOUtils.skip(java.io.Reader,long) throws java.io.IOException
*skip(java.io.Reader p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long skip(java.io.Reader p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.skip(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#skipFully(java.io.Reader,long)}
*@see org.apache.commons.io.IOUtils#skipFully(java.io.Reader,long)
*<code>public static void org.apache.commons.io.IOUtils.skipFully(java.io.Reader,long) throws java.io.IOException
*skipFully(java.io.Reader p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void skipFully(java.io.Reader p0,long p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.skipFully(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader,int)}
*@see org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader,int)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader,int)
*toBufferedReader(java.io.Reader p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader)
*toBufferedReader(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#toByteArray(java.io.Reader,int)}
*@see org.codehaus.plexus.util.IOUtil#toByteArray(java.io.Reader,int)
*<code>public static byte[] org.codehaus.plexus.util.IOUtil.toByteArray(java.io.Reader,int) throws java.io.IOException
*toByteArray(java.io.Reader p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.Reader p0,int p1) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.toByteArray(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#toByteArray(java.io.Reader)}
*@see org.codehaus.plexus.util.IOUtil#toByteArray(java.io.Reader)
*<code>public static byte[] org.codehaus.plexus.util.IOUtil.toByteArray(java.io.Reader) throws java.io.IOException
*toByteArray(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.Reader p0) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.toByteArray(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#toByteArray(java.io.Reader,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#toByteArray(java.io.Reader,java.nio.charset.Charset)
*<code>public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.Reader,java.nio.charset.Charset) throws java.io.IOException
*toByteArray(java.io.Reader p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.Reader p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toByteArray(java.io.Reader,java.lang.String)}
*@see org.apache.commons.io.IOUtils#toByteArray(java.io.Reader,java.lang.String)
*<code>public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.Reader,java.lang.String) throws java.io.IOException
*toByteArray(java.io.Reader p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.Reader p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toCharArray(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#toCharArray(java.io.Reader)
*<code>public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.Reader) throws java.io.IOException
*toCharArray(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] toCharArray(java.io.Reader p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0);
}
}
