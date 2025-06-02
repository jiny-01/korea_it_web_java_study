package _31_Generic.Generic_Wildcard.UnBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
