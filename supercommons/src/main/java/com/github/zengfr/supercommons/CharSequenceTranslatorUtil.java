package com.zengfr.supercommons;
import org.apache.commons.text.StringEscapeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSequenceTranslatorUtil{ 
public static Builder builder(org.apache.commons.text.translate.CharSequenceTranslator p0){
return StringEscapeUtils.builder(p0);
}
}
