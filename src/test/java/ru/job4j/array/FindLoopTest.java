package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas45Then2() {
        int[] data = new int[] {3, 6, 45, 23};
        int el = 45;
        int expected = 2;
        int rsl = FindLoop.indexOf(data, el);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot9ThenMinus1() {
        int[] data = new int[] {3, 56, 23, 34, 16};
        int el = 9;
        int expected = -1;
        int rsl = FindLoop.indexOf(data, el);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
       int[] data = new int[] {2, 5, 6, 7, 7, 8};
       int el = 8;
       int start = 1;
       int finish = 4;
       int expected = -1;
       int result = FindLoop.indexInRange(data, el, start, finish);
       assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then8() {
        int[] data = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int el = 2;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

}