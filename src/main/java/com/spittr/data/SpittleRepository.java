package com.spittr.data;

import java.util.List;

/**
 * Created by Allen on 2016/4/16.
 */

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
