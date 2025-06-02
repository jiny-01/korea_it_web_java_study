package _31_Generic.Generic_Wildcard.UpperBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
