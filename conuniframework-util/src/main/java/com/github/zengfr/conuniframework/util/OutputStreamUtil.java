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
public final class OutputStreamUtil{ 
/**
*{@link com.google.common.hash.Funnels#asOutputStream(com.google.common.hash.PrimitiveSink)}
*@see com.google.common.hash.Funnels#asOutputStream(com.google.common.hash.PrimitiveSink)
*<code>public static java.io.OutputStream com.google.common.hash.Funnels.asOutputStream(com.google.common.hash.PrimitiveSink)
*asOutputStream(com.google.common.hash.PrimitiveSink p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink p0){
	return com.google.common.hash.Funnels.asOutputStream(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.OutputStream,int)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.OutputStream,int)
*<code>public static java.io.BufferedOutputStream org.apache.commons.io.IOUtils.buffer(java.io.OutputStream,int)
*buffer(java.io.OutputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.OutputStream)
*<code>public static java.io.BufferedOutputStream org.apache.commons.io.IOUtils.buffer(java.io.OutputStream)
*buffer(java.io.OutputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedOutputStream buffer(java.io.OutputStream p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#bufferedCopy(java.io.InputStream,java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#bufferedCopy(java.io.InputStream,java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.bufferedCopy(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*bufferedCopy(java.io.InputStream p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void bufferedCopy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.bufferedCopy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#close(java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#close(java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.close(java.io.OutputStream)
*close(java.io.OutputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void close(java.io.OutputStream p0){
	 org.codehaus.plexus.util.IOUtil.close(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#closeQuietly(java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#closeQuietly(java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.OutputStream)
*closeQuietly(java.io.OutputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void closeQuietly(java.io.OutputStream p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.OutputStream,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.OutputStream,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.OutputStream,int) throws java.io.IOException
*copy(byte[] p0,java.io.OutputStream p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#copy(byte[],java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(byte[],java.io.OutputStream) throws java.io.IOException
*copy(byte[] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.OutputStream,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.io.InputStream,java.io.OutputStream,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.io.InputStream,java.io.OutputStream,int) throws java.io.IOException
*copy(java.io.InputStream p0,java.io.OutputStream p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.io.InputStream p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.OutputStream)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.lang.String,java.io.OutputStream) throws java.io.IOException
*copy(java.lang.String p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.IOUtil.copy(p0,p1);
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
*{@link org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.OutputStream,int)}
*@see org.codehaus.plexus.util.IOUtil#copy(java.lang.String,java.io.OutputStream,int)
*<code>public static void org.codehaus.plexus.util.IOUtil.copy(java.lang.String,java.io.OutputStream,int) throws java.io.IOException
*copy(java.lang.String p0,java.io.OutputStream p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.lang.String p0,java.io.OutputStream p1,int p2) throws java.io.IOException{
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
*{@link org.apache.commons.io.CopyUtils#copy(java.lang.String,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.CopyUtils#copy(java.lang.String,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.CopyUtils.copy(java.lang.String,java.io.OutputStream,java.lang.String) throws java.io.IOException
*copy(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
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
*{@link com.google.common.io.Resources#copy(java.net.URL,java.io.OutputStream)}
*@see com.google.common.io.Resources#copy(java.net.URL,java.io.OutputStream)
*<code>public static void com.google.common.io.Resources.copy(java.net.URL,java.io.OutputStream) throws java.io.IOException
*copy(java.net.URL p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copy(java.net.URL p0,java.io.OutputStream p1) throws java.io.IOException{
	 com.google.common.io.Resources.copy(p0,p1);
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
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,long,long,byte...)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,long,long,byte...)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,long,long,byte[]) throws java.io.IOException
*copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3,byte... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3,byte... p4) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,long,long)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,long,long)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,long,long) throws java.io.IOException
*copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,long p2,long p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,byte...)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream,byte...)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream,byte[]) throws java.io.IOException
*copyLarge(java.io.InputStream p0,java.io.OutputStream p1,byte... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1,byte... p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#copyLarge(java.io.InputStream,java.io.OutputStream)
*<code>public static long org.apache.commons.io.IOUtils.copyLarge(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*copyLarge(java.io.InputStream p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long copyLarge(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.copyLarge(p0,p1);
}
/**
*{@link org.apache.commons.io.HexDump#dump(byte[],long,java.io.OutputStream,int)}
*@see org.apache.commons.io.HexDump#dump(byte[],long,java.io.OutputStream,int)
*<code>public static void org.apache.commons.io.HexDump.dump(byte[],long,java.io.OutputStream,int) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException
*dump(byte[] p0,long p1,java.io.OutputStream p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void dump(byte[] p0,long p1,java.io.OutputStream p2,int p3) throws java.io.IOException,java.lang.ArrayIndexOutOfBoundsException,java.lang.IllegalArgumentException{
	 org.apache.commons.io.HexDump.dump(p0,p1,p2,p3);
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
*{@link org.codehaus.plexus.util.WriterFactory#newXmlWriter(java.io.OutputStream)}
*@see org.codehaus.plexus.util.WriterFactory#newXmlWriter(java.io.OutputStream)
*<code>public static org.codehaus.plexus.util.xml.XmlStreamWriter org.codehaus.plexus.util.WriterFactory.newXmlWriter(java.io.OutputStream) throws java.io.IOException
*newXmlWriter(java.io.OutputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.XmlStreamWriter newXmlWriter(java.io.OutputStream p0) throws java.io.IOException{
	return org.codehaus.plexus.util.WriterFactory.newXmlWriter(p0);
}
/**
*{@link java.io.OutputStream#nullOutputStream()}
*@see java.io.OutputStream#nullOutputStream()
*<code>public static java.io.OutputStream java.io.OutputStream.nullOutputStream()
*nullOutputStream()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.OutputStream nullOutputStream(){
	return java.io.OutputStream.nullOutputStream();
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.InputStream,java.io.OutputStream)}
*@see org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.InputStream,java.io.OutputStream)
*<code>public static void org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(java.io.InputStream,java.io.OutputStream) throws java.io.IOException
*prettyFormat(java.io.InputStream p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void prettyFormat(java.io.InputStream p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.InputStream,java.io.OutputStream,int,java.lang.String)}
*@see org.codehaus.plexus.util.xml.XmlUtil#prettyFormat(java.io.InputStream,java.io.OutputStream,int,java.lang.String)
*<code>public static void org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(java.io.InputStream,java.io.OutputStream,int,java.lang.String) throws java.io.IOException
*prettyFormat(java.io.InputStream p0,java.io.OutputStream p1,int p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void prettyFormat(java.io.InputStream p0,java.io.OutputStream p1,int p2,java.lang.String p3) throws java.io.IOException{
	 org.codehaus.plexus.util.xml.XmlUtil.prettyFormat(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
*@see org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)
*<code>public static void org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable,java.io.OutputStream)
*serialize(java.io.Serializable p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void serialize(java.io.Serializable p0,java.io.OutputStream p1){
	 org.apache.commons.lang3.SerializationUtils.serialize(p0,p1);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],int,int,java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],int,int,java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],int,int,java.io.OutputStream) throws java.io.IOException
*storeBytes(byte[] p0,int p1,int p2,java.io.OutputStream p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[] p0,int p1,int p2,java.io.OutputStream p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(byte[],java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],java.io.OutputStream) throws java.io.IOException
*storeBytes(byte[] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
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
*{@link it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.OutputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeObject(java.lang.Object,java.io.OutputStream)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.io.OutputStream) throws java.io.IOException
*storeObject(java.lang.Object p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeObject(java.lang.Object p0,java.io.OutputStream p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.write(char[],java.io.OutputStream,java.lang.String) throws java.io.IOException
*write(char[] p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(char[] p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.write(char[],java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*write(char[] p0,java.io.OutputStream p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(char[] p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#write(char[],java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.write(char[],java.io.OutputStream) throws java.io.IOException
*write(char[] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(char[] p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.String,java.io.OutputStream,java.lang.String) throws java.io.IOException
*write(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.String p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.String,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*write(java.lang.String p0,java.io.OutputStream p1,java.nio.charset.Charset p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.String p0,java.io.OutputStream p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#write(java.lang.String,java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.String,java.io.OutputStream) throws java.io.IOException
*write(java.lang.String p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.String p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream,java.lang.String) throws java.io.IOException
*write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(byte[],java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#write(byte[],java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.write(byte[],java.io.OutputStream) throws java.io.IOException
*write(byte[] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.StringBuffer,java.io.OutputStream,java.lang.String) throws java.io.IOException
*write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#write(java.lang.StringBuffer,java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.StringBuffer,java.io.OutputStream) throws java.io.IOException
*write(java.lang.StringBuffer p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.StringBuffer p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#write(java.lang.CharSequence,java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.write(java.lang.CharSequence,java.io.OutputStream) throws java.io.IOException
*write(java.lang.CharSequence p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.lang.CharSequence p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.write(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#writeChunked(byte[],java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#writeChunked(byte[],java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.writeChunked(byte[],java.io.OutputStream) throws java.io.IOException
*writeChunked(byte[] p0,java.io.OutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeChunked(byte[] p0,java.io.OutputStream p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeChunked(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.nio.charset.Charset)
*<code>public static void org.apache.commons.io.IOUtils.writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.nio.charset.Charset) throws java.io.IOException
*writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.nio.charset.Charset p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.nio.charset.Charset p3) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream)}
*@see org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream)
*<code>public static void org.apache.commons.io.IOUtils.writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream) throws java.io.IOException
*writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.lang.String)
*<code>public static void org.apache.commons.io.IOUtils.writeLines(java.util.Collection<?>,java.lang.String,java.io.OutputStream,java.lang.String) throws java.io.IOException
*writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.util.Collection<?> p0,java.lang.String p1,java.io.OutputStream p2,java.lang.String p3) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.EndianUtils#writeSwappedDouble(java.io.OutputStream,double)}
*@see org.apache.commons.io.EndianUtils#writeSwappedDouble(java.io.OutputStream,double)
*<code>public static void org.apache.commons.io.EndianUtils.writeSwappedDouble(java.io.OutputStream,double) throws java.io.IOException
*writeSwappedDouble(java.io.OutputStream p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeSwappedDouble(java.io.OutputStream p0,double p1) throws java.io.IOException{
	 org.apache.commons.io.EndianUtils.writeSwappedDouble(p0,p1);
}
/**
*{@link org.apache.commons.io.EndianUtils#writeSwappedFloat(java.io.OutputStream,float)}
*@see org.apache.commons.io.EndianUtils#writeSwappedFloat(java.io.OutputStream,float)
*<code>public static void org.apache.commons.io.EndianUtils.writeSwappedFloat(java.io.OutputStream,float) throws java.io.IOException
*writeSwappedFloat(java.io.OutputStream p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeSwappedFloat(java.io.OutputStream p0,float p1) throws java.io.IOException{
	 org.apache.commons.io.EndianUtils.writeSwappedFloat(p0,p1);
}
/**
*{@link org.apache.commons.io.EndianUtils#writeSwappedInteger(java.io.OutputStream,int)}
*@see org.apache.commons.io.EndianUtils#writeSwappedInteger(java.io.OutputStream,int)
*<code>public static void org.apache.commons.io.EndianUtils.writeSwappedInteger(java.io.OutputStream,int) throws java.io.IOException
*writeSwappedInteger(java.io.OutputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeSwappedInteger(java.io.OutputStream p0,int p1) throws java.io.IOException{
	 org.apache.commons.io.EndianUtils.writeSwappedInteger(p0,p1);
}
/**
*{@link org.apache.commons.io.EndianUtils#writeSwappedLong(java.io.OutputStream,long)}
*@see org.apache.commons.io.EndianUtils#writeSwappedLong(java.io.OutputStream,long)
*<code>public static void org.apache.commons.io.EndianUtils.writeSwappedLong(java.io.OutputStream,long) throws java.io.IOException
*writeSwappedLong(java.io.OutputStream p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeSwappedLong(java.io.OutputStream p0,long p1) throws java.io.IOException{
	 org.apache.commons.io.EndianUtils.writeSwappedLong(p0,p1);
}
/**
*{@link org.apache.commons.io.EndianUtils#writeSwappedShort(java.io.OutputStream,short)}
*@see org.apache.commons.io.EndianUtils#writeSwappedShort(java.io.OutputStream,short)
*<code>public static void org.apache.commons.io.EndianUtils.writeSwappedShort(java.io.OutputStream,short) throws java.io.IOException
*writeSwappedShort(java.io.OutputStream p0,short p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeSwappedShort(java.io.OutputStream p0,short p1) throws java.io.IOException{
	 org.apache.commons.io.EndianUtils.writeSwappedShort(p0,p1);
}
}
