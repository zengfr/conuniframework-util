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
public final class WriterUtil{ 
/**
*{@link com.google.common.io.CharStreams#asWriter(java.lang.Appendable)}
*@see com.google.common.io.CharStreams#asWriter(java.lang.Appendable)
*<code>public static java.io.Writer com.google.common.io.CharStreams.asWriter(java.lang.Appendable)
*asWriter(java.lang.Appendable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer asWriter(java.lang.Appendable p0){
	return com.google.common.io.CharStreams.asWriter(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Writer,int)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Writer,int)
*<code>public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer,int)
*buffer(java.io.Writer p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Writer)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Writer)
*<code>public static java.io.BufferedWriter org.apache.commons.io.IOUtils.buffer(java.io.Writer)
*buffer(java.io.Writer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedWriter buffer(java.io.Writer p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#close(java.io.Writer)}
*@see org.codehaus.plexus.util.IOUtil#close(java.io.Writer)
*<code>public static void org.codehaus.plexus.util.IOUtil.close(java.io.Writer)
*close(java.io.Writer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void close(java.io.Writer p0){
	 org.codehaus.plexus.util.IOUtil.close(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#closeQuietly(java.io.Writer)}
*@see org.apache.commons.io.IOUtils#closeQuietly(java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.Writer)
*closeQuietly(java.io.Writer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void closeQuietly(java.io.Writer p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.Writer) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.Writer,int) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.Writer p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,java.lang.String)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,java.lang.String)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.Writer,java.lang.String) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
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
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.Writer) throws java.io.IOException
*copy(byte[] p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.Writer)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.Writer)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.lang.String,java.io.Writer) throws java.io.IOException
*copy(java.lang.String p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,java.lang.String,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.Writer,java.lang.String,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.Writer,java.lang.String,int) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.lang.String p2,int p3) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,java.lang.String,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,java.lang.String,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.Writer,java.lang.String,int) throws java.io.IOException
*copy(byte[] p0,java.io.Writer p1,java.lang.String p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2,int p3) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,java.lang.String)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,java.lang.String)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.Writer,java.lang.String) throws java.io.IOException
*copy(byte[] p0,java.io.Writer p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.Writer,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.Writer,int) throws java.io.IOException
*copy(byte[] p0,java.io.Writer p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.Writer p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#copy(java.io.InputStream,java.io.Writer,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#copy(java.io.InputStream,java.io.Writer,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.copy(java.io.InputStream,java.io.Writer,java.nio.charset.Charset) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
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
*{@link org.codehaus.plexus.util.WriterFactory#newPlatformWriter(java.io.OutputStream)}
*@see org.codehaus.plexus.util.WriterFactory#newPlatformWriter(java.io.OutputStream)
*<code>public static java.io.Writer org.codehaus.plexus.util.WriterFactory.newPlatformWriter(java.io.OutputStream)
*newPlatformWriter(java.io.OutputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer newPlatformWriter(java.io.OutputStream p0){
	return org.codehaus.plexus.util.WriterFactory.newPlatformWriter(p0);
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
*{@link org.codehaus.plexus.util.WriterFactory#newWriter(java.io.OutputStream,java.lang.String)}
*@see org.codehaus.plexus.util.WriterFactory#newWriter(java.io.OutputStream,java.lang.String)
*<code>public static java.io.Writer org.codehaus.plexus.util.WriterFactory.newWriter(java.io.OutputStream,java.lang.String) throws java.io.UnsupportedEncodingException
*newWriter(java.io.OutputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer newWriter(java.io.OutputStream p0,java.lang.String p1) throws java.io.UnsupportedEncodingException{
	return org.codehaus.plexus.util.WriterFactory.newWriter(p0,p1);
}
/**
*{@link java.io.Writer#nullWriter()}
*@see java.io.Writer#nullWriter()
*<code>public static java.io.Writer java.io.Writer.nullWriter()
*nullWriter()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Writer nullWriter(){
	return java.io.Writer.nullWriter();
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
*{@link org.codehaus.plexus.util.xml.Xpp3DomWriter#write(java.io.Writer,org.codehaus.plexus.util.xml.Xpp3Dom)}
*@see org.codehaus.plexus.util.xml.Xpp3DomWriter#write(java.io.Writer,org.codehaus.plexus.util.xml.Xpp3Dom)
*<code>public static void org.codehaus.plexus.util.xml.Xpp3DomWriter.write(java.io.Writer,org.codehaus.plexus.util.xml.Xpp3Dom)
*write(java.io.Writer p0,org.codehaus.plexus.util.xml.Xpp3Dom p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.Writer p0,org.codehaus.plexus.util.xml.Xpp3Dom p1){
	 org.codehaus.plexus.util.xml.Xpp3DomWriter.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(char[],java.io.Writer)}
*@see org.apache.commons.io.IOUtils#write(char[],java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.write(char[],java.io.Writer) throws java.io.IOException
*write(char[] p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(char[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(byte[],java.io.Writer,java.lang.String)}
*@see org.apache.commons.io.IOUtils#write(byte[],java.io.Writer,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer,java.lang.String) throws java.io.IOException
*write(byte[] p0,java.io.Writer p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(byte[] p0,java.io.Writer p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.String,java.io.Writer)}
*@see org.apache.commons.io.IOUtils#write(java.lang.String,java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.String,java.io.Writer) throws java.io.IOException
*write(java.lang.String p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.String p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.Writer)}
*@see org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.Writer) throws java.io.IOException
*write(java.lang.CharSequence p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.CharSequence p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(byte[],java.io.Writer,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#write(byte[],java.io.Writer,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer,java.nio.charset.Charset) throws java.io.IOException
*write(byte[] p0,java.io.Writer p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(byte[] p0,java.io.Writer p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(byte[],java.io.Writer)}
*@see org.apache.commons.io.IOUtils#write(byte[],java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.write(byte[],java.io.Writer) throws java.io.IOException
*write(byte[] p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(byte[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.Writer)}
*@see org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.StringBuffer,java.io.Writer) throws java.io.IOException
*write(java.lang.StringBuffer p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.StringBuffer p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#writeChunked(char[],java.io.Writer)}
*@see org.apache.commons.io.IOUtils#writeChunked(char[],java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.writeChunked(char[],java.io.Writer) throws java.io.IOException
*writeChunked(char[] p0,java.io.Writer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeChunked(char[] p0,java.io.Writer p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeChunked(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.Writer)}
*@see org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.Writer)
*<code>public static void org.apache.commons.io.IOUtils.writeLines(java.util.Collection<?>,java.lang.String,java.io.Writer) throws java.io.IOException
*writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.Writer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.Writer p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeLines(p0,p1,p2);
}
}
