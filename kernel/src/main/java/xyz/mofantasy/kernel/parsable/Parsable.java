package xyz.mofantasy.kernel.parsable;

/**
 * @author mofantasy
 * @version 0.0.1-RELEASE 2020/9/22 4:49
 */
public interface Parsable<O, T> {

    /**
     * 解析
     *
     * @param o 源类型
     * @return 目标类型
     */
    T parse(O o);

    /**
     * 逆向解析
     *
     * @param t 目标类型
     * @return 源类型
     */
    O deParse(T t);

}