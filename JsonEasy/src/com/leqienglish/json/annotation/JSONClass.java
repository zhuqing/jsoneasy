/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leqienglish.json.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *标记JSON对象,可以继续解析其子
 * @author zhuleqi
 */
@Target({ElementType.TYPE,ElementType.FIELD}) 
@Retention(RetentionPolicy.RUNTIME) 
@Documented 
public @interface JSONClass {
    	/**
	 * json 的key值
	 * @return
	 */
	String name() default "";
}
