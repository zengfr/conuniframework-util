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
public final class FloatListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigLists#asBigList(it.unimi.dsi.fastutil.floats.FloatList)}
*@see it.unimi.dsi.fastutil.floats.FloatBigLists#asBigList(it.unimi.dsi.fastutil.floats.FloatList)
*<code>public static it.unimi.dsi.fastutil.floats.FloatBigList it.unimi.dsi.fastutil.floats.FloatBigLists.asBigList(it.unimi.dsi.fastutil.floats.FloatList)
*asBigList(it.unimi.dsi.fastutil.floats.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatBigList asBigList(it.unimi.dsi.fastutil.floats.FloatList p0){
	return it.unimi.dsi.fastutil.floats.FloatBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatList()}
*@see org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatList()
*<code>public static org.apache.commons.collections.primitives.FloatList org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatList()
*getEmptyFloatList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatList getEmptyFloatList(){
	return org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatList();
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#shuffle(it.unimi.dsi.fastutil.floats.FloatList,java.util.Random)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#shuffle(it.unimi.dsi.fastutil.floats.FloatList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.shuffle(it.unimi.dsi.fastutil.floats.FloatList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.floats.FloatList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList shuffle(it.unimi.dsi.fastutil.floats.FloatList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#singleton(float)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#singleton(float)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.singleton(float)
*singleton(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList singleton(float p0){
	return it.unimi.dsi.fastutil.floats.FloatLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.floats.FloatLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#singletonFloatList(float)}
*@see org.apache.commons.collections.primitives.FloatCollections#singletonFloatList(float)
*<code>public static org.apache.commons.collections.primitives.FloatList org.apache.commons.collections.primitives.FloatCollections.singletonFloatList(float)
*singletonFloatList(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatList singletonFloatList(float p0){
	return org.apache.commons.collections.primitives.FloatCollections.singletonFloatList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.synchronize(it.unimi.dsi.fastutil.floats.FloatList)
*synchronize(it.unimi.dsi.fastutil.floats.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0){
	return it.unimi.dsi.fastutil.floats.FloatLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.synchronize(it.unimi.dsi.fastutil.floats.FloatList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatLists#unmodifiable(it.unimi.dsi.fastutil.floats.FloatList)}
*@see it.unimi.dsi.fastutil.floats.FloatLists#unmodifiable(it.unimi.dsi.fastutil.floats.FloatList)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.unmodifiable(it.unimi.dsi.fastutil.floats.FloatList)
*unmodifiable(it.unimi.dsi.fastutil.floats.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList unmodifiable(it.unimi.dsi.fastutil.floats.FloatList p0){
	return it.unimi.dsi.fastutil.floats.FloatLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList)}
*@see org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList)
*<code>public static org.apache.commons.collections.primitives.FloatList org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList) throws java.lang.NullPointerException
*unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatList unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatListList#wrap(org.apache.commons.collections.primitives.FloatList)}
*@see org.apache.commons.collections.primitives.adapters.FloatListList#wrap(org.apache.commons.collections.primitives.FloatList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.FloatListList.wrap(org.apache.commons.collections.primitives.FloatList)
*wrap(org.apache.commons.collections.primitives.FloatList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.FloatList p0){
	return org.apache.commons.collections.primitives.adapters.FloatListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListFloatList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListFloatList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.FloatList org.apache.commons.collections.primitives.adapters.ListFloatList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListFloatList.wrap(p0);
}
}
