package xyz.mofantasy.kernel.enumerable;

/**
 * @author mofantasy
 * @version 0.0.1-RELEASE 2020/9/22 4:48
 */
public interface Enumerable<K, V> {

    /**
     * 获取目标key
     * @return K
     */
    K getKey();

    /**
     * 获取目标value
     * @return V
     */
    V getValue();

}