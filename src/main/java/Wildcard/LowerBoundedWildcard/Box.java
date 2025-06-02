package Wildcard.LowerBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
