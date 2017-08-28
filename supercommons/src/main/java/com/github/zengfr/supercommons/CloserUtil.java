package com.zengfr.supercommons;
import com.google.common.io.Closer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CloserUtil{ 
public static com.google.common.io.Closer create(){
return Closer.create();
}
}
