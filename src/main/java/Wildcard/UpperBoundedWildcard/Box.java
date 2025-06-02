package Wildcard.UpperBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
