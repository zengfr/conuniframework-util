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
public final class CharsetUtil{ 
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
*{@link com.google.common.io.MoreFiles#asCharSink(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)}
*@see com.google.common.io.MoreFiles#asCharSink(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
*<code>public static com.google.common.io.CharSink com.google.common.io.MoreFiles.asCharSink(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
*asCharSink(java.nio.file.Path p0,java.nio.charset.Charset p1,java.nio.file.OpenOption... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.CharSink asCharSink(java.nio.file.Path p0,java.nio.charset.Charset p1,java.nio.file.OpenOption... p2){
	return com.google.common.io.MoreFiles.asCharSink(p0,p1,p2);
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
*{@link com.google.common.io.MoreFiles#asCharSource(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)}
*@see com.google.common.io.MoreFiles#asCharSource(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
*<code>public static com.google.common.io.CharSource com.google.common.io.MoreFiles.asCharSource(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
*asCharSource(java.nio.file.Path p0,java.nio.charset.Charset p1,java.nio.file.OpenOption... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.CharSource asCharSource(java.nio.file.Path p0,java.nio.charset.Charset p1,java.nio.file.OpenOption... p2){
	return com.google.common.io.MoreFiles.asCharSource(p0,p1,p2);
}
/**
*{@link com.google.common.io.Resources#asCharSource(java.net.URL,java.nio.charset.Charset)}
*@see com.google.common.io.Resources#asCharSource(java.net.URL,java.nio.charset.Charset)
*<code>public static com.google.common.io.CharSource com.google.common.io.Resources.asCharSource(java.net.URL,java.nio.charset.Charset)
*asCharSource(java.net.URL p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.CharSource asCharSource(java.net.URL p0,java.nio.charset.Charset p1){
	return com.google.common.io.Resources.asCharSource(p0,p1);
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
*{@link com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)}
*@see com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>)
*<code>public static <T> T com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1,p2);
}
/**
*{@link com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset)}
*@see com.google.common.io.Resources#readLines(java.net.URL,java.nio.charset.Charset)
*<code>public static java.util.List<java.lang.String> com.google.common.io.Resources.readLines(java.net.URL,java.nio.charset.Charset) throws java.io.IOException
*readLines(java.net.URL p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> readLines(java.net.URL p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Resources.readLines(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#resourceToString(java.lang.String,java.nio.charset.Charset,java.lang.ClassLoader)}
*@see org.apache.commons.io.IOUtils#resourceToString(java.lang.String,java.nio.charset.Charset,java.lang.ClassLoader)
*<code>public static java.lang.String org.apache.commons.io.IOUtils.resourceToString(java.lang.String,java.nio.charset.Charset,java.lang.ClassLoader) throws java.io.IOException
*resourceToString(java.lang.String p0,java.nio.charset.Charset p1,java.lang.ClassLoader p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String resourceToString(java.lang.String p0,java.nio.charset.Charset p1,java.lang.ClassLoader p2) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.resourceToString(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.IOUtils#resourceToString(java.lang.String,java.nio.charset.Charset)}
*@see org.apache.commons.io.IOUtils#resourceToString(java.lang.String,java.nio.charset.Charset)
*<code>public static java.lang.String org.apache.commons.io.IOUtils.resourceToString(java.lang.String,java.nio.charset.Charset) throws java.io.IOException
*resourceToString(java.lang.String p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String resourceToString(java.lang.String p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.resourceToString(p0,p1);
}
/**
*{@link com.google.common.hash.Funnels#stringFunnel(java.nio.charset.Charset)}
*@see com.google.common.hash.Funnels#stringFunnel(java.nio.charset.Charset)
*<code>public static com.google.common.hash.Funnel<java.lang.CharSequence> com.google.common.hash.Funnels.stringFunnel(java.nio.charset.Charset)
*stringFunnel(java.nio.charset.Charset p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset p0){
	return com.google.common.hash.Funnels.stringFunnel(p0);
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
*{@link org.apache.commons.io.Charsets#toCharset(java.lang.String)}
*@see org.apache.commons.io.Charsets#toCharset(java.lang.String)
*<code>public static java.nio.charset.Charset org.apache.commons.io.Charsets.toCharset(java.lang.String)
*toCharset(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.nio.charset.Charset toCharset(java.lang.String p0){
	return org.apache.commons.io.Charsets.toCharset(p0);
}
/**
*{@link org.apache.commons.io.Charsets#toCharset(java.nio.charset.Charset)}
*@see org.apache.commons.io.Charsets#toCharset(java.nio.charset.Charset)
*<code>public static java.nio.charset.Charset org.apache.commons.io.Charsets.toCharset(java.nio.charset.Charset)
*toCharset(java.nio.charset.Charset p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.nio.charset.Charset toCharset(java.nio.charset.Charset p0){
	return org.apache.commons.io.Charsets.toCharset(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#toEncodedString(byte[],java.nio.charset.Charset)}
*@see org.apache.commons.lang3.StringUtils#toEncodedString(byte[],java.nio.charset.Charset)
*<code>public static java.lang.String org.apache.commons.lang3.StringUtils.toEncodedString(byte[],java.nio.charset.Charset)
*toEncodedString(byte[] p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toEncodedString(byte[] p0,java.nio.charset.Charset p1){
	return org.apache.commons.lang3.StringUtils.toEncodedString(p0,p1);
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
}
