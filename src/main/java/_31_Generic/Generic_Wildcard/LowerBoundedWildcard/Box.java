package _31_Generic.Generic_Wildcard.LowerBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
