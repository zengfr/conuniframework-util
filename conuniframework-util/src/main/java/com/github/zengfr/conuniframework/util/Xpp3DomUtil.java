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
public final class Xpp3DomUtil{ 
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(org.codehaus.plexus.util.xml.pull.XmlPullParser) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0);
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
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder.InputLocationBuilder p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
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
*{@link org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom)}
*@see org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom)
*mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1){
	return org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)
*mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,java.lang.Boolean p2){
	return org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)
*<code>public static void org.codehaus.plexus.util.xml.Xpp3DomWriter.write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)
*write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,boolean p2){
	 org.codehaus.plexus.util.xml.Xpp3DomWriter.write(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom)}
*@see org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom)
*<code>public static void org.codehaus.plexus.util.xml.Xpp3DomWriter.write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom)
*write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1){
	 org.codehaus.plexus.util.xml.Xpp3DomWriter.write(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomWriter#write(java.io.PrintWriter,org.codehaus.plexus.util.xml.Xpp3Dom)}
*@see org.codehaus.plexus.util.xml.Xpp3DomWriter#write(java.io.PrintWriter,org.codehaus.plexus.util.xml.Xpp3Dom)
*<code>public static void org.codehaus.plexus.util.xml.Xpp3DomWriter.write(java.io.PrintWriter,org.codehaus.plexus.util.xml.Xpp3Dom)
*write(java.io.PrintWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.PrintWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1){
	 org.codehaus.plexus.util.xml.Xpp3DomWriter.write(p0,p1);
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
}
