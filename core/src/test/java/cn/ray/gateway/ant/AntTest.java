package cn.ray.gateway.ant;

import cn.ray.gateway.common.utils.AntPathMatcher;
import org.junit.Test;

/**
 * @author Ray
 * @date 2023/11/20 12:11
 * @description
 */
public class AntTest {

    private static final AntPathMatcher ANT_PATH_MATCHER = new AntPathMatcher();

    @Test
    public void test1() {
        String pattern = "/aa/bb/*";
        String path = "/aa/bb/cc";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }

    @Test
    public void test2() {
        String pattern = "/aa/bb/**";
        String path = "/aa/bb/cc/dd/ee/ff";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }

    @Test
    public void test3() {
        String pattern = "/aa/bb/?x?";
        String path = "/aa/bb/xxx";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }


    @Test
    public void test4() {
        String pattern = "/aa/*.html";
        String path = "/aa/login.html";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }

    @Test
    public void test5() {
        String pattern = "/test*";
        String path = "/test?name=1234";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }

    @Test
    public void test6() {
        String pattern = "/test*";
        String path = "/testPut";
        boolean ret = ANT_PATH_MATCHER.match(pattern, path);
        System.err.println("ret: " + ret);
    }
}