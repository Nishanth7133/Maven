package org.testng;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
	IRetryAnalyzer rs = arg0.getRetryAnalyzer();
	if (rs==null) {
		arg0.setRetryAnalyzer(Failed.class);
	}
		
	}

}
