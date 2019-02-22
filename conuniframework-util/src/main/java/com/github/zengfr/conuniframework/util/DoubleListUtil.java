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
public final class DoubleListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigLists#asBigList(it.unimi.dsi.fastutil.doubles.DoubleList)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigLists#asBigList(it.unimi.dsi.fastutil.doubles.DoubleList)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleBigList it.unimi.dsi.fastutil.doubles.DoubleBigLists.asBigList(it.unimi.dsi.fastutil.doubles.DoubleList)
*asBigList(it.unimi.dsi.fastutil.doubles.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigList asBigList(it.unimi.dsi.fastutil.doubles.DoubleList p0){
	return it.unimi.dsi.fastutil.doubles.DoubleBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleList()}
*@see org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleList()
*<code>public static org.apache.commons.collections.primitives.DoubleList org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleList()
*getEmptyDoubleList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleList getEmptyDoubleList(){
	return org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleList();
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#shuffle(it.unimi.dsi.fastutil.doubles.DoubleList,java.util.Random)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#shuffle(it.unimi.dsi.fastutil.doubles.DoubleList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.shuffle(it.unimi.dsi.fastutil.doubles.DoubleList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList shuffle(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#singleton(double)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#singleton(double)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.singleton(double)
*singleton(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList singleton(double p0){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleList(double)}
*@see org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleList(double)
*<code>public static org.apache.commons.collections.primitives.DoubleList org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleList(double)
*singletonDoubleList(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleList singletonDoubleList(double p0){
	return org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(it.unimi.dsi.fastutil.doubles.DoubleList)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(it.unimi.dsi.fastutil.doubles.DoubleList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleLists#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList)}
*@see it.unimi.dsi.fastutil.doubles.DoubleLists#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList)
*unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList p0){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList)}
*@see org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList)
*<code>public static org.apache.commons.collections.primitives.DoubleList org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList) throws java.lang.NullPointerException
*unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleList unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleListList#wrap(org.apache.commons.collections.primitives.DoubleList)}
*@see org.apache.commons.collections.primitives.adapters.DoubleListList#wrap(org.apache.commons.collections.primitives.DoubleList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.DoubleListList.wrap(org.apache.commons.collections.primitives.DoubleList)
*wrap(org.apache.commons.collections.primitives.DoubleList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.DoubleList p0){
	return org.apache.commons.collections.primitives.adapters.DoubleListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListDoubleList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListDoubleList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.DoubleList org.apache.commons.collections.primitives.adapters.ListDoubleList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListDoubleList.wrap(p0);
}
}
