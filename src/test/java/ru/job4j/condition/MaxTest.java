package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To7Then7() {
        int left = 4;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int one = 2;
        int two = 3;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To3Then3() {
        int one = 2;
        int two = 3;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To4Then4() {
        int one = 3;
        int two = 3;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To2To4To8Then9() {
        int one = 9;
        int two = 2;
        int three = 4;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To2To8Then8() {
        int one = 2;
        int two = 2;
        int three = 2;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To9To9To9Then9() {
        int one = 9;
        int two = 9;
        int three = 9;
        int four = 9;
        int result = Max.max(one, two, three, four);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}