package Wildcard.UnBoundedWildcard;

import lombok.Data;

@Data //-@getter, @setter
public class Box<T> {
    private T item;

}
