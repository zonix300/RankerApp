package com.zonix.musicrankerapp.mapper;


public interface Mapper<S, T> {

    T map(S source);

    default T map(S source, T target) {
        return target;
    }
}
