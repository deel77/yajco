package yajco.annotation;

import yajco.model.pattern.impl.Associativity;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yajco.annotation.processor.MapsTo;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.CONSTRUCTOR)
@MapsTo("yajco.model.pattern.impl.Operator")
public @interface Operator {

	int priority() default 1;

	Associativity associativity() default Associativity.AUTO;
        
}
