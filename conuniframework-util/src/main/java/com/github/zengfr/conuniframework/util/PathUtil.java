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
public final class PathUtil{ 
/**
*{@link com.google.common.io.MoreFiles#asByteSink(java.nio.file.Path,java.nio.file.OpenOption...)}
*@see com.google.common.io.MoreFiles#asByteSink(java.nio.file.Path,java.nio.file.OpenOption...)
*<code>public static com.google.common.io.ByteSink com.google.common.io.MoreFiles.asByteSink(java.nio.file.Path,java.nio.file.OpenOption...)
*asByteSink(java.nio.file.Path p0,java.nio.file.OpenOption... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.ByteSink asByteSink(java.nio.file.Path p0,java.nio.file.OpenOption... p1){
	return com.google.common.io.MoreFiles.asByteSink(p0,p1);
}
/**
*{@link com.google.common.io.MoreFiles#asByteSource(java.nio.file.Path,java.nio.file.OpenOption...)}
*@see com.google.common.io.MoreFiles#asByteSource(java.nio.file.Path,java.nio.file.OpenOption...)
*<code>public static com.google.common.io.ByteSource com.google.common.io.MoreFiles.asByteSource(java.nio.file.Path,java.nio.file.OpenOption...)
*asByteSource(java.nio.file.Path p0,java.nio.file.OpenOption... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.io.ByteSource asByteSource(java.nio.file.Path p0,java.nio.file.OpenOption... p1){
	return com.google.common.io.MoreFiles.asByteSource(p0,p1);
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
*{@link com.google.common.io.MoreFiles#createParentDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute<?>...)}
*@see com.google.common.io.MoreFiles#createParentDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute<?>...)
*<code>public static void com.google.common.io.MoreFiles.createParentDirectories(java.nio.file.Path,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException
*createParentDirectories(java.nio.file.Path p0,java.nio.file.attribute.FileAttribute<?>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void createParentDirectories(java.nio.file.Path p0,java.nio.file.attribute.FileAttribute<?>... p1) throws java.io.IOException{
	 com.google.common.io.MoreFiles.createParentDirectories(p0,p1);
}
/**
*{@link com.google.common.io.MoreFiles#deleteDirectoryContents(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...)}
*@see com.google.common.io.MoreFiles#deleteDirectoryContents(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...)
*<code>public static void com.google.common.io.MoreFiles.deleteDirectoryContents(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...) throws java.io.IOException
*deleteDirectoryContents(java.nio.file.Path p0,com.google.common.io.RecursiveDeleteOption... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void deleteDirectoryContents(java.nio.file.Path p0,com.google.common.io.RecursiveDeleteOption... p1) throws java.io.IOException{
	 com.google.common.io.MoreFiles.deleteDirectoryContents(p0,p1);
}
/**
*{@link com.google.common.io.MoreFiles#deleteRecursively(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...)}
*@see com.google.common.io.MoreFiles#deleteRecursively(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...)
*<code>public static void com.google.common.io.MoreFiles.deleteRecursively(java.nio.file.Path,com.google.common.io.RecursiveDeleteOption...) throws java.io.IOException
*deleteRecursively(java.nio.file.Path p0,com.google.common.io.RecursiveDeleteOption... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void deleteRecursively(java.nio.file.Path p0,com.google.common.io.RecursiveDeleteOption... p1) throws java.io.IOException{
	 com.google.common.io.MoreFiles.deleteRecursively(p0,p1);
}
/**
*{@link com.google.common.io.MoreFiles#getFileExtension(java.nio.file.Path)}
*@see com.google.common.io.MoreFiles#getFileExtension(java.nio.file.Path)
*<code>public static java.lang.String com.google.common.io.MoreFiles.getFileExtension(java.nio.file.Path)
*getFileExtension(java.nio.file.Path p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getFileExtension(java.nio.file.Path p0){
	return com.google.common.io.MoreFiles.getFileExtension(p0);
}
/**
*{@link com.google.common.io.MoreFiles#getNameWithoutExtension(java.nio.file.Path)}
*@see com.google.common.io.MoreFiles#getNameWithoutExtension(java.nio.file.Path)
*<code>public static java.lang.String com.google.common.io.MoreFiles.getNameWithoutExtension(java.nio.file.Path)
*getNameWithoutExtension(java.nio.file.Path p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getNameWithoutExtension(java.nio.file.Path p0){
	return com.google.common.io.MoreFiles.getNameWithoutExtension(p0);
}
/**
*{@link com.google.common.io.MoreFiles#listFiles(java.nio.file.Path)}
*@see com.google.common.io.MoreFiles#listFiles(java.nio.file.Path)
*<code>public static com.google.common.collect.ImmutableList<java.nio.file.Path> com.google.common.io.MoreFiles.listFiles(java.nio.file.Path) throws java.io.IOException
*listFiles(java.nio.file.Path p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.ImmutableList<java.nio.file.Path> listFiles(java.nio.file.Path p0) throws java.io.IOException{
	return com.google.common.io.MoreFiles.listFiles(p0);
}
/**
*{@link com.google.common.io.MoreFiles#touch(java.nio.file.Path)}
*@see com.google.common.io.MoreFiles#touch(java.nio.file.Path)
*<code>public static void com.google.common.io.MoreFiles.touch(java.nio.file.Path) throws java.io.IOException
*touch(java.nio.file.Path p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void touch(java.nio.file.Path p0) throws java.io.IOException{
	 com.google.common.io.MoreFiles.touch(p0);
}
}
