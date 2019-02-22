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
public final class StrMatcherUtil{ 
/**
*{@link org.apache.commons.lang3.text.StrMatcher#charMatcher(char)}
*@see org.apache.commons.lang3.text.StrMatcher#charMatcher(char)
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.charMatcher(char)
*charMatcher(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher charMatcher(char p0){
	return org.apache.commons.lang3.text.StrMatcher.charMatcher(p0);
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#charSetMatcher(char...)}
*@see org.apache.commons.lang3.text.StrMatcher#charSetMatcher(char...)
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.charSetMatcher(char...)
*charSetMatcher(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(char... p0){
	return org.apache.commons.lang3.text.StrMatcher.charSetMatcher(p0);
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#charSetMatcher(java.lang.String)}
*@see org.apache.commons.lang3.text.StrMatcher#charSetMatcher(java.lang.String)
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.charSetMatcher(java.lang.String)
*charSetMatcher(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(java.lang.String p0){
	return org.apache.commons.lang3.text.StrMatcher.charSetMatcher(p0);
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#commaMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#commaMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.commaMatcher()
*commaMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher commaMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.commaMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#doubleQuoteMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#doubleQuoteMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()
*doubleQuoteMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher doubleQuoteMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#noneMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#noneMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.noneMatcher()
*noneMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher noneMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.noneMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#quoteMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#quoteMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.quoteMatcher()
*quoteMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher quoteMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.quoteMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#singleQuoteMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#singleQuoteMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher()
*singleQuoteMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher singleQuoteMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#spaceMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#spaceMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.spaceMatcher()
*spaceMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher spaceMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.spaceMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#splitMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#splitMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.splitMatcher()
*splitMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher splitMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.splitMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#stringMatcher(java.lang.String)}
*@see org.apache.commons.lang3.text.StrMatcher#stringMatcher(java.lang.String)
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.stringMatcher(java.lang.String)
*stringMatcher(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher stringMatcher(java.lang.String p0){
	return org.apache.commons.lang3.text.StrMatcher.stringMatcher(p0);
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#tabMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#tabMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.tabMatcher()
*tabMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher tabMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.tabMatcher();
}
/**
*{@link org.apache.commons.lang3.text.StrMatcher#trimMatcher()}
*@see org.apache.commons.lang3.text.StrMatcher#trimMatcher()
*<code>public static org.apache.commons.lang3.text.StrMatcher org.apache.commons.lang3.text.StrMatcher.trimMatcher()
*trimMatcher()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.lang3.text.StrMatcher trimMatcher(){
	return org.apache.commons.lang3.text.StrMatcher.trimMatcher();
}
}
