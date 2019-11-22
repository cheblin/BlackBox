package org.unirail.BlackBox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Required field that values have bi-direction dispersion gradient.
@Target(ElementType.FIELD)
public @interface X {
	double value() default 0;//Middle, most often value or value range (-7 | 78)
}
	