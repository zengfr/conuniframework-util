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
public final class BooleanListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigLists#asBigList(it.unimi.dsi.fastutil.booleans.BooleanList)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigLists#asBigList(it.unimi.dsi.fastutil.booleans.BooleanList)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanBigList it.unimi.dsi.fastutil.booleans.BooleanBigLists.asBigList(it.unimi.dsi.fastutil.booleans.BooleanList)
*asBigList(it.unimi.dsi.fastutil.booleans.BooleanList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList asBigList(it.unimi.dsi.fastutil.booleans.BooleanList p0){
	return it.unimi.dsi.fastutil.booleans.BooleanBigLists.asBigList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#shuffle(it.unimi.dsi.fastutil.booleans.BooleanList,java.util.Random)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#shuffle(it.unimi.dsi.fastutil.booleans.BooleanList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.shuffle(it.unimi.dsi.fastutil.booleans.BooleanList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList shuffle(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#singleton(boolean)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#singleton(boolean)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.singleton(boolean)
*singleton(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList singleton(boolean p0){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(it.unimi.dsi.fastutil.booleans.BooleanList)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(it.unimi.dsi.fastutil.booleans.BooleanList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanLists#unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList)}
*@see it.unimi.dsi.fastutil.booleans.BooleanLists#unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList)
*unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList p0){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.unmodifiable(p0);
}
}
