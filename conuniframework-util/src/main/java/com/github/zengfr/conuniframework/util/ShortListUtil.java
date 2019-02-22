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
public final class ShortListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigLists#asBigList(it.unimi.dsi.fastutil.shorts.ShortList)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigLists#asBigList(it.unimi.dsi.fastutil.shorts.ShortList)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortBigList it.unimi.dsi.fastutil.shorts.ShortBigLists.asBigList(it.unimi.dsi.fastutil.shorts.ShortList)
*asBigList(it.unimi.dsi.fastutil.shorts.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortBigList asBigList(it.unimi.dsi.fastutil.shorts.ShortList p0){
	return it.unimi.dsi.fastutil.shorts.ShortBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#getEmptyShortList()}
*@see org.apache.commons.collections.primitives.ShortCollections#getEmptyShortList()
*<code>public static org.apache.commons.collections.primitives.ShortList org.apache.commons.collections.primitives.ShortCollections.getEmptyShortList()
*getEmptyShortList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortList getEmptyShortList(){
	return org.apache.commons.collections.primitives.ShortCollections.getEmptyShortList();
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#shuffle(it.unimi.dsi.fastutil.shorts.ShortList,java.util.Random)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#shuffle(it.unimi.dsi.fastutil.shorts.ShortList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.shuffle(it.unimi.dsi.fastutil.shorts.ShortList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.shorts.ShortList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList shuffle(it.unimi.dsi.fastutil.shorts.ShortList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.shorts.ShortLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#singleton(short)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#singleton(short)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.singleton(short)
*singleton(short p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList singleton(short p0){
	return it.unimi.dsi.fastutil.shorts.ShortLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.shorts.ShortLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#singletonShortList(short)}
*@see org.apache.commons.collections.primitives.ShortCollections#singletonShortList(short)
*<code>public static org.apache.commons.collections.primitives.ShortList org.apache.commons.collections.primitives.ShortCollections.singletonShortList(short)
*singletonShortList(short p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortList singletonShortList(short p0){
	return org.apache.commons.collections.primitives.ShortCollections.singletonShortList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(it.unimi.dsi.fastutil.shorts.ShortList)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0){
	return it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(it.unimi.dsi.fastutil.shorts.ShortList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.shorts.ShortLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortLists#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList)}
*@see it.unimi.dsi.fastutil.shorts.ShortLists#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList)
*unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList p0){
	return it.unimi.dsi.fastutil.shorts.ShortLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortList(org.apache.commons.collections.primitives.ShortList)}
*@see org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortList(org.apache.commons.collections.primitives.ShortList)
*<code>public static org.apache.commons.collections.primitives.ShortList org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortList(org.apache.commons.collections.primitives.ShortList) throws java.lang.NullPointerException
*unmodifiableShortList(org.apache.commons.collections.primitives.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortList unmodifiableShortList(org.apache.commons.collections.primitives.ShortList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListShortList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListShortList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.ShortList org.apache.commons.collections.primitives.adapters.ListShortList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListShortList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortListList#wrap(org.apache.commons.collections.primitives.ShortList)}
*@see org.apache.commons.collections.primitives.adapters.ShortListList#wrap(org.apache.commons.collections.primitives.ShortList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.ShortListList.wrap(org.apache.commons.collections.primitives.ShortList)
*wrap(org.apache.commons.collections.primitives.ShortList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.ShortList p0){
	return org.apache.commons.collections.primitives.adapters.ShortListList.wrap(p0);
}
}
