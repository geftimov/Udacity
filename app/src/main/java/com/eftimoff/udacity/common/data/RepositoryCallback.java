package com.eftimoff.udacity.common.data;

/**
 * For async support.
 * <p/>
 * Created by georgieftimov on 06/04/16.
 */
public interface RepositoryCallback<T> {

    void onSuccess(T t);

    void onError(Throwable throwable);

}
