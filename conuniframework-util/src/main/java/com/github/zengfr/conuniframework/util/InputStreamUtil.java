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
public final class InputStreamUtil{ 
/**
*{@link org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream#adapt(org.apache.commons.collections.primitives.ByteIterator)}
*@see org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream#adapt(org.apache.commons.collections.primitives.ByteIterator)
*<code>public static java.io.InputStream org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(org.apache.commons.collections.primitives.ByteIterator)
*adapt(org.apache.commons.collections.primitives.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator#adapt(java.io.InputStream)}
*@see org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator#adapt(java.io.InputStream)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(java.io.InputStream)
*adapt(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
	return org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.InputStream)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.InputStream)
*<code>public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream)
*buffer(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.InputStream,int)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.InputStream,int)
*<code>public static java.io.BufferedInputStream org.apache.commons.io.IOUtils.buffer(java.io.InputStream,int)
*buffer(java.io.InputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedInputStream buffer(java.io.InputStream p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
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
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.InputStream,java.lang.String) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.InputStream p0,java.lang.String p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.InputStream,java.lang.String,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.InputStream p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.InputStream p0,java.lang.String p1,boolean p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#close(java.io.InputStream)}
*@see org.codehaus.plexus.util.IOUtil#close(java.io.InputStream)
*<code>public static void org.codehaus.plexus.util.IOUtil.close(java.io.InputStream)
*close(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void close(java.io.InputStream p0){
	 org.codehaus.plexus.util.IOUtil.close(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#closeQuietly(java.io.InputStream)}
*@see org.apache.commons.io.IOUtils#closeQuietly(java.io.InputStream)
*<code>public static void org.apache.commons.io.IOUtils.closeQuietly(java.io.InputStream)
*closeQuietly(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void closeQuietly(java.io.InputStream p0){
	 org.apache.commons.io.IOUtils.closeQuietly(p0);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#contentEquals(java.io.InputStream,java.io.InputStream)}
*@see org.codehaus.plexus.util.IOUtil#contentEquals(java.io.InputStream,java.io.InputStream)
*<code>public static boolean org.codehaus.plexus.util.IOUtil.contentEquals(java.io.InputStream,java.io.InputStream) throws java.io.IOException
*contentEquals(java.io.InputStream p0,java.io.InputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.contentEquals(p0,p1);
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
*{@link org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)}
*@see org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)
*<code>public static <T> T org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)
*deserialize(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T deserialize(java.io.InputStream p0){
	return org.apache.commons.lang3.SerializationUtils.deserialize(p0);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer)
*<code>public static int org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer) throws org.codehaus.plexus.util.cli.CommandLineException
*executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3) throws org.codehaus.plexus.util.cli.CommandLineException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLine(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int)
*<code>public static int org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLine(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int) throws org.codehaus.plexus.util.cli.CommandLineException
*executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3,int p4) throws org.codehaus.plexus.util.cli.CommandLineException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLine(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int)
*<code>public static org.codehaus.plexus.util.cli.CommandLineCallable org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline,java.io.InputStream,org.codehaus.plexus.util.cli.StreamConsumer,org.codehaus.plexus.util.cli.StreamConsumer,int) throws org.codehaus.plexus.util.cli.CommandLineException
*executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.cli.CommandLineCallable executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline p0,java.io.InputStream p1,org.codehaus.plexus.util.cli.StreamConsumer p2,org.codehaus.plexus.util.cli.StreamConsumer p3,int p4) throws org.codehaus.plexus.util.cli.CommandLineException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.executeCommandLineAsCallable(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.io.ByteStreams#exhaust(java.io.InputStream)}
*@see com.google.common.io.ByteStreams#exhaust(java.io.InputStream)
*<code>public static long com.google.common.io.ByteStreams.exhaust(java.io.InputStream) throws java.io.IOException
*exhaust(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long exhaust(java.io.InputStream p0) throws java.io.IOException{
	return com.google.common.io.ByteStreams.exhaust(p0);
}
/**
*{@link com.facebook.util.StreamImporter#importLines(java.io.InputStream)}
*@see com.facebook.util.StreamImporter#importLines(java.io.InputStream)
*<code>public static java.util.List<java.lang.String> com.facebook.util.StreamImporter.importLines(java.io.InputStream) throws java.io.IOException
*importLines(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> importLines(java.io.InputStream p0) throws java.io.IOException{
	return com.facebook.util.StreamImporter.importLines(p0);
}
/**
*{@link com.google.common.io.ByteStreams#limit(java.io.InputStream,long)}
*@see com.google.common.io.ByteStreams#limit(java.io.InputStream,long)
*<code>public static java.io.InputStream com.google.common.io.ByteStreams.limit(java.io.InputStream,long)
*limit(java.io.InputStream p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream limit(java.io.InputStream p0,long p1){
	return com.google.common.io.ByteStreams.limit(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#lineIterator(java.io.InputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#lineIterator(java.io.InputStream,java.nio.charset.Charset)
*<code>public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#lineIterator(java.io.InputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#lineIterator(java.io.InputStream,java.lang.String)
*<code>public static org.apache.commons.io.LineIterator org.apache.commons.io.IOUtils.lineIterator(java.io.InputStream,java.lang.String) throws java.io.IOException
*lineIterator(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.lineIterator(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[],int,int)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[],int,int) throws java.io.IOException
*loadBytes(java.io.InputStream p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
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
*{@link it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte...)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadBytes(java.io.InputStream,byte...)
*<code>public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.InputStream,byte[]) throws java.io.IOException
*loadBytes(java.io.InputStream p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.InputStream)}
*@see it.unimi.dsi.fastutil.io.BinIO#loadObject(java.io.InputStream)
*<code>public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.InputStream) throws java.io.IOException,java.lang.ClassNotFoundException
*loadObject(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object loadObject(java.io.InputStream p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.InputStream)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.InputStream)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.io.InputStream) throws java.io.IOException
*loadProperties(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.io.InputStream p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
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
*{@link org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.io.InputStream)}
*@see org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.io.InputStream)
*<code>public static org.codehaus.plexus.util.xml.XmlStreamReader org.codehaus.plexus.util.ReaderFactory.newXmlReader(java.io.InputStream) throws java.io.IOException
*newXmlReader(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.io.InputStream p0) throws java.io.IOException{
	return org.codehaus.plexus.util.ReaderFactory.newXmlReader(p0);
}
/**
*{@link java.io.InputStream#nullInputStream()}
*@see java.io.InputStream#nullInputStream()
*<code>public static java.io.InputStream java.io.InputStream.nullInputStream()
*nullInputStream()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream nullInputStream(){
	return java.io.InputStream.nullInputStream();
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
*{@link org.apache.commons.io.IOUtils#read(java.io.InputStream,byte[],int,int)}
*@see org.apache.commons.io.IOUtils#read(java.io.InputStream,byte[],int,int)
*<code>public static int org.apache.commons.io.IOUtils.read(java.io.InputStream,byte[],int,int) throws java.io.IOException
*read(java.io.InputStream p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int read(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#read(java.io.InputStream,byte...)}
*@see org.apache.commons.io.IOUtils#read(java.io.InputStream,byte...)
*<code>public static int org.apache.commons.io.IOUtils.read(java.io.InputStream,byte[]) throws java.io.IOException
*read(java.io.InputStream p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int read(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.read(p0,p1);
}
/**
*{@link com.google.common.io.ByteStreams#readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>)}
*@see com.google.common.io.ByteStreams#readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>)
*<code>public static <T> T com.google.common.io.ByteStreams.readBytes(java.io.InputStream,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.ByteStreams.readBytes(p0,p1);
}
/**
*{@link com.google.common.hash.BloomFilter#readFrom(java.io.InputStream,com.google.common.hash.Funnel<? super T>)}
*@see com.google.common.hash.BloomFilter#readFrom(java.io.InputStream,com.google.common.hash.Funnel<? super T>)
*<code>public static <T> com.google.common.hash.BloomFilter<T> com.google.common.hash.BloomFilter.readFrom(java.io.InputStream,com.google.common.hash.Funnel<? super T>) throws java.io.IOException
*readFrom(java.io.InputStream p0,com.google.common.hash.Funnel<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream p0,com.google.common.hash.Funnel<? super T> p1) throws java.io.IOException{
	return com.google.common.hash.BloomFilter.readFrom(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readFully(java.io.InputStream,byte[],int,int)}
*@see org.apache.commons.io.IOUtils#readFully(java.io.InputStream,byte[],int,int)
*<code>public static void org.apache.commons.io.IOUtils.readFully(java.io.InputStream,byte[],int,int) throws java.io.IOException
*readFully(java.io.InputStream p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void readFully(java.io.InputStream p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.IOUtils#readFully(java.io.InputStream,int)}
*@see org.apache.commons.io.IOUtils#readFully(java.io.InputStream,int)
*<code>public static byte[] org.apache.commons.io.IOUtils.readFully(java.io.InputStream,int) throws java.io.IOException
*readFully(java.io.InputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] readFully(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readFully(java.io.InputStream,byte...)}
*@see org.apache.commons.io.IOUtils#readFully(java.io.InputStream,byte...)
*<code>public static void org.apache.commons.io.IOUtils.readFully(java.io.InputStream,byte[]) throws java.io.IOException
*readFully(java.io.InputStream p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void readFully(java.io.InputStream p0,byte... p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.readFully(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream) throws java.io.IOException
*readLines(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.io.InputStream p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#readLines(java.io.InputStream,java.lang.String)
*<code>public static java.util.List<java.lang.String> org.apache.commons.io.IOUtils.readLines(java.io.InputStream,java.lang.String) throws java.io.IOException
*readLines(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedDouble(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedDouble(java.io.InputStream)
*<code>public static double org.apache.commons.io.EndianUtils.readSwappedDouble(java.io.InputStream) throws java.io.IOException
*readSwappedDouble(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double readSwappedDouble(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedDouble(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedFloat(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedFloat(java.io.InputStream)
*<code>public static float org.apache.commons.io.EndianUtils.readSwappedFloat(java.io.InputStream) throws java.io.IOException
*readSwappedFloat(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float readSwappedFloat(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedFloat(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedInteger(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedInteger(java.io.InputStream)
*<code>public static int org.apache.commons.io.EndianUtils.readSwappedInteger(java.io.InputStream) throws java.io.IOException
*readSwappedInteger(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int readSwappedInteger(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedInteger(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedLong(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedLong(java.io.InputStream)
*<code>public static long org.apache.commons.io.EndianUtils.readSwappedLong(java.io.InputStream) throws java.io.IOException
*readSwappedLong(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long readSwappedLong(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedLong(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedShort(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedShort(java.io.InputStream)
*<code>public static short org.apache.commons.io.EndianUtils.readSwappedShort(java.io.InputStream) throws java.io.IOException
*readSwappedShort(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short readSwappedShort(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedShort(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedUnsignedInteger(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedUnsignedInteger(java.io.InputStream)
*<code>public static long org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(java.io.InputStream) throws java.io.IOException
*readSwappedUnsignedInteger(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long readSwappedUnsignedInteger(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(p0);
}
/**
*{@link org.apache.commons.io.EndianUtils#readSwappedUnsignedShort(java.io.InputStream)}
*@see org.apache.commons.io.EndianUtils#readSwappedUnsignedShort(java.io.InputStream)
*<code>public static int org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(java.io.InputStream) throws java.io.IOException
*readSwappedUnsignedShort(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int readSwappedUnsignedShort(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#skip(java.io.InputStream,long)}
*@see org.apache.commons.io.IOUtils#skip(java.io.InputStream,long)
*<code>public static long org.apache.commons.io.IOUtils.skip(java.io.InputStream,long) throws java.io.IOException
*skip(java.io.InputStream p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long skip(java.io.InputStream p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.skip(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#skipFully(java.io.InputStream,long)}
*@see org.apache.commons.io.IOUtils#skipFully(java.io.InputStream,long)
*<code>public static void org.apache.commons.io.IOUtils.skipFully(java.io.InputStream,long) throws java.io.IOException
*skipFully(java.io.InputStream p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void skipFully(java.io.InputStream p0,long p1) throws java.io.IOException{
	 org.apache.commons.io.IOUtils.skipFully(p0,p1);
}
/**
*{@link org.apache.commons.io.output.ByteArrayOutputStream#toBufferedInputStream(java.io.InputStream)}
*@see org.apache.commons.io.output.ByteArrayOutputStream#toBufferedInputStream(java.io.InputStream)
*<code>public static java.io.InputStream org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(java.io.InputStream) throws java.io.IOException
*toBufferedInputStream(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(p0);
}
/**
*{@link org.apache.commons.io.output.ByteArrayOutputStream#toBufferedInputStream(java.io.InputStream,int)}
*@see org.apache.commons.io.output.ByteArrayOutputStream#toBufferedInputStream(java.io.InputStream,int)
*<code>public static java.io.InputStream org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(java.io.InputStream,int) throws java.io.IOException
*toBufferedInputStream(java.io.InputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toBufferedInputStream(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#toByteArray(java.io.InputStream,int)}
*@see org.codehaus.plexus.util.IOUtil#toByteArray(java.io.InputStream,int)
*<code>public static byte[] org.codehaus.plexus.util.IOUtil.toByteArray(java.io.InputStream,int) throws java.io.IOException
*toByteArray(java.io.InputStream p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.InputStream p0,int p1) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.toByteArray(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#toByteArray(java.io.InputStream)}
*@see org.codehaus.plexus.util.IOUtil#toByteArray(java.io.InputStream)
*<code>public static byte[] org.codehaus.plexus.util.IOUtil.toByteArray(java.io.InputStream) throws java.io.IOException
*toByteArray(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.InputStream p0) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.toByteArray(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#toByteArray(java.io.InputStream,long)}
*@see org.apache.commons.io.IOUtils#toByteArray(java.io.InputStream,long)
*<code>public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.io.InputStream,long) throws java.io.IOException
*toByteArray(java.io.InputStream p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.io.InputStream p0,long p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream,java.nio.charset.Charset)
*<code>public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream,java.nio.charset.Charset) throws java.io.IOException
*toCharArray(java.io.InputStream p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] toCharArray(java.io.InputStream p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream)}
*@see org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream)
*<code>public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream) throws java.io.IOException
*toCharArray(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] toCharArray(java.io.InputStream p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream,java.lang.String)}
*@see org.apache.commons.io.IOUtils#toCharArray(java.io.InputStream,java.lang.String)
*<code>public static char[] org.apache.commons.io.IOUtils.toCharArray(java.io.InputStream,java.lang.String) throws java.io.IOException
*toCharArray(java.io.InputStream p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] toCharArray(java.io.InputStream p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toCharArray(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.String)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.String)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String)
*toInputStream(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0){
	return org.apache.commons.io.IOUtils.toInputStream(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence,java.lang.String)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence,java.lang.String)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.lang.String) throws java.io.IOException
*toInputStream(java.lang.CharSequence p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence,java.nio.charset.Charset)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence,java.nio.charset.Charset)
*toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0,java.nio.charset.Charset p1){
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.CharSequence)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.CharSequence)
*toInputStream(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.CharSequence p0){
	return org.apache.commons.io.IOUtils.toInputStream(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.String,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.String,java.nio.charset.Charset)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String,java.nio.charset.Charset)
*toInputStream(java.lang.String p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0,java.nio.charset.Charset p1){
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toInputStream(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.IOUtils#toInputStream(java.lang.String,java.lang.String)
*<code>public static java.io.InputStream org.apache.commons.io.IOUtils.toInputStream(java.lang.String,java.lang.String) throws java.io.IOException
*toInputStream(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream toInputStream(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toInputStream(p0,p1);
}
}
