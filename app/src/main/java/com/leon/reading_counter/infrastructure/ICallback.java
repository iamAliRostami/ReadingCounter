package com.leon.reading_counter.infrastructure;

/**
 * Created by Leon on 12/12/2017.
 */

public interface ICallback<T> {
    void execute(T t);
}
