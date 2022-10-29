package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Elements() {
        int[] data = new int[] {98, 67, 18};
        int[] expected = new int[] {18, 67, 98};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith5Elements() {
        int[] data = new int[] {10, 60, 30, 90, 20};
        int[] expected = new int[] {10, 20, 30, 60, 90};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}
