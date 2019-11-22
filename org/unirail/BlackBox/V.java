package org.unirail.BlackBox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Required field that values has down direction dispersion gradient.
@Target(ElementType.FIELD)
public @interface V {
	double value() default 0;//Highest value or values range (-7 | 78)
}
	