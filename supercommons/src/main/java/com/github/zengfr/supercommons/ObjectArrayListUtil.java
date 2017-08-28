package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectArrayListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectArrayList<K> wrap(K[] p0){
return ObjectArrayList.wrap(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectArrayList<K> wrap(K[] p0,int p1){
return ObjectArrayList.wrap(p0,p1);
}
}
