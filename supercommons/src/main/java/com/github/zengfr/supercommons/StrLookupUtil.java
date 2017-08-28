package com.github.zengfr.supercommons;
import org.apache.commons.lang3.text.StrLookup;
import org.apache.commons.text.StrLookup;
import org.apache.commons.lang.text.StrLookup;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StrLookupUtil{ 
public static <V> org.apache.commons.lang3.text.StrLookup<V> mapLookup(java.util.Map<java.lang.String, V> p0){
return StrLookup.mapLookup(p0);
}
public static org.apache.commons.lang3.text.StrLookup<?> noneLookup(){
return StrLookup.noneLookup();
}
public static org.apache.commons.lang3.text.StrLookup<java.lang.String> systemPropertiesLookup(){
return StrLookup.systemPropertiesLookup();
}
public static org.apache.commons.lang.text.StrLookup mapLookup(java.util.Map p0){
return StrLookup.mapLookup(p0);
}
}
