package com.zengfr.supercommons;
import org.apache.commons.collections4.MultiMapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetValuedMapUtil{ 
public static <K,V> org.apache.commons.collections4.SetValuedMap<K, V> newSetValuedHashMap(){
return MultiMapUtils.newSetValuedHashMap();
}
}
