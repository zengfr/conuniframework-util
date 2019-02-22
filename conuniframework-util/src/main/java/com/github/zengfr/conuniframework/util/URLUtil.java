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
public final class URLUtil{ 
/**
*{@link com.google.common.io.Resources#asByteSource(java.net.URL)}
*@see com.google.common.io.Resources#asByteSource(java.net.URL)
*<code>public static com.google.common.io.ByteSource com.google.common.io.Resources.asByteSource(java.net.URL)
*asByteSource(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.ByteSource asByteSource(java.net.URL p0){
	return com.google.common.io.Resources.asByteSource(p0);
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
*{@link com.google.common.io.Resources#getResource(java.lang.String)}
*@see com.google.common.io.Resources#getResource(java.lang.String)
*<code>public static java.net.URL com.google.common.io.Resources.getResource(java.lang.String)
*getResource(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.URL getResource(java.lang.String p0){
	return com.google.common.io.Resources.getResource(p0);
}
/**
*{@link com.google.common.io.Resources#getResource(java.lang.Class<?>,java.lang.String)}
*@see com.google.common.io.Resources#getResource(java.lang.Class<?>,java.lang.String)
*<code>public static java.net.URL com.google.common.io.Resources.getResource(java.lang.Class<?>,java.lang.String)
*getResource(java.lang.Class<?> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.URL getResource(java.lang.Class<?> p0,java.lang.String p1){
	return com.google.common.io.Resources.getResource(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.net.URL)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.net.URL)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.net.URL) throws java.io.IOException
*loadProperties(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.net.URL p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
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
*{@link org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.net.URL)}
*@see org.codehaus.plexus.util.ReaderFactory#newXmlReader(java.net.URL)
*<code>public static org.codehaus.plexus.util.xml.XmlStreamReader org.codehaus.plexus.util.ReaderFactory.newXmlReader(java.net.URL) throws java.io.IOException
*newXmlReader(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.net.URL p0) throws java.io.IOException{
	return org.codehaus.plexus.util.ReaderFactory.newXmlReader(p0);
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
*{@link org.apache.commons.io.IOUtils#resourceToURL(java.lang.String)}
*@see org.apache.commons.io.IOUtils#resourceToURL(java.lang.String)
*<code>public static java.net.URL org.apache.commons.io.IOUtils.resourceToURL(java.lang.String) throws java.io.IOException
*resourceToURL(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.URL resourceToURL(java.lang.String p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.resourceToURL(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#resourceToURL(java.lang.String,java.lang.ClassLoader)}
*@see org.apache.commons.io.IOUtils#resourceToURL(java.lang.String,java.lang.ClassLoader)
*<code>public static java.net.URL org.apache.commons.io.IOUtils.resourceToURL(java.lang.String,java.lang.ClassLoader) throws java.io.IOException
*resourceToURL(java.lang.String p0,java.lang.ClassLoader p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.net.URL resourceToURL(java.lang.String p0,java.lang.ClassLoader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.resourceToURL(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toByteArray(java.net.URL)}
*@see org.apache.commons.io.IOUtils#toByteArray(java.net.URL)
*<code>public static byte[] org.apache.commons.io.IOUtils.toByteArray(java.net.URL) throws java.io.IOException
*toByteArray(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] toByteArray(java.net.URL p0) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.toByteArray(p0);
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
}
