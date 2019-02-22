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
public final class LongListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigLists#asBigList(it.unimi.dsi.fastutil.longs.LongList)}
*@see it.unimi.dsi.fastutil.longs.LongBigLists#asBigList(it.unimi.dsi.fastutil.longs.LongList)
*<code>public static it.unimi.dsi.fastutil.longs.LongBigList it.unimi.dsi.fastutil.longs.LongBigLists.asBigList(it.unimi.dsi.fastutil.longs.LongList)
*asBigList(it.unimi.dsi.fastutil.longs.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigList asBigList(it.unimi.dsi.fastutil.longs.LongList p0){
	return it.unimi.dsi.fastutil.longs.LongBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#getEmptyLongList()}
*@see org.apache.commons.collections.primitives.LongCollections#getEmptyLongList()
*<code>public static org.apache.commons.collections.primitives.LongList org.apache.commons.collections.primitives.LongCollections.getEmptyLongList()
*getEmptyLongList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongList getEmptyLongList(){
	return org.apache.commons.collections.primitives.LongCollections.getEmptyLongList();
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,int)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,int)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#shuffle(it.unimi.dsi.fastutil.longs.LongList,java.util.Random)}
*@see it.unimi.dsi.fastutil.longs.LongLists#shuffle(it.unimi.dsi.fastutil.longs.LongList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.shuffle(it.unimi.dsi.fastutil.longs.LongList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.longs.LongList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList shuffle(it.unimi.dsi.fastutil.longs.LongList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#singleton(long)}
*@see it.unimi.dsi.fastutil.longs.LongLists#singleton(long)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.singleton(long)
*singleton(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList singleton(long p0){
	return it.unimi.dsi.fastutil.longs.LongLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.longs.LongLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#singletonLongList(long)}
*@see org.apache.commons.collections.primitives.LongCollections#singletonLongList(long)
*<code>public static org.apache.commons.collections.primitives.LongList org.apache.commons.collections.primitives.LongCollections.singletonLongList(long)
*singletonLongList(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongList singletonLongList(long p0){
	return org.apache.commons.collections.primitives.LongCollections.singletonLongList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList)}
*@see it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.synchronize(it.unimi.dsi.fastutil.longs.LongList)
*synchronize(it.unimi.dsi.fastutil.longs.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0){
	return it.unimi.dsi.fastutil.longs.LongLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongLists#synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.synchronize(it.unimi.dsi.fastutil.longs.LongList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongLists#unmodifiable(it.unimi.dsi.fastutil.longs.LongList)}
*@see it.unimi.dsi.fastutil.longs.LongLists#unmodifiable(it.unimi.dsi.fastutil.longs.LongList)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.unmodifiable(it.unimi.dsi.fastutil.longs.LongList)
*unmodifiable(it.unimi.dsi.fastutil.longs.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList unmodifiable(it.unimi.dsi.fastutil.longs.LongList p0){
	return it.unimi.dsi.fastutil.longs.LongLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#unmodifiableLongList(org.apache.commons.collections.primitives.LongList)}
*@see org.apache.commons.collections.primitives.LongCollections#unmodifiableLongList(org.apache.commons.collections.primitives.LongList)
*<code>public static org.apache.commons.collections.primitives.LongList org.apache.commons.collections.primitives.LongCollections.unmodifiableLongList(org.apache.commons.collections.primitives.LongList) throws java.lang.NullPointerException
*unmodifiableLongList(org.apache.commons.collections.primitives.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongList unmodifiableLongList(org.apache.commons.collections.primitives.LongList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.LongCollections.unmodifiableLongList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListLongList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListLongList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.LongList org.apache.commons.collections.primitives.adapters.ListLongList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListLongList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongListList#wrap(org.apache.commons.collections.primitives.LongList)}
*@see org.apache.commons.collections.primitives.adapters.LongListList#wrap(org.apache.commons.collections.primitives.LongList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.LongListList.wrap(org.apache.commons.collections.primitives.LongList)
*wrap(org.apache.commons.collections.primitives.LongList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.LongList p0){
	return org.apache.commons.collections.primitives.adapters.LongListList.wrap(p0);
}
}
