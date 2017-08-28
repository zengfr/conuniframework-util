package com.github.zengfr.supercommons;
import com.google.common.io.BaseEncoding;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BaseEncodingUtil{ 
public static com.google.common.io.BaseEncoding base32Hex(){
return BaseEncoding.base32Hex();
}
public static com.google.common.io.BaseEncoding base64(){
return BaseEncoding.base64();
}
public static com.google.common.io.BaseEncoding base32(){
return BaseEncoding.base32();
}
public static com.google.common.io.BaseEncoding base16(){
return BaseEncoding.base16();
}
public static com.google.common.io.BaseEncoding base64Url(){
return BaseEncoding.base64Url();
}
}
